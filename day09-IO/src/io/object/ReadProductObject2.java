package io.object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * adidas.obj 파일을 읽어서 객체를 생성학고
 * 표준 출력으로 생성된 객체의 내용을 확인
 * 
 * -- 입력 --
 * 1. node stream (파일 : FileInputStream)
 * 2. filter stream (객체 입력 : ObjectInputStream)
 * 3. read 작업 : filter stream 메소드 사용
 * 
 * -- 출력 --
 * 4. 표준 출력 (콘솔 : System.out)
 * 
 * -- 정리 --
 * 5. 입력 filter stream 닫기
 * 
 * @author PC38219
 *
 */
public class ReadProductObject2 {

	public static void main(String[] args) {

		// 1. node input stream : 
		FileInputStream fis;
		ObjectInputStream in = null;
		
		try {
			fis = new FileInputStream("adidas.obj");
			
			// 2. input filter stream 
			in = new ObjectInputStream(fis);
			
			// 3. read 작업
			Product adidas = (Product) in.readObject();
			
			// 4. 객체 표준 출력
			System.out.println(adidas);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} finally {
			// 5. 입력 filter stream 닫기
			try {
				if (in != null);
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
