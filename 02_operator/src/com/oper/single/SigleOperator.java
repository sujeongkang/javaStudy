package com.oper.single;
import java.util.Scanner;
public class SigleOperator {
	public static void main(String[] args) {
		//���׿����� Ȱ���ϱ�
		//���������� Ȱ���ϱ�
		boolean flag=true;
		System.out.println(flag);
		System.out.println(!!flag);
		//���������� �������� �幰�� ����ϰ�, �񱳿���, ������� �Բ�
		//���� ���
		int age=19;
		//if(!(age>19&&id.equals("admin"))); ������ �ƴϸ�
		
		//����, ���ҿ���
		//++,--
		int su=19;
		su++; //su=su+1
		su++;
		su++;
		System.out.println(su);
		su--;
		su--;
		System.out.println(su);
		//����, ���ҿ���� 
		//����, ���� �����̶� ����!
		//�������� : ���� �տ� �����ڸ� �ۼ� ++su
		//�������� : ���� �ڿ� �����ڸ� �ۼ� su++
		//�ٸ� �����ڿ� ������ �� �� ���̰� �߻���.
		//�������� ->���� ��/�� ������ ó���ϰ� �ٸ����� ����
		//��������->�ٸ� ������ ���� ó���ϰ� ��/������
		int su1=29;
		int su2=0;
		int su3=0;
		su2=++su1;
		su1=29;
		su3=su1++;
		System.out.println("su2: "+su2);
		System.out.println("su3: "+su3);
		System.out.println("su1: "+su1);
		
		//����, ������ �ܵ����� ����ϰ� �Ǹ� ��������� ����.
		//1.�ݺ����� ���� ���� ���!
		//for(int i=0;i<10;i++)/for(int i=100;i>10;i--)
		//2.Ư���� ���� ������ ����
		//count++;
		int su4=30;
		int su5=0;
		//su5=su4+++20;//50
		su5=++su4+20;//51
		System.out.println(su5);
		
		//��������� Ȱ���ϱ�
		//�⺻���� ���ϱ�, ����, ������, ���ϱ�, �������� ���ϱ�
		//���ڿ����� �ϴ� ��, ���ϱ�� ���ڿ��굵 ����
		//���� �ΰ� ���� �� 7, 10�� �ֱ�
		int su6=7;
		int su7=10;
		//���ϱ�
		//su6+su7; //����. ������ ����/����ϴ� ����� �ʿ�
		System.out.println(su6+su7);//������ ����/��� �ؾ��� ������ ���� ����.
		System.out.println(su6+20);//����+���ͷ� ���굵 ����
		System.out.println(5+10);//���ͷ� ������ ���갡��
		//�������� ������ ���� ����
		int result=su6+su7; 
		//byte result=su6+su7;//����.int=int+int ������.
		System.out.println(result);
		//����
		System.out.println(su6-su7); //������ ǥ������
		result=su6-su7;		//�������� ������ ���� ����
		System.out.println(result);
		//���ϱ�
		System.out.println(su6*su7);
		result=su6*su7;
		System.out.println(result);
		//������
		System.out.println(su6/su7);//0.7�ε� 0�� ��µ�. int/int
		System.out.println((double)su6/su7);
		// double/int�� ������� double�� �սǾ��� 7.0/10.0 =>0.7
		result=su6/su7; //0
		System.out.println(result);//0
		//result=(double)su6/su7;//results�� int���̱⿡ ���� �� ����. �����߻�
		double result2=(double)su6/su7;
		System.out.println(result2);
		//������ ���ϱ�
		System.out.println(su6%su7); //7  // 7/10�� ��� ����0, �������� 7
		System.out.println(5%3); 
		//������%�� ¦���� ���ϼ���~ Ȧ��, ������ϱ� �� Ȱ�밡��
		//�Է¹��� ���� ¦�� ���� Ȯ��
		//�Է¹ޱ�! Ű�����
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է�: ");
		int su8=sc.nextInt();
		System.out.println(su8%2); //¦���� ������� 0, Ȧ���� ������� 1
		//if(su8%2==0) {
		//	System.out.println("¦��!");
		//}  //su8�� ¦���̸� ¦��! ����Ʈ
	}
}
