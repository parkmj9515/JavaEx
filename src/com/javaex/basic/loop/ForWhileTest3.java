package com.javaex.basic.loop;

public class ForWhileTest3 {
	// i like java0-20
	public static void main(String[] args) {
		//	while 반복문
		//	조건을 만족하는 동안 블록 반복
		//	반복 조건 제어 변수 필요 , 조건 변수를 개발자가 직접 제어
		int num = 1;
		
		while(num <= 6) {
			if(num <= 1) {
			System.out.println("*");
			if(num <=2) 
			System.out.println("**");	
			if(num <=3) 
				System.out.println("***");
			if(num<=4) 
				System.out.println("****");
			if(num<=5) 
				System.out.println("*****");
			if(num<=6) 
				System.out.println("******");
			num ++;
			
			}break;
		}
	}
}

		//	int s= 1,t;
		//		t=1;
		//	while (s <=6){				// 행 루프 1 - t까지
		//	System.out.println("*");
		// 	t += 1;
		//	}
		//	System.out.print();	
		//	s +=1;