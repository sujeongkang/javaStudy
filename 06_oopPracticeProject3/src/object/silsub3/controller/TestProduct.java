package object.silsub3.controller;

import object.silsub3.model.Product;

public class TestProduct {
	public static void main(String[] args) {
		Product p1=new Product("ssgnote6","�����ó�Ʈ6 ","��⵵����", 960000 ,10.0);
		Product p2=new Product("lgxnote5","LG����Ʈ��5", "��⵵����",  780000, 0.7);
		Product p3=new Product("ktnorm3","KT�Ϲ���3", "����ð��� ", 25000 , 0.3);
		//1�ܰ�
		p1.information();
		p2.information();
		p3.information();
		//2�ܰ�
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);
		p1.setTex(0.5);
		p2.setTex(0.5);
		p3.setTex(0.5);
		//3�ܰ�
		p1.setTex(0.05);
		p2.setTex(0.05);
		p3.setTex(0.05);
		
		System.out.println("��ǰ��: "+p1.getProductName()+"\n�ΰ��� ���԰���: "+p1.pricef());
		System.out.println("��ǰ��: "+p2.getProductName()+"\n�ΰ��� ���԰���: "+p2.pricef());
		System.out.println("��ǰ��: "+p3.getProductName()+"\n�ΰ��� ���԰���: "+p3.pricef());
	}
}
