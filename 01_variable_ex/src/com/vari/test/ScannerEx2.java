package com.vari.test;
import java.util.Scanner;
public class ScannerEx2 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		System.out.print("�̸�:");
		String name1=sc.next();
		System.out.print("����:");
		int age1=sc.nextInt();
		System.out.print("����:");
		char gen1=sc.next().charAt(0);
		sc.nextLine();
		System.out.print("����:");
		String loc1=sc.nextLine();
		System.out.print("��ȭ��ȣ:");
		String num1=sc.nextLine();
		System.out.print("�̸���:");
		String email1=sc.nextLine();
		
		System.out.print("�̸�:");
		String name2=sc.next();
		System.out.print("����:");
		int age2=sc.nextInt();
		System.out.print("����:");
		char gen2=sc.next().charAt(0);
		sc.nextLine();
		System.out.print("����:");
		String loc2=sc.nextLine();
		System.out.print("��ȭ��ȣ:");
		String num2=sc.nextLine();
		System.out.print("�̸���:");
		String email2=sc.nextLine();
		
		System.out.println("�̸�\t����\t����\t����\t��ȭ��ȣ\t\t�̸���");
		System.out.println("---------------------------------------------------------");
		System.out.printf("%s\t %d\t %c\t %s\t %s\t %s\n",name1,age1,gen1,loc1,num1,email1);
		System.out.println("---------------------------------------------------------");
		System.out.printf("%s\t %d\t %c\t %s\t %s\t %s",name2,age2,gen2,loc2,num2,email2);

	}
}
