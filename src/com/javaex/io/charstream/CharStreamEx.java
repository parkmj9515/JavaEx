package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "char.txt"; // 문장데이터 출력
	
	public static void main(String[] args) {
		//	fileWriter
//		writeFile();
		//	fileReader
		readFile();
	}
	//	write
	private static void writeFile() {
		//	fileWriter를 이용해서 text파일 생성
		System.out.println("파일명: " + filename);
		
		try(		//	스트림 열기
			Writer writer = new FileWriter(filename);)
				{		//	텍스트 기록
					writer.write("하이미디어 아카데미\r\n");
					writer.write("Java Programming\r\n");
					writer.write("2024.04");
					writer.flush();	//	내부 데이터 지우기
					writer.close();
				} catch(FileNotFoundException e) {
					System.err.println("파일을 찾을 수 없습니다");
				} catch(IOException e) {
					e.printStackTrace();
				}

	}
	
	private static void readFile() {
		System.out.println("파일명: " + filename);
		
		try(
			Reader reader = new FileReader(filename);
				)
		{
			//	읽어들일 데이터 저장 변수
			int data =0;
			String message = "";
			
			//	2바이트( char) 읽어서 > int로 반환
			while((data = reader.read()) != -1) { // -1이면 더 읽을 수 없다
//				System.out.println("읽은 데이터: "+ (char)data);
				message += (char)data;
			}
				System.out.println(message);
		} catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다");
		} catch(IOException e) {
			e.printStackTrace();
		}
				
		
	}

}
