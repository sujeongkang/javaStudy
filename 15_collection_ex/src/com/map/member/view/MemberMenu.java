package com.map.member.view;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.map.member.controller.MemberController;
import com.map.member.model.vo.Member;

public class MemberMenu {
	Scanner sc=new Scanner(System.in);
	MemberController mc=new MemberController();
	
//	public void mainMenu() {
//		System.out.println("=======KH ����Ʈ=======");
//		while(true) {
//			
//			System.out.println("******���� �޴�******");
//			System.out.println("1.ȸ������");
//			System.out.println("2.�α���");
//			System.out.println("3.���� �̸� ã��");
//			System.out.println("9.����");
//			System.out.print("�޴�:");
//			int choice=sc.nextInt();
//			switch(choice){
//				case 1: joinMembership();break;
//				case 2: 
//					login();
//					memberMenu();break;
//				case 3: sameName();break;
//				case 9: System.out.println("���α׷� ����");return;
//				default: System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
//			}
//			
//		}
//
//	}
//	public void memberMenu() {
//		while(true) {
//			
//			System.out.println("******ȸ�� �޴�******");
//			System.out.println("1.��й�ȣ �ٲٱ�");
//			System.out.println("2.�̸� �ٲٱ�");
//			System.out.println("3.�α׾ƿ�");
//			System.out.print("�޴�:");
//			int choice=sc.nextInt();
//			switch(choice){
//				case 1: changePassword();break;
//				case 2: changeName();break;
//				case 3: 
//					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
//					mainMenu();return;
//				default: System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
//			}
//		}
//	}
	public void joinMembership() {
		System.out.print("���̵�:");
		String id=sc.nextLine();
		System.out.print("��й�ȣ:");
		String pw=sc.nextLine();
		System.out.print("�̸�:");
		String name=sc.nextLine();
		
		Member m=new Member(name,pw);
		if(mc.joinMembership(id, m)==true) {
			System.out.println("���������� ȸ������ �Ϸ� �Ͽ����ϴ�.");
		}else{
			System.out.println("�ߺ��� ���̵� �Դϴ�. �ٽ� �Է����ּ���.");
		}
		
	}
//	public void login() {
//		System.out.print("���̵�:");
//		String id=sc.nextLine();
//		System.out.print("��й�ȣ:");
//		String pw=sc.nextLine();
//		String name=mc.login(id, pw);
//		if(name!=null) {
//			System.out.println(name+"��, ȯ���մϴ�!");
//			memberMenu();
//		}else {
//			System.out.println("Ʋ�� ���̵� �Ǵ� ��й�ȣ �Դϴ�. �ٽ� �Է����ּ���");
//		}
//		 
//		
//	}
//	public void changePassword() {
//		while(true) {
//			System.out.print("���̵�:");
//			String id=sc.nextLine();
//			System.out.print("��й�ȣ:");
//			String oldPw=sc.nextLine();
//			System.out.print("������ ��й�ȣ:");
//			String newPw=sc.nextLine();
//			if((mc.changePassword(id, oldPw, newPw))==true) {
//				System.out.println("��й�ȣ ���濡 �����߽��ϴ�.");break;
//			}else{
//				System.out.println("��й�ȣ ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���.");
//			}
//		}
//	}
//	public void changeName() {
//		while(true) {
//			System.out.print("���̵�:");
//			String id=sc.nextLine();
//			System.out.print("��й�ȣ:");
//			String pw=sc.nextLine();
//			String name=mc.login(id, pw);
//			if(name!=null) {
//				System.out.println("�̸� ���濡 �����߽��ϴ�.");break;
//			}else {
//				System.out.println("�̸� ���濡 �����߽��ϴ�. �ٽ� �Է��� �ּ���");
//			}
//		}
//	}
//	public void sameName() {
//		System.out.print("�˻��� �̸�:");
//		String name=sc.nextLine();
//		Map.Entry entry=(Map.Entry) mc.sameName(name);
//		System.out.println(entry.getKey());
//		System.out.println(entry.getValue());
//
//	}
}
