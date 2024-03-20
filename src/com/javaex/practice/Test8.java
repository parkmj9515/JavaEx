package com.javaex.practice;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해 주세요.");
		
		int age = scanner.nextInt();
			age = 2024- age;
			
			if(age < 15 || age >65) {
				System.out.println(age + "살 무료예방 접종 대상자 입니다");
			}else  
				System.out.println(age + "살 무료예방접종 대상자 아닙니다");
			
			scanner.close();
		
			
	}

}
