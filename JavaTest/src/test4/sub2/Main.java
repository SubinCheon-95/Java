package test4.sub2;

/*
 * 날짜 : 2025/07/17
 * 이름 : 천수빈
 * 내용 : 자바 클래스 문제
 */
public class Main {
	
	public static void main(String[] args) {
		
		// 상품 객체 생성
		Product product = new Product("P001", "키보드", 35000, 10);

		// 상품 정보 출력
		product.printProductInfo();
		System.out.println("---------------------");
		
		// 가격 수정 및 재고 관리 테스트
		product.updatePrice(30000);
		System.out.println("---------------------");
		
		// 상품 정보 출력
		product.printProductInfo();
		System.out.println("---------------------");
		
		// 재고 추가
		product.addStock(5);
		System.out.println("---------------------");
		
		// 상품 정보 출력
		product.printProductInfo();
		System.out.println("---------------------");
	}
}
