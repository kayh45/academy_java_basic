package io.data;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 객체 생성 후 객체의 데이터 필드(멤버변수)를 출력
 * 
 * -- 입력 --
 * 1. product 객체 생성
 * 
 * -- 출력 --
 * 2. node stream (파일에 출력 : FileOutputStream)
 * 3. filter stream (data 단위출력 : DataOutputStream)
 * 4. write 작업 : filter stream 의 메소드로 출력
 * 
 * -- 정리 --
 * 5. 출력 filter stream 닫기
 * 
 * @author PC38219
 *
 */
public class WriteProductData2 {

	public static void main(String[] args) {
		
		// 1. 입력 대신 객체 생성
		Product adidas = new Product("S001", "슈퍼스타", 87200, 5);
		DataOutputStream out = null;
		
		// 2. 출력 node stream 
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("adidas.data");
			
			// 3. 출력 filter stream
			out = new DataOutputStream(fos);
			
			// 4. write 작업 : filter stream 의 메소드 사용
			//    데이터 타입별로 출력 메소드를 지원
			out.writeUTF(adidas.getProdCode());
			out.writeUTF(adidas.getProdName());
			out.writeInt(adidas.getPrice());
			out.writeInt(adidas.getQuantity());
			
			System.out.println("adidas.data 파일이 생성되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			// 5. output filter stream 닫기
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
