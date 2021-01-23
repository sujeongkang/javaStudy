package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book{
	private boolean coupon;//�丮Ƽ������
	public CookBook() {}
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title,author,publisher);
		this.coupon = coupon;
	}
	
	
	
	@Override
	public String toString() {
		return "CookBook [" + super.toString() + ", coupon=" + coupon + "]";
	}
	
	public boolean isCoupon() {
		if(coupon==true) {
			return true;
		}else {
			return false;
		}
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	

	
}
