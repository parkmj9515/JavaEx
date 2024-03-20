package com.javaex.basic.loop;

public class BreakEx {
	// 6과 14로 모두 나누어 떨어지는 숫자 찾기
	// 반복횟수를 정확히 알기 힘든경우 > while 이 효율적 (반복횟수를 안다면 for)
	public static void main(String[] args) {
		int num =1;
		
		while(true) {
			if(num % 6==0 && num % 14==0) {
				break;
			}
			num += 1;
		}
		System.out.println(num);
	}

}
