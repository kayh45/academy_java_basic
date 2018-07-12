package calc;

import static calc.Calculator.*;

/**
 * 산술연산을 하틑 클래스인
 * Calculator를 테스트 한다.
 * @author PC38219
 *
 */
public class CalculatorTest {

	public static void main(String[] args) {
		
		// 1. 선언
		Calculator calc;
		
		// 2. 초기화 : Calculator 클래스의 모든 생성자 정의를 생략하여
		//             기본 생성자가 자동 제공됨.
		calc = new Calculator(); // non-static 영역의 명시적 초기화 : new 사용
		
		// 3. 사용
		// Calculator 클래스의 add() 메소드 사용
		// (1) staitc -> non-static : 다른 클래스
		int addResult = calc.add(100, 200);
		System.out.println("100 + 200 = " + addResult);
		
		// 이 클래스에 있는 add() 메소드를 사용
		// 이 클래스 자신의 객체를 생성 후 사용 가능
		// (2) static -> non-static : 같은 클래스
		CalculatorTest cTest = new CalculatorTest();
		cTest.add(100, 300);
		
		// 동일 클래스안의 static 영역끼리의 호출 : 이름만으로 바로 사용가능
		// (3) static -> static : 같은 클래스
		subtract(300, 250);
		
		// 다른 클래스의 static 영역끼리의 호출 : 앞에 클래스 이름을 명시
		// (4) static -> static : 다른 클래스
		Calculator.subtract(20.0, 45.0);
		
		// (5) static import를 사용하여
		//     마치 내가 가지고 있는 메소드 처럼 호출가능
		Calculator.multiply(10.0, 20.0);
		multiply(10.0, 20.0);
	}
	
	// add 메소드 정의 : non-static
	public int add(int x, int y) {
		System.out.printf("%d + %d = %d%n", x, y, x + y);
		
		return x + y;
	}

	public static int subtract(int x, int y) {
		System.out.printf("%d - %d = %d", x, y, x - y);
		
		return x - y;
	}
	
}
