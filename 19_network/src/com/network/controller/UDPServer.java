package com.network.controller;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPServer {
	public static void main(String[] args) throws UnknownHostException {
		int port=8888;
		
		InetAddress address=InetAddress.getLocalHost();
		
		//문자전송 주고받기
		DatagramSocket socket=null;
		Scanner sc=new Scanner(System.in);
		try {
			socket=new DatagramSocket(port);
			System.out.print("전송할 데이터 입력:");
			String msg=sc.nextLine();
			DatagramPacket packet=new DatagramPacket(msg.getBytes(), 
					msg.getBytes().length//패킷의 데이터 길이
					,address,
					9999);//클라이언트의 포트
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
