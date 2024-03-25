package com.javaex.oop.tv;

public class TV {
	
	public TV(int channel) {
		
	}
	private int channel;
	private int volume;
	private boolean power;
	private int status;
	
	public TV(int channel,int volume,int power,boolean power1) {
		this(channel);
		this.volume = volume;
		this.power = power;
			
		
		
	public void boolean power() {
	
	for(int i; i<=100;i++) {
	if(channel <=255&&volume >=100) {
		System.out.print(volume);
		i += volume;
		System.out.println(channel);
	}
	}
	}

	public int getchannel() {
		return channel;
	}
	public int getvolume() {
		return volume;
	}
	public boolean getpower() {
		return power;
	}
	public int status() {
		return status;
	}
	
}
