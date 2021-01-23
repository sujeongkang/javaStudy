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
		//���������ϱ�
		//1.port��ȣ �����ϱ�
		int port=8888;  //�����Ǿ����� 0~65535 //0~2000 �� ���� �����Ǿ���.
		
		//2.ServetSocket�����ϱ�
		ServerSocket server=new ServerSocket(port); //���α׷��� �����ϴ� ��θ� ����
		
		//3.server���� �����ϱ�
		while(true) {  //������ ��� ���ƾ��ϴ� �ݺ���..
			//3-1. client��û���
			Socket client=server.accept();  //���ӿ�û�� ��û������ �ش� Ŭ���̾�Ʈ ��ü ����
			
			//����� ������ �̿��Ͽ� ��Ʈ������
			InputStream clientInput=client.getInputStream();//Ŭ���̾�Ʈ�� �������� �޾ƿ�
			OutputStream clientOutput=client.getOutputStream();//�������� Ŭ���̾�Ʈ�� ����.
		
			
			//��������� ���� ������Ʈ�� ����ϱ�        //���ڿ� 
			BufferedReader br=new BufferedReader(new InputStreamReader(clientInput));//�ӵ��⼧
			PrintWriter pw=new PrintWriter(clientOutput);
		
			//Ŭ���̾�Ʈ�� ���� ������ �ޱ�
			while(true) {
				String msg=br.readLine();//�� ���ξ� ���ۿ��� �޾ƿ�.
				
				if(!msg.equals("exit")) { //exit�� ������
					System.out.println(client.getInetAddress().getHostAddress()+":"+msg);
					pw.println("�����޼��� ���ż���");
					pw.flush();//��������� ..������ �����ϱ�..
				
				}else {
					System.out.println("��������");
					break;
				}
			}
			
	
			//���� ��Ʈ���� �ݱ�
			br.close();
			pw.close();
			client.close();
		
		
		}
	}
}
