package com.vari.test;
import java.util.Scanner;
public class ScannerEx2 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		System.out.print("이름:");
		String name1=sc.next();
		System.out.print("나이:");
		int age1=sc.nextInt();
		System.out.print("성별:");
		char gen1=sc.next().charAt(0);
		sc.nextLine();
		System.out.print("지역:");
		String loc1=sc.nextLine();
		System.out.print("전화번호:");
		String num1=sc.nextLine();
		System.out.print("이메일:");
		String email1=sc.nextLine();
		
		System.out.print("이름:");
		String name2=sc.next();
		System.out.print("나이:");
		int age2=sc.nextInt();
		System.out.print("성별:");
		char gen2=sc.next().charAt(0);
		sc.nextLine();
		System.out.print("지역:");
		String loc2=sc.nextLine();
		System.out.print("전화번호:");
		String num2=sc.nextLine();
		System.out.print("이메일:");
		String email2=sc.nextLine();
		
		System.out.println("이름\t나이\t성별\t지역\t전화번호\t\t이메일");
		System.out.println("---------------------------------------------------------");
		System.out.printf("%s\t %d\t %c\t %s\t %s\t %s\n",name1,age1,gen1,loc1,num1,email1);
		System.out.println("---------------------------------------------------------");
		System.out.printf("%s\t %d\t %c\t %s\t %s\t %s",name2,age2,gen2,loc2,num2,email2);

	}
}
