package com.network.controller;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {
	//������ �޴� ..
	public static void main(String[] args) throws UnknownHostException{
		int port=9999;
		
		InetAddress address=InetAddress.getLocalHost();
		
		//�������� �ְ�ޱ�
		DatagramSocket socket=null;
		Scanner sc=new Scanner(System.in);
		try {
			socket=new DatagramSocket(port);
			System.out.print("������ ������ �Է�:");
			String msg=sc.nextLine();
			DatagramPacket packet=new DatagramPacket(msg.getBytes(),  //�����͸� ����Ʈ��
					msg.getBytes().length//��Ŷ�� ������ ����
					,address,
					8888);//������ ��Ʈ
			socket.send(packet);
			
			//������ �ޱ�
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
