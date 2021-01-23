package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	
	public boolean isLeapYear(int year) {
		if((year%4==0)&&(year%100!=0||year%400==0)) {
			return true;
		}else {
			return false;
		}
	}
	public long leapDate(Calendar c) {
		
		int daycount=0;
		for(int y=1;y<=c.get(Calendar.YEAR);y++) {
			if(y!=c.get(Calendar.YEAR)) {
				for(int m=1;m<=12;m++) {
					if(m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
						daycount+=31;
					}else if(m==4||m==6||m==9||m==11) {
						daycount+=30;
					}else if(m==2) {
						if((y%4==0)&&(y%100!=0||y%400==0)) {
							daycount+=29;
						}else {
							daycount+=28;
						}
					}
				}
				
			}else {
				for(int m=1;m<=c.get(Calendar.MONTH+1);m++) {
					if(m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
						daycount+=31;
					}else if(m==4||m==6||m==9||m==11) {
						daycount+=30;
					}else if(m==2) {
						if((y%4==0)&&(y%100!=0||y%400==0)) {
							daycount+=29;
						}else {
							daycount+=28;
						}
					}
				}
			}
			
		}return daycount;

	}
}
