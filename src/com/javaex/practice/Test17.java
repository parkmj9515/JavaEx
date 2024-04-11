package com.javaex.practice;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		System.out.println("숫익을 입력해 주세요");
		int x= sc.nextInt();
			
		System.out.println("금익:"); 
		
		while(x <= 1000) {
			System.out.println("소득세는" + 0.09 * x + "입니다");
			break;
		}while(1000 < x && x < 4000) {
			System.out.println("소득세는" + 1000 * 0.09+0.18+(x-1000) + "입니다");	
			break;
		}while(4000 < x && x < 8000) {
			System.out.println("소득세는" + 1000 * 0.09 + 3000*0.18 + 0.27*(x-4000) + "입니다");
			break;
		}while(8000 >= x){
			System.out.println("소득세는" + 1000 * 0.09 + 3000*0.18 + 4000*0.27 + 0.36*(x-8000) + "입니다");
			break;
		}while(8000 < x) {
			System.out.println("잘못 입력했습니다");
			break;
		}
			sc.close();
	}
	

}
