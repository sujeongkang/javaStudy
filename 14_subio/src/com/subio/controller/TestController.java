package com.subio.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.subio.model.vo.Person;

public class TestController {
	
	//이름, 나이 , 성별, 전화번호를 세명을 입력받아 
	//person.data파일에 저장하고
	//저장된 데이터를 불러와 Person클래스를 만들고 저장하기
	public void savePerson() {
		Scanner sc=new Scanner(System.in);
		
			
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("person.data"))){
			
			for(int i=0;i<3;i++) {
				System.out.println("======사람저장!======");
				System.out.print("이름: ");
				String name=sc.nextLine();
				System.out.print("나이: ");
				int age=sc.nextInt();
				System.out.print("성별: ");
				char gender=sc.next().charAt(0);
				System.out.print("전화번호: ");
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
