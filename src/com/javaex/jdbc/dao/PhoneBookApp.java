package com.javaex.jdbc.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class PhoneBookApp {

	public static void main(String[] args) {
		listPhoneBook();
		System.out.println();
		
		inserPhoneBook();
//		updatePhoneBook();
//		getPhoneBook();
//		deletePhoneBook();
		
		System.out.println();
		
		

	}
	private static void deletePhoneBook() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 이름: ");
		String name = sc.nextLine();
		
		PhoneBookDAO pdao = new PhoneBookDAOImpl();
		boolean success = pdao.delete(name);
		
		System.out.println("Author DELETE" + (success ? "성공":"실패"));
	}
//----------------------------------------------------------------------------------------	
	private static void getPhoneBook() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 사람: ");
		String name = sc.nextLine();
		
		PhoneBookDAO pdao = new PhoneBookDAOImpl();
		PhoneBookVO vo = pdao.get(name);
		
		if(vo != null) {
			System.out.printf("%s\t%s\t%s%n", vo.getName(),vo.getHp(),vo.getTel());
		} else {
			System.out.println("레코드를 찾기 못했습니다");
		}
		sc.close();
	}
//-------------------------------------------------------------------------------------------
	private static void updatePhoneBook() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("전화 번호: ");
		String phone = sc.nextLine();
		
		System.out.print("집번호: ");
		String tel = sc.nextLine();
		
		PhoneBookVO pvo = new PhoneBookVO(name,phone,tel);
		
		PhoneBookDAO pdao = new PhoneBookDAOImpl();
		boolean success = pdao.update(pvo);
		
		System.out.println("Author UPDATE" + (success ? "성공":"실패"));
		sc.close();
	}
	
//---------------------------------------------------------------------------------------------------	
	private static void inserPhoneBook() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("전화 번호: ");
		String hp = sc.nextLine();
		
		System.out.print("집번호: ");
		String tel = sc.nextLine();
		
		PhoneBookVO pvo = new PhoneBookVO(name,hp,tel);
		
		PhoneBookDAO pdao = new PhoneBookDAOImpl();
		boolean success = pdao.insert(pvo);
		
		System.out.println("PhoneBook INSERT" + (success ? "성공":"실패"));
		
		sc.close();
	}
//-------------------------------------------------------------------------------------------------------	
	private static void listPhoneBook() {
		PhoneBookDAO pdao = new PhoneBookDAOImpl();
		System.out.println("=========전화번호 관리 프로그램==========");
		
		List<PhoneBookVO> list = pdao.getList();
		if(list.size() > 0) {
			// Iterator 순회
			Iterator<PhoneBookVO> it = list.iterator();
			while(it.hasNext()) {
				PhoneBookVO vo = it.next();
				System.out.printf("%s\t%s\t%s%n", vo.getName(),vo.getHp(),vo.getTel());
			}
		} else {
			System.out.println("데이터가 없습니다");
		}
	}
}