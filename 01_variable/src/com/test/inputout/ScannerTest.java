package com.test.inputout;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		//Ű���忡 �Էµ� ���� ������������
		//Scanner��ü�� �̿�
		//1.import java.util.Scanner�� �߰�
		//2.Scanner���� -->Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		//3.Scanner�� �����ϴ� ���(�޼ҵ�)�� �̿��ؼ� ���� �޾ƿ�
		//nextInt():����, nextFloat()/nextDouble():�Ǽ�,
		//next()/nextLine():���ڿ�
		//System.out.println(sc.nextInt());
		
		System.out.print("����� �ּ�: ");
		String address=sc.nextLine();
		System.out.println("�ּ�: "+address);
		
		System.out.print("���̸� �Է�: ");
		int age=sc.nextInt(); //�Է¹��� ���� ������ ����
		System.out.println("����� �Է��� ���̴�: "+age); //����� ������ ���� ���
		System.out.print("�����Է�: ");
		String msg=sc.next(); 
		//���⸦ �������� �տ� ���ڸ� ������.
		//���� ���ְ� �Ծ����? 
		//������� ��� ���ڸ� �޾ƿ����� sc.nextLine();
		sc.nextLine();//���۸� ����ִ� ����!
		System.out.println("����� �Է��� ����:"+msg);
		System.out.print("����� Ű: ");
		double height=sc.nextDouble();
		System.out.println("����� Ű��:"+height+"cm");
		
		//sc.nextChar();//����
		//�Է¹��� �� �ִ� �ڷ���?
		//int, double, float, ���ڿ�, lnog,
		sc.nextLine();//���� nextDouble()�� ����
		
		//char������ �Է¹ޱ�!
		//���ڿ��� �������� char������ �߶� ������.
		System.out.println("����: "); //����
		//���� ��ġ�� �ִ� �ѱ��ڸ� ������.
		char gender=sc.nextLine().charAt(0);//��
		System.out.println(gender);
		String key="��ȣ����";
		char ch1=key.charAt(0); //��
		char ch2=key.charAt(1); //ȣ
	}

}
