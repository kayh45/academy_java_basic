package control.ifstmt;

import java.util.Scanner;

/**
 * 하나의 정수를 입력받아서 음수인지, 0인지, 양수인지를 판단하는 클래스이다.
 * ------------------------------------ 값의 부호를 판단할 때 if ~ else if ~ else 구문을 사용
 * ------------------------------------
 * 
 * @author PC38216
 *
 */

public class PositiveNegative {
	public static void main(String[] args) {
		
		// 1. 선언
		int input = 0;
		String result;
		Scanner scan;

		// 2. 초기화
		scan = new Scanner(System.in);

		System.out.println("정수를 입력해주세요 : ");
		try {
			input = scan.nextInt();
			
			// 3. 사용			
			if (input > 0) {
				result = "양수";
			} else if (input < 0) {
				result = "음수";
			} else {
				result = "0";
			}

			// 출력			
			System.out.printf("입력된 값 %d(은)는 %s입니다.%n", input, result);
		} catch(Exception e) {
			System.out.println("올바른 값이 아닙니다.");
		}
		
		scan.close();
		
	}
}
