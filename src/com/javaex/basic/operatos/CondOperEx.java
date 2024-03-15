package com.javaex.basic.operatos;

public class CondOperEx {

	public static void main(String[] args) {
		int a = 10;		// a가 짝수면 "짝수" 홀수면 "홀수" 출력
		
		String result = a % 2 ==0 ?"짝수" : "홀수";
		System.out.println(a + "는" + result + "입니다");
		
		
		int score = 70;
		String messege;		// score > 80 	 : Good
							// score 50 ~ 80 : Pass
							// score < 50	 : Fail
		messege = score >= 80 ? "Good" : score >=50 ?  "Pass" : "Fail";			
		System.out.println(messege);
		
		

	}

}
