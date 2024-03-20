package com.javaex.practice;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		String x = sc.next();
		
		if(x.equals("a")) {
			System.out.println("모음입니다");	
		}else if(x.equals ("e")) {
			System.out.println("모음입니다");
		}else if(x.equals ("i")) {
			System.out.println("모음입니다");
		}else if(x.equals ("o")) {
			System.out.println("모음입니다");
		}else if(x.equals("u")) {
			System.out.println("모음입니다");
		}else 
			System.out.println("자음입니다");
	}

}

// 이건 나중에 다시 해봐야할듯
