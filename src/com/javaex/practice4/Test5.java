package com.javaex.practice4;


public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray ={10,20,30,40,50};
		int sum = 0, avg=0;		
				
		for(int i=0; i<intArray.length;i++) {
			sum += intArray[i];
		}
			avg = sum/(intArray.length);
		System.out.println("평균은"+ avg + "입니다"); 	
		

	}
}
