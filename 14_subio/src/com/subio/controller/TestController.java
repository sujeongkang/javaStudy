package com.subio.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.subio.model.vo.Person;

public class TestController {
	
	//�̸�, ���� , ����, ��ȭ��ȣ�� ������ �Է¹޾� 
	//person.data���Ͽ� �����ϰ�
	//����� �����͸� �ҷ��� PersonŬ������ ����� �����ϱ�
	public void savePerson() {
		Scanner sc=new Scanner(System.in);
		
			
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("person.data"))){
			
			for(int i=0;i<3;i++) {
				System.out.println("======�������!======");
				System.out.print("�̸�: ");
				String name=sc.nextLine();
				System.out.print("����: ");
				int age=sc.nextInt();
				System.out.print("����: ");
				char gender=sc.next().charAt(0);
				System.out.print("��ȭ��ȣ: ");
				sc.nextLine();
				String phone=sc.nextLine();
			
				dos.writeUTF(name);
				dos.writeInt(age);
				dos.writeChar(gender);
				dos.writeUTF(phone);
				
				}
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		
	}
	
	public void loadPerson() {
		Person []p=new Person[3];
		String name=null;
		int age=0;
		char gender=0;
		String phone=null;
		
		try(DataInputStream dis=new DataInputStream(new FileInputStream("person.data"))){
			
			for(int i=0;i<p.length;i++) {
				
				name=dis.readUTF();
				age=dis.readInt();
				gender=dis.readChar();
				phone=dis.readUTF();
				
				p[i]=new Person(name,age,gender,phone);
			}
			
			for(Person p1:p) {
				
				System.out.println(p1);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
