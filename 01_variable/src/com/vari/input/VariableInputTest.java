package com.vari.input;

public class VariableInputTest {
	public static void main(String[] args) {
		//���� �����ϰ� �� �ֱ�
		int age;
		age=19; //���� ����
		double height;
		height=180.5;
		String name;
		name="������";
		char gender;
		gender='��';
		String gender2;
		gender2="��";
		
		byte bnum;
		bnum=100;
		//bnum=128;
		
		long lnum=100000000000L;//����� ���ÿ� �ʱ�ȭ
		
		float fnum=3.14f;//����� ���ÿ� �ʱ�ȭ
		
		//�������� �ߺ��Ǹ� �ȵȴ�.
		//int fnum;
		
		//������ ���� ó�� �����ϴ� ��-->�ʱ�ȭ
		//���������� �ݵ�� �ʱ�ȭ�� �ϰ� ����ؾ���.
		int a=0;double dnum=0.0;
		char ch=' ';String str="";
		
		//System.out.println(a);
		
		//������ ����� ������(��) ����������
		//�������� �̿��ϸ� ��.
		
		System.out.println("�ȳ��ϼ���!");
		System.out.println(name);//name="������";
		name="����ȣ";
		System.out.println(name);
	
		//������ ���� ����. ���ͷ��� �ƴ� ������ �̿��� �� �ִ�.
		String name2=name;
		System.out.println(name2);
		//�������� �ڵ忡 ������ ������ �ִ� ���� �� ��ġ�� �ҷ��´�.
		
		//���Ȱ���ϱ�
		//�ѹ��� ������ �� �ִ� �������
		int num=10;
		num=20;
		num=30;
		
		final int NUM_FINAL=19;
		//NUM_FINAL=30;
		
		System.out.println(NUM_FINAL);
		
		//���ڿ� Ȱ���ϱ�
		//�⺻ ���� �� ��������
		String str1="����";
		String str2=new String("����");
		System.out.println(str1);
		System.out.println(str2);
		
		str1="����"+"ĢĢ����";
		str2=new String("����"+"ĢĢ����");
		System.out.println(str1);
		System.out.println(str2);
		str1="����"+(123+45)+"ĢĢ����";
		System.out.println(str1);
		str2=""+123+45+"����"+"ĢĢ����";
		System.out.println(str2);
		
		//num, age, height, gender =>�� �ڷ����� �� �ٸ�
		System.out.println(" �̸�: "+name+" ����: "+age+" Ű: "+height+" ����: "+gender);
		
		
		int inumz=100;
		long lnumz=10000L;
		float fnumz=234.567f;
		double dnumz=567.12356;
		char chz='A';
		String strz="Hello World";
		boolean brz=true;
		
		System.out.println(inumz);
		System.out.println(lnumz);
		System.out.println(fnumz);
		System.out.println(dnumz);
		System.out.println(chz);
		System.out.println(strz);
		System.out.println(brz);

	}
}
