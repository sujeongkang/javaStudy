package com.vari.input;

public class VariableInputTest {
	public static void main(String[] args) {
		//변수 선언하고 값 넣기
		int age;
		age=19; //변수 대입
		double height;
		height=180.5;
		String name;
		name="유병승";
		char gender;
		gender='남';
		String gender2;
		gender2="남";
		
		byte bnum;
		bnum=100;
		//bnum=128;
		
		long lnum=100000000000L;//선언과 동시에 초기화
		
		float fnum=3.14f;//선언과 동시에 초기화
		
		//변수명이 중복되면 안된다.
		//int fnum;
		
		//변수에 값을 처음 대입하는 것-->초기화
		//지역변수는 반드시 초기화를 하고 사용해야함.
		int a=0;double dnum=0.0;
		char ch=' ';String str="";
		
		//System.out.println(a);
		
		//변수에 저장된 데이터(값) 가져오려면
		//변수명을 이용하면 됨.
		
		System.out.println("안녕하세요!");
		System.out.println(name);//name="유병승";
		name="설진호";
		System.out.println(name);
	
		//변수에 값을 대입. 리터럴이 아닌 변수를 이용할 수 있다.
		String name2=name;
		System.out.println(name2);
		//변수명을 코드에 적으면 변수에 있는 값을 그 위치로 불러온다.
		
		//상수활용하기
		//한번만 저장할 수 있는 저장공간
		int num=10;
		num=20;
		num=30;
		
		final int NUM_FINAL=19;
		//NUM_FINAL=30;
		
		System.out.println(NUM_FINAL);
		
		//문자열 활용하기
		//기본 선언 및 대입히기
		String str1="기차";
		String str2=new String("기차");
		System.out.println(str1);
		System.out.println(str2);
		
		str1="기차"+"칙칙폭폭";
		str2=new String("기차"+"칙칙폭폭");
		System.out.println(str1);
		System.out.println(str2);
		str1="기차"+(123+45)+"칙칙폭폭";
		System.out.println(str1);
		str2=""+123+45+"기차"+"칙칙폭폭";
		System.out.println(str2);
		
		//num, age, height, gender =>각 자료형이 다 다름
		System.out.println(" 이름: "+name+" 나이: "+age+" 키: "+height+" 성별: "+gender);
		
		
		int inumz=100;
		long lnumz=10000L;
		float fnumz=234.567f;
		double dnumz=567.12356;
		char chz='A';
		String strz="Hello World";
		boolean brz=true;
		
		System.out.println(inumz);
		System.out.println(lnumz);
		System.out.println(fnumz);
		System.out.println(dnumz);
		System.out.println(chz);
		System.out.println(strz);
		System.out.println(brz);

	}
}
