package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	public LeapView() {
		//기본생성자로 이 안에 평년인지 윤년인지,
		//1년 1월 1일부터 지금까지 며칠이 지났는지 모두 출력
		LeapController lc=new LeapController();
		GregorianCalendar gc=new GregorianCalendar();
		int year=gc.get(Calendar.YEAR);
		
		if(lc.isLeapYear(year)==true) {
			System.out.println(year+"년은 윤년입니다.");
		}else {
			System.out.println(year+"년은 평년입니다.");
		}
		System.out.println("총 날짜수: "+(lc.leapDate(gc)));
		
	}
}
