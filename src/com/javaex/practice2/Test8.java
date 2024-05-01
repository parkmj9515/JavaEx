package com.javaex.practice2;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		num1 = sc.nextInt();
		
		System.out.println("두번째 숫자: ");
		num2 = sc.nextInt();
		
		System.out.println("몫 :" + num1/num2);
		System.out.println("나머지: "+ num1%num2);
		
	}

}
