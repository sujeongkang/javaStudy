package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
	public static void main(String[] args) {
		//��¥�� Ȱ���ϰ� �ϴ� Ŭ������!!
		//Date, Calendar, GregorianCalendar
		
		Date today=new Date();//���� ��¥�� �ð� ���
		System.out.println(today);
		today=new Date(1234567891155L);//��������
		System.out.println(today);
		
		System.out.println("=====Calendar=======");
		//Calendar��üȰ���ϱ�   
		//abstract�߻�Ŭ���� �����Ұ�. ���������ڵ� protected    
		Calendar birthDay=Calendar.getInstance();
		System.out.println(birthDay); //�ʵ忡 �ִ� �� ���
		//���� ���� �ʵ忡 �����ؼ� ����� �ؾ���.
		//get()�޼ҵ� �̿�//int�ι�ȯ
		System.out.println("��"+birthDay.get(Calendar.YEAR));//static�� Ŭ���������� ����
		System.out.println("��"+(birthDay.get(Calendar.MONTH)+1));
		//MONTH�� 1���� 0���� ó�� //�������� -1�� 
		System.out.println("��"+birthDay.get(Calendar.DATE));
		System.out.println("��"+birthDay.get(Calendar.HOUR_OF_DAY));
		System.out.println("��"+birthDay.get(Calendar.MINUTE));
		System.out.println("��"+birthDay.get(Calendar.SECOND));
		int year=birthDay.get(Calendar.YEAR);
		int month=birthDay.get(Calendar.MONTH)+1;
		int date=birthDay.get(Calendar.DATE);
		System.out.println(year+"�� "+month+"�� "+date+"��");
		//�⺻������ ���� ������ ����.
		System.out.println(new Date(birthDay.getTimeInMillis()));
		//������ ��¥�� ��Ÿ������ ��ȯ
		
		//���ϴ� ��¥ �����ϱ�
		//set�޼ҵ� �̿��Ͽ� ��¥�� ������ �� ����
		birthDay.set(1993,7-1,8,11,35,15);
		System.out.println(new Date(birthDay.getTimeInMillis())); //������ ������ ����.
		
		System.out.println("=====GregorianCalendar=======");
		//GregorianCalendar  <--calendar�� �ڽ�
		GregorianCalendar gc=new GregorianCalendar();//���� ��¥ ����
		System.out.println(gc);
		//��¥ ������ ����Ϸ��� get
		printDate(gc); //2020�� 7�� 2��
//		int year1=gc.get(Calendar.YEAR);
//		int month1=gc.get(Calendar.MONTH)+1;
//		int date1=gc.get(Calendar.DATE);
//		System.out.println(year1+"��"+month1+"��"+date1+"��");
		//calendar��ü������ ������¥�� �����Ҷ� set���̿�.
		//GregorianCalendar ������ ���ÿ� �ʱ�ȭ ����
		gc=new GregorianCalendar(1993,(8-1),28);//���� ���� �޿� -1 
//		year1=gc.get(Calendar.YEAR);
//		month1=gc.get(Calendar.MONTH)+1;
//		date1=gc.get(Calendar.DATE);
//		date1++;
//		System.out.println(year1+"��"+month1+"��"+date1+"��");
		
		printDate(gc);//1993�� 8�� 28��
		//�׷����� Ķ������
		//���ʵ��� ���� ��������
		gc.set(Calendar.YEAR,2021);//gc.set(1,2021);�� �Ȱ��� ����
		gc.set(Calendar.MONTH,9-1);
		System.out.println(gc);
		
		
		//gregorianCalendar
		Date birth2=new Date(gc.getTimeInMillis());
		System.out.println(birth2);
		
		//��¥�� ���Ŀ� �°� ���������ֱ�
		//00�� 0�� 0��
		//0000�� 00�� 00��
		//00.00.00/00-00-00
		//SimpleDateFormat��ü�� �̿� <--text�ȿ� ����.
		//Date��ü�� ���Ŀ� �°� ���ڿ��� ������ִ� ��ü
		//SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd��");//1993�� 08�� 28��
		//SimpleDateFormat sdf=new SimpleDateFormat("yy.MM.dd");//93.08.28
		//SimpleDateFormat sdf=new SimpleDateFormat("yy�� MM�� dd�� E����a hh:mm:ss");//93�� 08�� 28�� ����� 12:00:00
		SimpleDateFormat sdf=new SimpleDateFormat("yy�� MM�� dd�� E����a HH:mm:ss");//93�� 08�� 28�� ����Ͽ��� 00:00:00
		//String strDate=sdf.format(birth2); //�ڷ����� Date�� ����! 
		String strDate=sdf.format(gc.getTimeInMillis());//�ƴҰ�쿡�� getTimeMillis()���
		System.out.println(strDate);

		
		//Date�� Calendar�� ��Ӱ��� �ƴ�.
		//Calendar�� GregorianCalendar�� �θ��ڽİ�����.
	
	}
	
	private static void printDate(Calendar c) {
		int year1=c.get(Calendar.YEAR);
		int month1=c.get(Calendar.MONTH)+1;
		int date1=c.get(Calendar.DATE);
		System.out.println(year1+"��"+month1+"��"+date1+"��");
	}
}
