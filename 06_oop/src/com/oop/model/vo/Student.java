package com.oop.model.vo;
//student ��ü�� ����� �̸�, �г�, ��, ��ȣ, Ű, ������ �⺻���� �ڽ��� ������ �����ϰ� 
//studentUpdate�żҵ带 ����� �Է¹��� ������ �����ѵ� ����� ��.

//2020-06-23
//�����ͺ����� Ŭ����
public class Student {

	private String name;
	private int grade;
	private int cl;
	private int num;
	private double height;
	private double weight;
	
	public Student() {}
	public Student(String name, int grade, int cl, int num, double height, double weight) {
		this.name=name;
		this.grade=grade;
		this.cl=cl;
		this.height=height;
		this.weight=weight;
	
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public int getGrade() {
		return grade;
	}
	public void setCl(int cl) {
		this.cl=cl;
	}
	public int getCl() {
		return cl;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public int getNum() {
		return num;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public double getWeight() {
		return weight;
	}
	
}
