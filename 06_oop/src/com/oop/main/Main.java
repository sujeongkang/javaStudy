package com.oop.main;

import com.oop.model.vo.AccessTest;
import com.oop.model.vo.FieldAccessTest;
import com.oop.model.vo.FinalTest;
import com.oop.model.vo.InitialTest;
//import com.oop.model.vo.DefaultTest; 
//not visible ->저장공간은 있지만. 접근 제한자에 의해 접근이 제한됬을 때 나오는 에러
//import com.oop.model.vo.ABCTest;
//cannot be resolved ->해당 파일이 없을 경우
import com.oop.model.vo.StaticVariableTest;

public class Main {
	
	public static void main(String[] args) {
		//객체 접근가능 여부확인-> 생성가능한가 확인해보기
		
		new AccessTest(); //객체 생성 구문
		//new DefaultTest();//접근제한자가 default클래스 생성
		//new com.oop.model.vo.AccessTest();
		//import선언 안할시 한번 사용시에는 이렇게 선언도 가능
		//여러번 사용시에는 import가 더 적합.
		
		//필드 접근 테스트
		FieldAccessTest fct=new FieldAccessTest(); //new 클래스명 -->생성  
		FieldAccessTest fct1=new FieldAccessTest(); 
		FieldAccessTest fct3=new FieldAccessTest(); 
		//<--FieldAccessTest클래스를 객체화 ->heap공간에 저장공간을 확보 ->확보한 공간의 주소를 반환
		//ctrl+shift+o import 자동완성
		//  클래스명은 하나의 자료형이 될수 있음, FieldAccessTest fct는 객체를 저장하는 변수
		
		//필드 접근 제한자 4가지
		//fct.publicInt=100; //public은 다른 패키지에서 직접접근이 가능하다.
		//fct.protectedChar='남'; //자손객체, 같은 패키지, 같은클래스
		//fct.defaultString="이건 접근??";//같은 패키지, 같은 클래스
		//fct.privateDouble=180.5;//같은 클래스에서만 접근 가능.
		
		//캡슐화 하는 이유
		//fct.age=19; //음수가 있으면 될까?
		//System.out.println(fct.age);
		//fct.age=-19;
		//System.out.println(fct.age);
		
		//fct.setAge(); //메소드 호출=>메소드 실행
		//fct.setAge(19);//fct에 있는 age변수에 19 대입
		//System.out.println(fct.getAge());//fct에 있는 age변수 값 가져오기
		//fct.age와 fct.getAge()는 같은 의미
		fct.setAge(-19);
		System.out.println(fct.getAge());//???? -19만 실행시 default 값 0
		//default값 생성은 배열, 객체에서만
		
		//static변수(클래스 변수)는 
		//System.out.println(StaticVariableTest.name);
		//StaticVariableTest.name="유병승";
		//System.out.println(StaticVariableTest.name);//어디에서든  접근해서 사용가능
		
		System.out.println(StaticVariableTest.getName()); //메소드 만들때나 호출할때는()
		StaticVariableTest.setName("유병승");
		System.out.println(StaticVariableTest.getName());
		
		
		StaticVariableTest svt=new StaticVariableTest(); 
		StaticVariableTest svt2=new StaticVariableTest(); 
		StaticVariableTest svt3=new StaticVariableTest(); 
		svt.setName("static");
		System.out.println(svt.getName());
		System.out.println(svt2.getName());
		svt2.setName("svt2변경");
		System.out.println(svt.getName());
		System.out.println(svt2.getName());
		System.out.println(StaticVariableTest.getName());
		
		svt.setSu(100); //new 만든 멤버변수는 각각바뀜.
		System.out.println(svt.getSu()); //100
		System.out.println(svt2.getSu());//0
		
		//상수 이용하기
		FinalTest ft=new FinalTest();
		System.out.println(ft.ID);
	//	ft.ID=200; // 오류 cannot be assigned상수는 더이상 값을 넣을 수 없다.
		
		System.out.println("=====초기화 블록====");
		//초기화블록 설정하기
		InitialTest it=new InitialTest();
		System.out.println("it id: "+it.getId());
		System.out.println(it.getName());
		System.out.println(it.getSize());
		
		InitialTest it2=new InitialTest();
		System.out.println(("it2 id: "+it.getId()));
		System.out.println(it2.getName());
		System.out.println(it2.getSize());
		
		for(int i=0;i<10;i++) {
			System.out.println("for문 id: "+new InitialTest().getId());
		}
		
		
		
		
	}
}
