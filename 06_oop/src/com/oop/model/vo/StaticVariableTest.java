package com.oop.model.vo;

public class StaticVariableTest {
	//��������� static ���� ����ϸ�
	//static����, Ŭ���������� Ȱ���� ��
	//public static String name;//Ŭ���� ����
	
	private static  String name; //static����
	//������� �߰��ϱ�
	private int su;
	public void setSu(int su) {
		this.su=su;
	}
	public int getSu() {
		return this.su;
	}
	
	//Ŭ���� ������ ������� ����?!
	//Ŭ���� ����-> ���α׷� ���۰� ���ÿ� �޸𸮰���(static)�� �Ҵ��.(������ Ȯ��) 
	//				new������ �����ص���.�������� Static������ �Ҷ���.
	//		��������-> Ŭ������.������
	
	//�������->Ŭ������ new�����ڸ� ���� ��üȭ(����) ������ �Ҵ�
	
	
	//static������ �����ϱ� ���� getter.setter
	public static String getName() {  //�޼ҵ� ���鶧�� ȣ���Ҷ� ()��
		return StaticVariableTest.name;
	}
	public static void setName(String name) {
		StaticVariableTest.name=name;
		//this.name=name;//���� �߻� Cannot use this in a static context
		//this�� �ڱ��ڽ��� ã�ư�. Ŭ����. new ������ ��ü �ּҰ���ü�� ��������. �������� �� �ڱ��ڽ��ּ�
		//static���α׷� ���۵ɶ� �����Ҵ�, this�� new�����ɋ� ���� �Ҵ�. ������ static�ּҰ��� �ְ� this �ּҰ� ��� ���������� �־� ����
	//public void setName(String name) {
		//this.name=name;
	//*static�� ������ new�� �ݵ�� �����ؾߵǰ� this�� �� ������ �ּ��� �ڱⰪ�� �ҷ��´�
	
	}
	
}
