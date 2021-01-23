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
		
		//오름차순 정렬
		Collections.sort(nums);
		
		//내림차순 정렬 
		//내림차순을 위한 객체를 생성. -->Comparator인터페이스를 구현
		//객체내부에서 정렬 순서를 정하는 방법 ->comparable 인터페이스를 구현
		//compare()/compareTo() 메소드 구현
		
		
		
		
		//익명클래스
		Collections.sort(nums, new Comparator() {
			@Override
			public int compare(Object o,Object o1)
			{
				return (Integer)o1-(Integer)o;
			}
		});
		
		
		
		
		
		//문자열 리스트
		nums.clear();
		nums.add("하하하");
		nums.add("나나나");
		nums.add("아아아");
		nums.add("라라라");
		nums.add("가가가");
		
		
		Collections.sort(nums);
		
		for(Object o:nums) {
			System.out.print(o+" ");
		}
		System.out.println();
		
		
		
	}
	
	public void propertiesTest() {
		Properties prop=new Properties();
		
		prop.setProperty("name", "하하하");
		System.out.println(prop.getProperty("name"));
		
		
	
		
		try {
			prop.store(new FileWriter("eee.txt"), "실험용");
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
	

