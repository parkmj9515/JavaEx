package com.javaex.practice2;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력해 주세요");
		
		int num1 ;
			System.out.println("숫자1:");
			num1 = scanner.nextInt();
		
		int num2 ;
			System.out.println("숫자2:");
			 num2 = scanner.nextInt();
		
		if(num1 > num2) {
			System.out.println("큰수"+ num1 + "작은수" + num2 +"입니다");
		}else {
			System.out.println("큰수"+ num2 + "작은수" + num1 +"입니다");
		}
		
			
		scanner.close();
	}

}
