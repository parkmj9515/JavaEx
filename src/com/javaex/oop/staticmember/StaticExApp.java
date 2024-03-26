package com.javaex.oop.staticmember;

public class StaticExApp {
	
	public static void main(String[] args) {
		
		StaticEx s1 = new StaticEx();
		System.out.println("refcount:" + s1.refcount);
		
		StaticEx s2 = new StaticEx();
		System.out.println("refcount:" + StaticEx.refcount);
		
		StaticEx s3 = new StaticEx();
		System.out.println("refcount:" + StaticEx.refcount);
		
		// 중요 NOTE.
		// 이 부분은 스택틱 영역에서 메모리 공유를 테스트하기 위함
		// 테스트일뿐 직접 가비지 컬렉터를 호출하는것은 권장하지않습니다
		s3=null;		// 참조 해제
		System.out.println("s3 해제");
		System.out.println("refcount:"+ StaticEx.refcount);
		
		System.gc();	// 가비지 컬렉터 호출
		try {
			Thread.sleep(3000); // 3초 대기
			System.out.println("refcount:"+ StaticEx.refcount);
		} catch (Exception e) {
			
		}
	}

}
