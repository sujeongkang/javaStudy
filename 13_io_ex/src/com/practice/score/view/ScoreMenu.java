package com.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.practice.score.controller.ScoreController;


public class ScoreMenu {
	Scanner sc=new Scanner(System.in);
	ScoreController scr=new ScoreController();
	
	public void mainMenu() {
		while(true) {
			
			System.out.println("1.성적저장");
			System.out.println("2.성적출력");
			System.out.println("9.끝내기");
			System.out.print("선택:");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:saveScore();break;
			case 2:readScaore();break;
			case 9:System.out.println("프로그램을 종료합니다.");return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");continue;
			}
		}
	}
	public void saveScore() {
		int num=0;
		while(true) {
			System.out.println((num+1)+"번째 학생 정보기록");
			sc.nextLine();
			System.out.print("이름: ");
			String name=sc.nextLine();
			System.out.print("국어 점수: ");
			int kor=sc.nextInt();
			System.out.print("영어 점수: ");
			int eng=sc.nextInt();
			System.out.print("수학 점수: ");
			int math=sc.nextInt();
			int sum=kor+eng+math;
			double avg=sum/3.0;
			scr.saveScore(name, kor, eng, math, sum, avg);
			num++;
			
			System.out.println("그만 입력 하시려면 N또는 n 입력, 계속하시려면 아무키나 입력하세요.");
			char yn=sc.next().charAt(0);
			if(yn=='n'||yn=='N') {
				return;
			}
		}
		
	}
	public void readScaore() {
		int count=0;
		int sumAll=0;
		double avgAll=0.0;
		
		System.out.println("이름 \t 국어 \t 영어\t 수학\t 총점\t 평균");
		
		try (DataInputStream dis=scr.readScore()){
			while(true) {
				String name=dis.readUTF();
				int kor=dis.readInt();
				int eng=dis.readInt();
				int math=dis.readInt();
				int sum=dis.readInt();
				double avg=dis.readDouble();
				count++;
				sumAll+=sum;
				avgAll=sumAll/count/3.0;
				System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg);	
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("읽은 횟수"+count+",전체합계:"+sumAll+",전체평균:"+avgAll);
		} catch (IOException e){
			e.printStackTrace();
		}
		System.out.println("읽은 횟수\t 전체합계\t 전체평균");
		System.out.println(count+"\t"+sumAll+"\t"+avgAll);
		
	}
		
}
	

