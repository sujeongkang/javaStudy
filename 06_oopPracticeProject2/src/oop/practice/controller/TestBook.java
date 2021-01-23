package oop.practice.controller;

import oop.practice.model.Book;

public class TestBook {
	public static void main(String[] args) {
		Book b=new Book();
		Book bm=new Book("뇌를 자극하는 Java",20000,0.2,"김윤영");
		
		b.bookInfomation();
		bm.bookInfomation();
		
		b.setTitle("자바의 정석");
		b.setPrice(35000);
		b.setDiscountRate(0.1);
		b.setAuthor("윤상섭");
		
	
		System.out.println("도서명: "+b.getTitle()+"\n할인된 가격 :"+b.bookdiscount());
		System.out.println("도서명: "+bm.getTitle()+"\n할인된 가격 :"+bm.bookdiscount());
		
	}
}
