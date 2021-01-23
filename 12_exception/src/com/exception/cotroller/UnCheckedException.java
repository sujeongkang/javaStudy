package com.exception.cotroller;

import java.util.Calendar;
import java.util.Date;

public class UnCheckedException {//예외가 발생할때 정상적인 처리로 돌아갈 수 있도록 처리
	
	public static void main(String[] args) {
		//UncheckedException 코드상에서 개발자가 처리하지 않아도 되는
		//Exception을 말함.//코드상에는 에러 안뜸 처리하라고 강제하지 않음. 에러띄어주고 끝냄.
		int a=0;
		int b=10;
		//System.out.println(b/a);//ArithmeticExceptiondl 발생함!
		String name=null;
		//System.out.println(name.charAt(0));//NullPointerException발생
		//int[]nums=new int[-3];//컴파일시에는 에러 없고 런타임시에 오류발생//NegativeArraySizeException
		int[]nums=new int[2];
//		Scanner sc=new Scanner(System.in);
//		while(true) {
//			System.out.println("선택");
//			int cho=sc.nextInt();
//			if(cho==0)break;
//			try {
//				System.out.println(nums[3]);//ArrayIndexOutOfBoundsException
//			}catch(ArrayIndexOutOfBoundsException e) {
//				nums=new int[nums.length+5];
//				System.out.println("해결함");
//			}
//
//		}
		Object obj=new Date();
		//Calendar c=(Calendar)obj; //ClassCastException
		
		//예외는 강제로 발생시킬 수 있음
		//throw예약어를 이용해서 Exception을 발생시킴
		throw new NullPointerException("히힛! 에러!");
		//printStackTrace(); //어디서부터 시작해서 어디서 에러발생이 됬어 출력하는 메소드
		
		
	}
}
