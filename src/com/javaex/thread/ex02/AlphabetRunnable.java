package com.javaex.thread.ex02;


//	Runable 구현 방식 쓰레드
//	런 매서드를 오버라이드 한 실행 클래스를 쓰레드 클래스에 전달
public class AlphabetRunnable implements Runnable {

	@Override
	public void run() {
		//	쓰레드 내부에서 실행될 로직
		//	주의 : 직접호출 x .start()메서드를 통한 우회호출
		for(char ch= 'A'; ch<'Z'; ch++) {
//			System.out.println("AlphabetRunnable: "+ ch);
			System.out.printf("%s:%c%n",Thread.currentThread().getName(),ch);
			
			//	잠시대기
			try {
				
				Thread.sleep(300);	//	0.3.초대기
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("AlphabetRunnable 종료");
		
	}
	
	

}
