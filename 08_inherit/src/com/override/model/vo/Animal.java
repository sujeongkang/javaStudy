package com.override.model.vo;
//ValueObject/DTO Date Trasfer Object

public class Animal {
	private String category;
	private String name;
	private char gender;
	private	String diet;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String category, String name, char gender, String diet) {
		super();
		this.category = category;
		this.name = name;
		this.gender = gender;
		this.diet = diet;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}
	//�޼ҵ��� final������ Override�� ������.
	//public final String bark(){ //���� 
	public String bark() { 
		return "�ϰ� ���� �˰� ¢��!";
	}
	protected String info() {
		return category+" "+name+" "+gender+" "+diet;
	}
	
	public double calculator(int a, int b) {
		return a+b;
	}
}
