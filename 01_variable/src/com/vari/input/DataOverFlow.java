package com.vari.input;

public class DataOverFlow {
	public static void main(String[] args) {
		//������ �����÷ο� Ȯ���ϱ�
		int bnum=127;
		
		for(int i=0;i<300;i++) {
			System.out.println(bnum++);
			
		}
	}
}
