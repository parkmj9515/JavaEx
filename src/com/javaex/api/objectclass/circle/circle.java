package com.javaex.api.objectclass.circle;

import com.javaex.api.objectclass.ex2.Point;

public class circle {
	
	private int x;
	private int y;
	private double radius;
	
	//	생성자
	public circle(int x, int y, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public boolean equals(Object obj) {		//	동등성 조건 : 반지름이 같으면 동등하다
		if(obj instanceof circle) {
			circle other = (circle)obj;
			return radius == other.radius;
			
		//	동등성 조건 x,y좌표가 같고 반지름이 같으면 동등하다	
//		return  x==other.x && y==other.y && radius == other.radius;
		}
			return super.equals(obj);
	}
	//	문자열 출력 메서드
	@Override
	public String toString() { 	
		return "circle(x="+x+",y="+ y +", radius="+ radius +")";

	}

	
}
