package com.interfacetest.controller;

import com.interfacetest.model.vo.Test;
import com.interfacetest.model.vo.TestAble;

public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(TestAble.age);
		System.out.println(TestAble.name);
		//TestAble.age=20; 인터페이스에서 선언한 것은 상수로
		//다른 값이 대입이 안됨
		//TestAlbe.name="이거는?"
		Test t=new Test();
		t.test();
		System.out.println(t.getStr("여러분 이제 거의 끝나가요!!"));
		
		//인터페이스는 참조형자료형으로 사용이 가능
		TestAble test;
		test=new Test("유병승",19);
		//장점: 필수적인 기능만 보이도록 설정됨.
		//인터페이스가 강제한 메소드만 보임!.필수적인 요소만 보이게한다.
		//인터페이스(TestAble)에서 강제 안한 메소드는 생략됨! 
		System.out.println(test.getStr("곧 곧 정리시간"));//동적바인딩
		((Test)test).getAge();
		
		TestAble[] arrTest=new TestAble[10];//변수 공간을 만든것이지 객체생성을 한게 아니기때문에 가능.
		arrTest[0]=new Test();
		
		//인터페이스는 클래스와 달리 다중구현이 가능함.
		
		//default예약어를 사용하여 구현부가있는 메소드를 인터페이스 내부에서
		//선언이 가능해짐.
		arrTest[0].whatHell("이건뭐지?? 왜 헷갈리게... 너무한다!!");
		
		
		
	}
}
