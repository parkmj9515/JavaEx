package com.javaex.exception;

public class NullPointExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Hello");
		str = null;
		
		try {
		System.out.println(str.toString());
	}	catch (NullPointerException e) {
		System.err.println("널입니다");
	}	finally {
		System.out.println("예외 처리 종료!");
	}

}
}
