package com.oop.model.vo;

public class FieldAccessTest {
	//��������� �����׽�Ʈ
	//���������� ����� �ڷ��� ������[=��]
	//public int publicInt;
	private int publicInt=20; //default ->0  ������ ���� �ִٸ� ����� ���ÿ� �ʱ�ȭ ����
	//protected char protectedChar;
	private char protectedChar='A'; //default->''
	//String defaultString;
	private String defaultString="��ȣ~"; //default->null
	private double privateDouble=180.5; //default->0.0
	//not used �������� �������� ���� �ٸ������� ������.
	//�ڵ常 �ִٰ� �ؼ� ��������� ���� �ȵ�. new�� �����ؼ� �ּҰ��� ��������.
	//public int age;
	private int age=180; //���� ���� �Ұ�
	
	//�ʵ��� �ڷ����� �ڹٿ��� ����ϴ� ��� �ڷ����� ����� �� ����
	private int[] intArr=new int[10]; //�迭�� ��밡��
	//private DefaultTest test=new DefaultTest(); //��ü�鵵 ������ ��䰡��
	
	
	{
		publicInt=200;
		protectedChar='��';
		defaultString="�̰�!";
		privateDouble=180.5;
	}
	
	//������ �����ؼ� �����͸� ��������, ������ ���� ������ �� �ִ� �޼ҵ带 ���� �ۼ�
	//������ 1:2�� ����������� getter(�������� ��)/setter(������ ����)
	//���������� �ڷ���(��ȯ��)||void get������(){      }||set������(�����ڷ��� ������){     }
	
	//getter ->�������� �������� ���
	public int getAge() { //get�������Ҷ� camel ù���� �빮��!
		return this.age;//�������ȣ��
	}
	//setter ->������ ���� �ִ� ���
	public void setAge(int age) {//(int age)�� �Ű�����
		if (age>0) {
			this.age=age; //mainŬ������ fct.setAge(19)�� ���� �̰��� 19�ֱ�
		}
	} //��ü�ּ� ctrl+ / 
	
}
