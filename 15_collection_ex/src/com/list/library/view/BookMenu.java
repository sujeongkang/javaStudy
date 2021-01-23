package com.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.list.library.controller.BookController;
import com.list.library.model.vo.Book;

public class BookMenu {
	Scanner sc=new Scanner(System.in);
	private BookController bc=new BookController();
	
	public void mainMenu() {
		System.out.println("===Welcome KH Library====");
		while(true) {
			System.out.println("****���θ޴�****");
			System.out.println("1.�� ���� �߰�");
			System.out.println("2.���� ��ü ��ȸ");
			System.out.println("3.���� �˻� ��ȸ");
			System.out.println("4.���� ����");
			System.out.println("5.������ �������� ����");
			System.out.println("9.����");
			System.out.print("�޴�: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:insertBook();break;
			case 2:selectList();break;
			case 3:searchBook();break;
			case 4:deleteBook();break;
			case 5:ascBook();break;
			case 9:System.out.println("���α׷��� �����մϴ�.");return;
			default: System.out.println("�߸� �Է� �Ͽ����ϴ�. �ٽ� �Է����ּ���");

			}
		
		}
	}
	public void insertBook() {
		
		sc.nextLine();
		System.out.print("������: ");
		String title=sc.nextLine();
		System.out.print("���ڸ�: ");
		String author=sc.nextLine();
		System.out.print("�帣(1.�ι� / 2.�ڿ����� / 3.�Ƿ� / 4.��Ÿ): ");
		String []cg=new String[] {"�ι�","�ڿ�����","�Ƿ�","��Ÿ"};
		String category=cg[sc.nextInt()-1];
		System.out.print("���� :");	
		int price=sc.nextInt();
		
		//5. �Ű����� �����ڸ� �̿��Ͽ� Book ��ü ����
		//(��ü ���� �� �帣 ��ȣ ���� ���ǽ� �̿��� �帣��ȣ�� �ƴ� �帣 ������ �� �Ѱܾ� ��)
		
		Book bk=new Book(title,author,category,price);
		bc.insertBook(bk);		
		return;
			
	}
	public void selectList() {
		ArrayList<Book> bookList=bc.selectList();
		if(bookList.size()==0) {
			System.out.println("�����ϴ� ������ �����ϴ�.");
		}else {
			for(Book b:bookList) {
				System.out.println(b);
			}
		}
	}
	public void searchBook() {
		sc.nextLine();
		System.out.print("�˻��� ������ Ű����: ");
		String keyword=sc.nextLine();
		ArrayList <Book> searchList=bc.searchBook(keyword);
		if(!searchList.isEmpty()) {
				System.out.println(searchList);
		}else {
			System.out.println("�˻������ �����ϴ�");
		}
	}
	public void deleteBook() {
		sc.nextLine();
		System.out.print("������ ������: ");
		String title=sc.nextLine();
		System.out.print("������ ���ڸ�: ");
		String author=sc.nextLine();
		Book remove=(bc.deleteBook(title, author));
		if(remove==null) {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		}else {
			System.out.println("���������� ���� �Ǿ����ϴ�.");
		}
		
	}
	public void ascBook() {
		bc.ascBook();
	}
}
