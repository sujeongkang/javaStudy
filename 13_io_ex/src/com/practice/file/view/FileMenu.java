package com.practice.file.view;

import java.util.Scanner;

import com.practice.file.controller.FileController;

public class FileMenu {
	Scanner sc=new Scanner(System.in);
	FileController fc=new FileController();
	
	public void mainMenu() {
		
		System.out.println("*****My Note*****");
		while(true) {
			System.out.println("1.��Ʈ ���� �����");
			System.out.println("2.��Ʈ ����");
			System.out.println("3.��Ʈ ���� �����ϱ�");
			System.out.println("9.������");
			System.out.print("����: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:fileSave();break;
			case 2:fileOpen();break;
			case 3:fileEdit();break;
			case 9:System.out.println("���α׷��� �����մϴ�.");return;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");continue;
			}
			
		}
		
		
	}
	public void fileSave() {
		System.out.println("���Ͽ� ������ ������ �Է��ϼ���\nex��it�̶�� �Է��ϸ� ����˴ϴ�.");
		boolean a=true;
		StringBuilder sb = new StringBuilder();
		sc.nextLine();
		while(true) {
			System.out.print("����: ");
			String s=sc.nextLine();
			sb.append(s);
			
			if(s.equals("ex��it")) {
				break;
			}
		}
		String file="";
		loop:
		while(true){
			
			sc.nextLine();
			System.out.println("������ ���ϸ��� �Է����ּ���.(ex. myfile.txt)");
			file=sc.nextLine();
			
			if(fc.checkName(file)) {
				System.out.println("�̹� �����ϴ� �����Դϴ�. ����ðڽ��ϱ�(y/n)");
				char yn=sc.nextLine().charAt(0);
				if(yn=='y') {
					break loop;
				}else if(yn=='n') {
					mainMenu();break;
				}else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");continue;
				}
				
			}else {
				break;
				
			}
		}
		fc.fileSave(file,sb);
		System.out.println("����Ǿ����ϴ�.");
	
	}
	public void fileOpen() {
		sc.nextLine();
		System.out.print("�� ���ϸ�: ");
		String openFile=sc.nextLine();
		
		if(fc.checkName(openFile)) {
			System.out.println(fc.fileOpen(openFile));
		}else {
			System.out.println("���� ���� �Դϴ�.");
			mainMenu();
		}
	}
	public void fileEdit() {
		sc.nextLine();
		System.out.print("������ ���ϸ�: ");
		String File=sc.nextLine();
		if(fc.checkName(File)) {
			System.out.println("�̹� �����ϴ� �����Դϴ�. ����ðڽ��ϱ�(y/n)");
			char yn=sc.nextLine().charAt(0);
			if(yn=='y') {
				StringBuilder sb=new StringBuilder();
				System.out.println("���Ͽ� ������ ������ �Է��ϼ���\nex��it�̶�� �Է��ϸ� ����˴ϴ�.");
				while(true) {
					System.out.println("������ ����: ");
					String s=sc.nextLine();
					if(s.equals("ex��it")) {
						
						fc.fileEdit(File, sb);break;
					}
					sb.append(s);
				}
				fc.fileEdit(File, sb);
				
			}else {
				mainMenu();
			}
		}else {
			System.out.println("���� ���� �Դϴ�.");
			mainMenu();
		}
	}
}
