package array.multi;

public class MultiDarray {
	public static void main(String[] args) {

		char stars[][];
		
		stars = new char[6][];
		
		for (int outer = 0; outer < stars.length; outer++) {
			stars[outer] = new char[outer + 1];
			for (int inner = 0; inner < stars[outer].length; inner++) {
				stars[outer][inner] = '☆';
			}
		}
		
		for (char[] outer: stars) {
			for (char star: outer) {
				System.out.printf("%3c", star);
			}
			System.out.println();
		}
		
	}
}
