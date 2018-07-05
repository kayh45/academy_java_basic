package control.loop;

public class SquareTable {
	public static void main(String[] args) {
		for(int num	= 1; num <= 10; num++) {
			System.out.printf("%3d x %3d = %3d%n", num, num, num*num);
		}
	}
}
