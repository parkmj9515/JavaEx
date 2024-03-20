package com.javaex.practice;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력해 주세요");
		
		int num1 ;
			System.out.println("숫자1:");
		int num2 ;
			System.out.println("숫자2:");
			
			 num1 = scanner.nextInt();
			 num2 = scanner.nextInt();
		
		if(num1 > num2) {
			System.out.println("큰수"+ num1 + "작은수" + num2 +"입니다");
		}else {
			System.out.println("큰수"+ num2 + "작은수" + num1 +"입니다");
		}
		
			
		scanner.close();
	
	}
}