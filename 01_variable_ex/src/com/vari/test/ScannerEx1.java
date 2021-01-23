package com.vari.test;
import java.util.Scanner;
public class ScannerEx1 {

	public static void main(String[] args) {
		//자신의이름(string),나이(int),주소(String),키(double)
		//몸무게(double),성별(char)입력 받고 출력하는 프로그램.
		//몸무게는 첫째자리까지, 키는 정수로 변환하여 출력

			Scanner sc=new Scanner(System.in);
			System.out.print("당신의 이름:");
			String name=sc.next();
			System.out.print("당신의 나이:");
			int age=sc.nextInt();
			sc.nextLine();
			System.out.print("당신의 주소:");
			String address=sc.nextLine();
			System.out.print("당신의 키:");
			double height=sc.nextDouble();
			int hei=(int)height;
			System.out.print("당신의  몸무게:");
			double weight=sc.nextDouble();
			sc.nextLine();
			System.out.print("당신의 성별:");
			char gender=sc.nextLine().charAt(0);
			
			System.out.printf("이름:%s, 나이:%d, 주소:%s, 키:%d, 몸무게:%.1f, 성별:%c",name,age,address,hei,weight,gender);

		}
	}