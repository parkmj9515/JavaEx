package com.javaex.api.objectclass.ex2;

//	두 객체의 내부 데이터의 같음을 확인하는 equals 메서드
public class Point {	//	extends java.lang.object
	
	//	필드
	private int x;
	private int y;
	
	// 생성자
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//	equals : 두 객체의 내부 데이터가 같음을 확인하는 메서드
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			
		//	전달받은 파라미터 obj가 포인트인지 확인(필수)
		//	Obj > Point 캐스팅
			Point other = (Point)obj;
			//	두 객체의 동등성
			//	두 객체의 x필드와 같고, y필드와 같아야 동등하다
//			return x == other.x && y== other.y;

			if(x == other.x && y== other.y) {
				return true;
			}else {
				return false;
			}	
		}
//		obj가 Point가 아니면
		return super.equals(obj);
	}
	//	toString : 객체 정보를 문자열로 출력할 때 호출되는 메서드
	@Override 
	public String toString() { 	
		return " Point(" + x +", "+ y +")";
	
	}
}

