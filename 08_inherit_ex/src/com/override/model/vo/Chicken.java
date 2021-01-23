package com.override.model.vo;

public class Chicken extends Animal {
	public Chicken(String name, String category, int leg) {
		super(name,category,leg);
	}

	@Override
	public String action() {
		return "²¿³¢¿À~Ä¡Å² ¸ÀÀÌ´Ù.";
	}
//	@Override
//	public Chicken clone() {
//		return new Chicken(super.getName(),super.getCategory(),super.getLeg());
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Cat) {
//		Chicken ch=(Chicken)obj;
//		
//		if(super.getCategory().equals(ch.getCategory())
//				&&super.getLeg()==ch.getLeg()) {
//			return true;  
//			}
//		}
//		return false; 
//	}
}
