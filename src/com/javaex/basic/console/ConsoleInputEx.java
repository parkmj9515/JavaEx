package com.javaex.basic.console;

import java.util.Scanner;	//scanner 불러오기 *필수

public class ConsoleInputEx {

	public static void main(String[] args) {
		
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		// 데이터 입력
		
		int age;
		
		System.out.print("나이는?:");
		age = scanner.nextInt();
		
		String name;
		
		System.out.print("이름은?:");
		name = scanner.next();
		
		System.out.println("안녕하세요," + name + "님");
		
		// 스캐너 닫기
		scanner.close();	// 닫기필수 *필수*
		
		

	}

}
