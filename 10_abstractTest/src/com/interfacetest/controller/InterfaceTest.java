package com.interfacetest.controller;

import com.interfacetest.model.vo.Test;
import com.interfacetest.model.vo.TestAble;

public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(TestAble.age);
		System.out.println(TestAble.name);
		//TestAble.age=20; �������̽����� ������ ���� �����
		//�ٸ� ���� ������ �ȵ�
		//TestAlbe.name="�̰Ŵ�?"
		Test t=new Test();
		t.test();
		System.out.println(t.getStr("������ ���� ���� ��������!!"));
		
		//�������̽��� �������ڷ������� ����� ����
		TestAble test;
		test=new Test("������",19);
		//����: �ʼ����� ��ɸ� ���̵��� ������.
		//�������̽��� ������ �޼ҵ常 ����!.�ʼ����� ��Ҹ� ���̰��Ѵ�.
		//�������̽�(TestAble)���� ���� ���� �޼ҵ�� ������! 
		System.out.println(test.getStr("�� �� �����ð�"));//�������ε�
		((Test)test).getAge();
		
		TestAble[] arrTest=new TestAble[10];//���� ������ ��������� ��ü������ �Ѱ� �ƴϱ⶧���� ����.
		arrTest[0]=new Test();
		
		//�������̽��� Ŭ������ �޸� ���߱����� ������.
		
		//default���� ����Ͽ� �����ΰ��ִ� �޼ҵ带 �������̽� ���ο���
		//������ ��������.
		arrTest[0].whatHell("�̰ǹ���?? �� �򰥸���... �ʹ��Ѵ�!!");
		
		
		
	}
}
