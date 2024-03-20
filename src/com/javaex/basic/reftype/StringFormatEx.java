package com.javaex.basic.reftype;

public class StringFormatEx {

	public static void main(String[] args) {
		// %s(문자열) %d(십진수) %n(개행)
		
		// __개의 __중에서 __개를 먹었다
		String fruit = "사과";
		int total = 10, eat = 3;
//		System.out.println(total + "개의" + fruit + "중에서" +eat + "먹었다");
		
		
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다%n", total , fruit ,eat);	// 포맷 문자열	*순서 중요*
		
		
		// %d의 천단위 구분 기호출력 : %,d
		int amount = 1_234_567_890;
		System.out.printf("%,d%n",amount);
		
		double pi = Math.PI;
		System.out.printf("pi : %.2f%n",pi);	// pi값 소수점 두번째 자리까지 나옴 (.2)
		
		// 포맷 형식은 String 형의 .formatted 메서드에서구현된다
		String fmt = "%d개의 %s 중에서 %d개를 먹었다%n";
				System.out.println(fmt.formatted(10,"바나나",2));
	}

}
