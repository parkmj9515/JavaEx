package com.javaex.basic.loop;

public class ForWhileTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//행 루프 1-6
		for(int s = 1; s <=6 ; s++) {
			// 열루프 1 -현재행까지 
			for(int t=1; t <= s ; t++) {
				System.out.print("*");
			}
			System.out.println();	// 강제 개행
		}
	}

}
