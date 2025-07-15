package sub4;

public class Doctor extends Person {

	private String specialty;
	
	public Doctor(String name, int age, String specialty) {
		super(name, age);
		this.specialty = specialty;
	}
	
	public void introduce() {
		super.introduce();
		System.out.println("저는 " + this.specialty + " 의사 입니다.");
		
	}
}