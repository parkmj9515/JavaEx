package com.javaex.oop.shape.v2;

//추상클래스
//-자신이 객체화 될 수는 없다
//-상송을 위한 부모 클래스로만 존재
//-안쪽에 추상메서드를 가져야 한다
//-상속 받은 클래스는 선언된 추상 메서드를 반드시 구현해야 한다

public abstract class Shape {

	//	필드
	protected int x;
	protected int y;
	
	//	생성자
	public Shape(int x,int y) {
		this.x = x;
		this.y = y;
	}
	//	추상 메서드
	//	> 추상클래스를 상속 받은 클래스에서 반드시 구현해야 한다
//	public abstract void draw();	//	직접적인 상속관계에서 벗어난다
	// > 인터페이스에 위임
	public abstract double area();
	
}
