package com.oper.single;
import java.util.Scanner;
public class CompareOperator {
	
	public static void main(String[] args) {
		//�񱳿���Ȱ���ϱ�
		//�񱳴� ���� ���� ���(����), ���� �񱳰� ������
		//�񱳿����� ����� true/false�� ����
		//�񱳿����� ���ǹ��� ���� ����� ��.
		//1. ����� == ����? ��!����!(true) / �ƴ� �޶�!(false)
		int su=100;
		int su1=200;
		int su3=100;
		System.out.println(su==su1); //f
		System.out.println(su==su3); //t
		double dsu=180.5;
		double dsu1=190.2;
		double dsu3=180.5;
		System.out.println(dsu==dsu1);//f
		System.out.println(dsu==dsu3);//t
		char ch='A';  //65
		char ch1='B'; //66
		char ch3='A';
		System.out.println(ch==ch1);//f
		System.out.println(ch==ch3);//t
		
		//String ���ڿ�
		System.out.println("=== ���ڿ� ����� ====");
		String str="����";
		String str1="�輼��"; //���ͷ� ���� heap�������� ����Ǯ �ȿ� '�輼��'���� ����. 
		String str3="����";
		System.out.println(str==str1);//false
		System.out.println(str==str3); //true �ּҰ��� ���� ������
		//���ڿ��� == ���� ���ϸ� �ȵ�!. �Ҿ�����
		String str2=new String("�輼��");
		System.out.println(str1==str2); //false
		Scanner sc=new Scanner(System.in);
		System.out.print("�̸��Է�: ");
		String name=sc.nextLine();
		System.out.println("str1 : "+str1+" name: "+name);
		System.out.println(str1==name);//false. ����Ǿ� �ִ� �ּҰ��� ���� �ٸ�.
		//���ڿ� object�� ������ ���� <-heap�� �����'�輼��'�� �ּҰ��� ��.
		//���ڿ��� ��ü�� ����񱳸� �Ϸ��� equals()����� �̿��ؾ���.
		//���ڿ�������.equals(�񱳹��ڿ�);
		System.out.println("==���� �� "+(str1==str2));
		System.out.println("equals�� �� "+str1.equals(str2));
		System.out.println("�Է¹����� ��: "+str1.equals(name));
		//�Է¹��� ���� ������ �̴�?
		System.out.println("������".equals(name));
		System.out.println(name.equals("������"));//���� �յڸ� �ٲ㵵 ����
		
		//!=��ġ���� ���� �� ��
		System.out.println(su==su1);//false
		System.out.println(su!=su1);//true �ٸ���?
		//���ڿ��� �ٸ��İ� �����???
		//���������̿�
		System.out.println(str.equals(str1)); //����?  false
		System.out.println(!str.equals(str1)); //�ٸ���? true
		System.out.println("==== ��Һ� ====");
		//��Һ�
		//>,<,<=,>=
		su=30;
		su1=20;
		System.out.println(su>su1);
		System.out.println(su<su1);
		System.out.println(su>=su3);
		
		//char���� ��Һ񱳰� �����Ѱ�? o
		//char ��Һ� ������
		//char ������= ����/65->A
		ch='A'; //65
		ch1='B'; //66
		System.out.println(ch<ch1);
		System.out.println(ch++);//����ϰ� ����
		//System.out.println(++ch);//������� ����
		System.out.println(ch); //B
		
		System.out.println(ch>'a');//����>���ͷ� �񱳰���
		
		//�񱳿����� ����� boolean��
		boolean flag=ch<'Z';
		
		//10�� 1���� ũ�� 20���� �۴�?
		//1<10<20 -->���α׷������� X
		//��Һ� �ΰ��� ���� --> ������
		
		
	}
}
