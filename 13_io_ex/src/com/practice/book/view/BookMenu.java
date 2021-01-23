package com.practice.book.view;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.Scanner;

import com.practice.book.controller.BookController;
import com.practice.book.model.vo.Book;



public class BookMenu {
	private Scanner sc=new Scanner(System.in);
	private BookController bc=new BookController();
	private Book[]bArr;
	
	public BookMenu() {
		bc.makeFile();
		bArr=bc.fileRead();
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("1.���� �߰�����");
			System.out.println("2.���� ���� ���");
			System.out.println("9.���α׷� ������");
			System.out.print("�޴���ȣ: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: fileSave();break;
			case 2: fileRead();break;
			case 9: System.out.println("���α׷� ����");return;
			default: System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
		
	}
	public void fileSave() {
		
		for(int i=0;i<bArr.length;i++) {
			if(bArr[i]==null) {
				sc.nextLine();
				System.out.print("������: ");
				String title=sc.nextLine();
				System.out.print("���ڸ�: ");
				String author=sc.nextLine();
				System.out.print("��������: ");
				int price=sc.nextInt();
				sc.nextLine();
				System.out.print("���� ��¥(yyyy-mm-dd): ");
				String date=sc.nextLine();
				System.out.print("������");
				double discount=sc.nextDouble();
				
				String[]darr=(date.split("-"));
				Calendar cal=Calendar.getInstance();
				cal.set(Calendar.YEAR,Integer.parseInt(darr[0]));
				cal.set(Calendar.MONTH,Integer.parseInt(darr[1]));
				cal.set(Calendar.DATE,Integer.parseInt(darr[2]));
		
			
				bArr[i]=new Book(title,author,price,cal,discount);
				bc.fileSave(bArr);
			}else {
				System.out.println("������ ������ �����ϴ�.");
			}
					
		}
		
		
	}
	public void fileRead() {
		for(Book book:bc.fileRead()) {
			if(book!=null) {
				System.out.println(book);
			}
		}
	}
	
}
