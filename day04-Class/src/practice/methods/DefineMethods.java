package practice.methods;

public class DefineMethods {

	// 문제 1
	public void printTenTimes(int input) {
		for (int idx = 0; idx < 10; idx++) {
			System.out.println(input + (idx * 10));
		}
	}

	// 문제 2
	public void printSomebodysMessage(String message, String name) {
		System.out.printf("%s 의 메시지 : %s ... %n", name, message);
	}

	// 문제 3
	public void printMessage(String message) {
		System.out.println(message);
	}

	// 문제 4
	public String returnOriginalMessage(String message) {
		return message;
	}

	// 문제 5
	public int addTen(int input) {
		return input + 10;
	}

	// 문제 6
	public int substractTen(int input) {
		return input - 10;
	}

	// 문제 7
	public double makeDouble(double input) {
		return input * 2;
	}

	// 문제 8
	public double substractFivePointFive(double input) {
		return input - 5.5;
	}

	// 문제 9
	public String makeFullName(String name, String surname) {
		return surname + " " + name;
	}

	// 문제 10
	public int add(int x, int y) {
		return x + y;
	}

	// 문제 11
	public double add(double x, double y) {
		return x + y;
	}

	// 문제 12
	public void printMsgManyTimes(String message, int input) {
		for (int idx = 0; idx < input; idx++) {
			System.out.printf("%s (%d)%n", message, idx + 1);
		}
	}

	// 문제 13
	public void arithmetic(String operator, int x, int y) {
		double result = 0.0;

		if (operator.equals("+")) {
			result = x + y;
		}else if (operator.equals("-")) {
			result = x - y;
		}else if (operator.equals("*")) {
			result = x * y;
		}else if (operator.equals("/")) {
			result = (double)x / y;
		}else {
			System.out.printf("%s 는 잘못된 연산자 입니다.%n", operator);
			return;
		}

		System.out.printf("%d %s %d", x, operator, y);
		System.out.printf(" = %4.2f%n", result);
	}

	// 문제 14
	public double arithmetic(String operator, double x, double y) {
		double result = 0.0;

		switch (operator) {
		case "+" : result = x + y; break;
		case "-" : result = x - y; break;
		case "*" : result = x * y; break;
		case "/" : result = x / y; break;
		}

		return result;
	}

	// 문제 15
	public boolean isEven(int input) {
		if(input % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}



	//===========================================

	// 문제 1
	public int absolute(int x) {
		return (x < 0) ? -x : x;
	}

	// 문제 2
	public void findMultiple(int x) {
		for(int idx = x; idx <= 100; idx += x) {
			System.out.printf("%d%n", idx);
		}
	}

	// 문제 3
	public String decideSign(int x) {
		String result = null;
		if (x > 0) {
			result = "양의 정수";
		} else if (x < 0) {
			result = "음의 정수";
		} else {
			result = "정수 0";
		}
		
		return result;
	}

	// 문제 4
	public void repeatedMessage(String message, int repeat) {
		String[] messages = new String[repeat];

		for (int idx = 0; idx < repeat; idx++) {
			messages[idx] = message;
		}
		for (String msg : messages) {
			System.out.println(msg);
		}
	}

	// 문제 5
	public double calcCircleArea(int r) {
		return 3.14 * r * r;
	}

	// 문제 6
	public int[] makeMultipleNums(int x) {
		int count = 100 / x;
		int[] results = new int[count];
		int idx = 0;

		for (int num = x; num <= 100; num += x) {
			results[idx] = num;
			idx++;
		}

		return results;
	}







	
	
}
