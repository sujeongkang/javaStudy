package com.api.controller;

public class Wrapper {
	public static void main(String[] args) {
		//Wrapper클래스 활용하기
		//Wrapper클래스는 자동으로 형변환하여 기본 자료형으로 변경되고
		//기본 자료형도 필요에 따라 자동으로 Wrapper클래스로 변경됨.
		int age=19;
		Integer ageW=age;//오토박싱
		System.out.println(ageW);//19
		
		int su=ageW;//오토언박싱
		printTest(su);
		
		double height=180.5;
		Double dheight=height;
		System.out.println(dheight);
		printTest(height);//false
		
		//Wrapper클래스에는 유용한 메소드도 함께 가지고 있음
		//숫자형식의 문자값을 숫자형으로 변경하는 것
		//Wrapper클래스명.parseWrapper클래스명(변경할 문자);
		//보통 정보를 바당올때 문자열로 받아오기때문에 자주 사용
		String test="2020";
		int year=Integer.parseInt(test);//형변환
		System.out.println(year);//2020
		test="65.5";
		double weight=Double.parseDouble(test);
		System.out.println(weight);
//		test="10a";
		//에러남.. 문자열은 안됨.. 순자형문자열만 가능
		//Integer.valfueOf();
//		int a=Integer.valueOf(test);
//		System.out.println(a);
		
		//다른 자료형을 문자형으로 변경하려면?
		//String.valueOf();
		test=String.valueOf(age);
		System.out.println(test);//19
		test=String.valueOf(height);
		System.out.println(test);//180.5
		
		
		
	}
	
	public static void printTest(Object obj) {
		//object에는 상속관계의 다형성의 특징때문에 들어갈 수 있음.
		System.out.println(obj instanceof Integer);//true
	}
	
}
