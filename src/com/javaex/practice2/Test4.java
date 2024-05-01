package com.javaex.practice2;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.println("나이");
		age = sc.nextInt();
		if(age <= 7) {
			System.out.println("취학전 아동/무료 입니다");
		}else if( age >= 8 && age <=13) {
			System.out.println("초등학생/2000원 입니다");
		}else if(age >=14 && age <=16) {
			System.out.println("중학생/3000원 입니다");
		}else if(age >=17 && age <=19) {
			System.out.println("고등학생/4000원 입니다");
		}else {
			System.out.println("성인/5000원 입니다");
		}
		sc.close();
	}
}
