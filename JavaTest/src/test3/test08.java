package test3;

/*
* 날짜 : 2025/07/16
* 이름 : 천수빈
* 내용 : 다형성 연습문제
*/
class Product {
	protected String productName;
	protected int price;
	
	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}
	
	public void spec(){}
}

class SmartPhone extends Product {

	public SmartPhone(String productName, int price) {
		super(productName, price);
	}
	
	@Override
	public void spec() {
		System.out.println("-------------------");
		System.out.println("제품명 : " + productName);
		System.out.println("제품가격 : " + price);
	}
}

class Computer extends Product {

	public Computer(String productName, int price) {
		super(productName, price);
	}
	
	@Override
	public void spec() {
		System.out.println("-------------------");
		System.out.println("제품명 : " + productName);
		System.out.println("제품가격 : " + price);
	}	
}

public class test08 {

	public static void main(String[] args) {
		
		Product p1 = new SmartPhone("갤럭시", 100);
		Product p2 = new Computer("맥북프로", 200);
		
		p1.spec();
		p2.spec();
	}
}
