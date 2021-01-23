package com.exception.cotroller;
//프로그램에서 사용하는 예외 만들기
//일반클래스에 Exception객체 중 하나를 상속받으면
//Exception객체가 됨.
public class MyException extends RuntimeException{
	//exception객체가 됨.
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	public MyException(String msg) {
		super(msg);
	}
	
}
