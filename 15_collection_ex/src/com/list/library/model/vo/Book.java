package com.list.library.model.vo;

import java.util.Objects;

public class Book implements Comparable{
	
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "(" + title + "/" + author + "/" + category + "/" + price + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book b=(Book)obj;
			if(this.author.equals(b.author)&&this.title.equals(b.title)) {
				return true;
			}
		}return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author,title);
	}
	
	@Override
	public int compareTo(Object o) {
		return this.title.compareTo(((Book)o).title);
		
	}
	
}
