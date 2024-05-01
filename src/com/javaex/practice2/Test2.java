package com.javaex.practice2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		
		// 나이 입력
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		age = sc.nextInt();
		
		// 그룹 분류
		if( age > 20) {
			System.out.print("\"1번그룹\"");
		}else {
			System.out.println("\'2번그룹\'");
		}
		System.out.println("입니다");
		sc.close();
	}
		
}
