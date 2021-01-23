package com.oop.model.vo;

public class InitialTest {
	//�ʱ�ȭ���
	private String name="�ȳ�"; //null
	private int size=180;//0
	private int id;//1���� ���������� 1���ؼ� �ο�
	//�ܺο��� ������ �Ұ���!
	private static int count;
	
	
	//�ʱ�ȭ ����� �����Ͽ� �ʱⰪ�� �����ϱ�
	{
		//��ü�� new�����ڷ� ������ �Ҷ�
		//����Ǵ� ���� //������ //����� ���
		this.name+="Rclass";
		this.size+=100;
		//this.id++;
		this.id=++count;
		System.out.println("�ʱ�ȭ ��� ����!");
	}
	
	
	//static �ʱ�ȭ ���
	static {
		//�ʱ�ȭ����̶� �ٸ�!!
		//���α׷��� ��Ÿ�� ���� �� 1���� �����!
		//�������, ����޼ҵ��� ȣ���� �Ұ���
		//this.name="����";//this�� new�Ҷ� �����Ǳ� ����
		
		//static���� �ʱ�ȭ
		InitialTest.count=100;
		System.out.println("static�ʱ�ȭ��Ͻ���");
		
	}
	
	public int getId() {
		return id;
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
		
	}
	public void setSize(int size) {
		this.size=size;
	}
	public int getSize() {
		return size;
	}
}
