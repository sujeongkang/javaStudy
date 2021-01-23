package com.vari.input;

public class DataOverFlow {
	public static void main(String[] args) {
		//데이터 오버플로우 확인하기
		int bnum=127;
		
		for(int i=0;i<300;i++) {
			System.out.println(bnum++);
			
		}
	}
}
