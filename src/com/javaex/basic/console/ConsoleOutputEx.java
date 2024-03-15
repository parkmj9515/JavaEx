package com.javaex.basic.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		// System.out.println
		// System.out.print
		// System.out.printf
		System.out.print("Hello ");
		System.out.println("JAVA");
		
		String str1= "Hello";
		String str2= "JAVA";
		
		System.out.println(str1 + " " + str2);
		
		// 이스케이프문자
		// |n(개행) |t(탭) |"(인용부호) || (|)
		
		System.out.println("Hello\nJAVA");
		System.out.println("Hello\tJAVA");
		System.out.println("Hello, \"JAVA\"");
		
		String path = "c:\\User\\Hong\\memo.txt";
		System.out.println(path);
		
		
		
	}

}
