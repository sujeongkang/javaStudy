package com.oop.model.vo;

public class Car {
	//�ʵ�(�������)
	//private �ڷ��� ������ => ĸ��ȭ
	private  String model;
	private int cc;
	private int door;
	private String color;
	//�⺻ ������
	public Car() {};
	//�Ű����� ������
	public Car(String model, int cc, int door, String color) {
		this.model=model; //this�� �ʵ尡 ������� �����ּ�.
		this.cc=cc;
		this.door=door;
		this.color=color;
	}	
	//getter,setter ĸ��ȭ �Ǿ��ִ� Ŭ�������� ���� �ְų�, ���� ������.  
	public void setModel(String model) {
		this.model=model;
	}
	public String getMoedel() {
		return model;
	}
	public void setCc(int cc) {
		this.cc=cc;
	}
	public int getCc() {
		return cc;
	}
	public void setDoor(int door) {
		this.door=door;
	}
	public int getDoor() {
		return door;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
}
