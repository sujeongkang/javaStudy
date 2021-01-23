package com.abstracttest.controller;

import com.abstracttest.model.vo.Food;
import com.abstracttest.model.vo.Recipe;
import com.abstracttest.model.vo.Test;
import com.abstracttest.model.vo.IncludeAbstract;
import com.abstracttest.model.vo.IncludeImplements2;
import com.abstracttest.model.vo.IncludeImplements;

public class AbstractTestMain {
	public static void main(String[] args) {
	
		//Food f=new Food("중식","짜장면","한국",1,0);
		//Cannot instantiate the type Food //static 클래스 를 인스턴스화 (생성)할 수 없다!
		//System.out.println(f);
		Test t=new Test("한식","돈까스","한국",1,5);
		System.out.println(t);//변수가 들어갔을 때 주소값을 봔한하는 메소드는 Object.toString.
		//Food클래스에서 toString() 메소드 재정의 <-오버라이딩
		
		
		System.out.println(t.getName());
		//Food f=new Food();
		//추상클래스는 참조형자료형을 사용이 가능하다.
		Food f=new Test();//부모 변수에 상속받은 자식클래스의 객체를 담을 수 있음. 다형성
		f=new Recipe();
		//Food 자료형의 변수에는 Food상속받은 객체만 대입가능
		//f=new String();
		((Recipe)f).cooking();//부모객체가 자식객체에 접근하기 위해서는 형변환이 필요.
		
		IncludeAbstract ia=new IncludeImplements();//ia에는 IncludeAbstract를 상속받은 객체만 들어갈수있다.
		System.out.println(ia.calulator(10, 20)); //동적바인딩
		ia=new IncludeImplements2();
		System.out.println(ia.calulator(10, 20));
		System.out.println(ia.getA());  //0 default값  //위에 매개변수는 상관무.계산끝나면 bye 
		
		System.out.println(ia.combine("안녕", "하세요!"));
		
		
	}
}
