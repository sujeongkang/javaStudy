package com.abstracttest.controller;

import com.abstracttest.model.vo.Food;
import com.abstracttest.model.vo.Recipe;
import com.abstracttest.model.vo.Test;
import com.abstracttest.model.vo.IncludeAbstract;
import com.abstracttest.model.vo.IncludeImplements2;
import com.abstracttest.model.vo.IncludeImplements;

public class AbstractTestMain {
	public static void main(String[] args) {
	
		//Food f=new Food("�߽�","¥���","�ѱ�",1,0);
		//Cannot instantiate the type Food //static Ŭ���� �� �ν��Ͻ�ȭ (����)�� �� ����!
		//System.out.println(f);
		Test t=new Test("�ѽ�","���","�ѱ�",1,5);
		System.out.println(t);//������ ���� �� �ּҰ��� �����ϴ� �޼ҵ�� Object.toString.
		//FoodŬ�������� toString() �޼ҵ� ������ <-�������̵�
		
		
		System.out.println(t.getName());
		//Food f=new Food();
		//�߻�Ŭ������ �������ڷ����� ����� �����ϴ�.
		Food f=new Test();//�θ� ������ ��ӹ��� �ڽ�Ŭ������ ��ü�� ���� �� ����. ������
		f=new Recipe();
		//Food �ڷ����� �������� Food��ӹ��� ��ü�� ���԰���
		//f=new String();
		((Recipe)f).cooking();//�θ�ü�� �ڽİ�ü�� �����ϱ� ���ؼ��� ����ȯ�� �ʿ�.
		
		IncludeAbstract ia=new IncludeImplements();//ia���� IncludeAbstract�� ��ӹ��� ��ü�� �����ִ�.
		System.out.println(ia.calulator(10, 20)); //�������ε�
		ia=new IncludeImplements2();
		System.out.println(ia.calulator(10, 20));
		System.out.println(ia.getA());  //0 default��  //���� �Ű������� �����.��곡���� bye 
		
		System.out.println(ia.combine("�ȳ�", "�ϼ���!"));
		
		
	}
}
