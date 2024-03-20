package com.javaex.practice4;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {};
	
		data[0] =1;
		data[1] =3;
		data[2] =5;
		data[3] =8;
		data[4] =9;
		data[5] =11;
		data[6] =15;
		data[7] =19;	
		data[8] =18;
		data[9] =20;
		data[10] =30;
		data[10] =33;
		data[10] =34;
		
		
		for(int i=0; i % 3==0; i++) {
			System.out.printf("주어진 배열에서 3의 배수의 개수=> %d %n", 
								"주어진 배열에서 3의 배수의 합 %d",data[i]);
															
		i += 1;					
		}
	}	

}
