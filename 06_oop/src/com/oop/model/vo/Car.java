package com.oop.model.vo;

public class Car {
	//필드(멤버변수)
	//private 자료형 변수명 => 캡슐화
	private  String model;
	private int cc;
	private int door;
	private String color;
	//기본 생성자
	public Car() {};
	//매개변수 생성자
	public Car(String model, int cc, int door, String color) {
		this.model=model; //this는 필드가 만들어질 때의주소.
		this.cc=cc;
		this.door=door;
		this.color=color;
	}	
	//getter,setter 캡슐화 되어있는 클래스에서 값을 넣거나, 값을 가져옴.  
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
