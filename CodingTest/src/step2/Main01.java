package step2;

import java.util.Scanner;

/**
 * 날짜 : 2025/07/12
 * 이름 : 천수빈
 * 내용 : 백준 2단계 1번 문제 - 두 수 비교하기
 * 
 * 문제 : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 * 출력 : 첫째 줄에 다음 세 가지 중 하나를 출력한다.	
 * 		 A가 B보다 큰 경우에는 '>'를 출력한다.
 * 		 A가 B보다 작은 경우에는 '<'를 출력한다.
 * 		 A와 B가 같은 경우에는 '=='를 출력한다.
 */
public class Main01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A >= -10000 && A <= 10000 && B >= -10000 && B <= 10000) {
			if(A > B) {
				System.out.println(">");
			}else if(A < B) {
				System.out.println("<");
			}else {
				System.out.println("==");
			}
		}
		
		sc.close();
	}
}