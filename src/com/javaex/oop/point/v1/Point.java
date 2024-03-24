package com.javaex.oop.point.v1;

public class Point {

		private int x;	//x축
		private int y;
		
	public int getName() {
		return x;
	}
		
		void print() {
			System.out.printf("x좌표는:%d 좌표는:%d&n", x,y);
		}
		
	//setter
		public void setx(int x) {
			this.x = x;
		}
		public void sety(int y) {
			this.y = y;
		}
		
		public void showInfo() {
			System.out.printf("점[x=%d, 점y=%d]을 그렸습니다%n",
							x,y);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}



