package com.abstracttest.model.vo;

public class IncludeImplements extends IncludeAbstract {
	//The type includeImplements must implement the inherited abstract method includeAbstract.calulator(int, int)
	
	//����� ��ü�� �߻�޼ҵ尡 ������ �ݵ�� Override�������
	//�����ָ� ����� ���ϰ� ��
	@Override
	public double calulator(int su, int su2) {
		return su/(double)su2;
	}
	
	@Override
	public String combine(String a, String b) {
		return a+b;
	}
	
}

