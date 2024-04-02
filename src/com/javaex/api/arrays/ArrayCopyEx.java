package com.javaex.api.arrays;

import java.util.Arrays;

public class ArrayCopyEx {
	
	//	배열 복제
	public static void main(String[] args) {
		char [] src = "Java Programming".toCharArray();
		System.out.println(src);
		System.out.println(Arrays.toString(src));
		//	System을 이용한 Copy
		char target[] = new char[src.length];
		System.arraycopy(src,	//	원본 배열
				0,				//	복사 시작 인덱스
				target,			//	target 배열
				0,				//	target 배열의 복사 시작 위치
				src.length);				//	복사할 길이
		System.out.println(src);
		System.out.println(Arrays.toString(target));
	
		//	Arrays.copyOf 를 이용한 Copy
		target = Arrays.copyOf(src,	//	복사하는 원본 배열
				src.length);		//	복사할 길이
		System.out.println(Arrays.toString(target));
		
		//	범위 복제 : Arrays.copyOfRange 
		target = Arrays.copyOfRange(src,	//	복사할 원본 배열	
								5,			//	복사 시작 인덱스
								12);		//	복사할 끝 인덱스
		System.out.println(Arrays.toString(target));
		
	}

}
