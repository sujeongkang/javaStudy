package com.interfacetest.controller;

import com.interfacetest.model.vo.CannonPrinter;

public class Run {
	public static void main(String[] args) {
		//new PrintManager(new LgPrinter()).print();//�μⰡ�� ����!
		new PrintManager(new CannonPrinter()).print();//�μⰡ�� ����!
		//new PrintManager().print();//�Ű������ȳ־ ¥���� ������ ���� �� �� ���� ����
		
		//���������� ����.��� new CannonPrinter()�κи� �ٲٸ��. new PrintManager(new CannonPrinter()).print();
		
		
	}
}
