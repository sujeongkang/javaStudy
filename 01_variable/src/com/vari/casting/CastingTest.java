package com.vari.casting;

public class CastingTest {
	
	public static void main(String[] args) {
		//자동형변환 확인하기
		//자료형이 다른 변수에 변수를 대입하면 
		//자동형변환하여 들어감.
		int age=19;
		double height=180.5;
		
		height=age;
		
		System.out.println(height); //19.0
		//산술연산시 자동형변환
		int su=30;
		double weight=3.44;
		System.out.println(su+weight);//33.44
		
		//형변환은 변수(저장공간)자체가 변경되는 것이 아니라 
		//변수에 있는 값(리터럴)의 자료형을 변경하는 것임.
		
		String name="19";//참조형
		char ch='A';//자료형
		//name=ch; 오류 
		//name=String.valueOf(ch); 가능
		//문자열로는 자동형 변환이 불가능함. 변환하려면 기능(메소드) 이용해야함.
		
		//int su1=name;//기능(메소드)를 이용해야함.
		int su1=ch;
		
		double dnum=28.5;
		//강제적으로 형을 변환
		//데이터에 손실이 있어도 감안한다는 말!
		System.out.println("원본값:"+dnum);//28.5
		su1=(int)dnum;
		System.out.println("dnum을 넗은 변수:"+su1);//28  데이터 손실이 있음
		
		int chTest=2105435473;//4byte
		char ch1=(char)chTest;//char 2byte라 강제 형변환 필요. 
		System.out.println(ch1); //a
		System.out.println((char)chTest); //a
		
		char a='홍';
		int t=a;
		System.out.println(t);
		short s=(short)a;
		System.out.println(s);
	
		//작은 자료형으로 형변환하면 데이터 손실이 발생함.
		//표현할 수 있는 범위에 값만 표현하고 나머지는 버림.
		t=290;
		byte b=(byte)t;
		System.out.println(b);
		
		
		
	}
}
