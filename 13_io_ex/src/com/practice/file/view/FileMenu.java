package com.practice.file.view;

import java.util.Scanner;

import com.practice.file.controller.FileController;

public class FileMenu {
	Scanner sc=new Scanner(System.in);
	FileController fc=new FileController();
	
	public void mainMenu() {
		
		System.out.println("*****My Note*****");
		while(true) {
			System.out.println("1.노트 새로 만들기");
			System.out.println("2.노트 열기");
			System.out.println("3.노트 열어 수정하기");
			System.out.println("9.끝내기");
			System.out.print("선택: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:fileSave();break;
			case 2:fileOpen();break;
			case 3:fileEdit();break;
			case 9:System.out.println("프로그램을 종료합니다.");return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");continue;
			}
			
		}
		
		
	}
	public void fileSave() {
		System.out.println("파일에 저장할 내용을 입력하세요\nex끝it이라고 입력하면 종료됩니다.");
		boolean a=true;
		StringBuilder sb = new StringBuilder();
		sc.nextLine();
		while(true) {
			System.out.print("내용: ");
			String s=sc.nextLine();
			sb.append(s);
			
			if(s.equals("ex끝it")) {
				break;
			}
		}
		String file="";
		loop:
		while(true){
			
			sc.nextLine();
			System.out.println("저장할 파일명을 입력해주세요.(ex. myfile.txt)");
			file=sc.nextLine();
			
			if(fc.checkName(file)) {
				System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까(y/n)");
				char yn=sc.nextLine().charAt(0);
				if(yn=='y') {
					break loop;
				}else if(yn=='n') {
					mainMenu();break;
				}else {
					System.out.println("잘못입력하셨습니다.");continue;
				}
				
			}else {
				break;
				
			}
		}
		fc.fileSave(file,sb);
		System.out.println("저장되었습니다.");
	
	}
	public void fileOpen() {
		sc.nextLine();
		System.out.print("열 파일명: ");
		String openFile=sc.nextLine();
		
		if(fc.checkName(openFile)) {
			System.out.println(fc.fileOpen(openFile));
		}else {
			System.out.println("없는 파일 입니다.");
			mainMenu();
		}
	}
	public void fileEdit() {
		sc.nextLine();
		System.out.print("수정할 파일명: ");
		String File=sc.nextLine();
		if(fc.checkName(File)) {
			System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까(y/n)");
			char yn=sc.nextLine().charAt(0);
			if(yn=='y') {
				StringBuilder sb=new StringBuilder();
				System.out.println("파일에 저장할 내용을 입력하세요\nex끝it이라고 입력하면 종료됩니다.");
				while(true) {
					System.out.println("수정할 내용: ");
					String s=sc.nextLine();
					if(s.equals("ex끝it")) {
						
						fc.fileEdit(File, sb);break;
					}
					sb.append(s);
				}
				fc.fileEdit(File, sb);
				
			}else {
				mainMenu();
			}
		}else {
			System.out.println("없는 파일 입니다.");
			mainMenu();
		}
	}
}
