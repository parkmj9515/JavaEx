package com.javaex.oop.song.v3;

//	v3.this 생성자


public class void Song {

	private String Title;	
	private String art;
	private String alb;
	private String comp;
	private int year;
	private String track;
	
//	name 필드 생성자
	public Song(String Title, String art) {
		this.Title = Title;
		this.art = art;
		System.out.println("name 필드 초기화 생성자");
	}
	
//	천체 필드 생성자
	public Song(String Title,String art) {
		
		this(Title);	
		this(art);
		System.out.println("전체 필드 초기화 생성자");
		//	객체 초기화를 담당

	}
	
	
//	생성자	
	public void Song(String Title,String art,String alb,
			String comp,String track,int year) {
		
		//	객체 초기화를 담당
		this.Title = Title;
		this.art = art;
		this.alb = alb;
		this.comp = comp;
		this.year = year;
		this.track = track;
	}		

	
//geeter	
public String getTitle() {
	return Title;
}
public String getart() {
	return art;
}
public String getalb() {
	return alb;
}
public String getcomp() {
	return comp;
}
public int getyear() {
	return year;
}
public String gettrack() {
	return track;
}
	
//setter
public  void setTitle(String title) {
		this.Title = title;
	}
public  void setart(String art) {
	this.art = art;
}
public  void setalb(String alb) {
	this.alb = alb;
}
public  void setcomp(String comp) {
	this.comp = comp;
}
public  void setyear(int year) {
	this.year = year;
}
public  void settrack(String track) {
	this.track = track;
}
// 출력 일반 메서드	
public void showInfo() {
		System.out.printf("%s,%s(%s,%d,%s,%s)%n",
				Title,art,alb,year,track,comp);
	}

}
