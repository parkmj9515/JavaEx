package com.javaex.practice;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.println("사번:");
		
		int score = scanner.nextInt();
		
		if (score % 3==0) {
		System.out.println("A팀 입니다");
		} else if (score % 3==1) {		
		System.out.println("B팀 입니다");
		} else if (score % 3==2) {
		System.out.println("C팀 입니다");
		} else {
		System.out.println("잘못된 사번입니다");
		scanner.close();
		}
	}	
		

}
