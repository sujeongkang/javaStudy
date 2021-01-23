package com.subio.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataInputOutput2 {
	public void dataOutput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("======�������!======");
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("����: ");
		int age=sc.nextInt();
		System.out.print("Ű: ");
		double height=sc.nextDouble();
		
		
		//���Ϸ� �����ϱ�
		//�ڷ������ ������ �ϱ�
		//�⺻��Ʈ��.->�ֽ�Ʈ��~
		FileOutputStream out=null;
		//����� ���� ��Ʈ�� ����
		DataOutputStream dout=null;
		try {
			out=new FileOutputStream("datatest.bs");
			dout=new DataOutputStream(out);
			//file�� write�޼ҵ� �̿��ؼ� �����ϱ�
			//������Ʈ���� write�ڷ����� �� ���߾������ ���������Ŀ� �ؼ��ؼ� �����.
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeDouble(height);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(dout!=null) {
				
				try {
					//out.close();
					dout.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void dataInput() {
		String name="";
		int age=0;
		double height=0;
		try(DataInputStream dis=new DataInputStream(new FileInputStream("datatest.bs"))){
			//���Ͽ� �ִ� �ҷ�����
			//DataOutputStream�� �̿��Ͽ� ����� �����͸� DataInputStream���� �ҷ��� �� ����.
			//�ҷ��ö��� ������ ������� �����͸� �о�;���.. �ڷ����� ���缭
			name=dis.readUTF();
			age=dis.readInt();
			height=dis.readDouble();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(name+age+height);
	}
}
