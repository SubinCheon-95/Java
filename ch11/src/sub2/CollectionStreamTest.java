package sub2;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * 날짜 : 2025/07/24
 * 이름 : 천수빈
 * 내용 : 자바 컬렉션 스트림 실습하기
 */

class Person {
	private String name;
	private 
	
	
}
public class CollectionStreamTest {

	public static void main(String[] args) {
		
		List<String> persons = new ArrayList<>();
		
		person.add("김유신");
		person.add("김춘추");
		person.add("장보고");
		person.add("강감찬");
		person.add("이순신");
	
		// 외부 반복자를 이용한 출력
		Iterator<Spring> it = persons.Iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String person : persons) {
			System.out.println(person);
		}
		
		// 내부 반복자를 이용한 출력
		Stream<String> stream = persons.stream();
		stream.forEach((person) -> {
			System.out.println(person);
		});
	 
		List<Person> people = new ArrayList<>();
		people.add(new Person("김유신", 23));
		people.add(new Person("김춘추", 21));
		people.add(new Person("장보고", 33));
		people.add(new Person("강감찬", 43));
		people.add(new Person("이순신", 53));
	
		people.stream().forEach((p) -> {
			System.out.println(p);
		});
	
		people.stream().forEach(System.out::println);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	@Override
	public String toString() {
		return "CollectionStreamTest []";
	}
