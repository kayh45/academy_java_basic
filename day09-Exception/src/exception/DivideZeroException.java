package exception;

/**
 * 0 으로 나누려는 시도가 있을 때
 * 발생시킬 예외를 정의하는 클래스
 * 
 * 모든 예외 클래스는 일반클래스와 동일하게 정의 가능
 * 
 * 예외 클래스 정의 시 주의 점
 * 1. 멤버 변수, 생성자, 메소드 정의는 동일
 * 2. Exception 클래스를 반드시 상속
 * 3. 예외 클래스의 이름은 반드시 Exception으로 끝나도록하여
 *    이 클래스가 예외 클래스 임을 명시
 *    
 * 예외 객체를 사용 시 주의 점
 * 1. new 로 생성하는 것 동일
 * 2. new 로 생성 후 throw (던져서) 발생 시켜야 함
 * @author PC38219
 *
 */
public class DivideZeroException extends Exception {

	// 멤버 변수 선언부
	private String reason;
	
	// 생성자 선언부
	// (1) 매개 변수가 없는 기본 생성자 : 발생 이유를 직접 할당
	public DivideZeroException() {
		this.reason = "0으로 나누려는 시도";
	}
	
	// (2) 매개 변수가 있는 생성자 : 발생 이유를 외부에서 전달받음
	public DivideZeroException(String reason) {
		this.reason = reason;
	}

	// 메소드 선언부
	@Override
	public String toString() {
		return this.reason;
	}
	
}
