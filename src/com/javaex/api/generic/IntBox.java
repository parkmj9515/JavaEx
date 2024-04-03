package com.javaex.api.generic;

//	내부에 Integer만 담길수 있는 상자
public class IntBox {
	Integer contents;
	
	//	getter
	public Integer getContents() {
		return contents;
	}
	//	setter
	public void setContents(Integer contents) {
		this.contents = contents;
	}
}
