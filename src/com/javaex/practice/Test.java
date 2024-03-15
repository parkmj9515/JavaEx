package com.javaex.practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		// 숫자입력
		System.out.println("숫자를 입력하세요");
		
		int num = scanner.nextInt();
		if(num > 0) {
			System.out.println("양수");
		}else if(num < 0){
			System.out.println("음수");		
		}else {
			System.out.println("0");
		}if(num % 2==1) {
				System.out.println("홀수");
		}else		
				System.out.println("짝수");
						 
		scanner.close();
		
			
			
				
	
	}
}