package com.exception.cotroller;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsTest {
	public void exceptionTest2() throws FileNotFoundException {//throw ���ܸ� ���⼭ ó���ض�
		throw new FileNotFoundException(); 
			//����ó������ ��Ӱ��谡 ����.�ڽİ�üFileNotFoundException�� �θ��� IOException�� ó���� �� �ִ�.
			//EOFException ���� �����̶� ó���Ұ� . ���������϶��� ����
		
	}
	
	public void exceptionTest3() throws EOFException{
		throw new EOFException();
	}
	
	//����ó���Ҷ� ������ ����.
	public void exceptionTest() throws FileNotFoundException,EOFException{//���� 
		//���ܸ� �߻���Ŵ ChekedException
		//�ݵ�� ó�� ������ �ۼ��ؾ���!!!!
		//throw new IOException();//Unhandled exception type IOException //IOException�� �ٷ��� �ʾҾ�.
		exceptionTest2();
		exceptionTest3();
	
	}
}
