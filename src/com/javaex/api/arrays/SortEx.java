package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

//	사용자 정의 클래스를 Sort 하고자 할때 Comparable 인터페이스를 구현 해야한다
class Member implements Comparable {


	//필드
	String name;

	//	생성자
public Member(String name) {
	this.name = name;
	
}

@Override
public String toString() {
	return "Member [name=" + name + "]";
}
	//	두객체의 선후 관계를 비교해서 객체의 순서가 같으면 0
	//	-1,0,1 return
	//	비교대상의 순서가 동일 	= 0
	//	비교대상의 순서가 작으면 	= 음수(-) -1
	//	비교대상의 순서가 크면  	= 양수(+)  1
	@Override
	public int compareTo(Object o) {	//	member와 obj가 비교 가능한지 먼저 확인
		if(o instanceof Member) {
			// Member로 캐스팅 가능
			Member other = (Member)o;
			//	대소 관계의 비교는 name 필드로 비교
			return name.compareTo(other.name);
		}
	return 0;
}
}

public class SortEx {

	public static void main(String[] args) {
		//	1.기본 소팅
			basicSort();
			//	2.역순정렬
				basicDescSort();
				//	3.사용자 정의 클래스 정렬
					customClassSort();
	}
	//	기본정렬
	private static void basicSort() {
		int[] scores = {80,50,30,90,75,88,77};
		System.out.println("배열 원본:"+Arrays.toString(scores));	//	작은것 > 큰것 오름차순( Ascending) , 큰것 > 작은것 내림차순 ( Desending)
		
		//	오름차순 : Ascending 
		Arrays.sort(scores);
		System.out.println("오름차순 정렬"+Arrays.toString(scores));
	}
	
	//	역순정렬
	private static void basicDescSort() {
		Integer[] scores = {80,50,30,90,75,88,77};	
		System.out.println("배열 원본:"+Arrays.toString(scores));
		
		//	내림차순 : Descending
		Arrays.sort (scores,		//	정럴할 배열
					Collections.reverseOrder());
		System.out.println("내림차순 정렬:" + Arrays.toString(scores));
		//	객체 내부의 Comparerator로 객체의 선후 관계를 규정해야 하기 떄문에 
		//	프리미티브 타입은 역순정렬 될수 없다
	}
	//	사용자 정의 클래스 정렬
	private static void customClassSort() {
		Member[] members = {new Member("홍길동"),
							new Member("고길동"),
							new Member("장길산"),
							new Member("임꺽정")
			};	//	네임필드 기준
				System.out.println("원본 배열:"+Arrays.toString(members));
				//	오름차순 정렬(가나다)
				Arrays.sort(members);
				System.out.println("오름차순 정렬:"+Arrays.toString(members));				
				//	역순
				Arrays.sort(members,Collections.reverseOrder());
				System.out.println("내림차순 정렬:" + Arrays.toString(members));

	
	}
	

}

