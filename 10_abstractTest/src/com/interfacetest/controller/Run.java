package com.interfacetest.controller;

import com.interfacetest.model.vo.CannonPrinter;

public class Run {
	public static void main(String[] args) {
		//new PrintManager(new LgPrinter()).print();//인쇄가능 실행!
		new PrintManager(new CannonPrinter()).print();//인쇄가능 실행!
		//new PrintManager().print();//매개변수안넣어서 짜놓은 로직에 넣을 수 가 없어 에러
		
		//유지보수에 용이.가운데 new CannonPrinter()부분만 바꾸면됨. new PrintManager(new CannonPrinter()).print();
		
		
	}
}
