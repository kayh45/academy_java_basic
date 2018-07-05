package control.ifstmt;

import java.util.Scanner;

public class CalcBMI {
	public static void main(String[] args) {

		double weight, height, bmi;
		String info;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몸무게(kg)를 입력하세요 : ");
		weight = scan.nextDouble();

		System.out.println("키(cm)를 입력하세요 : ");
		height = scan.nextDouble();		
		
		height /= 100;
		
		bmi = weight / (height * height);
		
		if (bmi >= 40.0) {
			info = "병적인 비만";
		} else if (bmi > 27.5) {
			info = "비만";
		} else if (bmi >= 23.0) {
			info = "과체중";
		} else if (bmi >= 18.5) {
			info = "정상";
		} else if (bmi >= 15.0) {
			info = "저체중";
		} else {
			info = "병적인 저체중";
		}
		
		System.out.printf("당신의 체중은 %5.1f kg이고, 키는 %5.1f cm 입니다.%n", weight, height * 100);
		System.out.printf("당신의 BMI는 %5.1f 이고,  %s 입니다.%n", bmi, info);
		
		scan.close();
		
	}
}
