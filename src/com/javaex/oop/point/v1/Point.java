package com.javaex.oop.point.v1;

public class Point {
		// 필드 은닉
		private int x;	//x축
		private int y;	//y축
		
	//geeter	
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
		
	//setter
	public void setx(int x) {
			this.x = x;
		}
	public void sety(int y) {
			this.y = y;
		}
	// 출력 일반 메서드	
	public void showInfo() {
			System.out.printf("점[x=%d, 점y=%d]을 그렸습니다%n",
							x,y);
		}

		
		
		
		
		
		
		
		
		
		
		
		
}



