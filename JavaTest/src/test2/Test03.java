package test2;

/**
 * 날짜 : 2025/07/10
 * 이름 : 천수빈
 * 내용 : 자바 배열 역순으로 정렬 연습문제
 */
public class Test03 {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 현재 배열 출력
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(arr[i]+", ");
		}
		
		System.out.println("\n");
		
	// 역순으로 정렬된 배열 출력
		for(int n : arr) {
			System.out.print(n + ", ");
		}
	}
}
