package com.javaex.basic.types;

public class intLongEx {
	public static void main(String[] args) {
		//인트형 변수 (4byte)
		int intVar1;
		int intVar2;
		
		intVar1 = 2024;
//		intVar2 = 1234567890123;	// out of rage
		
		System.out.println(intVar1);
//		System.out.println(intVar2); // 초기화 필요
		
		// 롱형 (8byte)
		
		long longVar1;
		long longVar2;
		
	    longVar1 = 2024;
		longVar2 = 1234567890123L;	// 롱형 데이터 뒤에는 'L' 대소문자 상관x
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		long amount = 1_000_000_000_000l;
		System.out.println(amount);
		
		// 2진수 8진수 16진수
		
		int bin, oct, hex;
		bin = 0b1100;	// 2진수 ; 0
		oct = 072;		// 8진수 ; 0
		hex = 0xFF; 	//16진수 ; 0x
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
		
	}

}
