package com.oop.model.vo;

public class FinalTest {
	//������� final����ϱ�
	//final ��� �ѹ� ���� �����ϰ� ������ �� ���� ���� ���!
	public final int ID; //final ����� ���ÿ� �ʱ�ȭ �ʿ�, �����Ǽ� heap������ �������� 
	//public final int ID=10; 1.����� ���ÿ� �ʱ�ȭ
	public static final int ID2;
	//�ʱ�ȭ
//	{//.�ʱ�ȭ ��
//		ID=200;
//	}
	
	
	static{//�ʱ�ȭ ������ �ʱ�ȭ
		ID2=200;
	}

	//3.�����ڷ� �ʱ�ȭ
	public FinalTest() {
		ID=300;
		//ID2=200;
	}
}
