package type.reference;

/**
 * 기본형 8가지 외의 모든 타입인 
 * 참조형 타입을 테스트 하는 클래스이다.
 * 
 * 참조형의 대표격인 String(문자열) 타입으로 
 * 테스트를 해보자.
 * 
 * @author PC38216
 *
 */

public class ReferenceTest {
	public static void main(String[] args) {
		// 1. 선언 : 선언할 떄 타입에 기본형 
		//			 8가지가 아닌 이름이 오면 
		// 			 무조건 참조형
		// 			 => 변수 칸에 화살표가 저장되고 
		//			 진짜 값은 다른 곳에 존재 하는 타입
		String name;

		// 2. 초기화
		name = "강현";
		
		// 3. 사용
		System.out.println("name = " + name);

		
	}
}
