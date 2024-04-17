package com.javaex.practice4;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
			
		int sum = 0;	
		int count = 0;
		
		for(int i=0; i < data.length;i++) {
			if(data[i] % 3==0) {
				sum = data[i];
				count++;
				
			
				
				System.out.println("주어진 배열에서 3의 배수의개수=>"+ count);
			}
				
			}
}
}
