package com.javaex.collection.list;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// 벡터 선언
		// 모든 객체 (Objcet)를 담을수 있는 컬렉션 객체
		// .elementAt 등 참조를 위해서 실제 클래스로 캐스팅 필요
		
		Vector v = new Vector(); // 기본 벡터 버퍼 용량:10
		System.out.println("Size:" + v.size() + "  " + "Capacity:" + v.capacity()); // size = head의 위치

		for (int i = 0; i < 10; i++) {
			v.addElement(i); // auto boxing
		}
		System.out.println("Size:" + v.size() + "  " + "Capacity:" + v.capacity());

		// 허용량 추가
		v.addElement(10);
		System.out.println("Size:" + v.size() + "  " + "Capacity:" + v.capacity());

		// 조회 : elementAt
		Integer val = (Integer) v.elementAt(5); // elementAt > object 리턴 / 캐스팅 필요
		System.out.println(".elementAt(5):" + val);

		// 역참조(검색)
		// 객체의 index 조회
		System.out.println(".indexOf(5):" + v.indexOf(5));
		System.out.println(".indexOf(20):" + v.indexOf(20)); // 없는 객체 인데스는 -1

		// 객체 포함 여부 : .contains / boolean
		System.out.println(".contains(7):" + v.contains(7)); // true
		System.out.println(".contains(20):" + v.contains(20)); // false

		// 객체 삭제 : .removeElement
		v.removeElement(7);

		for (int i = 0; i < v.size(); i++) {
			Integer item = (Integer) v.elementAt(i);
			System.out.print(item + " ");
		}
		// Collection FramWork 에서는 루프의 개선이 필요
		// ToDo : 루프 방식 개선
		System.out.println();

		System.out.println("Size:" + v.size() + "  " + "Capacity:" + v.capacity());

		// 버퍼 비우기
		v.clear();
		System.out.println("v=" + v);
		System.out.println("Size:" + v.size() + "  " + "Capacity:" + v.capacity());

		//	Generic을 사용하여 코드 개선 가능
		//	Ex)	Number를 상속한 모든 객체를 담을 수 있는 Generic을 사용
		Vector<? super Number> v2 = new Vector();	//	Number 상속받은 클래스만 저장 
		v2.addElement(Integer.valueOf(2024));	//
		v2.addElement(Float.valueOf(3.14159f));
//		v2.addElement("Vector");	//	String은 Number를 상속 받지 않은 객체
		
		//	ToDo 개선된 방식으로 루프 돌리기
		
		
	}

}
