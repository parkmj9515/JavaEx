package com.javaex.oop.tv;

public class TVApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV (7,20,false);
		
		tv.status();		// 전원off상태
		
		tv.power(true);		// 전원on
		tv.volume(120);		// 음량과 범위를 벗어남
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channel(0);		//채널범위를 벗어남
		tv.status();
		
		tv.channel(true);	//채널 +1
		tv.channel(true);	//채널 +1
		tv.channel(true);	//채널 +1
		tv.status();
		
		tv.power(false);
		tv.status();
	}

}
