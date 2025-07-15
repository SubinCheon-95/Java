package sub4;

public class Sedan extends Car {

	private int cc; // 배기량
	
	public Sedan(String name, String color, int speed, int cc) {
		// 부모 클래스 생성자 호출, 자식 클래스는 부모 클래스 속성을 초기화 해줘야 됨
		super(name, color, speed);
		this.cc = cc;
	}

	public void turbo() {
		//부모 클래스 speed 참조를 위해 접근 권한을 private 에서 protected 로 변경
		this.speed += 10;
	}
	
	public void show() {
		super.show(); // 부모 클래스 show() 호출
		System.out.println("배기량 : " + this.cc);
	}
	
}
