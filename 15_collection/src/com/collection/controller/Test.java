package com.collection.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;

public class Test {
	public void listSort() {
		List nums=new ArrayList();
		for(int i=0;i<10;i++) {
			nums.add((int)(Math.random()*30)+1);
		}
//		for(Object o:nums) {
//			System.out.println(o);
//		}
		
		//�������� ����
		Collections.sort(nums);
		
		//�������� ���� 
		//���������� ���� ��ü�� ����. -->Comparator�������̽��� ����
		//��ü���ο��� ���� ������ ���ϴ� ��� ->comparable �������̽��� ����
		//compare()/compareTo() �޼ҵ� ����
		
		
		
		
		//�͸�Ŭ����
		Collections.sort(nums, new Comparator() {
			@Override
			public int compare(Object o,Object o1)
			{
				return (Integer)o1-(Integer)o;
			}
		});
		
		
		
		
		
		//���ڿ� ����Ʈ
		nums.clear();
		nums.add("������");
		nums.add("������");
		nums.add("�ƾƾ�");
		nums.add("����");
		nums.add("������");
		
		
		Collections.sort(nums);
		
		for(Object o:nums) {
			System.out.print(o+" ");
		}
		System.out.println();
		
		
		
	}
	
	public void propertiesTest() {
		Properties prop=new Properties();
		
		prop.setProperty("name", "������");
		System.out.println(prop.getProperty("name"));
		
		
	
		
		try {
			prop.store(new FileWriter("eee.txt"), "�����");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

}
	
//	public void printList(List list) {
//		for(Object o:list) {
//			System.out.print(o+" ");
//		}
//		System.out.println();
//	}
//	
	

