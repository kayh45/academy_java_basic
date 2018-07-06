package array.multi;

import java.util.Scanner;

public class ArcheryScore {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][9];
		int[] sum = new int [3];
		
		int max = 0;
		int topPlayer = 0;
		
		// 각 선수별로 과녁 점수를 입력받아 배열에 저장
		System.out.println("양궁 선수 점수 입력");
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1 ) + "번째 선수 점수 입력 : ");
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = scan.nextInt();
				sum[i] += score[i][j];
			}
		}
		System.out.println("우승 선수");
		for (int i = 0; i < sum.length; i++) {
			if (sum[i] > max) {
				max = sum[i];
				topPlayer = i;
			}
		}
		System.out.printf("우승 선수는 %d 번째 선수이며 총점은 %d입니다.%n", (topPlayer + 1), max);
		for (int idx = 0; idx < score[topPlayer].length; idx++) {
			System.out.printf("%d 차수 : %d점%n", (idx + 1) , score[topPlayer][idx]);
		}
	}
}
