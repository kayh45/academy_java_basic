package control.ifstmt;

import java.util.Scanner;

/**
 * 다중 선택 if 구문을 사용하여 다음의 기준으로
 * 
 * 90점 이상 A
 * 80 ~ 89 B
 * 60 ~ 79 C
 * 40 ~ 59 D
 * 나머지 F
 * 
 * 입력된 점수에 대해 학점을 계산하는 클래스를 작성
 * 
 * 점수(score) int 타입
 * 학점(grade) char 타입을 사용할 것
 * 
 * @author PC38216
 *
 */

public class Grade {
	public static void main(String[] args) {

		//  1. 선언
		int score;
		char grade;
		Scanner scan;
		
		boolean isCorrect = false;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		score = -1;
		
		while(!isCorrect) {
			System.out.println("점수를 입력해주세요(0 ~ 100) : ");
			score = scan.nextInt();
			if (score > 100 || score < 0) {
				System.out.println("올바른 값을 입력하세요");
			}else {
				isCorrect = true;
			}
		}

		// 3. 사용
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 60) {
			grade = 'C';
		} else if (score >= 40) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.printf("당신의 점수는 %d 점이고, 학점은 %c 입니다. %n", score, grade);
		scan.close();
	}
}
