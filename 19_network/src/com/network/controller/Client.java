package com.network.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		//Client�����ϱ�
		//���� ��û�� ������ ��Ʈ
		int port=8888;//�� �ּҰ� �ƴ϶� ������ ��Ʈ !!!
		
		BufferedReader br=null;
		PrintWriter pw=null;
		Socket socket=null;
		try {
			//������ ������ �ּ�,��Ʈ�� ������ socket�� ����
			socket=new Socket("192.168.200.198",port);
			
			if(socket!=null) {//���� �����Ұž� �����ص� �Ǵ�? ���� �����ƴ�?
				//���� ��Ʈ�� ����
				br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw=new PrintWriter(socket.getOutputStream());
				
				//������ ���� �����Է� ��ɱ���
				Scanner sc=new Scanner(System.in);
				System.out.println("��ȭ�Է�");
				do {
					//������ �����͸� ����
					String msg=sc.nextLine();
					pw.println(msg);
					pw.flush();
					
					if(msg.equals("exit")) {
						break;
					}
					
					//�������� �� ������Ȯ��
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
