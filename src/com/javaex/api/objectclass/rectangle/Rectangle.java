package com.javaex.api.objectclass.rectangle;

import com.javaex.api.objectclass.ex2.Point;

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	//	면적 구하는 메서드
	public int area() {
		return width * height;
	}
	//	비교로직 : 면적이 같으면 동등한 사각형으로 판단
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj;
			return area() == other.area();
		}
		return super.equals(obj);
	}
	
	public String toString() {
		return"Rectangle(width =" + width + " , height= "+ height + " )";
	}

}
