package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// List 객체 x 인터페이스 o
		// 순서가 있다
		// 중복 허용
		List<String> lst = new LinkedList<>();

		// 객체 추가 : .add
		lst.add("Java");
		lst.add("c");
		lst.add("C++");
		lst.add("Python");

		System.out.println("lst=" + lst);

		// 객체 삽입
		lst.add(2, "C#");
		System.out.println("lst=" + lst);

		// 리스트는 중복 삽입을 허용한다
		lst.add("Java");
		System.out.println("lst=" + lst);

		System.out.println("Size=" + lst.size());
//		System.out.println("Capacity="+lst.capacity());

		// 삭제 : index삭제
		lst.remove(2);
		// 객체 삭제
		lst.remove("Python");

		System.out.println("lst=" + lst);
		
		
		//	ToDo : List 순회
		//	비우자
		lst.clear();
		System.out.println("lst=" + lst);
	}

}
