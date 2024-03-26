package com.javaex.oop.staticmember;

//	static 영역 활용
//	단 하나의 인스턴스만 유지
//		new Sigleton() 실행 x
public class Singleton {
	private static Singleton instance = 
						new Singleton();
	//생성자
	private Singleton() {
		// new 생성 불가
	}
	
	public static Singleton getInstance() {
		// 유일한 인스턴스 반환하는 메서드
		return instance;
	}
}
