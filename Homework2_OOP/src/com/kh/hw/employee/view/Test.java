package com.kh.hw.employee.view;
import java.util.Scanner;
public class Test {
	public static String a() {

		Scanner sc = new Scanner(System.in);

		System.out.print("����: ");

		int num = sc.nextInt();

		System.out.print("�ּ� : ");

		sc.nextLine();

		String address = sc.nextLine();

		return address;

	}

	public static void main(String[] args) {

		String add=a();

		System.out.println(add);

	}

}
