package com.override.model.vo;

public class Dog extends Animal {
	
	public Dog(String category, String name, char gender, String diet) {
		super(category,name,gender,diet);
	}
	//�������̵� ó���Ͽ� �°� ����,������
	//�޼ҵ� ����δ� �θ��� �޼ҵ�� �����ϰ� �ۼ���
	//�����δ� �� ��ü�� �°� ������ ����
	//�޼ҵ弱��� ���� ������׼� Override
	@Override
	public String bark() {
	//protected String bark() { //����
		//���������� Cannot reduce the visibility of the inherited method from Animal
		//�θ� ������ ���������� ���� �۰� �ϸ� �����߻�
	//@Override
	//public String barkbark() {	
		//@Override �����  �������ڸ��� �θ�Ŭ������ barkbark�� �ִ��� �ڵ� �˻�. ������ ����
		//���� ��� ����. ���ص� �Ǳ������� �ϴ°� ��Ȯ
		return "������������";
	}
	@Override
	public String info() {
		return "������";
	}
	@Override
	public double calculator(int su, int su2) { 
		//�������̵� ����δ� �Ű��������� ������ �Ȱ��ƾ���.
		return su*su2;
	}
	
}
