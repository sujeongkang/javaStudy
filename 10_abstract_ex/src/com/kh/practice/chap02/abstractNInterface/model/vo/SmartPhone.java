package com.kh.practice.chap02.abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	private String maker;
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	public abstract String printInformation();

	public void setMaker(String maker) {
		this.maker=maker;
	}
	public String getMaker() {
		return maker;
	}
	
	
	
}
