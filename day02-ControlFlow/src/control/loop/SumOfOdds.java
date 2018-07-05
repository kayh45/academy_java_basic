package control.loop;

/**
 * 1 ~ 100 사이의 홀수의 합을 구하는 클래스
 * 
 * while 구문을 활용
 * 
 * @author PC38216
 *
 */

public class SumOfOdds {
	public static void main(String[] args) {
		

		int number = 1;
		int sum = 0;
		
		while (number <= 100) {
			sum += number; 
			number += 2;
		}
		System.out.printf("1 ~ 100 사이의 홀수의 합 = %d %n", sum);
		
		// 다른 풀이
		number = 1;
		sum = 0;
		while (number <= 100) {
			if(number%2 == 1) {
				sum += number;
			}
			number++;
		}
		System.out.printf("1 ~ 100 사이의 홀수의 합 = %d %n", sum);
	}
}
