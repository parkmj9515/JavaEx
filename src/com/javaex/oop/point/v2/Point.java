package com.javaex.oop.point.v2;


//	v2. 기본 생성자 , 모든 필드 생성자
public class Point {
		// 필드 은닉
		private int x;	//x축
		private int y;	//y축
//	생성자	
public Point(int x,int y) {
			
			//	객체 초기화를 담당
			this.x = x;
			this.y = y;
		}
		
	//geeter	
//	public int getx() {
//		return x;
//	}
//	public int gety() {
//		return y;
//	}
//		
//	//setter
//	public void setx(int x) {
//			this.x = x;
//		}
//	public void sety(int y) {
//			this.y = y;
//		}
	// 출력 일반 메서드	
	public void showInfo() {
			System.out.printf("점[x=%d, 점y=%d]을 그렸습니다%n",
							x,y);
		}

		
		
		
		
		
		
		
		
		
		
		
		
}



