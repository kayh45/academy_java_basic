package control.loop;

public class NineNine2 {
	public static void main(String[] args) {
		for (int stage = 2; stage <= 9; stage += 3) {				
			System.out.println();
			System.out.printf("%d단\t\t", stage);
			System.out.printf("%d단\t\t", stage + 1);
			if(stage < 8) {
				System.out.printf("%d단", stage + 2);	
			}
			System.out.println();
			for (int times = 1; times <= 9; times++) {
				System.out.printf("%d x %d = %2d\t", stage, times, stage * times);
				System.out.printf("%d x %d = %2d\t", stage+1, times, (stage + 1) * times);
				if (stage < 8) {
					System.out.printf("%d x %d = %2d", stage+2, times, (stage + 2) * times);
				} 
				System.out.println();
			}			
		}
	}
}
