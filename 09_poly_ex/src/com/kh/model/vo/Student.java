package com.kh.model.vo;

public class Student extends Person{
	private int grade;
	private int ban;
	private int number;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int grade, int ban, int number) {
		this.grade = grade;
		this.ban = ban;
		this.number = number;
	}
	public Student(String name, int age, char gender, int grade, int ban, int number) {
		super(name, age, gender);
		this.grade = grade;
		this.ban = ban;
		this.number = number;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
