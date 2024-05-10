package com.javaex.jdbc.dao;

public class PhoneBookVO {
	
	private String name;
	private String hp;
	private String tel;

	
	public PhoneBookVO() {
		
	}
	
	public PhoneBookVO(String name, String hp, String tel) {
		super();
		
		this.name = name;
		this.hp = hp;
		this.tel = tel;
	}
	
	public PhoneBookVO(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "PhoneBookVO [name=" + name + ", hp=" + hp + ", tel=" + tel + "]";
	}


	
	
	
}

