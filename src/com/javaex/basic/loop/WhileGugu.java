package com.javaex.basic.loop;

import java.util.Scanner;

public class WhileGugu {

	public static void main(String[] args) {
		//	스캐너열기
		
		//	단 입력 받기
		
		//	1-9까지 while loop
		//		단 *num 출력
		
		//	스캐너 닫기
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int num = 1 , dan;
		
		dan = scanner.nextInt();
		while(num <=9 ) {
			System.out.println(dan + "*" + num + "=" + (dan * num));
			num += 1;
		}
			scanner.close();
	}

}
