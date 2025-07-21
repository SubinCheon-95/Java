package sub1;

public class Apple extends Object { // 자바의 모든 클래스는 암묵적으로 Object 를 상속
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() { // 마우스 R + Source + Generate toString
		// 클래스 정보 출력 메서드
		return "Apple [country=" + country + ", price=" + price + "]";
	}
}
