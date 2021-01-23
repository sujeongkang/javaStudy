package com.subio.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataInputOutput {
	public void dataOutputTest() {
		//보조 스트림을 사용할때는
		//주 스트림을 먼저 생성한 후
		//보조 스트림을 생성함.
		FileOutputStream fos=null;//주 스트림
		DataOutputStream dos=null;//기반 스트림
		
		try {
			fos=new FileOutputStream("character.dat");
			dos=new DataOutputStream(fos);
			Scanner sc=new Scanner(System.in);
			System.out.print("이름: ");
			String name=sc.nextLine();
			System.out.print("나이: ");
			int age=sc.nextInt();
			
			dos.writeUTF(name); //자료형 준수해서 write설정
			dos.writeInt(age);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(dos!=null) {
				try {
					dos.close(); //닫을때 보조스트림만 닫으면됨.
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void dataInputTest() {
		
		try(FileInputStream fis=new FileInputStream("character.dat");//기본스트림 먼저 생성 후
				DataInputStream dis=new DataInputStream(fis)){//보조 스트림 생성
			//data보조 스트림에서 데이터를 읽어올때는 저장한 type순서대로 읽어옴.
			String name=dis.readUTF();
			int age=dis.readInt();//둘이 순서를 바꾸면 에러. 
			//위에서 저장할때  String,int순이면 읽어올때도 String,int순
			
			System.out.println("이름: "+name+" 나이: "+age);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
