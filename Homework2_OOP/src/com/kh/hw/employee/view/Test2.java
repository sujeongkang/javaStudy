package com.kh.hw.employee.view;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		String[] colors = {"red", "yellow", "green", "blue", "orange"};
		
		Scanner sc=new Scanner(System.in);
//Ű���� �Է¿� ��ü ���� ���� �ۼ�
		System.out.print("�˻��� ���� : ");
		
		String searchColor = sc.nextLine(); //Ű����� �����ڿ��� �Է¹���
		
		for(int i = 0; i < colors.length ; i++){ //�迭 �ȿ� ������ �豳�� �� �ֵ��� ���� ����
			
			if( colors[i].equals(searchColor) ){ //�Է°��� �迭 ������ ��ġ�ϴ��� Ȯ��
				
				System.out.println(searchColor + "���� ��Ͽ� �����մϴ�.");
				
				break; //��ġ�ϴ� ���� ������ ���� ������.
				
			}
			
		}
	}
}
