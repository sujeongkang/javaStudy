package com.interfacetest.controller;

import com.interfacetest.model.vo.PrinterDriver;

public class PrintManager {
	
	//private HpPrinter print=new HpPrinter();
	//private SamPrinter print=new SamPrinter();
	//private LgPrinter print=new LgPrinter();
	
	private PrinterDriver driver;//�������̽��� �ڷ������ξ�  ������������ ����
//	public PrintManager() {-->�⺻������ �θ�, ������Ʈ ����
//		// TODO Auto-generated constructor stub
//	} 
	//�����ͱ�� ��ü���� �մ����ʰ� �ܺο��������ͼ� �����ڴ�.
	public PrintManager(PrinterDriver driver) {//�Ű����� �ִ� ������
		this.driver=driver;
	}
	
	public void print() {
		//print.printHp();
		//print.Samprinter("�Ｚ�μ�Ⱑ");
		//print.printLg();
		driver.print();
	}
}
