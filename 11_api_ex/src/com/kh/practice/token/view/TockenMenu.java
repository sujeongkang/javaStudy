package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TockenMenu {
	Scanner sc=new Scanner(System.in);
	TokenController tc=new TokenController();
	
	public void mainMenu() {
		menu:
		while(true) {
			System.out.println("1.���� ���ڿ�");
			System.out.println("2.�Է� ���ڿ�");
			System.out.println("3.���α׷� ����");
			System.out.print("�޴�����: ");
			int cho=sc.nextInt();
			switch(cho) {
			case 1: tockenMenu();break;
			case 2: inputMenu();break;
			case 3: System.out.println("���α׷��� �����մϴ�.");break menu;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");continue;
			}
		}
		
	}
	public void tockenMenu() {
		String str="J a v a P r o g r a m";
		System.out.println("��ū ó�� �� ����: "+str);
		System.out.println("��ū ó�� �� ����: "+str.length());
		String after=tc.afterTocken(str);
		System.out.println("��Ŭ ó�� �� ����: "+after);
		System.out.println("��Ŭ ó�� �� ����: "+after.length());
		String upper=after.toUpperCase();
		System.out.println("��� �빮�ڷ� ��ȯ: "+upper);
		
		
	}
	public void inputMenu() {
		System.out.print("���ڿ��� �Է��ϼ���: ");
		sc.nextLine();
		String input=sc.nextLine();
		String first=tc.firstCap(input);
		System.out.println("ù ���� �빮��: "+first);
		System.out.print("ã�� ���� �ϳ��� �Է��ϼ��� :");
		char one=sc.nextLine().charAt(0);
		int count=tc.findChar(input, one);
		System.out.println(one+"���ڰ� �� ����: "+count);
	}
	
}
