package oop.practice.controller;

import oop.practice.model.Book;

public class TestBook {
	public static void main(String[] args) {
		Book b=new Book();
		Book bm=new Book("���� �ڱ��ϴ� Java",20000,0.2,"������");
		
		b.bookInfomation();
		bm.bookInfomation();
		
		b.setTitle("�ڹ��� ����");
		b.setPrice(35000);
		b.setDiscountRate(0.1);
		b.setAuthor("����");
		
	
		System.out.println("������: "+b.getTitle()+"\n���ε� ���� :"+b.bookdiscount());
		System.out.println("������: "+bm.getTitle()+"\n���ε� ���� :"+bm.bookdiscount());
		
	}
}
