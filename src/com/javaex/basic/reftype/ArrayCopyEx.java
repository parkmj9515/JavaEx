package com.javaex.basic.reftype;

import java.util.Arrays; // 배열 유틸리티클래스

public class ArrayCopyEx {

	public static void main(String[] args) {
		// for 문을 이용한 배열 복사 > 크기변경 불가 공간을 늘리고자 한다면 새 배열 생성 후 복사
//		arrayCopyByFor();
		// System을 이용한 배열 복사
		arrayCopyBySystem();
	}
	
	public static void arrayCopyByFor() {
		int scores[] = {1,2,3};  // .length ==3
		for(int i =0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
		
		// 새 공간을 만들어 복사
		int target[] = new int[10];
		
		for(int i=0; i < scores.length; i++) {
			target[i] = scores[i];
		}
		
		// 배열 유틸리티 클래스를 이용한 출력
		System.out.println(Arrays.toString(target));
	}
	
	public static void arrayCopyBySystem() {
	
		int source[] = {1,2,3};
		int target[] = new int[10];
		
		System.out.println("source:" + Arrays.toString(source));
		
		// 배열 복제
		System.arraycopy(source, // 원본 배열
						0, // 원본 배열 시작 인덱스
						target, // 복사 대상 배열
						3, // 대상 배열 시작 인덱스
						source.length);
		System.out.println("target:" + Arrays.toString(target));
		
		// Enhanced For
		// For (추출된 데이터 : 원본 배열 혹은 컬렉션)
		for(int val: target) {
			System.out.print(val + "\t");
		}
		System.out.println();
	} 

}
