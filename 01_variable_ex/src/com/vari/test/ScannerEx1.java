package com.vari.test;
import java.util.Scanner;
public class ScannerEx1 {

	public static void main(String[] args) {
		//�ڽ����̸�(string),����(int),�ּ�(String),Ű(double)
		//������(double),����(char)�Է� �ް� ����ϴ� ���α׷�.
		//�����Դ� ù°�ڸ�����, Ű�� ������ ��ȯ�Ͽ� ���

			Scanner sc=new Scanner(System.in);
			System.out.print("����� �̸�:");
			String name=sc.next();
			System.out.print("����� ����:");
			int age=sc.nextInt();
			sc.nextLine();
			System.out.print("����� �ּ�:");
			String address=sc.nextLine();
			System.out.print("����� Ű:");
			double height=sc.nextDouble();
			int hei=(int)height;
			System.out.print("�����  ������:");
			double weight=sc.nextDouble();
			sc.nextLine();
			System.out.print("����� ����:");
			char gender=sc.nextLine().charAt(0);
			
			System.out.printf("�̸�:%s, ����:%d, �ּ�:%s, Ű:%d, ������:%.1f, ����:%c",name,age,address,hei,weight,gender);

		}
	}