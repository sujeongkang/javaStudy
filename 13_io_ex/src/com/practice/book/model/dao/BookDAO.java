package com.practice.book.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.practice.book.model.vo.Book;

public class BookDAO {
	private Book[]bArr=new Book[10];
	
	public void fileSave(Book[] bArr) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("book.txt"))){
			oos.writeObject(bArr);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public Book[] fileRead() {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("book.txt"))){
			bArr=(Book[])ois.readObject();
		}catch(ClassNotFoundException e) {
			//e.printStackTrace();
			
		}catch(EOFException e) {
			//e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return bArr;
	}
}
