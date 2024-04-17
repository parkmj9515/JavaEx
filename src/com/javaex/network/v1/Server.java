package com.javaex.network.v1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//	v1. 접속대기
public class Server {

	public static void main(String[] args) {
		// 서버 소켓 생성
		ServerSocket serverSocket = null;

		// IP와 포트에 연결 : bind
		try {
			serverSocket = new ServerSocket();
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000); // 접속허용주소(허용IP),남들이 사용하지않는주소
			serverSocket.bind(local);

			System.out.println("서버가 시작되었습니다");
			System.out.println("연결을 기다립니다");

			// 연결 대기
			Socket socket = serverSocket.accept();

			// 클라이언트 접속시의 처리
			InetSocketAddress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println("클라이언트가 연결되었습니다");
			System.out.println(socketAddress.getAddress() + ":" + socketAddress.getPort());// Port 데이터통신포트

			// 후처리
			System.out.println("================");
			System.out.println("서버종료");

			// 접속허용
		} catch (IOException e) {

		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
