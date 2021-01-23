package com.interfacetest.model.vo;

public class HpPrinter implements PrinterDriver{
	
	
	public void printHp() {
		System.out.println("hp프린터 작동! 인쇄중...");
	}
	
	
	@Override
	public void print() {
		printHp();
	}
}
