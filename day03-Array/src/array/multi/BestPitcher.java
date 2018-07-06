package array.multi;

import java.util.Scanner;

public class BestPitcher {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[][] ERA = new double[3][5];
		double min = 10.0;
		
		int team = 0;
		int player = 0;
		
		// 각 팀별로 각 투수의 방어율 입력받아 배열에 저장한다.
		System.out.println("1선발, 2선발, 3선발, 4선발, 5선발 방어율 입력");
		for (int i = 0; i < ERA.length; i++) {
			System.out.print((i+1) + "번 째 팀 1 ~ 5선발 투수 방어율 : ");
			for(int j = 0; j < ERA[i].length; j++) {
				ERA[i][j] = scan.nextDouble();
			}
		}
		
		System.out.println("최고의 투수는 ");
		
		for (int i = 0; i < ERA.length; i++) {
			for(int j = 0; j < ERA[i].length; j++) {
				if (ERA[i][j] < min ) {
					 min = ERA[i][j];
					 team = i + 1;
					 player = j + 1;
				}
			} 
		}
		
		System.out.printf("%d번 째 팀의 %d선발 투수이며, 방어율은 %2.1f입니다.", team, player, min);
		scan.close();
	}
}
