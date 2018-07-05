package control.ifstmt;

import java.util.Scanner;

/**
 * 세 정수를 입력받아서
 * 그 중 가장 작은 정수를 판별하는 클래스
 * 
 * 가장 작은 정수를 판별할 때 중첩 if ~ else 를 사용
 * 
 * @author PC38216
 *
 */

public class MinOfThree {
	public static void main(String[] args) {

		// 1. 선언
		int num1, num2, num3;
		int min;
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		
		System.out.println("세 정수를 입력해주세요(space bar로 분리하여 입력)");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		// 3. 사용		
		if (num1 < num2) {
			if (num1 < num3) {
				min = num1;
			} else {
				min = num3;
			}
		} else {
			if (num2 < num3) {
				min = num2;
			} else {
				min = num3;
			}
		}
		
		// 출력
		System.out.printf("입력된 세 값 : %d, %d, %d %n", num1, num2, num3);
		System.out.printf("그 중 가장 작은 값 : %d %n", min);
		
		scan.close();
	}
}
