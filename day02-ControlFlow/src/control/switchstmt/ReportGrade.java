package control.switchstmt;

import java.util.Scanner;

/**
 * switch 구문을 사용하여 다음의 기준으로
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

public class ReportGrade {
	public static void main(String[] args) {
		
		// 1. 선언
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
		switch(score / 10) {
		case 10 :
		case 9 : 
			grade = 'A';
			break; 
		case 8 : 
			grade = 'B';
			break;
		case 7 : 
		case 6 : 
			grade = 'C';
			break;
		case 5 : 
		case 4 : 
			grade = 'D';
			break;
		default : 
			grade = 'F';
		}
		
		// 출력
		System.out.printf("당신의 점수는 %d 점이고, 학점은 %c 입니다.", score, grade);
		scan.close();
		
	}
}
