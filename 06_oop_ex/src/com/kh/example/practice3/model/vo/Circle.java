package com.kh.example.practice3.model.vo;

public class Circle {
	private static double PI=3.14;
	private static int radius=1;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public void incrementRadius() {
		this.radius=radius+1;
	}
	public void getAreaOfCircle() {
		System.out.println("���� ����: "+radius*radius*PI);
	}
	public void getSizeOfCircle() {
		System.out.println("���� �ѷ�: "+radius*2*PI);
	}
}
