package com.javaex.practice;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력하세요");
		System.out.println("키:");
		int m = scanner.nextInt();
		
		System.out.println("몸무게:");
		int kg = scanner.nextInt();
		
		int	bmi;
			bmi= kg / m*m;
			
		if(bmi <= 18.5) {
			System.out.println("저체중입니다");
		}else if (bmi >=24.9) {
			System.out.println("과체중입니다");
		}else {
			System.out.println("정상입니다");
		}
		
		scanner.close();
		
	}

}
