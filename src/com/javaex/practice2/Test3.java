package com.javaex.practice2;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		
		System.out.println("나이를 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		System.out.println("나이:");
		age=sc.nextInt();
		
		if( age >= 19 && age < 65) {
			System.out.print("1번그룹");
		}else {
			System.out.print("2번그룹");
		}
		
			System.out.println("입니다");
			sc.close();
			
	}

}
