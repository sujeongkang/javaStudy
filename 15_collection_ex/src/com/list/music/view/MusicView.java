package com.list.music.view;

import java.util.Scanner;

import com.list.music.controller.MusicController;
import com.list.music.model.vo.Music;

public class MusicView {
	Scanner sc=new Scanner(System.in);
	private MusicController mc=new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("****메인메뉴****");
			System.out.println("1.마지막 위치에 곡 추가");
			System.out.println("2.첫 위치에 곡 추가");
			System.out.println("3.전체 곡 목록 출력");
			System.out.println("4.특정 곡 검색");
			System.out.println("5.특정 곡 삭제");
			System.out.println("6.특정 곡  정보수정");
			System.out.println("7.곡명 오름차순 정렬");
			System.out.println("8.가수명 내림차순 정렬");
			System.out.println("9.종료");
			System.out.print("메뉴: ");
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
			case 9:System.out.println("프로그램을 종료합니다.");return;
			default: System.out.println("잘못 입력 하였습니다. 다시 입력해주세요");

			}
		}
	}
	public void addList() {
		System.out.println("***마지막 위치에 곡 추가****");
		sc.nextLine();
		System.out.print("곡명: ");
		String title=sc.nextLine();
		System.out.print("가수명: ");
		String singer=sc.nextLine();
		
		Music music=new Music(title,singer);
		int reusult=mc.addList(music);
		if(music!=null) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
		
	}
	public void addAtZero() {
		System.out.println("***첫 위치에 곡 추가****");
		sc.nextLine();
		System.out.print("곡명: ");
		String title=sc.nextLine();
		System.out.print("가수명: ");
		String singer=sc.nextLine();
		Music music=new Music(title,singer);
		mc.addAtZero(music);
		if(music!=null) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
		
	}
	public void printAll() {
		System.out.println("***전체 곡 목록 출력****");

		System.out.println(mc.printAll());
	}
	public void searchMusic() {
		sc.nextLine();
		System.out.println("***특정 곡 검색***");
		System.out.print("곡명: ");
		String title=sc.nextLine();
		if(mc.searchMusic(title)==null) {
			System.out.println("반환 값이 없습니다.");
		}else {
			System.out.println((mc.searchMusic(title).getSinger())+" - "+(mc.searchMusic(title).getTitle()));
		}
		
	}
	public void removeMusic() {
		sc.nextLine();
		System.out.println("***특정 곡 삭제***");
		System.out.print("곡명: ");
		String title=sc.nextLine();
		Music m=mc.removeMusic(title);
		if(m==null) {
			System.out.println("삭제할 곡이 없습니다.");
		}else {
			System.out.println(m.getSinger()+" - "+m.getTitle()+"을(를) 삭제했습니다.");
		}

	}
		

	public void setMusic() {
		System.out.println("***특정 곡 정보 수정***");
		sc.nextLine();
		System.out.print("검색할 곡명: ");
		String title=sc.nextLine();
		System.out.print("곡명: ");
		String newtitle=sc.nextLine();
		System.out.print("가수명: ");
		String newsinger=sc.nextLine(); 
		
		Music music=new Music(newtitle,newsinger);
		Music m=mc.setMusic(title, music);
		if(m==null) {
			System.out.println("수정할 곡이 없습니다.");
		}else {
			System.out.println(m.getSinger()+" - "+title+"가 값이 변경되었습니다.");

		}
		
	}
	public void ascTitle() {
		if(mc.ascTitle()==1) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}
	}
	public void descSinger() {
		if(mc.descSinger()==1) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}
	}
	
}
