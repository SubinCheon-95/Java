package sub2;

/*
 * 날짜 : 2025/07/15
 * 이름 : 천수빈
 * 내용 : 캡슐화 문제 풀기
 */

public class Book {
	
	public static void main(String[] args) {
		
		Book book1 = new Book("삼국지", "나관중", "10001", 10);
		
		book1.borrowBook();
		book1.getTitle();
		book1.show();
		
		boolean isOK = book1.borrowBook();
		
		if(isOK) {
			System.out.println(book1.getTitle() + "도서 대출 성공!");
		}else {
			System.out.println(book1.getTitle() + "도서 대출 실패!");
		}
		
		book1.show();
		
		Book book2 = new Book("명품 Java", "황기태", "10002", 1);
		
		boolean isOK1 = book2.borrowBook();
		boolean isOK2 = book2.borrowBook();
		
		if(isOK) {
			System.out.println(book2.getTitle() + "도서 대출 성공!");
		}else {
			System.out.println(book2.getTitle() + "도서 대출 실패!");
		}
		
		book2.show();
		
	}

}
