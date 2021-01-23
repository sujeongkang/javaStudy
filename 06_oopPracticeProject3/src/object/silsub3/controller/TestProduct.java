package object.silsub3.controller;

import object.silsub3.model.Product;

public class TestProduct {
	public static void main(String[] args) {
		Product p1=new Product("ssgnote6","갤럭시노트6 ","경기도수원", 960000 ,10.0);
		Product p2=new Product("lgxnote5","LG스마트폰5", "경기도평택",  780000, 0.7);
		Product p3=new Product("ktnorm3","KT일반폰3", "서울시강남 ", 25000 , 0.3);
		//1단계
		p1.information();
		p2.information();
		p3.information();
		//2단계
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);
		p1.setTex(0.5);
		p2.setTex(0.5);
		p3.setTex(0.5);
		//3단계
		p1.setTex(0.05);
		p2.setTex(0.05);
		p3.setTex(0.05);
		
		System.out.println("상품명: "+p1.getProductName()+"\n부가세 포함가격: "+p1.pricef());
		System.out.println("상품명: "+p2.getProductName()+"\n부가세 포함가격: "+p2.pricef());
		System.out.println("상품명: "+p3.getProductName()+"\n부가세 포함가격: "+p3.pricef());
	}
}
