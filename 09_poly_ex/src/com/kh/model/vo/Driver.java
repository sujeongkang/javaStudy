package com.kh.model.vo;

public class Driver extends Person {
	private int career;
	private boolean accident;
	public Driver() {
		// TODO Auto-generated constructor stub
	}
	public Driver(int career, boolean accident) {
		this.career = career;
		this.accident = accident;
	}
	public Driver(String name, int age, char gender, int career, boolean accident) {
		super(name, age, gender);
		this.career = career;
		this.accident = accident;
	}
	public int getCareer() {
		return career;
	}
	public void setCareer(int career) {
		this.career = career;
	}
	public boolean isAccident() {
		return accident;
	}
	public void setAccident(boolean accident) {
		this.accident = accident;
	}
	
	
}
