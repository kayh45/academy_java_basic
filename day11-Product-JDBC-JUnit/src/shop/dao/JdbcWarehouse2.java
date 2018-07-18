package shop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import shop.exception.DuplicateException;
import shop.exception.NotFoundException;
import shop.vo.Product;

import static java.sql.DriverManager.getConnection;
/**
 * 제품 정보를 JDBC 를 통하여
 * 오라클 데이터 베이스의 PRODUCT 테이블로 저장하는 클래스
 * ---------------------------------------------------------
 * 중복되는 드라이버 로드 / 자원 해제 등의 코드를 정리
 * ---------------------------------------------------------
 * 객체 생성을 1개로 제한하는 싱글턴(싱글톤:singleton) 패턴을 적용
 * 
 * 싱글턴
 * 인스턴스가 단 1개만 있어도 될 때,
 * 특정 클래스의 인스턴스가 한 개 만 유지 되도록
 * (new 를 할 때마다 새로운 인스턴스가 생성되지 않도록)
 * 인스턴스 생성을 제한하는 기법
 * ---------------------------------------------------------
 * 1. 이 클래스의 생성자를 private 으로 변경
 * 2. 이 클래스 타입의 public static 변수 instance 룰 선언
 * 3. 이 클래스 탕입을 리턴하는 static 메소드 getInstance()를 작성
 * 4. getInstance() 메소드 내부에서 private 생성자를 사용
 * 5. 외부에서는 getInstance() 메소드만을 통하여
 *    이 클래스의 인스턴스를 얻어내도록 제한
 * ---------------------------------------------------------
 *    
 * @author PC38219
 *
 */
public class JdbcWarehouse2 implements GeneralWarehouse {

	// 싱글턴 2. 이 클래스 타입의 static 변수 instance를 선언
	public static JdbcWarehouse2 instance;
	
	// 싱글턴 3. 이 클래스 타입을 리턴하는 static 메소드 선언
	public static JdbcWarehouse2 getInstance() {
		if (instance == null) {
			instance = new JdbcWarehouse2();
		}

		return instance;
	}
	
	// DB 커넥션을 위한 정보
	private static final String URL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	
	// 2. 생성자 선언
	
	// 싱글턴 1. 생성자 private으로 변경
	private JdbcWarehouse2() {
		// 드라이버 로드는 실행할 때 최초 1번만 수행하면 되므로
		// 한 번 실행되는 생성자로 이동
		// 1. 드라이버 로드
		try {
			Class.forName(DRIVER);
			
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 오류!");
			e.printStackTrace();
			
		}
	}
	
	// 3. 메소드 선언
	
	@Override
	public int add(Product product) throws DuplicateException {

		// 추가하고자 하는 제품이 이미 존재하는지 검사
		if (isExists(product)) {
			throw new DuplicateException("추가", product);
		}

		int addCnt = 0;

		// 0. 필요 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 2. 커넥션 맺기
			conn = getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = "INSERT INTO product(prodcode, prodname, price, quantity)"
			           + "VALUES (?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProdCode());
			pstmt.setString(2, product.getProdName());
			pstmt.setInt(3, product.getPrice());
			pstmt.setInt(4, product.getQuantity());
			
			// 4. 쿼리 실행
			addCnt = pstmt.executeUpdate();
			
			// 5. 결과 처리
			//    ==> 쿼리 실행 전에 중복여부 검사하므로 특별한
			//		  결과 처리가 필요 없음
		
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			// 6. 자원 해제
			closeResources(null, pstmt, conn);
			
		}
		
		return addCnt;
	}

	@Override
	public Product get(Product product) throws NotFoundException {
		
		// 조회하려는 제품 존재 여부 검사 : isExists()
		if (!isExists(product)) {
			throw new NotFoundException("조회", product);
		}
		
		// 0. 필요 객체 선언
		Product found = null;
		Connection conn = null;
		PreparedStatement pstmt	= null;
		ResultSet rs = null;
		
		try {

			// 2. 커넥션 맺기
			conn = getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = "SELECT p.prodcode" 
			           + "     , p.prodname"
			           + "     , p.price"
			           + "     , p.quantity" 
			           + "  FROM product p"
			           + " WHERE p.prodcode = ?";
			
			pstmt = conn.prepareStatement(sql);
		
			pstmt.setString(1, product.getProdCode());
			// 4. 쿼리 실행
			rs = pstmt.executeQuery();
			
			// 5. 결과 처리
			while (rs.next()) {
				String prodCode = rs.getString(1);
				String prodName = rs.getString(2);
				int price = rs.getInt(3);
				int quantity = rs.getInt(4);
				
				found = new Product(prodCode, prodName, price, quantity);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			// 6. 자원 해제
			closeResources(rs, pstmt, conn);		
		}
		
		return found;
	}

	@Override
	public int set(Product product) throws NotFoundException {
		
		// 수정하려는 제품 존재 여부 검사 : isExists()
		if (!isExists(product)) {
			throw new NotFoundException("수정", product);
		}
		
		int setCnt = 0;
		
		// 0. 필요 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {

			// 2. 커넥션 맺기
			conn = getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = "UPDATE product p"
					   + "   SET p.prodname = ?"
					   + "     , p.price = ?"
					   + "     , p.quantity = ?"
					   + "     , p.moddate = sysdate" 
					   + " WHERE p.prodcode = ?";
							
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, product.getProdName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setInt(3, product.getQuantity());
			pstmt.setString(4, product.getProdCode());
			
			// 4. 쿼리 실행
			setCnt = pstmt.executeUpdate();
			
			// 5. 결과 처리

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			// 6. 자원 해제
			closeResources(null, pstmt, conn);		
		}
		
		return setCnt;
	}

	@Override
	public int remove(Product product) throws NotFoundException {
		
		// 삭제하려는 제품 존재 여부 검사 : isExists()
		if (!isExists(product)) {
			throw new NotFoundException("삭제", product);
		}
		
		int rmvCnt = 0;
		
		// 0. 필요 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {

			// 2. 커넥션 맺기
			conn = getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = "DELETE product p" 
			           + " WHERE p.prodcode = ?";
			
			// product 매개변수에 
			// null 이 아닌 값이왔을 때는 1건 삭제
			// null 이 왔을 때는 전체 삭제로 진행
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProdCode());
			
			// 4. 쿼리 실행
			rmvCnt = pstmt.executeUpdate();
			
			// 5. 결과 처리

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			// 6. 자원 해제
			closeResources(null, pstmt, conn);			
		}
		
		return rmvCnt;
	}

	@Override
	public List<Product> getAllProducts() {
		
		// 0. 필요 객체 선언
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Product> allProds = new ArrayList<Product>();
		
		try {

			// 2. 커넥션 맺기
			conn = getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = "SELECT p.prodcode"
					   + "     , p.prodname"
					   + "     , p.price"
					   + "     , p.quantity "
					   + "  FROM product p";
					
			// 4. 쿼리 실행
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			// 5. 결과 처리
			while (rs.next()) {

				String prodCode = rs.getString(1);
				String prodName= rs.getString(2);
				int price = rs.getInt(3);
				int quantity= rs.getInt(4);
				
				Product prod = new Product(prodCode, prodName, price, quantity);
				
				allProds.add(prod);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			// 6. 자원 해제
			closeResources(rs, stmt, conn);		
		}
		
		return allProds;
	}

	// 지원 메소드 : 등록 수정 삭제 조회할 대상 제품의
	// 				 존재 여부를 확인하는 메소드
	private boolean isExists(Product product) {
		boolean isExist = false;
		
		// 0. 필요 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			// 2. 커넥션
			conn = getConnection(URL, USER, PASSWORD);
			// 3. 쿼리 준비
			String sql = "SELECT p.prodcode"
					   + "  FROM product p"
					   + " WHERE p.prodcode = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProdCode());
			
			// 4. 쿼리 실행
			rs = pstmt.executeQuery();
			
			// 5. 결과 처리
			while (rs.next()) {
				// 조회 결과가 있다는 뜻은
				// 동일 제품 코드가 등록되었음을 뜻함
				isExist = true;
			}
					
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			// 6. 자원 해제
			closeResources(rs, pstmt, conn);
		}
		
		return isExist;
	}
	
	/**
	 * 반복되는 자원해제 코드를 수행하는 지원 메소드
	 * 
	 * @param rs
	 * @param stmt
	 * @param conn
	 */
	private void closeResources(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if (rs != null)
				rs.close();
			
			if (stmt != null) 
				stmt.close();
			
			if (conn != null)
				conn.close();
			
		} catch (SQLException e) {
			System.err.println("자원 반납 오류!");
			e.printStackTrace();
			
		}
		
	}
	
}
