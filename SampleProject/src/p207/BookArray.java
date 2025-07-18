package p207;

import java.util.Scanner;

/*
 * 날짜 : 2025/07/18
 * 이름 : 천수빈
 * 내용 : 교재 p207 예제 4-7 실습하기
 */
class Book{
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		Book [] book = new Book[2];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<book.length ; i++) {
			System.out.print("제목>>");
			String title = sc.nextLine();
			System.out.print("저자>>");
			String author = sc.nextLine();
			book[i] = new Book(title, author);
		}
		
		for(int i=0 ; i<book.length ; i++)
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
		
		sc.close();
	}
}
