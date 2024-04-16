package com.javaex.thread.ex01;


//	쓰레드 상속을 통한 쓰레드 생성
public class DigitThread extends Thread {

	//	쓰레드의 로직 구현
	//	주의사항 : 이 메서드는 절대 직접 실행하지 말자 , t.start를 통해 우회실행
	@Override
	public void run() {
		//	워킹로직 : 0-30까지 숫자를 출력
		for(int i=0; i<30; i++) {
			System.out.printf("%s:%d%n", getName(),//쓰레드 이름
													i);
			//	쓰레드 지연
			try {
				Thread.sleep(300);	//	0.3초 대기
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
			System.out.println(getName()+"쓰레드 종료");
		
	}

}
