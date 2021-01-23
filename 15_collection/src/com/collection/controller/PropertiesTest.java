package com.collection.controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	
	public void propertiesTest() {
		//Properties :  key = value�������� �����͸� �����ϴ� Ŭ����
		//���ڿ� �ڷḦ �����ϴ� Ŭ����
		//key : String, value:String
		//���� ū ����!! ���ϰ� �����Ͽ� ó���� �� ����
		//���Ͽ� �����ϰ�, ����Ȱ��� ������ �� ����
		//���α׷��� �ֿ� ��������, ȯ�浥���� ���� �����ϰ� �ҷ��ö� ���� ���
		
		//�����ؼ� �����.
		Properties prop=new Properties();
		
		
		//��ü�� �����͸� �����ϱ�
		//setProperty(key,value)�޼ҵ带 �̿��ؼ� ����
		prop.setProperty("name", "����ȣ");
		prop.setProperty("age", "29");
		
		//���Ͽ� �����ϰ� ������ �� ����
		//store(�������彺Ʈ��)�޼ҵ� �̿�
		try {
		prop.store(new FileWriter("prop.properties"),"�ΰ�");  //"�ΰ�"ĭ��  �ּ�ĭ..
		
		}catch(IOException e) {
			e.printStackTrace();  //�����ʿ� ����. �ڵ����� ����
		}
		
		//���Ͽ� ����� ���� �ҷ�����
		//load(���ڿ� �ҷ����� ��Ʈ��!)
		try {
			prop.load(new FileReader("myProp.properties"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//properties�� �ִ� �� ����ϱ�
		//getProperty(Ű��);
		System.out.println(prop.getProperty("userId"));
		System.out.println(prop.getProperty("password"));
//		System.out.println(prop.getProperty("name"));
//		System.out.println(prop.getProperty("age"));
//		System.out.println(prop.getProperty("nickname"));
	}
}
