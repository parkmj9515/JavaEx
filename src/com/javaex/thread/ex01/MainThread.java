package com.javaex.thread.ex01;

public class MainThread {

	public static void main(String[] args) {
		//	워킹쓰레드 수행
		DigitThread thread = new DigitThread();
		thread.setName("DigitThread");
		//	쓰레드 시작 > .start() 매서드로 호출
		thread.start();
		
		//	메인쓰레드 로직		
		//	A -Z까지 차례대로 출력
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.println("MainThread: "+ ch);
			
			//	쓰레드 실행 대기
		try {
			Thread.sleep(300);	// 0.3초 대기
		
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
		
		System.out.println("메인쓰레드 종료");
	}

}
