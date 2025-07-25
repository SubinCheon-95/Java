package test3;

/*
* 날짜 : 2025/07/16
* 이름 : 천수빈
* 내용 : 인터페이스 연습문제
*/
interface Buyer {
	public void buy();
}

interface Seller {
	public void sell();
}

class Customers implements Buyer, Seller {
	
	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}
}

public class test10 {

	public static void main(String[] args) {
		Buyer	buyer = new Customers();
		Seller 	seller = new Customers();
		
		buyer.buy();
		seller.sell();
	}
}
