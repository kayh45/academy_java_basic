package control.loop;

public class NineNineTable {
	public static void main(String[] args) {
		// 외부 for 반목문 : 2 ~ 9단을 반복
		for (int stage = 2; stage <= 9; stage++) {
			
			// 단의 제목 출력
			System.out.printf("%n%d 단%n", stage);
			
			// 내부 for 반복문 : 1 ~ 9 곱해지는 수를 반복
			for (int times = 1; times <= 9; times++) {
				System.out.printf("%d x %d = %2d%n", stage, times, stage * times);
			}
		}
	}
}
