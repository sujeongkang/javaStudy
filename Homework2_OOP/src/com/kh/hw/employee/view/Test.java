package com.kh.hw.employee.view;
import java.util.Scanner;
public class Test {
	public static String a() {

		Scanner sc = new Scanner(System.in);

		System.out.print("나이: ");

		int num = sc.nextInt();

		System.out.print("주소 : ");

		sc.nextLine();

		String address = sc.nextLine();

		return address;

	}

	public static void main(String[] args) {

		String add=a();

		System.out.println(add);

	}

}
