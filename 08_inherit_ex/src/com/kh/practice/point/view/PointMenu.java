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
			System.out.println("=====메뉴=====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");			
			System.out.print("메뉴 번호: ");
			int cho=sc.nextInt();
			switch(cho) {
			case 1:circleMenu();break;
			case 2:rectangleMenu();break;
			case 9:System.out.println("종료합니다");break menu;
			default:System.out.println("다시 입력해주세요");continue;
			}
			
		}
		
	}
	public void circleMenu() {
		while(true) {
			System.out.println("=====원 메뉴=====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호: ");
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
			System.out.println("=====사각형 메뉴=====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호: ");
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
		System.out.print("x 좌표: ");
		int x=sc.nextInt();
		System.out.print("y 좌표: ");
		int y=sc.nextInt();
		System.out.print("반지름: ");
		int radius=sc.nextInt();
		String result=cc.calcCircum(x, y, radius);
		System.out.println(result);
	}
	public void calcCircleArea() {
		System.out.print("x 좌표: ");
		int x=sc.nextInt();
		System.out.print("y 좌표: ");
		int y=sc.nextInt();
		System.out.print("반지름: ");
		int radius=sc.nextInt();
		String result=cc.calcArea(x, y, radius);
		System.out.println(result);
	}
	public void calcPerimeter() {
		System.out.print("x 좌표: ");
		int x=sc.nextInt();
		System.out.print("y 좌표: ");
		int y=sc.nextInt();
		System.out.print("높이: ");
		int height=sc.nextInt();
		System.out.print("너비: ");
		int width=sc.nextInt();
		String result=rc.calcPerimeter(x, y, height, width);
		System.out.println(result);
	}
	public void calcRectArea() {
		System.out.print("x 좌표: ");
		int x=sc.nextInt();
		System.out.print("y 좌표: ");
		int y=sc.nextInt();
		System.out.print("높이: ");
		int height=sc.nextInt();
		System.out.print("너비: ");
		int width=sc.nextInt();
		String result=rc.calcArea(x, y, height, width);
		System.out.println(result);
	}
}
