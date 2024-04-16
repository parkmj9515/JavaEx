package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		//	입력소스(파일)
		File file = new File(filename);
		try {
		Scanner sc = new Scanner(file);
		String name;
		float height;
		float weight;
		
		while(sc.hasNextLine()) {	//	더 읽을 라인이 있는지 확ㅇ
			name = sc.next();		//	문자열 토큰 읽기
			height = sc.nextFloat();	//	실수 토큰 일기
			weight = sc.nextFloat();	//	실수 토큰 읽기
			
			System.out.printf("%s, 키:%f, 체중:%f%n",name,height,weight);
			sc.nextLine();
			
		}
		
		sc.close();
		} catch(FileNotFoundException e) {
			System.err.println("파일을 찾을수 없습니다");
		}
	}

}
