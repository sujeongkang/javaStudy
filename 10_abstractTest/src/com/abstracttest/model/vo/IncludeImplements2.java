package com.abstracttest.model.vo;

public class IncludeImplements2 extends IncludeAbstract {

	
	public IncludeImplements2() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calulator(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	@Override
	public String combine(String a, String b) {
		return a+b;
	}
}
