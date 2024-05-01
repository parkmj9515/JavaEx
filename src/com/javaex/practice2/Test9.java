package com.javaex.practice2;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력하세요");
		System.out.println("숫자1: ");
		num1 = sc.nextInt();
		
		System.out.println("숫자2: ");
		num2 = sc.nextInt();
		
		System.out.println("숫자3: ");
		num3 = sc.nextInt();
		
		if(num2>num1 || num3>num1) {
			System.out.println("가장 작은수는" + num1+ "입니다");
		}else if(num1>num2 || num3>num2) {
			System.out.println("가장 작은수는" + num2 + "입니다");
		}else if(num1>num3 || num2>num3) {
			System.out.println("가장 작은수는" + num3 + "입니다");
		}
		
		sc.close();
	}

}
