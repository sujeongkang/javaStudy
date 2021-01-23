package com.first;
//외부패키지에 있는 클래스를 이용하는 방법
//import로 외부에 있는 클래스를 불러옴
import com.second.SecondTest;  //import 외부패키지.클래스명;

public class FirstTest {
	
	public static void main(String[] args) {
		//주석을 통해서 설명이나 기록사항을 남김
		//한 줄만 주석을 하는 경우
		/*
		  여러줄을 주석하는 경우
		  여러줄
		  여러줄!!!!
		 */
		//안녕
		System.out.println("안녕 내가 처음만든 코드!");
	
		System.out.println("이것도 출력해봐야지!");
		
		//외부클래스 기능(메소드)이용하기
		new SecondTest().printTest();

	}
	
}
