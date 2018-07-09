package practice.methods;

/**
 * VarietyMethods 클래스를 테스트 하는 클래스
 * 
 * @author PC38219
 *
 */

public class MethodsTest {
	public static void main(String[] args) {

		VarietyMethods mMethods;
		
		mMethods = new VarietyMethods();
		
		mMethods.sayHello();
		mMethods.maxims("소크라테스", "너 자신을 알라");
		System.out.println("=============================\n");
		
		mMethods.birthYearMonth("킬리앙 음바페", 1998, 12);
		System.out.println("=============================\n");

		mMethods.printNineNineTable(8);
		System.out.println("=============================\n");
		
		int[] stages = new int[4];
		
		stages[0] = 2;
		stages[1] = 8;
		stages[2] = 9;
		stages[3] = 11;
		
		mMethods.printNineNineTableArray(stages);
		System.out.println("=============================\n");
		
		double cel = mMethods.fahToCel(100.0);
		System.out.printf("cel = %5.2f%n", cel);
		System.out.println("=============================\n");
	
		String result = mMethods.calcBmi(172, 88);
		System.out.printf("%s%n", result);
		System.out.println("=============================\n");

		int min = mMethods.min(100, -100);
		System.out.printf("min = %d%n", min);
		System.out.println("=============================\n");
	
		int max = mMethods.max(100, -100);
		System.out.printf("max = %d%n", max);
		System.out.println("=============================\n");
	
		int[] numbers = new int[4];
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 300;
		numbers[3] = 400;

		int sum = mMethods.sumOfArray(numbers);
		System.out.printf("100 ~ 400 까지 원소의 합 :  %4d%n", sum);
		System.out.println("=============================\n");

		double avg = mMethods.avgOfArray(numbers);
		System.out.printf("100 ~ 400 까지 원소의 평균 :  %6.2f%n", avg);
		System.out.println("=============================\n");
	
		
		mMethods.adder('+', 100, 90);
		mMethods.adder('-', 100, 90);
		System.out.println();
		System.out.println("=============================\n");
	
	
	
	}
}
