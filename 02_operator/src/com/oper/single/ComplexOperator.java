package com.oper.single;
import java.util.Scanner;

public class ComplexOperator {
	public void test() {
	//public static void main(String[] args) {
		//���մ��Կ�����
		//���ϴ� ���� ������ ������ ��������� �����ϴ� ������.
		int account=100000000;
		//1.�Ա�
		account+=10; //account=account+10; ���� ����
		System.out.println(account);
		//2.���� 5000000
		account-=5000000;
		System.out.println(account);
		
		//�Է¹��� ���� �հ踦 ���ϴ� ���α׷� ����ÿ�
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է�: ");
		int sum=sc.nextInt();
		System.out.print("�����Է�: ");
		sum+=sc.nextInt();
		System.out.print("�����Է�: ");
		sum+=sc.nextInt();
		System.out.println("�հ�: "+sum);
		
		//����ڿ��� ���ڸ� 3�� �Է��ϰ� �ϰ� �Է¹��� ���ڸ�
		//��� ����ϴ� ���α׷�
		System.out.print("�޽��� �Է�: ");
		sc.nextLine();
		//String msg=""; �ؿ� ó�� �ٷ� ���մ��� ������ ���� ���ؼ��� �ʱ�ȭ�ʿ�
		//String msg+=sc.nextLine();//msg=msg+�Է°�;
		String msg=sc.nextLine(); //�ʱ�ȭ
		System.out.print("�޼��� �Է�: ");
		msg+=sc.nextLine();
		System.out.print("�޽��� �Է�: ");
		msg+=sc.nextLine();
		System.out.println("�Է��� �޼���: "+msg);
		
		//����, ����, ����, �ڵ� ������
		//�Է¹޾� �հ�� ����� ���ϴ� ���α׷�
		//*����,����,����,�ڵ������� ���� ������ �ʿ䰡 ����
		//int kor=sc.nextInt();
		int sum1=0;
		int count=0;//��������,
		System.out.print("���� ����: ");
		sum1+=sc.nextInt();
		count++;
		System.out.print("���� ����: ");
		sum1+=sc.nextInt();
		count++;
		System.out.print("���� ����: ");
		sum1+=sc.nextInt();
		count++;
		System.out.print("�ڵ� ����: ");
		sum1+=sc.nextInt();
		count++;

		System.out.println("�հ�: "+sum1+" ���: "+(sum1/4.0));
		//������� 4�� �������� �Ҽ����� �߻��� �� �־� double�� �����ϱ�  ����.
		//4.0 double������ ����.
		System.out.printf("�հ�: %d, ��: %.1f",sum1,(sum1/4.0));
		//��� ���ڸ����� ǥ���.
		System.out.println("�հ�: "+sum1+" ���: "+((double)sum1/count));
	}
}
