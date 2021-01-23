package com.abstracttest.model.vo;

public abstract class IncludeAbstract {

	private int a;
	private int b;
	private int count;
	//추상메소드가 포험되어 있으면 반드시
	//추상클래스로 선언한다.
	//추상메소드로 선언된 메소드를 지식객체에 강제시킴
	//추상메소드는 선언부만 선언함, 구현부가 없음!
	//접근제한자 abstract 반환형 메소드명(매개변수);   <--세미콜론으로 끝남..주의!
	
	public abstract double calulator(int a,int b);
	//The abstract method calulator in type includeAbstract can only be defined by an abstract class
	//추상 메소드는 추상 클래스에만 정의 할 수 있습니다.
	//자식클래스에 abstract 오버라이드강제
	public abstract String combine(String a, String b);
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
