package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {

//		Shape s = new Shape();	//	추상 클래스의 직접 객체화 불가
		
		//	추상 클래스를 상속받은 클래스는 직접 객체화 할수있다
		Circle c = new Circle(10,5,30);
		c.draw();
		Rectangle r = new Rectangle(10,20,100,50);
		r.draw();
		
		Point p = new Point(100,100);
		p.draw();
		
		//	Circle Rectangle > Shape의 서브클래스
		//	Point > Shape의 서브클래스가 아님(관계x)
		//	Circle Rectangle Point > Drawable 공통된 인터페이스를 지니고있다
		
		Drawble objs[] = new Drawble[] {
				r,c,p
		};
		
		for(Drawble obj: objs) {
			if(obj instanceof Drawble) {
				//	특정 인스턴스가 Drawble 인터페이스의 구현인가?
				obj.draw();
			}
		}
	}

}
