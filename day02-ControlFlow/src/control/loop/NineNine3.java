package control.loop;

import java.util.Scanner;

public class NineNine3 {
	public static void main(String[] args) {
		
		int step;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("모아 출력할 단위를 입력하세요 : ");
		step = scan.nextInt();
		
		for (int stage = step; stage <= 9; stage += step) {
			System.out.println();
			for(int loop = step; loop > 0; loop--) {
				System.out.printf("%d단\t\t", stage - step);
			}
			System.out.println();
			for (int times = 1; times <= 9; times++) {
				for(int loop = step; loop > 0; loop--) {
					System.out.printf("%d x %d = %2d\t", stage, times, (stage - step) * times);
				}
				System.out.println();
			}			
		}
	}
}
