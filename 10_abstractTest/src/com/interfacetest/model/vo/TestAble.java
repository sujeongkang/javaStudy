package com.interfacetest.model.vo;
//틀 만들어주고, 틀 정해준대로 꼭 다 써내라 
public interface TestAble {
	//상수형  필드를 가질수 있고
	public static final int age=19;
	String name="유병승";//=public static final String name="유병승"
	
	
	
	//메소드는 추상메소드만 가질 수 있고 Override를 위해 public 접근제한자를 설정함.
	//기본적으로 메소드 선언하면 추상메소드로 보기 대문에 public abstract는 생략이 가능함.
	public void test();//추상메소드
	
	String getStr(String a);//추상메소드 자동으로 앞에 public abstract
	
	//메소드 구현부를 선언할 수 있나? 원래는 없었으나 고정된 녀석(구현부가 있는 메소드)이 필요해짐.
	default void whatHell(String why) { //예약어를 default로 지정해서 씀
		System.out.println(why);
	}
	
}
