package com.exception.cotroller;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsTest {
	public void exceptionTest2() throws FileNotFoundException {//throw 에외를 여기서 처리해라
		throw new FileNotFoundException(); 
			//예외처리에도 상속관계가 있음.자식객체FileNotFoundException을 부모인 IOException이 처리할 수 있다.
			//EOFException 같은 레벨이라 처리불가 . 같은레벨일때는 각각
		
	}
	
	public void exceptionTest3() throws EOFException{
		throw new EOFException();
	}
	
	//에외처리할때 여러개 가능.
	public void exceptionTest() throws FileNotFoundException,EOFException{//위임 
		//예외를 발생시킴 ChekedException
		//반드시 처리 구문을 작성해야함!!!!
		//throw new IOException();//Unhandled exception type IOException //IOException을 다루지 않았어.
		exceptionTest2();
		exceptionTest3();
	
	}
}
