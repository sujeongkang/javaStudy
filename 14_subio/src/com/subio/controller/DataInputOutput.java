package com.subio.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataInputOutput {
	public void dataOutputTest() {
		//���� ��Ʈ���� ����Ҷ���
		//�� ��Ʈ���� ���� ������ ��
		//���� ��Ʈ���� ������.
		FileOutputStream fos=null;//�� ��Ʈ��
		DataOutputStream dos=null;//��� ��Ʈ��
		
		try {
			fos=new FileOutputStream("character.dat");
			dos=new DataOutputStream(fos);
			Scanner sc=new Scanner(System.in);
			System.out.print("�̸�: ");
			String name=sc.nextLine();
			System.out.print("����: ");
			int age=sc.nextInt();
			
			dos.writeUTF(name); //�ڷ��� �ؼ��ؼ� write����
			dos.writeInt(age);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(dos!=null) {
				try {
					dos.close(); //������ ������Ʈ���� �������.
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void dataInputTest() {
		
		try(FileInputStream fis=new FileInputStream("character.dat");//�⺻��Ʈ�� ���� ���� ��
				DataInputStream dis=new DataInputStream(fis)){//���� ��Ʈ�� ����
			//data���� ��Ʈ������ �����͸� �о�ö��� ������ type������� �о��.
			String name=dis.readUTF();
			int age=dis.readInt();//���� ������ �ٲٸ� ����. 
			//������ �����Ҷ�  String,int���̸� �о�ö��� String,int��
			
			System.out.println("�̸�: "+name+" ����: "+age);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
