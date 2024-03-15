package com.javaex.practice;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
			System.out.println("나이를 입력해주세요");
		
		int age = scanner.nextInt();
		
		if(age <=7)
			System.out.println("취학전아동/무료입니다");
		else if(age <=13)
			System.out.println("초등학생/2000원입니다");
		else if(age <=16)
			System.out.println("중학생/3000원입니다");
		else if(age <=19)
			System.out.println("고등학생/4000원입니다");
		else
			System.out.println("성인/5000원입니다");
		
		scanner.close();
			
		
		
		
		
		
		
	}

}
