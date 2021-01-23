package com.interfacetest.model.vo;
//인터페이스 끼리 인터페이스 상속할때는 extends
//클래스에서 인터페이스 가져다 쓸때는 implements
public interface TestAble2 extends TestAble3{
	void testable2(String name, int age);
}
