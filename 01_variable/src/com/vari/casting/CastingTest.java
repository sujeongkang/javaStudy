package com.vari.casting;

public class CastingTest {
	
	public static void main(String[] args) {
		//�ڵ�����ȯ Ȯ���ϱ�
		//�ڷ����� �ٸ� ������ ������ �����ϸ� 
		//�ڵ�����ȯ�Ͽ� ��.
		int age=19;
		double height=180.5;
		
		height=age;
		
		System.out.println(height); //19.0
		//�������� �ڵ�����ȯ
		int su=30;
		double weight=3.44;
		System.out.println(su+weight);//33.44
		
		//����ȯ�� ����(�������)��ü�� ����Ǵ� ���� �ƴ϶� 
		//������ �ִ� ��(���ͷ�)�� �ڷ����� �����ϴ� ����.
		
		String name="19";//������
		char ch='A';//�ڷ���
		//name=ch; ���� 
		//name=String.valueOf(ch); ����
		//���ڿ��δ� �ڵ��� ��ȯ�� �Ұ�����. ��ȯ�Ϸ��� ���(�޼ҵ�) �̿��ؾ���.
		
		//int su1=name;//���(�޼ҵ�)�� �̿��ؾ���.
		int su1=ch;
		
		double dnum=28.5;
		//���������� ���� ��ȯ
		//�����Ϳ� �ս��� �־ �����Ѵٴ� ��!
		System.out.println("������:"+dnum);//28.5
		su1=(int)dnum;
		System.out.println("dnum�� ���� ����:"+su1);//28  ������ �ս��� ����
		
		int chTest=2105435473;//4byte
		char ch1=(char)chTest;//char 2byte�� ���� ����ȯ �ʿ�. 
		System.out.println(ch1); //a
		System.out.println((char)chTest); //a
		
		char a='ȫ';
		int t=a;
		System.out.println(t);
		short s=(short)a;
		System.out.println(s);
	
		//���� �ڷ������� ����ȯ�ϸ� ������ �ս��� �߻���.
		//ǥ���� �� �ִ� ������ ���� ǥ���ϰ� �������� ����.
		t=290;
		byte b=(byte)t;
		System.out.println(b);
		
		
		
	}
}
