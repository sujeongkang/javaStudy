package com.oop.model.vo;

public class AccessTest {
	//접근 제한자가 public인 객체는 어디에서나 임포트하여
	//생성하고 사용이 가능함.
	
	//같은 패키지 안에서는 접근제한자가 default인 객체는 접근이 가능
	DefaultTest test=new DefaultTest();
	//import 안함. 같은 패지키안이기때문 / 다른 패키지일 때만 사용한다
	
	
	
}
