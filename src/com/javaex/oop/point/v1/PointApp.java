package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.setx(5);
		p1.sety(5);
		
		Point p2 = new Point();
		p2.setx(10);
		p2.sety(23);
		
		p1.showInfo();
		p2.showInfo();
		
	
	}
}
