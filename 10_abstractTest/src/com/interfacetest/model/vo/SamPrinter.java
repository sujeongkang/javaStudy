package com.interfacetest.model.vo;

public class SamPrinter implements PrinterDriver{
	
	
	
	public void Samprinter(String msg) {
		System.out.println("�Ｚ ������ �۵�!! "+msg+"�����...");
	}
	
	
	@Override
	public void print() {
		Samprinter("�Ｚ �μ�� �۵�");
	}
}
