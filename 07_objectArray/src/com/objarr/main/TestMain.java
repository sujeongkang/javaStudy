package com.objarr.main;

import com.objarr.model.vo.Nation;

public class TestMain {
	 public static void main(String[] args) {
	//String name, long population, String language, double size, String flower	 
		 Nation[]nation=new Nation[3];
		 nation[0]= new Nation("�ѱ�",6000,"�ѱ���",500,"����ȭ");
		 nation[1]= new Nation("ĳ����",9000,"����",1000,"��ǳ����");
		 nation[2]=new Nation("����",8000,"���Ͼ�",800,"������");
		 for(Nation na:nation)
		 System.out.println(na.getName());
		 for(int i=0;i<nation.length;i++) {
			 System.out.println(nation[i].getLanguage());
		 }
				 
	 }
}
