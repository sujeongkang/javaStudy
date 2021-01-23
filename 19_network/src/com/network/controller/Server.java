package com.network.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		//서버생성하기
		//1.port번호 선정하기
		int port=8888;  //지정되어있음 0~65535 //0~2000 은 보통 지정되었음.
		
		//2.ServetSocket생성하기
		ServerSocket server=new ServerSocket(port); //프로그램을 연결하는 통로를 만듬
		
		//3.server동작 구성하기
		while(true) {  //서버는 계속 돌아야하니 반복문..
			//3-1. client요청대기
			Socket client=server.accept();  //접속요청시 요청수락후 해당 클라이언트 객체 생성
			
			//연결된 소켓을 이용하여 스트림열기
			InputStream clientInput=client.getInputStream();//클라이언트가 보낸것을 받아옴
			OutputStream clientOutput=client.getOutputStream();//서버것을 클라이언트에 보냄.
		
			
			//성능향상을 위해 보조스트림 사용하기        //문자열 
			BufferedReader br=new BufferedReader(new InputStreamReader(clientInput));//속도향샹
			PrintWriter pw=new PrintWriter(clientOutput);
		
			//클라이언트가 보낸 데이터 받기
			while(true) {
				String msg=br.readLine();//한 라인씩 버퍼에서 받아옴.
				
				if(!msg.equals("exit")) { //exit면 끝내라
					System.out.println(client.getInetAddress().getHostAddress()+":"+msg);
					pw.println("보낸메세지 수신성공");
					pw.flush();//버퍼지우기 ..데이터 전송하기..
				
				}else {
					System.out.println("접속종료");
					break;
				}
			}
			
	
			//열린 스트림들 닫기
			br.close();
			pw.close();
			client.close();
		
		
		}
	}
}
