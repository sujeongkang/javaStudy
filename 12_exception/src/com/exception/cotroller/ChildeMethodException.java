package com.exception.cotroller;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChildeMethodException extends MethodOverrideTest{
	
	@Override
	public void exceptionOverride() throws FileNotFoundException,EOFException,IOException{
		//오버라이딩 시 상속한 부모와 같거나 아래 범위의 Exception처리만 가능,
		//개수제한없음.
		
		
	}
}
