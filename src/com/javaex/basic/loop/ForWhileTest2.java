package com.javaex.basic.loop;

import java.util.Scanner;

public class ForWhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		int dan = 2;
		int num = 1;
		// int dan =2 ,num;	
		
		
		while(dan <=9 ) {
			System.out.println(dan + "*" + num + "=" + (dan * num));	
			num ++; 
		while(num <=9 ) {
			System.out.println(dan + "*" + num + "=" + (dan * num));
			num ++;
			//num += 1;
			}
		num =1;
		dan ++;		
		}
	}
}

//	int dan = 2 ,num;
//	while(dan <=9) {
//		num =1;
//		}while(num <=9) {
//			System.out.println(dan + "*" + num + "=" + (dan * num));
//			num += 1;
//		}dan += 1;
//	}
//}
