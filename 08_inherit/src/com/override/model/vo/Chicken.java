package com.override.model.vo;

public class Chicken extends Animal{
	public Chicken(String category, String name, char gender, String diet) {
		super(category,name,gender,diet);
	}
	public String bark() {
		return "������";
	}
	
}
