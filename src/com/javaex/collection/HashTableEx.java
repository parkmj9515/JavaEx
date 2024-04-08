package com.javaex.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;


class ClassRoom	{
	//	필드
	private String subject;
	private String roomName;

	//	생성자
public ClassRoom(String  subject) {
		//	containsValue에서 사용하기 위한 생성자
	this.subject = subject;
}


public ClassRoom(String subject, String roomName) {
	super();
	this.subject = subject;
	this.roomName = roomName;
}

@Override
public String toString() {
	return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";

}
//동등성 체크 로직
	//	1.subject의 hashcode를 전체 객체의 hashcode
	//	2.subject의 값이 동일하면 전체 객체의 값도 같다
	//	두개의 관문을 모두 통과해야 동등성을 확인


@Override
public int hashCode() {
	return subject.hashCode();
}


@Override
public boolean equals(Object obj) {
	if(obj instanceof ClassRoom) {
		ClassRoom other = (ClassRoom) obj;
		return subject.equals(other.subject);
	}
	return super.equals(obj);
}

}
public class HashTableEx {

	public static void main(String[] args) {
		//	map형 자료형
		//	KeySet List의 복합 자료형
		//	Key(KeySet은 순서없고,중복허용 x)
		//	Value는 Key를 통한 접근만 가능 , 중복허용
		
		//	HashTable 선언
		Map<String,ClassRoom> map = new Hashtable<>();	//	참조자료형 : 맵 인터페이스 , 실제클래스 : 해시테이블
		
		//	Map 데이터 넣기 : 
		map.put("101", new ClassRoom("Java","R101"));
		map.put("202", new ClassRoom("C","R202"));
		map.put("303", new ClassRoom("Python","R303"));
		map.put("404", new ClassRoom("Linux","R404"));
		
		//	출력	: 순서가 없다
		System.out.println(map);
		
		//	데이터 참조 : get
		System.out.println(map.get("303"));	//	키를 통한 접근가능
		
		//	데이터 변경 : put
		map.put("202", new ClassRoom("C#","R202"));
		System.out.println(map.get("202"));
		
		//	특정 키가 키셋에 포함되어 있는지 확인
		System.out.println(map.containsKey("202"));	//	키에 연결된 값을 참조(true,false)
		System.out.println(map.containsKey("404"));	
				
		
		//	특정 값을 포함 하고 있는지 확인
		//	값에 "Java"가 포함된 값이 있는지 확인
		System.out.println(map.containsValue("Java"));
		System.out.println(map.containsValue(new ClassRoom("Java")));
		
		//	Interator
		System.out.println("-----------Interator");
		Iterator<String> it = map.keySet().iterator();
		//	키셋으로 부터 이터레이터 추출
		
		while(it.hasNext()) {	//	뒤에 요소가 더 있는지 확인
			ClassRoom room = map.get(it.next());
			System.out.println(room);
	}
		//	맵 비우기
		map.clear();
		System.out.println(map);
		
	}

}