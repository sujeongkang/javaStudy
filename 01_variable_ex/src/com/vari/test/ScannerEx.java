package com.vari.test;

import java.util.Scanner;

public class ScannerEx {
	//��������� �̸�,����,�ּ�,��ȭ��ȣ(����), Ű�� �Է¹޾�
	//����ϴ� ���α׷� �ۼ�
	//������Ʈ �����ؼ� �غ���!
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�� �̸�: ");
		//String name=sc.next(); //�̸��� ���ڿ�
		String name=sc.nextLine();
		System.out.print("�� ����: ");
		int age=sc.nextInt();//���̴� ����
		
		sc.nextLine(); //���۸� �����
		//nextLine()���� �ޱ�����
		//nextInt(),next(),nextDouble()�� ������ ���� �޾ƿ�����
		//�Է¹��۸� nextLine() ����ְ� ����� �ؾ��Ѵ�.

		System.out.print("�� �ּ�: ");
		String address=sc.nextLine();//�ּ� ���ڿ�
				
		System.out.print("�� ��ȭ��ȣ: ");
		String phone=sc.nextLine();
		
		System.out.println("�� Ű: ");
		double height=sc.nextDouble();
		
		System.out.println(name+" "+age+" "+address+" "+phone+" "+height);
		
		
	}
}
