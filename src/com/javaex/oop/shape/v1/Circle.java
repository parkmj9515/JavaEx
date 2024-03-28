package com.javaex.oop.shape.v1;

public class Circle extends Shape {
	//	필드
	private double radius;	//	반지름
	
	//	생성자
	public Circle(int x, int y, double radius) {
		super(x,y);	//	부모 생성자 호출
		this.radius = radius;
	}
	//	부모가 선언한 추상 메서드는 반드시 구현해줘야 한다
	@Override
	public void draw() {
		System.out.printf("원[x=%d,y=%d,r=%f,area=%f]을 그렸어요.%n",
						x,y,radius,area());
	}
	@Override
	public double area() {
		double area= Math.PI * Math.pow(radius,2);
		return area;
	}
}
