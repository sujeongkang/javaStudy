package com.interfacetest.model.vo;

public class LgPrinter implements PrinterDriver {

	public void printLg() {
		System.out.println("LG������ �۵�!!  �μ���...");
	}

	@Override
	public void print() {
		printLg();
	}
}
