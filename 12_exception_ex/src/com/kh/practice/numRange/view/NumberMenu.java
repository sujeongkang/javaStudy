package com.kh.practice.numRange.view;
import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	
	Scanner sc=new Scanner(System.in);
	
	public void menu() {
		System.out.print("����1: ");
		int num1=sc.nextInt();
		System.out.print("����2: ");
		int num2=sc.nextInt();
		try {
			Boolean a=new NumberController().checkDouble(num1,num2);
			System.out.println(num1+"��(��) "+num2+"�� ����ΰ� ? "+a);
		} catch (NumRangeException e) {
			e.printStackTrace();
		}
		
	}
}
