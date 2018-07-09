package practice.methods;
/**
 * 메소드 작성 실습 클래스
 * 
 * 
 * @author PC38219
 *
 */
public class VarietyMethods {

	/**
	 * 화면에 hello, world! 를 출력하는 메소드
	 */
	public void sayHello() {
		System.out.println("Hello, World!");
	}
	
	/**
	 * 매개변수로
	 * 유명인(명사) 의 이름(name)을 입력 받고
	 * 그 사람이 한 유명한 문구(maxim)를 입력받아
	 * 
	 * 000(이)가 말하길 "....." 라고 하였다.
	 * 라는 문장을 출력하는 메소드
	 * maxims를 정의하라
	 * 
	 * 
	 */
	
	public void maxims(String name, String maxim) {
		
		System.out.printf("%s(이)가 말하길, \"%s\"라고 하였다.", name, maxim);		
		
	}
	
}
