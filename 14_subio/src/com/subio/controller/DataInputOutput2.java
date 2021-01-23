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
		System.out.println("======사람저장!======");
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("나이: ");
		int age=sc.nextInt();
		System.out.print("키: ");
		double height=sc.nextDouble();
		
		
		//파일로 저장하기
		//자료형대로 저장을 하기
		//기본스트림.->주스트림~
		FileOutputStream out=null;
		//사용할 보조 스트림 생성
		DataOutputStream dout=null;
		try {
			out=new FileOutputStream("datatest.bs");
			dout=new DataOutputStream(out);
			//file에 write메소드 이용해서 저장하기
			//보조스트림은 write자료형을 잘 맞추어저장시 데이터형식에 준수해서 저장됨.
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
			//파일에 있는 불러오기
			//DataOutputStream을 이용하여 저장된 데이터만 DataInputStream으로 불러올 수 있음.
			//불러올때는 저정한 순서대로 데이터를 읽어와야함.. 자료형에 맞춰서
			name=dis.readUTF();
			age=dis.readInt();
			height=dis.readDouble();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(name+age+height);
	}
}
