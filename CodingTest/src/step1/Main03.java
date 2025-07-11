package step1;

import java.util.Scanner;

/**
 * 날짜 : 2025/07/10
 * 이름 : 천수빈
 * 내용 : 백준 1단계 3번 문제 - A-B
 * 
 * 문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력 : 첫째 줄에 A-B를 출력한다.
 */
public class Main03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a-b);
		
		sc.close();
	}
}