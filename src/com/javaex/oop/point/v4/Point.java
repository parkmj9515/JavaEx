package com.javaex.oop.point.v4;


//	v4.상속 연습
public class Point {
		// 필드 은닉
//		private int x;	//x축
//		private int y;	//y축
	// 자식에게 허용
		protected int x;
		protected int y;
//	생성자	
//		public Point() {
//			
//}	
		
	public Point(int x,int y) {
			this.x = x;
			this.y = y;
		}
		
//	geeter	
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

		// 메서드 오버로딩
		//	boolean bDraw > true면 그렸습니다
						// > False면 지웠습니다
	public void draw(boolean bDraw) {
		String message = String.format("점[x=%d,y=%d]을", x,y);
		message += bDraw ? "그렸습니다." : "지웠습니다";
		System.out.println(message);
	}

	public void draw() {
		
		
	}
		
}



