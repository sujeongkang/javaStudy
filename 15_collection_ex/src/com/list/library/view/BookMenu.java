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
			System.out.println("****메인메뉴****");
			System.out.println("1.새 도서 추가");
			System.out.println("2.도서 전체 조회");
			System.out.println("3.도서 검색 조회");
			System.out.println("4.도서 삭제");
			System.out.println("5.도서명 오름차순 정렬");
			System.out.println("9.종료");
			System.out.print("메뉴: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:insertBook();break;
			case 2:selectList();break;
			case 3:searchBook();break;
			case 4:deleteBook();break;
			case 5:ascBook();break;
			case 9:System.out.println("프로그램을 종료합니다.");return;
			default: System.out.println("잘못 입력 하였습니다. 다시 입력해주세요");

			}
		
		}
	}
	public void insertBook() {
		
		sc.nextLine();
		System.out.print("도서명: ");
		String title=sc.nextLine();
		System.out.print("저자명: ");
		String author=sc.nextLine();
		System.out.print("장르(1.인문 / 2.자연과학 / 3.의료 / 4.기타): ");
		String []cg=new String[] {"인문","자연과학","의료","기타"};
		String category=cg[sc.nextInt()-1];
		System.out.print("가격 :");	
		int price=sc.nextInt();
		
		//5. 매개변수 생성자를 이용하여 Book 객체 생성
		//(객체 생성 시 장르 번호 별로 조건식 이용해 장르번호가 아닌 장르 명으로 값 넘겨야 함)
		
		Book bk=new Book(title,author,category,price);
		bc.insertBook(bk);		
		return;
			
	}
	public void selectList() {
		ArrayList<Book> bookList=bc.selectList();
		if(bookList.size()==0) {
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			for(Book b:bookList) {
				System.out.println(b);
			}
		}
	}
	public void searchBook() {
		sc.nextLine();
		System.out.print("검색할 도서명 키워드: ");
		String keyword=sc.nextLine();
		ArrayList <Book> searchList=bc.searchBook(keyword);
		if(!searchList.isEmpty()) {
				System.out.println(searchList);
		}else {
			System.out.println("검색결과가 없습니다");
		}
	}
	public void deleteBook() {
		sc.nextLine();
		System.out.print("삭제할 도서명: ");
		String title=sc.nextLine();
		System.out.print("삭제할 저자명: ");
		String author=sc.nextLine();
		Book remove=(bc.deleteBook(title, author));
		if(remove==null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}else {
			System.out.println("성공적으로 삭제 되었습니다.");
		}
		
	}
	public void ascBook() {
		bc.ascBook();
	}
}
