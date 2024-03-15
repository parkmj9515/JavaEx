package com.javaex.basic.loop;

public class ContinueEx {
	// 1-20까지 루프
	// 2의배수 3의배수 출력 x
	// 나머지 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<=20; i++) {
			if (i % 2==0 || i % 3==0)
				continue;	// 다음 루프로
			System.out.println(i);
			
		}
			
	}

}
