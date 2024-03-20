package com.javaex.practice;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자3개를 입력해 주세요");
		System.out.println("숫자1:");
		int num1 = scanner.nextInt();
		System.out.println("숫자2:");
		int num2 = scanner.nextInt();
		System.out.println("숫자3:");	
		int num3 = scanner.nextInt();	
			
	
		if(num1 > num2 && num1 > num3) {
			System.out.println("가장 큰수는" + num1 + "입니다");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("가장 큰수는" + num2 + "입니다");
		}else {
			System.out.println("가장 큰수는" + num3 + "입니다");
		}
		
			
		scanner.close();
	
	}
}