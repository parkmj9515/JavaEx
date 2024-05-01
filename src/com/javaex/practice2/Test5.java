package com.javaex.practice2;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력하세요");
		
		double m;
			System.out.println("키:");
			m = scanner.nextInt();
		 	
		double kg;
			System.out.println("몸무게:");
			kg = scanner.nextInt();
		
		
		double bmi;
			bmi = kg / (m*m) * 10000;
			
		
		if(bmi <= 18.5) {
			System.out.println("저체중입니다");
		}else if (bmi >=24.9) {
			System.out.println("과체중입니다");
		}else {
			System.out.println("정상입니다");
		}
		System.out.println("BMI: "+bmi);
		scanner.close();
		
	}


}
