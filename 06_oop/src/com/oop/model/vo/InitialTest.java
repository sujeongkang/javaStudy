package com.oop.model.vo;

public class InitialTest {
	//초기화블록
	private String name="안녕"; //null
	private int size=180;//0
	private int id;//1부터 순차적으로 1더해서 부여
	//외부에서 수정이 불가능!
	private static int count;
	
	
	//초기화 블록을 설정하여 초기값을 변경하기
	{
		//객체를 new연산자로 생성을 할때
		//실행되는 로직 //고정값 //공통된 요소
		this.name+="Rclass";
		this.size+=100;
		//this.id++;
		this.id=++count;
		System.out.println("초기화 블록 실행!");
	}
	
	
	//static 초기화 블록
	static {
		//초기화블록이랑 다름!!
		//프로그램이 런타임 됬을 때 1번만 실행됨!
		//멤버변수, 멤버메소드의 호출이 불가능
		//this.name="하하";//this는 new할때 생성되기 때문
		
		//static변수 초기화
		InitialTest.count=100;
		System.out.println("static초기화블록실행");
		
	}
	
	public int getId() {
		return id;
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
		
	}
	public void setSize(int size) {
		this.size=size;
	}
	public int getSize() {
		return size;
	}
}
