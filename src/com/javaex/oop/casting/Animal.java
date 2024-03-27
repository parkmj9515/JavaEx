package com.javaex.oop.casting;

public class Animal {
	
	protected String name;
	
	//	생성자
	public Animal(String name) {
		this.name = name;
	}
	//	메서드
	public void eat() {
		System.out.println(name+"먹고있다");
	}
	
	public void walk() {
		System.out.println(name+"산책중");
	}
}
