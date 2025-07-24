package test5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* 날짜 : 2025/07/23
* 이름 : 천수빈
* 내용 : 객체 컬렉션 연습문제
*/
class Orange {
	private String country;
	private String price;
	
	???
			
	???
}

public class Test09 {
	
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<>();
		list1.add(new Orange("파주", 3000));
		list1.add(new Orange("수원", 3000));
		
		ArrayList list2 = new ArrayList<>();
		list2.add(new Orange("청주", 3000));
		list2.add(new Orange("충주", 3000));
		
		ArrayList list3 = new ArrayList<>();
		list3.add(new Orange("밀양", 3000));
		list3.add(new Orange("함안", 3000));
		
		HashMap<> map = new HashMap<>();
		map.put("gyeonggi", list1);
		map.put("chungbuk", list2);
		map.put("gyungnam", list3);
		
		List<Orange> list = map.???;
		Orange orange = list.get(0);
		orange.show();
		
		map.???;
		map.???;
		
	}
}
