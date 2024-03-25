package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		
//		Point p1 = new Point();
		Point p1 = new Point(5,5);
//		p1.setx(5);
//		p1.sety(5);
		
//		Point p2 = new Point();
		Point p2 = new Point(10,23);
//		p2.setx(10);
//		p2.sety(23);
		
		p1.showInfo();
		p2.showInfo();
		
//		오버로딩된 메서드 호출
		p1.draw(true);	// 그리기
		p2.draw(false);	// 지우기
		
		
	
	}
}
