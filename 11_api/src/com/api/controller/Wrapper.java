package com.api.controller;

public class Wrapper {
	public static void main(String[] args) {
		//WrapperŬ���� Ȱ���ϱ�
		//WrapperŬ������ �ڵ����� ����ȯ�Ͽ� �⺻ �ڷ������� ����ǰ�
		//�⺻ �ڷ����� �ʿ信 ���� �ڵ����� WrapperŬ������ �����.
		int age=19;
		Integer ageW=age;//����ڽ�
		System.out.println(ageW);//19
		
		int su=ageW;//�����ڽ�
		printTest(su);
		
		double height=180.5;
		Double dheight=height;
		System.out.println(dheight);
		printTest(height);//false
		
		//WrapperŬ�������� ������ �޼ҵ嵵 �Բ� ������ ����
		//���������� ���ڰ��� ���������� �����ϴ� ��
		//WrapperŬ������.parseWrapperŬ������(������ ����);
		//���� ������ �ٴ�ö� ���ڿ��� �޾ƿ��⶧���� ���� ���
		String test="2020";
		int year=Integer.parseInt(test);//����ȯ
		System.out.println(year);//2020
		test="65.5";
		double weight=Double.parseDouble(test);
		System.out.println(weight);
//		test="10a";
		//������.. ���ڿ��� �ȵ�.. ���������ڿ��� ����
		//Integer.valfueOf();
//		int a=Integer.valueOf(test);
//		System.out.println(a);
		
		//�ٸ� �ڷ����� ���������� �����Ϸ���?
		//String.valueOf();
		test=String.valueOf(age);
		System.out.println(test);//19
		test=String.valueOf(height);
		System.out.println(test);//180.5
		
		
		
	}
	
	public static void printTest(Object obj) {
		//object���� ��Ӱ����� �������� Ư¡������ �� �� ����.
		System.out.println(obj instanceof Integer);//true
	}
	
}
