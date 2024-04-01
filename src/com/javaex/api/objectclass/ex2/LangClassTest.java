package com.javaex.api.objectclass.ex2;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		System.out.println(s1==s2);	//	참조 주소 비교
		System.out.println(s1.equals(s2));	//	내부 데이터 비교
		
		//	객체 설계시 내부 데이터 값을 비교하기 위한 로직을
		//	equals 메서드에 정의해줘야 한다
		Point p = new Point(10,10);
		Point p2 = new Point(10,10);
		
		System.out.println(p==p2);	//	참조 주소 비교
		System.out.println(p.equals(p2));	//	객체 내부 데이터 비교
	}

}
