package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	public LeapView() {
		//�⺻�����ڷ� �� �ȿ� ������� ��������,
		//1�� 1�� 1�Ϻ��� ���ݱ��� ��ĥ�� �������� ��� ���
		LeapController lc=new LeapController();
		GregorianCalendar gc=new GregorianCalendar();
		int year=gc.get(Calendar.YEAR);
		
		if(lc.isLeapYear(year)==true) {
			System.out.println(year+"���� �����Դϴ�.");
		}else {
			System.out.println(year+"���� ����Դϴ�.");
		}
		System.out.println("�� ��¥��: "+(lc.leapDate(gc)));
		
	}
}
