package com.javaex.exception;

public class ArrayExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[] {3,6,9,};
		
		
		try {
			System.out.println(intArray[3]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error:" + e.getMessage());
		}finally {
		
			System.out.println(intArray[3]);
	}

}

}