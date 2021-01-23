package com.oop.model.vo;

public class StaticVariableTest {
	//멤버변수에 static 예약어를 사용하면
	//static변수, 클래스변수로 활용이 됨
	//public static String name;//클래스 변수
	
	private static  String name; //static변수
	//멤버변수 추가하기
	private int su;
	public void setSu(int su) {
		this.su=su;
	}
	public int getSu() {
		return this.su;
	}
	
	//클래스 변수와 멤버변수 차이?!
	//클래스 변수-> 프로그램 시작과 동시에 메모리공간(static)에 할당됨.(공간이 확보) 
	//				new연산자 사용안해도됨.변수에도 Static설정을 할때면.
	//		변수접근-> 클래스명.변수명
	
	//멤버변수->클래스가 new연산자를 통해 객체화(생성) 됬을때 할당
	
	
	//static변수에 접근하기 위한 getter.setter
	public static String getName() {  //메소드 만들때랑 호출할때 ()씀
		return StaticVariableTest.name;
	}
	public static void setName(String name) {
		StaticVariableTest.name=name;
		//this.name=name;//오류 발생 Cannot use this in a static context
		//this는 자기자신을 찾아감. 클래스. new 생성된 객체 주소값자체을 갖고있음. 생성됬을 때 자기자신주소
		//static프로그램 시작될때 공간할당, this는 new생성될떄 공간 할당. 위에는 static주소값만 있고 this 주소가 없어서 생성순서에 있어 오류
	//public void setName(String name) {
		//this.name=name;
	//*static이 없으면 new를 반드시 생성해야되고 this는 각 생성된 주소의 자기값을 불러온다
	
	}
	
}
