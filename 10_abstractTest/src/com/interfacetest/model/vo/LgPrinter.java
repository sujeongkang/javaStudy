package com.interfacetest.model.vo;

public class LgPrinter implements PrinterDriver {

	public void printLg() {
		System.out.println("LG프린터 작동!!  인쇄중...");
	}

	@Override
	public void print() {
		printLg();
	}
}
