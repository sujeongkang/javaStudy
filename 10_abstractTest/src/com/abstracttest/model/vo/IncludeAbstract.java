package com.abstracttest.model.vo;

public abstract class IncludeAbstract {

	private int a;
	private int b;
	private int count;
	//�߻�޼ҵ尡 ����Ǿ� ������ �ݵ��
	//�߻�Ŭ������ �����Ѵ�.
	//�߻�޼ҵ�� ����� �޼ҵ带 ���İ�ü�� ������Ŵ
	//�߻�޼ҵ�� ����θ� ������, �����ΰ� ����!
	//���������� abstract ��ȯ�� �޼ҵ��(�Ű�����);   <--�����ݷ����� ����..����!
	
	public abstract double calulator(int a,int b);
	//The abstract method calulator in type includeAbstract can only be defined by an abstract class
	//�߻� �޼ҵ�� �߻� Ŭ�������� ���� �� �� �ֽ��ϴ�.
	//�ڽ�Ŭ������ abstract �������̵尭��
	public abstract String combine(String a, String b);
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
