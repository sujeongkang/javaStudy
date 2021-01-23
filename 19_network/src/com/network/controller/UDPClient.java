package com.network.controller;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {
	//던지고 받는 ..
	public static void main(String[] args) throws UnknownHostException{
		int port=9999;
		
		InetAddress address=InetAddress.getLocalHost();
		
		//문자전송 주고받기
		DatagramSocket socket=null;
		Scanner sc=new Scanner(System.in);
		try {
			socket=new DatagramSocket(port);
			System.out.print("전송할 데이터 입력:");
			String msg=sc.nextLine();
			DatagramPacket packet=new DatagramPacket(msg.getBytes(),  //데이터를 바이트로
					msg.getBytes().length//패킷의 데이터 길이
					,address,
					8888);//서버의 포트
			socket.send(packet);
			
			//데이터 받기
			byte[] data=new byte[512];
			packet=new DatagramPacket(data, data.length);
			socket.receive(packet);
			
			System.out.println(new String(packet.getData()));
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			socket.close();
			
		}
		
	}
}
