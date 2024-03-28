package com.javaex.oop.shape.v2;

//	인터페이스 내의 모든 추상 메서드는 반드시 구현해야 한다 
public class Circle extends Shape implements Drawble {
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
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void drawble() {
		// TODO Auto-generated method stub
		
	}
}
