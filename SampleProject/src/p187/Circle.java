package p187;

/*
 * 날짜 : 2025/07/18
 * 이름 : 천수빈
 * 내용 : 교재 p187 실습하기
 */
public class Circle {

	int radius;
	String name;
	
	public Circle() {}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		pizza.radius = 2;
		pizza.name = "자바도넛";
		area = donut.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
	}
}
