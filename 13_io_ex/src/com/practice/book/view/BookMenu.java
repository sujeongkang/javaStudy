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
			System.out.println("1.도서 추가저장");
			System.out.println("2.저장 도서 출력");
			System.out.println("9.프로그램 끝내기");
			System.out.print("메뉴번호: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: fileSave();break;
			case 2: fileRead();break;
			case 9: System.out.println("프로그램 종료");return;
			default: System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");
			}
		}
		
	}
	public void fileSave() {
		
		for(int i=0;i<bArr.length;i++) {
			if(bArr[i]==null) {
				sc.nextLine();
				System.out.print("도서명: ");
				String title=sc.nextLine();
				System.out.print("저자명: ");
				String author=sc.nextLine();
				System.out.print("도서가격: ");
				int price=sc.nextInt();
				sc.nextLine();
				System.out.print("출판 날짜(yyyy-mm-dd): ");
				String date=sc.nextLine();
				System.out.print("할인율");
				double discount=sc.nextDouble();
				
				String[]darr=(date.split("-"));
				Calendar cal=Calendar.getInstance();
				cal.set(Calendar.YEAR,Integer.parseInt(darr[0]));
				cal.set(Calendar.MONTH,Integer.parseInt(darr[1]));
				cal.set(Calendar.DATE,Integer.parseInt(darr[2]));
		
			
				bArr[i]=new Book(title,author,price,cal,discount);
				bc.fileSave(bArr);
			}else {
				System.out.println("저장할 공간이 없습니다.");
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
