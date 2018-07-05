package control.loop;

/**
 * 1 ~ 100 사이의 짝수의 합을 계산하는 클래스
 * while을 활용
 * @author PC38216
 *
 */

public class SumOfEvens {
	public static void main(String[] args) {

		int number = 2;
		int sum = 0;
		
		while(number <= 100) {
			sum += number;
			number += 2;
		}
		
//		for (int idx = 2; idx <= 100; idx += 2) {
//			sum += idx;
//		}
		
		System.out.printf("1 ~ 100 사이의 짝수의 합 : %d", sum);
	}
}
