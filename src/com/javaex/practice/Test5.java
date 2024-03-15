package com.javaex.practice;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해 주세요");
		
		int num = scanner.nextInt();
		
		if(num >=19 && num <65) 
			System.out.println("1번그룹 입니다");
		else
			System.out.println("2번그룹 입니다");
		
		scanner.close();
		
	}

}
