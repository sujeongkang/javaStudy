package com.override.model.vo;

public class Animal {
	private String name;
	private String category;
	private int leg;

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, String category, int leg) {
		super();
		this.name = name;
		this.category = category;
		this.leg = leg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public String action() {
		return "나는 동물이다.";
	}
	@Override
	public Animal clone() {
		return new Animal(getName(),getCategory(),getLeg());
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Animal) {
		Animal a=(Animal)obj;
		
		if(this.category.equals(a.getCategory())
				&&this.leg==a.getLeg()) {
			return true;  
			}
		}
		return false; 
	}
}
