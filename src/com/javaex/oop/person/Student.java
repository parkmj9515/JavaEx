package com.javaex.oop.person;

public class Student extends Person {
	
	private String SchoolName;
		
	public Student(int age, String name, String SchoolName) {
		super(name,age);
		this.SchoolName = SchoolName;
		
	}
	public Student(String SchoolName) {
	super("Unknown",0);
		this.SchoolName = SchoolName;
		
	}
	
	// getter / setter
	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String SchoolName) {
			this.SchoolName=SchoolName;
	}
	
	
	public void showInfo() {
		super.showInfo();
		System.out.println("학교명:"+SchoolName);
	}
}
