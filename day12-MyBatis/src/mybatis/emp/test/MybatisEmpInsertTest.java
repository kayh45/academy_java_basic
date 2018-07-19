package mybatis.emp.test;

import static mybatis.emp.client.MybatisClient.getFactory;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.vo.Emp;

/**
 * 직원 정보 1건을 데이터베이스 테이블 emp에 삽입하는 클래스
 * @author PC38219
 *
 */
public class MybatisEmpInsertTest {

	public static void main(String[] args) {

		// 0. sqlSession Factory 생성
		SqlSessionFactory factory = getFactory();
		
		// 1. sqlSession 얻기
		// DML 작업을 할 때는 세션을 오픈할 때
		// 자바 애플리케이션에서 dommit 이 이루어 지도록 해야 함
		// JDBC 는 기본 auto-commit 이므로 신경쓰지 않아도 좋지만
		// mybatis는 기본 non auto-comit 이므로 auto-commit으로 변경해야함
		
		// optionSession() 메소드의 매개변수로 true를
		// 전송해야 auto-commit 이 활성화 됨
		SqlSession session = factory.openSession(true);
		
		try {
			// 2. 세션 객체를 통해서 쿼리 실행
			
			// insert 의 parameter 로 넘길 emp 객체 생성
			Emp emp = new Emp();
			emp.setEmpno(3210);
			emp.setEname("KANG");
			emp.setJob("DEV");
			
			// insert 수행하며 emp 객체를 전달
			int addCnt = session.insert("mybatis.emp.mapper.EmpMapper.insert", emp);
			
			System.out.println("삽입된 행의 개수 : " + addCnt);
			
		} finally {
			// 3. sqlSession 닫기
			session.close();
			
		}
		
		
	}

}
