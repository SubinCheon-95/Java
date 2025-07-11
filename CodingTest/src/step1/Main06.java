package step1;

import java.util.Scanner;

/**
 * 날짜 : 2025/07/10
 * 이름 : 천수빈
 * 내용 : 백준 1단계 6번 문제 - 사칙연산
 * 
 * 문제 : 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 * 입력 : 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 * 출력 : 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
 */
public class Main06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result1 = a + b;
		int result2 = a - b;
		int result3 = a * b;
		int result4 = a / b;
		int result5 = a % b;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		sc.close();
	}
}
