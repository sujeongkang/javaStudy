package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc=new LibraryController();
	private Scanner sc=new Scanner(System.in);
	
	
	public void mainMenu() {
		
		System.out.println("===ȸ�� ������ �Է����ּ���.==");
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("����: ");
		int age=sc.nextInt();
		System.out.print("����: ");
		sc.nextLine();
		char gender=sc.nextLine().charAt(0);
		
		Member mem=new Member(name,age,gender);
		lc.insetMember(mem);
		
		main:
		while(true) {
			System.out.println("=======�޴�====");
			System.out.println("1.����������");
			System.out.println("2.���� ��ü ��ȸ");
			System.out.println("3.���� �˻�");
			System.out.println("4.�����뿩�ϱ�");
			System.out.println("9.���α׷� �����ϱ�");
			System.out.print("�޴���ȣ: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: 
				Member info=lc.myInfo();
				System.out.println(info); break;
			case 2: selectAll();break;
			case 3: searchBook();break;
			case 4: rentBook();break;
			case 9: ;break main;
			
			}
			
		}
		
	
	}
	public void selectAll() {
		Book[]bList=lc.selectAll();
		for(int i=0;i<bList.length;i++) {
			System.out.println(i+"�� ����: "+bList[i]);
		}
		
		
		
	}
	public void searchBook() {
		System.out.print("�˻��� ���� Ű����: ");
		sc.nextLine();
		String key=sc.nextLine();
		Book[] searchList=lc.searchBook(key);
		for(Book book:searchList) {
			if(book!=null) {
				System.out.println(book);	
			}
		}
	
		
	}
	public void rentBook() {
		selectAll();
		System.out.print("�뿩�� ���� ��ȣ����: ");
		int index=sc.nextInt();
		int result=lc.rentBook(index);
		
		switch(result) {
		case 0: System.out.println("���������� �뿩 �Ǿ����ϴ�.");break;
		case 1: System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");break;
		case 2: System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");break;
		}
		
		
	}
}
