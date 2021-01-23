package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TockenMenu {
	Scanner sc=new Scanner(System.in);
	TokenController tc=new TokenController();
	
	public void mainMenu() {
		menu:
		while(true) {
			System.out.println("1.지정 문자열");
			System.out.println("2.입력 문자열");
			System.out.println("3.프로그램 종료");
			System.out.print("메뉴션택: ");
			int cho=sc.nextInt();
			switch(cho) {
			case 1: tockenMenu();break;
			case 2: inputMenu();break;
			case 3: System.out.println("프로그램을 종료합니다.");break menu;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");continue;
			}
		}
		
	}
	public void tockenMenu() {
		String str="J a v a P r o g r a m";
		System.out.println("토큰 처리 전 글자: "+str);
		System.out.println("토큰 처리 전 개수: "+str.length());
		String after=tc.afterTocken(str);
		System.out.println("토클 처리 후 글자: "+after);
		System.out.println("토클 처리 후 글자: "+after.length());
		String upper=after.toUpperCase();
		System.out.println("모든 대문자로 변환: "+upper);
		
		
	}
	public void inputMenu() {
		System.out.print("문자열을 입력하세요: ");
		sc.nextLine();
		String input=sc.nextLine();
		String first=tc.firstCap(input);
		System.out.println("첫 글자 대문자: "+first);
		System.out.print("찾을 문자 하나를 입력하세요 :");
		char one=sc.nextLine().charAt(0);
		int count=tc.findChar(input, one);
		System.out.println(one+"문자가 들어간 개수: "+count);
	}
	
}
