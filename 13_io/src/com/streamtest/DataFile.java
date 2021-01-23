package com.streamtest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataFile {
	public void savePerson() {
		Scanner sc=new Scanner (System.in);
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("나이: ");
		int age=sc.nextInt();
		System.out.print("키: ");
		double height=sc.nextDouble();
		
		try(FileWriter fw=new FileWriter("person.data")){
			fw.write(name+",");
			fw.write(String.valueOf(age)+",");
			fw.write(String.valueOf(height)+",");
			//매번 ,로 구분해 저장하지 않도록  보조스트림 활용.
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void loadPerson() {
		try(FileReader fr=new FileReader("person.data")){
			//char[] str=new char[new File("person.data")fr.length()];
			int value=0;
			String person="";
			while((value=fr.read())!=-1) {
				person+=(char)value;
			}
			System.out.println(person);
			String[] datas=person.split(",");
			System.out.println("이름: "+datas[0]);
			System.out.println("나이: "+Integer.parseInt(datas[1]));//csv형식
			System.out.println("키: "+Double.parseDouble(datas[2]));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
