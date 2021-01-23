package com.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.list.library.model.vo.Book;

public class BookController {
	private List list=new ArrayList();
	
	public BookController() {
		list.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		list.add(new Book("쉽게 배우는 알고리즘", "유병로", "기타", 15000));
		list.add(new Book("대화의 기술", "강보람", "인문", 17500));
		list.add(new Book("암정복기", "박신우", "의료", 21000));
	}
	public void insertBook(Book bk) {
		list.add(bk);
	}
	public ArrayList selectList() {
		return (ArrayList) list;
	}
	public ArrayList searchBook(String keyword) {
		ArrayList searchList=new ArrayList();
		for(Object o:list) {
			if(o instanceof Book) {
				Book search=(Book)o;
				if(search.getTitle().contains(keyword)) {
					searchList.add(search);
					
				}
			}
		}return searchList;
	}
	public Book deleteBook(String title, String author) {
		Book removeBook=null;
		for(Object o:list) {
			if(o instanceof Book) {
				Book b=(Book)o;
				if(b.getTitle().equals(title)&&b.getAuthor().equals(author)) {
					list.remove(b);
					return removeBook=b;
				}
			}
		}return removeBook;
	}
	public int ascBook() {
		Collections.sort(list);
		return 1;
	}
}
