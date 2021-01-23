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
			
			System.out.println("1.��������");
			System.out.println("2.�������");
			System.out.println("9.������");
			System.out.print("����:");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:saveScore();break;
			case 2:readScaore();break;
			case 9:System.out.println("���α׷��� �����մϴ�.");return;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");continue;
			}
		}
	}
	public void saveScore() {
		int num=0;
		while(true) {
			System.out.println((num+1)+"��° �л� �������");
			sc.nextLine();
			System.out.print("�̸�: ");
			String name=sc.nextLine();
			System.out.print("���� ����: ");
			int kor=sc.nextInt();
			System.out.print("���� ����: ");
			int eng=sc.nextInt();
			System.out.print("���� ����: ");
			int math=sc.nextInt();
			int sum=kor+eng+math;
			double avg=sum/3.0;
			scr.saveScore(name, kor, eng, math, sum, avg);
			num++;
			
			System.out.println("�׸� �Է� �Ͻ÷��� N�Ǵ� n �Է�, ����Ͻ÷��� �ƹ�Ű�� �Է��ϼ���.");
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
		
		System.out.println("�̸� \t ���� \t ����\t ����\t ����\t ���");
		
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
			System.out.println("���� Ƚ��"+count+",��ü�հ�:"+sumAll+",��ü���:"+avgAll);
		} catch (IOException e){
			e.printStackTrace();
		}
		System.out.println("���� Ƚ��\t ��ü�հ�\t ��ü���");
		System.out.println(count+"\t"+sumAll+"\t"+avgAll);
		
	}
		
}
	

