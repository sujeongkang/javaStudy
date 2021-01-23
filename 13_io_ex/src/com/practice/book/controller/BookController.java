package com.practice.book.controller;

import java.io.File;
import java.io.IOException;

import com.practice.book.model.dao.BookDAO;
import com.practice.book.model.vo.Book;

public class BookController {
	BookDAO bd=new BookDAO();
	
	public void makeFile() {
		File file=new File("book.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave(Book[]bArr) {
		bd.fileSave(bArr);
	}
	
	public Book[] fileRead() {
		return bd.fileRead();
	}
}
