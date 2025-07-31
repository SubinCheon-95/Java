package step1;

import java.util.Scanner;

/**
 * 날짜 : 2025/07/10
 * 이름 : 천수빈
 * 내용 : 백준 1단계 11번 문제 - 꼬마 정민
 * 
 * 문제 : 문제 : 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
 * 입력 : 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10의 12승)이 공백을 사이에 두고 주어진다.
 * 출력 : A+B+C의 값을 출력한다.
 */
public class Main11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		
		long rs = A + B + C;
		
		System.out.println(rs);
		
		sc.close();
	}
}
