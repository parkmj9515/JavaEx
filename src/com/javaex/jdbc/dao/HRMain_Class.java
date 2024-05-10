package com.javaex.jdbc.dao;

import java.util.Scanner;

public class HRMain_Class {

	public static void main(String[] args) {
		getHREmp();
		
	}

	private static void getHREmp() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("검색할 사람을 입력해주세요");
		 String name = sc.nextLine();
		 
		 HREmpDAO hdao = new EmpDAOImplOracle();
		 HREmpVO hvo = hdao.get(name);
		 
		 if(hvo != null) {
			 System.out.printf("%s%s%s%s%n",hvo.getName(),hvo.getEmail(),hvo.getPhone(),hvo.getHiredate());
		 } else {
			 System.out.println("사람을 찾을수 없습니다");
		 }
		 
		 sc.close();
		 
			
		}
		
	}

