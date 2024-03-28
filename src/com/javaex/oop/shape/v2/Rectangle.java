package com.javaex.oop.shape.v2;

public class Rectangle extends Shape implements Drawble {
	
	//	필드
	private int width;
	private int height;
	
	//	생성자
	public Rectangle(int x,int y,int width,int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	//	추상 메서드 구현
	@Override
	public double area() {
		return width * height;
	}
	
	@Override
	public void draw() {
		
	}
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.printf("사각형[x=%d, Y=%d, W=%d, H=%d, area=%f]을 그렸습니다.%n", x,y,width,height,area());
	}
	@Override
	public void drawble() {
		// TODO Auto-generated method stub
		System.out.printf("사각형[x=%d, Y=%d, W=%d, H=%d, area=%f]을 그렸습니다.%n", x,y,width,height,area());
	}

}
