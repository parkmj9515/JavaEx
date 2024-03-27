package com.javaex.oop.point.v4;

//	상속 extends
public class ColorPoint extends Point{	// 기본생성자가 없으면 자바는 기본생성자 추가 컴파일
	//	필드
	private String color;
	
//	ColorPoint cp1 = new ColorPoint("red");
//	ColorPoint cp2 = new ColorPoint(10,10);
	// 생성자			//	생성자 내에서 부모 생성자를 호출하지 않으면 부모의 기본생성자를 호출
	public ColorPoint(String color) {
		super(0,0);
		this.color = color;
	}
	public ColorPoint(int x, int y, String color) {
		super(x,y);	// 부모 생성자 호출
		this.color = color;
	}
	
	// getter / setter
	public String getcolor() {
		return color;
	}
	public void setColor(String color) {
			this.color=color;
	}

	@Override		// 현재 메서드가 Override 인지 확인
	public void draw() {
		// getter 이용 우회접근
//		System.out.printf("색깔점[x=%d, y=%d, color=%s] 점을 찍었습니다.%n",super.getx(),super.gety(),color);
		System.out.printf("색깔점[x=%d, y=%d, color=%s] 점을 찍었습니다.%n", x,y,color);
	}
	
}
