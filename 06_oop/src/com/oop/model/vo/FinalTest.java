package com.oop.model.vo;

public class FinalTest {
	//멤버변수 final사용하기
	//final 상수 한번 값을 대입하고 변경할 수 없는 변수 상수!
	public final int ID; //final 선언과 동시에 초기화 필요, 생성되서 heap영역에 들어가기전에 
	//public final int ID=10; 1.선언과 동시에 초기화
	public static final int ID2;
	//초기화
//	{//.초기화 블럭
//		ID=200;
//	}
	
	
	static{//초기화 블럭으로 초기화
		ID2=200;
	}

	//3.생성자로 초기화
	public FinalTest() {
		ID=300;
		//ID2=200;
	}
}
