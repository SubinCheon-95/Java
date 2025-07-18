package p281;

/*
 * 날짜 : 2025/07/18
 * 이름 : 천수빈
 * 내용 : 교재 p281 예제 5-4 실습하기
 */
class Person {}
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Person {}

public class InstancsOfEx {
	static void print(Person p) {
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Student() ->\t");		print(new Student());
		System.out.print("new Researcher() ->\t");	print(new Researcher());
		System.out.print("new Professor() ->\t");	print(new Professor());
	}
}
