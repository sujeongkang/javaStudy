package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
	public static void main(String[] args) {
		//날짜를 활용하게 하는 클래스들!!
		//Date, Calendar, GregorianCalendar
		
		Date today=new Date();//현재 날짜와 시간 출력
		System.out.println(today);
		today=new Date(1234567891155L);//롱형으로
		System.out.println(today);
		
		System.out.println("=====Calendar=======");
		//Calendar객체활용하기   
		//abstract추상클래스 생성불가. 접근제한자도 protected    
		Calendar birthDay=Calendar.getInstance();
		System.out.println(birthDay); //필드에 있는 값 출력
		//각각 따로 필드에 접근해서 출력을 해야함.
		//get()메소드 이용//int로반환
		System.out.println("년"+birthDay.get(Calendar.YEAR));//static은 클래스명으로 접근
		System.out.println("월"+(birthDay.get(Calendar.MONTH)+1));
		//MONTH는 1월을 0으로 처리 //넣을때는 -1로 
		System.out.println("일"+birthDay.get(Calendar.DATE));
		System.out.println("시"+birthDay.get(Calendar.HOUR_OF_DAY));
		System.out.println("분"+birthDay.get(Calendar.MINUTE));
		System.out.println("초"+birthDay.get(Calendar.SECOND));
		int year=birthDay.get(Calendar.YEAR);
		int month=birthDay.get(Calendar.MONTH)+1;
		int date=birthDay.get(Calendar.DATE);
		System.out.println(year+"년 "+month+"월 "+date+"일");
		//기본적으로 현재 값으로 나옴.
		System.out.println(new Date(birthDay.getTimeInMillis()));
		//지정된 날짜를 롱타입으로 반환
		
		//원하는 날짜 세팅하기
		//set메소드 이용하여 날짜를 지정할 수 있음
		birthDay.set(1993,7-1,8,11,35,15);
		System.out.println(new Date(birthDay.getTimeInMillis())); //세팅한 값으로 나옴.
		
		System.out.println("=====GregorianCalendar=======");
		//GregorianCalendar  <--calendar의 자식
		GregorianCalendar gc=new GregorianCalendar();//현재 날짜 나옴
		System.out.println(gc);
		//날짜 정보를 출력하려면 get
		printDate(gc); //2020년 7월 2일
//		int year1=gc.get(Calendar.YEAR);
//		int month1=gc.get(Calendar.MONTH)+1;
//		int date1=gc.get(Calendar.DATE);
//		System.out.println(year1+"년"+month1+"월"+date1+"일");
		//calendar객체에서는 지정날짜를 대입할때 set을이용.
		//GregorianCalendar 생성과 동시에 초기화 가능
		gc=new GregorianCalendar(1993,(8-1),28);//넣을 때는 달에 -1 
//		year1=gc.get(Calendar.YEAR);
//		month1=gc.get(Calendar.MONTH)+1;
//		date1=gc.get(Calendar.DATE);
//		date1++;
//		System.out.println(year1+"년"+month1+"월"+date1+"일");
		
		printDate(gc);//1993년 8월 28일
		//그레고리안 캘린더는
		//각필드의 값을 수정가능
		gc.set(Calendar.YEAR,2021);//gc.set(1,2021);도 똑같이 가능
		gc.set(Calendar.MONTH,9-1);
		System.out.println(gc);
		
		
		//gregorianCalendar
		Date birth2=new Date(gc.getTimeInMillis());
		System.out.println(birth2);
		
		//날짜를 형식에 맞게 포맷팅해주기
		//00년 0월 0일
		//0000년 00월 00일
		//00.00.00/00-00-00
		//SimpleDateFormat객체를 이용 <--text안에 있음.
		//Date객체를 형식에 맞게 문자열로 출력해주는 객체
		//SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일");//1993년 08월 28일
		//SimpleDateFormat sdf=new SimpleDateFormat("yy.MM.dd");//93.08.28
		//SimpleDateFormat sdf=new SimpleDateFormat("yy년 MM월 dd일 E요일a hh:mm:ss");//93년 08월 28일 토요일 12:00:00
		SimpleDateFormat sdf=new SimpleDateFormat("yy년 MM월 dd일 E요일a HH:mm:ss");//93년 08월 28일 토요일오전 00:00:00
		//String strDate=sdf.format(birth2); //자료형은 Date만 가능! 
		String strDate=sdf.format(gc.getTimeInMillis());//아닐경우에는 getTimeMillis()사용
		System.out.println(strDate);

		
		//Date랑 Calendar는 상속관계 아님.
		//Calendar와 GregorianCalendar는 부모자식관계임.
	
	}
	
	private static void printDate(Calendar c) {
		int year1=c.get(Calendar.YEAR);
		int month1=c.get(Calendar.MONTH)+1;
		int date1=c.get(Calendar.DATE);
		System.out.println(year1+"년"+month1+"월"+date1+"일");
	}
}
