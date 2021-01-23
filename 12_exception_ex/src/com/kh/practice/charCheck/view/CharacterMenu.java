package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	Scanner sc=new Scanner(System.in);
	
	public void menu() {
		System.out.print("���ڿ�: ");
		String str=sc.nextLine();
		try {
			int count=new CharacterController().countAlpha(str);
			System.out.println("'"+str+"'�� ���Ե� ������ ����: "+count);
			
		}catch(CharCheckException e){
			e.printStackTrace();
		}
		
	}
}
