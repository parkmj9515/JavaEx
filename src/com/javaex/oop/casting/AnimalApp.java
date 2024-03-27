package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		//	부모타입으로 자손객체를 참조 up캐스팅
		//	참조타입에 설계된 것만 시용할수있다
		//	자동 캐스팅
		Animal dog1 = new Dog("Snoopy");
		
		dog1.eat();
		dog1.walk();
//		dog1.bark();	//	설계도에 있는것만 사용가능하다
				
		Dog dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		// Down Casting 명시적으로 타입을 지정
		//	dog1(bark)을 활성화 해보자
		
		// Animal > Dog로 캐스팅 후 실행
		((Dog)(dog1)).bark();
		
		{
			Dog pet = new Dog("Azi");
			pet.eat();
			pet.walk();
			pet.bark();
			
			pet = null;
			
//			pet = new Cat("아즈라엘");	= 부모가 아닌 클래스에서는 참조 불가
		}
		
		{
			Animal pet = new Dog("Azi");
			pet.eat();
			pet.walk();
//			pet.bark();			// 현재 pet이 어떤 클래스의 인스턴스인지 확인
			if(pet instanceof Dog) {
				((Dog)pet).bark();
			}else if (pet instanceof Cat) { //	Cat이 인스턴스
				((Cat)pet).meow();
			}
			
			
			pet = null;
			
			pet = new Cat("아즈라엘");
			
			pet.eat();
			pet.walk();
//			pet.meow();
		}
	}

}
