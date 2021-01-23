package com.vari.test;

public class VariableTest {
	public static void main(String[] args) {
		//기본변수 선언하기
		//변수 선언 = 자료형 변수명;
		//진위값(true, false) 저장하는 변수 선언
		boolean istrue; //진위값을 저장하는 한개의 저장공간확보
		
		//정수저장하는 변수선언하기~!
		byte bnum;
		short snum;
		int num;
		long lnum;
		
		//문자
		char charater;
		//문자열
		String str;
		
		//실수형
		float fnum;
		double dnum;
		
		//변수의 명칭을 정할때 주의할점.
		int Number; //오류는 안나지만 관습에 어긋나는 명칭. 첫글자는 소문자로 하자!
		int number;//대소문자 구분하기 때문에 N n 다른거다!
		//String hello^^; //특수기호는 아무거나 사용할수 없다.
		//String hello#;
		//$, _ 이거만 가능
		String _hello;
		String h_ello;
		String hello_;
		String $hello;
		String h$ello;
		String hello$;
		
		//변수명에는 숫자 쓸 수 없다 첫글자에만!
		//char 1gender;//안돼!
		char gender1;
		//String nick name; //띄어쓰기 불가
		
		//같은 자료형의 여러변수를 선언할 때
		int a,b,c,d;
		
	}
}
