package com.objarr.main;

import com.objarr.model.vo.Nation;

public class TestMain {
	 public static void main(String[] args) {
	//String name, long population, String language, double size, String flower	 
		 Nation[]nation=new Nation[3];
		 nation[0]= new Nation("한국",6000,"한국어",500,"무궁화");
		 nation[1]= new Nation("캐나다",9000,"영어",1000,"단풍나무");
		 nation[2]=new Nation("독일",8000,"독일어",800,"ㄹㄹㄹ");
		 for(Nation na:nation)
		 System.out.println(na.getName());
		 for(int i=0;i<nation.length;i++) {
			 System.out.println(nation[i].getLanguage());
		 }
				 
	 }
}
