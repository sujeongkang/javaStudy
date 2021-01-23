package com.interfacetest.controller;

import com.interfacetest.model.vo.PrinterDriver;

public class PrintManager {
	
	//private HpPrinter print=new HpPrinter();
	//private SamPrinter print=new SamPrinter();
	//private LgPrinter print=new LgPrinter();
	
	private PrinterDriver driver;//인터페이스를 자료형으로씀  공통집합으로 만듬
//	public PrintManager() {-->기본생성자 두면, 널포인트 에러
//		// TODO Auto-generated constructor stub
//	} 
	//프린터기능 자체에는 손대지않고 외부에서가져와서 돌리겠다.
	public PrintManager(PrinterDriver driver) {//매개변수 있는 생성자
		this.driver=driver;
	}
	
	public void print() {
		//print.printHp();
		//print.Samprinter("삼성인쇄기가");
		//print.printLg();
		driver.print();
	}
}
