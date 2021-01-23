package com.network.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		//Client구성하기
		//연결 요청할 서버의 포트
		int port=8888;//내 주소가 아니라 서버의 포트 !!!
		
		BufferedReader br=null;
		PrintWriter pw=null;
		Socket socket=null;
		try {
			//연결한 서버의 주소,포트를 가지고 socket을 생성
			socket=new Socket("192.168.200.198",port);
			
			if(socket!=null) {//소켓 생성할거야 연결해도 되니? 소켓 생성됐니?
				//연결 스트림 열기
				br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw=new PrintWriter(socket.getOutputStream());
				
				//서버에 보낼 문구입력 기능구성
				Scanner sc=new Scanner(System.in);
				System.out.println("대화입력");
				do {
					//서버에 데이터를 전송
					String msg=sc.nextLine();
					pw.println(msg);
					pw.flush();
					
					if(msg.equals("exit")) {
						break;
					}
					
					//서버에서 온 데이터확인
					System.out.println(br.readLine());
					
				}while(true);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				pw.close();
				socket.close();

			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
}
