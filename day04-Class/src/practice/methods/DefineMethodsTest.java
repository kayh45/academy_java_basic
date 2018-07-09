package practice.methods;

public class DefineMethodsTest {

	public static void main(String[] args) {
		
		DefineMethods mMethod = new DefineMethods();
		
		// 문제 1
		System.out.println("\n========= 문제 1 ===========");
		mMethod.printTenTimes(23);
		
		
		// 문제 2
		System.out.println("\n========= 문제 2 ===========");
		mMethod.printSomebodysMessage("집에 가고 싶다", "강현");
		
		// 문제 3
		System.out.println("\n========= 문제 3 ===========");
		mMethod.printMessage("문제 3번을 출력");
		
		// 문제 4
		System.out.println("\n========= 문제 4 ===========");
		String message = mMethod.returnOriginalMessage("문제 4번을 출력");
		System.out.println(message); 
	
		// 문제 5
		System.out.println("\n========= 문제 5 ===========");
		System.out.printf("%d + 10 = %d%n", 35, mMethod.addTen(35));
				
		// 문제 6
		System.out.println("\n========= 문제 6 ===========");
		System.out.printf("%d - 10 = %d%n", 27, mMethod.substractTen(27));
		
		// 문제 7
		System.out.println("\n========= 문제 7 ===========");
		System.out.printf("%4.2f * 2 = %4.2f%n", 48.6, mMethod.makeDouble(48.6));

		// 문제 8
		System.out.println("\n========= 문제 8 ===========");
		System.out.printf("%4.2f - 5.5 = %4.2f%n", 6.3, mMethod.substractFivePointFive(6.3));
		
		// 문제 9
		System.out.println("\n========= 문제 9 ===========");
		System.out.println(mMethod.makeFullName("Hyeon", "Kang"));
		
		// 문제 10
		System.out.println("\n========= 문제 10 ===========");
		System.out.printf(" 10 + 5 = %d%n", mMethod.add(10, 5));

		// 문제 11
		System.out.println("\n========= 문제 11 ===========");
		System.out.printf(" 10.2 + 5.5 = %2.1f%n", mMethod.add(10.2, 5.5));
		
		// 문제 12
		System.out.println("\n========= 문제 12 ===========");
		mMethod.printMsgManyTimes("청년취업아카데미", 5);
		
		// 문제 13
		System.out.println("\n========= 문제 13 ===========");
		mMethod.arithmetic("*", 4, 5);
		mMethod.arithmetic("_", 4, 5);

		// 문제 14
		System.out.println("\n========= 문제 14 ===========");
		System.out.printf("4.2 + 5.8 = %2.1f%n", mMethod.arithmetic("+", 4.2, 5.8));
		
		// 문제 15
		System.out.println("\n========= 문제 15 ===========");
		System.out.printf("%d은(는) 짝수인가? %b%n", 1, mMethod.isEven(1));
		System.out.printf("%d은(는) 짝수인가? %b%n", 2, mMethod.isEven(2));
		
		System.out.println();
		System.out.println("==========================================");
		
		// 문제 1
		System.out.println("\n========= 문제 1 ===========");
		System.out.printf("%d의 절댓값 = %d%n", 7, mMethod.absolute(7));
		System.out.printf("%d의 절댓값 = %d%n", -8, mMethod.absolute(-8));
		
		// 문제 2
		System.out.println("\n========= 문제 2 ===========");
		mMethod.findMultiple(8);
		
		// 문제 3 
		System.out.println("\n========= 문제 3 ===========");
		System.out.printf("%d는 %s%n", -8, mMethod.decideSign(-8));
		System.out.printf("%d는 %s%n", 0, mMethod.decideSign(0));
		System.out.printf("%d는 %s%n", 8, mMethod.decideSign(8));
		
		// 문제 4 
		System.out.println("\n========= 문제 4 ===========");
		mMethod.repeatedMessage("Java Programing", 5);
		
		// 문제 5
		System.out.println("\n========= 문제 5 ===========");
		System.out.printf("반지름이 %d인 원의 넓이 : %4.2f%n", 7, mMethod.calcCircleArea(7));
	
		// 문제 6
		System.out.println("\n========= 문제 6 ===========");
		int[] resultArray;

		resultArray = mMethod.makeMultipleNums(21);
		
		for (int num : resultArray) {
			System.out.println(num);
		}
	
	}
}
