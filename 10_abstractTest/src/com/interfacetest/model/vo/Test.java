package com.interfacetest.model.vo;


import java.io.Serializable;

import com.abstracttest.model.vo.Food;
//인터페이스는 다중 구현이 가능. 
public class Test extends Food implements TestAble,TestAble2, Serializable{//Test implements TestAble 인터페이스 구현
	//The type Test must implement the inherited abstract method TestAble.test()
	//반드시 인터페이스에서 선언한 모든 메소드를 구현해야 한다.!!!!
	private String name;
	private int age;
	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Test(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override 
	//직접 클래스 implements 선언 하지 않아도 implement한 인터페이스에 
	//상속한 인터페이스가 있다면 그것도 꼭 오버라이딩해야함.
	public double calculator(double a, double b) {
		return (a*b+a+b/2)*0; 
	}
	
	
	@Override
	public void testable2(String a,int b) {
		System.out.println("이름은 "+a+"나이는"+b);
	}
	
	
	@Override
	public void test() {
		System.out.println("구현된 테스트!");
	}
	@Override
	public String getStr(String a) {
		return a+" BS";
	}
	
	
	
	
	public void otherMethod() {
		System.out.println("난 달라!");
	}
	public void otherMethod2() {
		System.out.println("나도 달라!");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
}
