package com.oop.model.vo;

public class FieldAccessTest {
	//멤버변수의 접근테스트
	//접근제한자 예약어 자료형 변수명[=값]
	//public int publicInt;
	private int publicInt=20; //default ->0  지정된 값이 있다면 선언과 동시에 초기화 가능
	//protected char protectedChar;
	private char protectedChar='A'; //default->''
	//String defaultString;
	private String defaultString="오호~"; //default->null
	private double privateDouble=180.5; //default->0.0
	//not used 개인적인 공간으로 만들어서 다른곳에서 사용못함.
	//코드만 있다고 해서 저장공간에 생성 안됨. new롤 생성해서 주소값을 가져야함.
	//public int age;
	private int age=180; //직접 접근 불가
	
	//필드의 자료형은 자바에서 사용하는 모든 자료형을 사요할 수 있음
	private int[] intArr=new int[10]; //배열도 사용가능
	//private DefaultTest test=new DefaultTest(); //객체들도 변수로 사요가능
	
	
	{
		publicInt=200;
		protectedChar='중';
		defaultString="이거!";
		privateDouble=180.5;
	}
	
	//변수에 접근해서 데이터를 가져가고, 변수의 값을 수정할 수 있는 메소드를 따로 작성
	//변수랑 1:2로 만들어져야함 getter(가져가는 것)/setter(데이터 대입)
	//접근제한자 자료형(반환형)||void get변수명(){      }||set변수명(변수자료형 변수명){     }
	
	//getter ->변수값을 가져오는 기능
	public int getAge() { //get변수명할때 camel 첫글자 대문자!
		return this.age;//멤버변수호출
	}
	//setter ->변수에 값을 넣는 기능
	public void setAge(int age) {//(int age)는 매개변수
		if (age>0) {
			this.age=age; //main클래스의 fct.setAge(19)로 인해 이곳에 19넣기
		}
	} //전체주석 ctrl+ / 
	
}
