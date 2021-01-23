package com.oop.model.vo;

public class Board {
	private int number;
	private String title;
	private String writer;
	private String date;
	private int views;
	private static int count;
	
	public Board() {}
	public Board(int number, String title, String writer, String date, int views) {
		this.number=count++;
		this.title=title;
		this.writer=writer;
		this.date=date;
		this.views=count++;
		
	}

	
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setWriter(String writer) {
		this.writer=writer;
	}
	public String getWriter() {
		return writer;
	}
	public void setDate(String date) {
		this.date=date;
	}
	public String getDate() {
		return date;
	}
	public void setViews(int views) {
		this.views=views;
	}
	public int getViews() {
		return views;
	}
}
