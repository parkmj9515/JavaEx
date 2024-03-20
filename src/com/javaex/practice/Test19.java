package com.javaex.practice;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.println("년도:");
	int age = sc.nextInt();	
		age = 2024 - age;
		
		if(age < 15 || age >65) {
			System.out.println(age + "살 무료예방접종 대상자 입니다");
		}else  
			System.out.println(age + "살 무료예방접종 대상자 아닙니다");
		
		sc.close();
	}

}
