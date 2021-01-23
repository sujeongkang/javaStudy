package com.override.model.vo;

public class Cat extends Animal {

	public Cat(String name, String category, int leg) {
		super(name,category,leg);
	}

	@Override
	public String action() {
		return "¾ß¿Ë °í¾çÀÌ~";
	}
//	@Override
//	public Cat clone() {
//		return new Cat(super.getName(),super.getCategory(),super.getLeg());
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Cat) {
//		Cat c=(Cat)obj;
//		
//		if(super.getCategory().equals(c.getCategory())
//				&&super.getLeg()==c.getLeg()) {
//			return true;  
//			}
//		}
//		return false; 
//	}
}
