package com.interfacetest.model.vo;
//Ʋ ������ְ�, Ʋ �����ش�� �� �� �᳻�� 
public interface TestAble {
	//�����  �ʵ带 ������ �ְ�
	public static final int age=19;
	String name="������";//=public static final String name="������"
	
	
	
	//�޼ҵ�� �߻�޼ҵ常 ���� �� �ְ� Override�� ���� public ���������ڸ� ������.
	//�⺻������ �޼ҵ� �����ϸ� �߻�޼ҵ�� ���� �빮�� public abstract�� ������ ������.
	public void test();//�߻�޼ҵ�
	
	String getStr(String a);//�߻�޼ҵ� �ڵ����� �տ� public abstract
	
	//�޼ҵ� �����θ� ������ �� �ֳ�? ������ �������� ������ �༮(�����ΰ� �ִ� �޼ҵ�)�� �ʿ�����.
	default void whatHell(String why) { //���� default�� �����ؼ� ��
		System.out.println(why);
	}
	
}
