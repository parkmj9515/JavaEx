package com.javaex.basic.types;

public class CastingEx {

	public static void main(String[] args) {
		//	암시적 캐스팅(promition)
		promotionEx();
		//	명시적 캐스팅(Casting)
		castingEx();

	}
	public static void castingEx() {
		// 표현 범위가 넓은 자료형 > 좁은 자료형으로의 변환
		// 데이터 유실 위험 > 반드시 강제 타입 변환이 필요
		double d = 1234567.890;
		System.out.println(d);
		
		float f = (float)d;	// 8byte 실수 > 4byte 실수
		System.out.println(f);
		
		long l = (long)f;	// 4byte 실수 > 8byte 정수
		System.out.println(l);
		
	
		
	}
	
	public static void promotionEx() {
		
		// 표현 범위가 좁은 자료형 > 넓은 자료형으로의 변환
		// 암묵적으로 자동으로 캐스팅을 수행
		// byte > short > int > long > float > double
		
		byte b =25;		// 1byte 정수형
		System.out.println(b);
		
		short s = b;	//2byte
		System.out.println(s);
		
		int i = s;		//4byte
		System.out.println(i);
		
		long l = i;		//8byte
		System.out.println(1);
		
		float f = l;	//8byte 정수 > 4byte 실수
		System.out.println(l);
		
		double d = f;
		System.out.println(d);
		
//		char ch = 'A';
//		System.out.println(Integer.toBinaryString(a));
//		
//		short s2 = ch;	// unsigned int(2) > 2byte 정수
//		System.out.println(s2);
//		
		
	
}
}
