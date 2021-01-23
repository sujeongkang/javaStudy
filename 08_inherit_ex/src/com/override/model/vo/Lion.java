package com.override.model.vo;

public class Lion extends Animal {
	public Lion(String name, String category, int leg) {
		super(name,category,leg);
	}

	@Override
	public String action() {
		return "Å©¾Æ¾Ó~ »çÀÚ~";
	}
//	@Override
//	public Lion clone() {
//		return new Lion(super.getName(),super.getCategory(),super.getLeg());
//	}
//	
//	
//	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Lion) {
//			Lion l=(Lion)obj;
//			if(super.getCategory().equals(l.getCategory())&&super.getLeg()==l.getLeg()) {
//				return true;
//			}
//		}return false;
//	}
	
}
