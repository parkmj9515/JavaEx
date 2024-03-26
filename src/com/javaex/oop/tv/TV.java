package com.javaex.oop.tv;


// 채널 범위 1-244
// 볼륨 범위 0-100
 public class TV {

		//	상수
		private static final int min_CHANNEL =1;
		private static final int max_CHANNEL =255;
		private static final int min_VOLUME =0;
		private static final int max_VOLUME =100;
	
		//필드
		private int channel;
		private int volume;
		private boolean power;
	
		public TV () {
			this(7,20,false);
//			this.channel = 7;
//			this.volume = 20;
//			this.power = false;
		}
		public TV(int channel,int volume, boolean power) {
			super();
			this.channel = channel;
			this.volume= volume;
			this.power= power;
		}
		
		
		public int getChannel() {
			return channel;
		}	
		public int getVolume() {
			return volume;
		}
		public boolean isPower() {
			return power;
		}
		public void power(boolean on) {
				this.power=on;
		}
		public void channel(int channel) {
			if(channel >= min_CHANNEL&&channel <= max_CHANNEL) {
				this.channel = channel;
			}
		}
		// 	채널 변경 메서드(오버로딩)
		public void channel(boolean up) {
			if(up) {	// 채널 올림
				if (this.channel < max_CHANNEL) {	// 최대 채널에 도달하지 않음
					this.channel++;
				}
			}else {		// 채널 내림
				if(this.channel > min_CHANNEL) {	// 최소 채널에 도달하지 않음
					this.channel--;
				}
			}
		}
	

	// 볼륨 조절 메서드
	public void volume(int volume) {
		if (volume >= min_VOLUME && volume <= max_VOLUME) {
			this.volume = volume;
		}
	}
	// 볼륨 조절 메서드(오버로딩)		
	public void volume(boolean up) {
		if(up) {	// 볼륨 높이기
			if(volume < max_VOLUME) {	// 최대 볼륨에 도달하지 않음
				this.volume++;
			}
		}else {		// 볼륨 낮추기
			if(volume > min_VOLUME) {	// 최소 볼륨에 도달하지 않음
				this.volume--;
			}
		}
	}
	public void status() {
		if(power) {			// TV가 켜졌을 때만 정보를 보여주자
			System.out.println("전원:켜짐");
			System.out.println("현재 채널:"+channel);
			System.out.println("현재 음량:"+volume);
			
		}else {
			System.out.println("전원:꺼짐");
			
		}
		
	}
		
}


