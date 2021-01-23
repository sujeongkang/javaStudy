package com.random;

public class RandomTest {

	public static void main(String[] args) {
		// 임의 수 출력하는 랜덤 사용하기!
		//Math클래스에 random메소드
		System.out.println((int)(Math.random()*11)); //0~10
		System.out.println((int)(Math.random()*20)+1);//1~20
		System.out.println((int)(Math.random()*20)+1);
		System.out.println((int)(Math.random()*20)+1);
		System.out.println((int)(Math.random()*3)); //0~2
		

		int a=((int)(Math.random()*10)+1);
		System.out.println(a);
				
	}
	
}
