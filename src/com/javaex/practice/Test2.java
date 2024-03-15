package com.javaex.practice;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
System.out.println("과목을 선택하세요 \n 1.자바 2.C 3.C++ 4.파이썬");
		
		int num = scanner.nextInt();
		if(num == 1) {
			System.out.println("R101호입니다");
		}else if(num == 2){
			System.out.println("R202호입니다");		
		}else if(num == 3){
			System.out.println("R303호입니다");
		}else if(num == 4) {
				System.out.println("R404호입니다");
		}else		
				System.out.println("상담원에게 문의주세요");
						 
		scanner.close();
	}
}

