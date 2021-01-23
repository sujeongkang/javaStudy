package com.list.music.view;

import java.util.Scanner;

import com.list.music.controller.MusicController;
import com.list.music.model.vo.Music;

public class MusicView {
	Scanner sc=new Scanner(System.in);
	private MusicController mc=new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("****���θ޴�****");
			System.out.println("1.������ ��ġ�� �� �߰�");
			System.out.println("2.ù ��ġ�� �� �߰�");
			System.out.println("3.��ü �� ��� ���");
			System.out.println("4.Ư�� �� �˻�");
			System.out.println("5.Ư�� �� ����");
			System.out.println("6.Ư�� ��  ��������");
			System.out.println("7.��� �������� ����");
			System.out.println("8.������ �������� ����");
			System.out.println("9.����");
			System.out.print("�޴�: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:addList();break;
			case 2:addAtZero();break;
			case 3:printAll();break;
			case 4:searchMusic();break;
			case 5:removeMusic();break;
			case 6:setMusic();break;
			case 7:ascTitle();break;
			case 8:descSinger();break;
			case 9:System.out.println("���α׷��� �����մϴ�.");return;
			default: System.out.println("�߸� �Է� �Ͽ����ϴ�. �ٽ� �Է����ּ���");

			}
		}
	}
	public void addList() {
		System.out.println("***������ ��ġ�� �� �߰�****");
		sc.nextLine();
		System.out.print("���: ");
		String title=sc.nextLine();
		System.out.print("������: ");
		String singer=sc.nextLine();
		
		Music music=new Music(title,singer);
		int reusult=mc.addList(music);
		if(music!=null) {
			System.out.println("�߰� ����");
		}else {
			System.out.println("�߰� ����");
		}
		
	}
	public void addAtZero() {
		System.out.println("***ù ��ġ�� �� �߰�****");
		sc.nextLine();
		System.out.print("���: ");
		String title=sc.nextLine();
		System.out.print("������: ");
		String singer=sc.nextLine();
		Music music=new Music(title,singer);
		mc.addAtZero(music);
		if(music!=null) {
			System.out.println("�߰� ����");
		}else {
			System.out.println("�߰� ����");
		}
		
	}
	public void printAll() {
		System.out.println("***��ü �� ��� ���****");

		System.out.println(mc.printAll());
	}
	public void searchMusic() {
		sc.nextLine();
		System.out.println("***Ư�� �� �˻�***");
		System.out.print("���: ");
		String title=sc.nextLine();
		if(mc.searchMusic(title)==null) {
			System.out.println("��ȯ ���� �����ϴ�.");
		}else {
			System.out.println((mc.searchMusic(title).getSinger())+" - "+(mc.searchMusic(title).getTitle()));
		}
		
	}
	public void removeMusic() {
		sc.nextLine();
		System.out.println("***Ư�� �� ����***");
		System.out.print("���: ");
		String title=sc.nextLine();
		Music m=mc.removeMusic(title);
		if(m==null) {
			System.out.println("������ ���� �����ϴ�.");
		}else {
			System.out.println(m.getSinger()+" - "+m.getTitle()+"��(��) �����߽��ϴ�.");
		}

	}
		

	public void setMusic() {
		System.out.println("***Ư�� �� ���� ����***");
		sc.nextLine();
		System.out.print("�˻��� ���: ");
		String title=sc.nextLine();
		System.out.print("���: ");
		String newtitle=sc.nextLine();
		System.out.print("������: ");
		String newsinger=sc.nextLine(); 
		
		Music music=new Music(newtitle,newsinger);
		Music m=mc.setMusic(title, music);
		if(m==null) {
			System.out.println("������ ���� �����ϴ�.");
		}else {
			System.out.println(m.getSinger()+" - "+title+"�� ���� ����Ǿ����ϴ�.");

		}
		
	}
	public void ascTitle() {
		if(mc.ascTitle()==1) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
	}
	public void descSinger() {
		if(mc.descSinger()==1) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
	}
	
}
