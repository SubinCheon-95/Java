package sub2;

/*
 * 날짜 : 2025/07/15
 * 이름 : 천수빈
 * 내용 : 캡슐화 문제 풀기
 */

public class Book {
	
	public static void main(String[] args) {
		
		Bookstore book1 = new Bookstore("삼국지", "나관중", "10001", 10);
		book1.show();
		
		boolean isOK = book1.borrowbook();
		
		if(isOK) {
			System.out.println(book1.getTitle() + "도서 대출 성공!");
		}else {
			System.out.println(book1.getTitle() + "도서 대출 실패!");
		}
		
		book1.show();
		
		Bookstore book2 = new Bookstore("명품 Java", "황기태", "10002", 1);
		
		boolean isOK1 = book2.borrowbook();
		boolean isOK2 = book2.borrowbook();
		
		if(isOK) {
			System.out.println(book2.getTitle() + "도서 대출 성공!");
		}else {
			System.out.println(book2.getTitle() + "도서 대출 실패!");
		}
		
		book2.show();
		
	}

}
