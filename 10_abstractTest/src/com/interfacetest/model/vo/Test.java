package com.interfacetest.model.vo;


import java.io.Serializable;

import com.abstracttest.model.vo.Food;
//�������̽��� ���� ������ ����. 
public class Test extends Food implements TestAble,TestAble2, Serializable{//Test implements TestAble �������̽� ����
	//The type Test must implement the inherited abstract method TestAble.test()
	//�ݵ�� �������̽����� ������ ��� �޼ҵ带 �����ؾ� �Ѵ�.!!!!
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
	//���� Ŭ���� implements ���� ���� �ʾƵ� implement�� �������̽��� 
	//����� �������̽��� �ִٸ� �װ͵� �� �������̵��ؾ���.
	public double calculator(double a, double b) {
		return (a*b+a+b/2)*0; 
	}
	
	
	@Override
	public void testable2(String a,int b) {
		System.out.println("�̸��� "+a+"���̴�"+b);
	}
	
	
	@Override
	public void test() {
		System.out.println("������ �׽�Ʈ!");
	}
	@Override
	public String getStr(String a) {
		return a+" BS";
	}
	
	
	
	
	public void otherMethod() {
		System.out.println("�� �޶�!");
	}
	public void otherMethod2() {
		System.out.println("���� �޶�!");
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
