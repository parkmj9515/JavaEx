package com.javaex.api.objectclass.circle;

import com.javaex.oop.shape.v2.Circle;

public class circleApp {

	public static void main(String[] args) {
		
		circle a = new circle(6,4,10);
		circle b = new circle(2,12,10);
		circle c = new circle(3,3,12);
		circle d = c;
//		circle e = new circle(6,4,10);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(d.equals(c));
		
//		System.out.println(a.equals(e));
	}
	

}

