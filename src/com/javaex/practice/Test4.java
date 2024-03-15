package com.javaex.practice;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		
		int num = scanner.nextInt();
		
		if(num >= 90)
			System.out.println("A등급");
		else if(num >= 80)
				System.out.println("B등급");
		else if(num >=70)
			System.out.println("C등급");
		else if(num >=60)
			System.out.println("D등급");
		else
			System.out.println("F등급");
		
		scanner.close();
			
			
		
		
		
		
		
		
			
		
		
		
		
	}

}
