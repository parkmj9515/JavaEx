package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx {
	// 점수입력 60점이상이면 합격
	// tip Ctrl Space 자동 임포트
	// 		Ctrl shift o (Organize Import)
	public static void main(String[] args) {
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		
		// 점수 입력 받기
		System.out.print("점수는?");
		int score = scanner.nextInt();
		
		
		// 점수 비교
		if(score >= 60) {
			System.out.println("합격입니다");	//조건 만족	
		}else {
			System.out.println("불합격입니다");	//조건 불만족
		}
		
		
		
		// 스캐너 종료
		scanner.close();
		
	}

}
