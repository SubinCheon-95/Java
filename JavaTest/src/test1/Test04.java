package test1;

import java.util.Scanner;

/**
 * 날짜 : 2025/07/09
 * 이름 : 천수빈
 * 내용 : 자바 조건문 연습문제
 */
public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade = 0;
		
		System.out.println("입력한 점수는 " + score + "입니다.");
		
		if(score >= 90 && score <= 100) {
			char grade1 = 'A';
		}else if(score >= 80 && score <= 90) {
			char grade2 = 'B';
		}else if(score >= 70 && score <= 80) {
			char grade3 = 'C';
		}else if(score >= 60 && score <= 70) {
			char grade4 = 'D';
		}else {
			char grade5 = 'F';
		}
				
		System.out.printf("등급은 %c입니다.", grade);
	}
	
}
