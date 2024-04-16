package com.javaex.thread.ex02;

public class MainThread {

	public static void main(String[] args) {
		//	워킹쓰레드 수행
		DigitThread thread = new DigitThread();
		thread.setName("DigitThread");
		
		//	쓰레드 시작 > .start() 매서드로 호출
//		thread.start();
		
		//	쓰레드의 우선 순위
		//	1(min)5(nor)10(max)
		thread.setPriority(Thread.MAX_PRIORITY);
		
		//	Runnable 활용 쓰레드
		Thread runnableThread = new Thread(new AlphabetRunnable());
		runnableThread.setName("AlphabetRunnable");
		runnableThread.setPriority(Thread.MIN_PRIORITY);
		
		thread.start();
		runnableThread.start();
		
		//	thread 와 runnableThread의 흐름을 메인 쓰레드의 흐름에 합류
		try {
			thread.join();
			runnableThread.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인쓰레드 종료");
	}

}
