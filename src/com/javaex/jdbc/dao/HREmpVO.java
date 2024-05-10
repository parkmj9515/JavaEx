package com.javaex.jdbc.dao;

public class HREmpVO {
	private String name;
	private String email;
	private String phone;
	private String hiredate;
	
	public HREmpVO() {
		
	}
	
	public HREmpVO(String name,String email, String phone, String hiredate) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.hiredate = hiredate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "HRApp [name=" + name + ", email=" + email + ", phone=" + phone + ", hiredate=" + hiredate + "]";
	}
	
}
