package com.javaex.api.stringclass;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		// 문자열 기본
//		stringBasic();
		// 문자열의 다양한 메서드
		usefulMethods();
	}
	//	문자열 기본
	private static void stringBasic() {
		String s1 = "Java"; // 리터럴
		String s2 = new String("Java"); // 메모리에 직접 객체 생성
		String s3 = "Java";

		// 리터럴과 new 객체 생성이 다르게 작동
		System.out.println(s1 == s2); // 메모리 주소 비교 리터럴 vs new 객체
		System.out.println(s1 == s3); // 리터럴 vs 리터럴
		// 리터럴의 경우 데이터가 같으면 같은 객체로 취급

		// 배열을 이용한 String 생성자
		char[] letters = { 'J', 'A', 'V', 'A' };
		String s4 = new String(letters);
		System.out.println(s4);

		// .valueOf > 메서드 기본타입을 문자열로 변환
		String s5 = String.valueOf(2024); // int > String
		System.out.println(s5);
	}
	
	//	문자열의 다양한 메서드
	private static void usefulMethods() {
		String str = "Java Programming, OOP Programming";
		System.out.println("str:" + str);

		// 문자열 길이 확인 : .length()
		System.out.println(".length():" + str.length());
		// index 범위 = 0 ~ length() -1 까지

		// 변환 메서드
		System.out.println("toUpperCase:" + str.toUpperCase()); // 대문자로 변환
		System.out.println("toLowCase:" + str.toLowerCase()); // 소문자로 변환

		// 검색
		System.out.println("charAt:" + str.charAt(5)); // 5번 인덱스의 글자

		int index = 0; // index 저장 변수
		index = str.indexOf("Programming"); // str내 Programming 의 위치 인덱스
		System.out.println("1st search:" + index);

		index += "Programming".length(); // 검색 시작 위치를 뒤로 이동
		index = str.indexOf("Programming", index); // 새로운 시작 위치에서 검색
		System.out.println("2nd search:" + index);

		index += "Programming".length(); // 검색 시작 위치를 뒤로 이동
		index = str.indexOf("Programming", index); // 새로운 시작 위치에서 검색
		System.out.println("3rd search:" + index); // 검색 할것이 없으면 -1
		// indexOf 로 검색 했을때 찾는것이 없으면 -1

		index = str.lastIndexOf("Programming"); // 검색을 뒤에서 부터 찾기
		System.out.println("lastIndexOf:" + index);
//-----------------------------------------------------------------------------------------------------------
		System.out.println("str:" + str);
		//	부분 문자열 추출 > sub String
		System.out.println("substring:"+str.substring(5));	//	5번 스트링부터 끝까지 추출 > 새객체로 추가해주기때문에 원본보존
		System.out.println("substring:"+str.substring(5,16));	//	5 ~ 16-1 까지 추출
		
		//	치환 : Replace, ReplaceAll
		System.out.println("replace:"+str.replace("Programming","Coding"));	//	Programming > Coding으로 치환
		
		String str2 = "                Hello             ";
		String str3 = ",Java";
		//	whitespace 지우기	> (공백,개행,탭문자)지우기
		String str4 = str2.trim();	//	white space 지우기
		System.out.println(str4 + str3);
		
		//	원본 출력
		System.out.println("원본:" + str);
		//	문자열 데이터는 불변(immutable) 이다
		//	여러가지 메서드를 통해 변화가 발생 했더라도 원본은 유지
		
		//	구분자로 분리 : split()
		String[] split = str.split(" ");
		System.out.println(Arrays.toString(split));	//	공백문자 기준으로 문자열을 분리 > 문자열 배열로 변환
		
		for(String data : split) {
			System.out.println("조각:"+data);
		}
			
			//	문자열 비교 메서드 :* compareTo > 문자열 Unicode비교 같으면 0 작으면 음수(-1) 크면 양수(1)*
			System.out.println("ABC".compareTo("ABD"));	// > A==A , b==b, c<d > -1
			
	}
}
