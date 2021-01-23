package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	Scanner sc=new Scanner(System.in);
	CircleController cc=new CircleController();
	RectangleController rc=new RectangleController();
	
	public void mainMenu() {
		menu:
		while(true) {
			System.out.println("=====�޴�=====");
			System.out.println("1. ��");
			System.out.println("2. �簢��");
			System.out.println("9. ������");			
			System.out.print("�޴� ��ȣ: ");
			int cho=sc.nextInt();
			switch(cho) {
			case 1:circleMenu();break;
			case 2:rectangleMenu();break;
			case 9:System.out.println("�����մϴ�");break menu;
			default:System.out.println("�ٽ� �Է����ּ���");continue;
			}
			
		}
		
	}
	public void circleMenu() {
		while(true) {
			System.out.println("=====�� �޴�=====");
			System.out.println("1. �� �ѷ�");
			System.out.println("2. �� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ: ");
			int cho=sc.nextInt();
			switch(cho) {
				case 1:calcCircum();break;
				case 2:calcCircleArea();break;
				case 9:;return;
				default:;break;
			}
		}
	}
		
	public void rectangleMenu() {
		while(true) {
			System.out.println("=====�簢�� �޴�=====");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ: ");
			int cho=sc.nextInt();
			switch(cho) {
			case 1:calcPerimeter();break;
			case 2:calcRectArea();break;
			case 9:;return;
			default:;break;
			}
		}
	}
	public void calcCircum() {
		System.out.print("x ��ǥ: ");
		int x=sc.nextInt();
		System.out.print("y ��ǥ: ");
		int y=sc.nextInt();
		System.out.print("������: ");
		int radius=sc.nextInt();
		String result=cc.calcCircum(x, y, radius);
		System.out.println(result);
	}
	public void calcCircleArea() {
		System.out.print("x ��ǥ: ");
		int x=sc.nextInt();
		System.out.print("y ��ǥ: ");
		int y=sc.nextInt();
		System.out.print("������: ");
		int radius=sc.nextInt();
		String result=cc.calcArea(x, y, radius);
		System.out.println(result);
	}
	public void calcPerimeter() {
		System.out.print("x ��ǥ: ");
		int x=sc.nextInt();
		System.out.print("y ��ǥ: ");
		int y=sc.nextInt();
		System.out.print("����: ");
		int height=sc.nextInt();
		System.out.print("�ʺ�: ");
		int width=sc.nextInt();
		String result=rc.calcPerimeter(x, y, height, width);
		System.out.println(result);
	}
	public void calcRectArea() {
		System.out.print("x ��ǥ: ");
		int x=sc.nextInt();
		System.out.print("y ��ǥ: ");
		int y=sc.nextInt();
		System.out.print("����: ");
		int height=sc.nextInt();
		System.out.print("�ʺ�: ");
		int width=sc.nextInt();
		String result=rc.calcArea(x, y, height, width);
		System.out.println(result);
	}
}
