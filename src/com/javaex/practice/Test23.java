package com.javaex.practice;

import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해 주세요");
		
		System.out.println("년도:");
		int x = sc.nextInt();
		
		System.out.println("올해:");
		int	num = sc.nextInt();
		
		System.out.println("태어난 해:");
		int	num2 = sc.nextInt();
		
		int	age = num - x;
		System.out.println("나이:" + age);
	System.out.println("=====================");
		int age2 = num - num2/2;
		
		
	if (age < 20) {
		System.out.println("20살미만 건강검진 대상이 아님");
	}else if(age >= 20 && age <40) {
		System.out.println("20살이상\n 건강검진 해 \n암검사x");
	}else if(age2 ==2) {
		System.out.println("20살이상\n 건강검진 해 아님");
		
	}else if(age >= 20 && age >=40) {
		System.out.println("20살이상\n 건강검진 해 \n암검사");
	}else if(age >= 20 && age >=40) {
		System.out.println("20살이상\n 건강검진 해 \n암검사");

	}
		
		
		sc.close();
	}

}
