package com.interfacetest.model.vo;

public class CannonPrinter implements PrinterDriver{
	
	@Override
	public void print() {
		System.out.println("캐논 프린터 작동! 인쇄중...");
	}
}
