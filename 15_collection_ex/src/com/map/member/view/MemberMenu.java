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
//		System.out.println("=======KH 사이트=======");
//		while(true) {
//			
//			System.out.println("******메인 메뉴******");
//			System.out.println("1.회원가입");
//			System.out.println("2.로그인");
//			System.out.println("3.같은 이름 찾기");
//			System.out.println("9.종료");
//			System.out.print("메뉴:");
//			int choice=sc.nextInt();
//			switch(choice){
//				case 1: joinMembership();break;
//				case 2: 
//					login();
//					memberMenu();break;
//				case 3: sameName();break;
//				case 9: System.out.println("프로그램 종료");return;
//				default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
//			}
//			
//		}
//
//	}
//	public void memberMenu() {
//		while(true) {
//			
//			System.out.println("******회원 메뉴******");
//			System.out.println("1.비밀번호 바꾸기");
//			System.out.println("2.이름 바꾸기");
//			System.out.println("3.로그아웃");
//			System.out.print("메뉴:");
//			int choice=sc.nextInt();
//			switch(choice){
//				case 1: changePassword();break;
//				case 2: changeName();break;
//				case 3: 
//					System.out.println("로그아웃 되었습니다.");
//					mainMenu();return;
//				default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
//			}
//		}
//	}
	public void joinMembership() {
		System.out.print("아이디:");
		String id=sc.nextLine();
		System.out.print("비밀번호:");
		String pw=sc.nextLine();
		System.out.print("이름:");
		String name=sc.nextLine();
		
		Member m=new Member(name,pw);
		if(mc.joinMembership(id, m)==true) {
			System.out.println("성공적으로 회원가입 완료 하였습니다.");
		}else{
			System.out.println("중복된 아이디 입니다. 다시 입력해주세요.");
		}
		
	}
//	public void login() {
//		System.out.print("아이디:");
//		String id=sc.nextLine();
//		System.out.print("비밀번호:");
//		String pw=sc.nextLine();
//		String name=mc.login(id, pw);
//		if(name!=null) {
//			System.out.println(name+"님, 환영합니다!");
//			memberMenu();
//		}else {
//			System.out.println("틀린 아이디 또는 비밀번호 입니다. 다시 입력해주세요");
//		}
//		 
//		
//	}
//	public void changePassword() {
//		while(true) {
//			System.out.print("아이디:");
//			String id=sc.nextLine();
//			System.out.print("비밀번호:");
//			String oldPw=sc.nextLine();
//			System.out.print("변경할 비밀번호:");
//			String newPw=sc.nextLine();
//			if((mc.changePassword(id, oldPw, newPw))==true) {
//				System.out.println("비밀번호 변경에 성공했습니다.");break;
//			}else{
//				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
//			}
//		}
//	}
//	public void changeName() {
//		while(true) {
//			System.out.print("아이디:");
//			String id=sc.nextLine();
//			System.out.print("비밀번호:");
//			String pw=sc.nextLine();
//			String name=mc.login(id, pw);
//			if(name!=null) {
//				System.out.println("이름 변경에 성공했습니다.");break;
//			}else {
//				System.out.println("이름 변경에 실패했습니다. 다시 입력해 주세요");
//			}
//		}
//	}
//	public void sameName() {
//		System.out.print("검색할 이름:");
//		String name=sc.nextLine();
//		Map.Entry entry=(Map.Entry) mc.sameName(name);
//		System.out.println(entry.getKey());
//		System.out.println(entry.getValue());
//
//	}
}
