package com.kh.hw.shape.view;
import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;


public class ShapeMenu {
	
	Scanner sc=new Scanner(System.in);
	SquareController src=new SquareController();
	TriangleController tc=new TriangleController();
	
	
	public void inputMenu() {	
	menu:	
	while(true){
		
		System.out.println("======도형프로그램=====");
		System.out.println("3.삼각형");
		System.out.println("4.사각형");
		System.out.println("9.프로그램종료");
		System.out.print("메뉴번호: ");
		int menuNum=sc.nextInt();
		switch(menuNum) {
		case 3:	triangleMenu();break;
		case 4:	SquareMenu();break;
		case 9: System.out.println("프로그램 종료합니다."); break menu;
		default: System.out.println("잘못된 번호입니다. 다시 입력하세요"); continue;
			}
		}
	}
	
	public void triangleMenu() {
		
		while(true) {
			
			System.out.println("======삼각형=====");
			System.out.println("1.삼각형 면적");
			System.out.println("2.삼각형 색칠");
			System.out.println("3.삼각형 정보");
			System.out.println("9.메인으로");
			System.out.print("메뉴번호: ");
			int menuNum=sc.nextInt();
			String type="삼각형";
			switch(menuNum) {
			case 1:inputSize(type,1);break;		
			case 2: inputSize(type,2);break;
			case 3: printInformation("삼각형");break;
			case 9: System.out.println("메인으로 돌아갑니다");
					inputMenu();break;
			default: System.out.println("잘못된 번호입니다. 다시 입력하세요");continue;
			}
		}
		
		
	}
	
	public void SquareMenu() {
		
		while(true) {
		System.out.println("======삼각형=====");
		System.out.println("1.사각형 둘레");
		System.out.println("2.사각형 면적");
		System.out.println("3.사각형 색칠");
		System.out.println("4.사각형 정보");
		System.out.println("9.메인으로");
		System.out.print("메뉴번호: ");
		int menuNum=sc.nextInt();
		String type="사각형";
		switch(menuNum) {
			case 1:inputSize(type,1);break;		
			case 2: inputSize(type,2);break;
			case 3: inputSize(type,3);break;
			case 4: printInformation("사각형");break;
			case 9: System.out.println("메인으로 돌아갑니다");
					inputMenu();break;
			default: System.out.println("잘못된 번호입니다. 다시 입력하세요");continue;
			}
		}
	}
	
	public void inputSize(String type, int menuNum) {
		double height=0;
		double width=0;
		String color="";
		if(type== "삼각형") {
			switch (menuNum) {
				case 1:
					System.out.print("높이: ");
					height = sc.nextDouble();
					System.out.print("너비: ");
					width = sc.nextDouble();
					System.out.println(type+" 면적: "+tc.calcArea(height, width));break;
				case 2:
					System.out.print("색깔을 입력하세요: ");
					sc.nextLine();
					color = sc.nextLine();
					tc.paintColor(color);
					System.out.println("색이 수정되었습니다.");
			}
		}else if(type== "사각형") {
			switch(menuNum) {
				case 1:
					System.out.print("높이: ");
					height = sc.nextDouble();
					System.out.print("너비: ");
					width = sc.nextDouble();
					System.out.println(type+" 둘레: "+src.calcPerimeter(height, width));break;
				case 2:
					System.out.print("높이: ");
					height = sc.nextDouble();
					System.out.print("너비: ");
					width = sc.nextDouble();
					System.out.println(type+" 면적: "+src.calcArea(height, width));break;
				case 3:
					System.out.print("색깔을 입력하세요: ");
					sc.nextLine();
					color = sc.nextLine();
					src.paintColor(color);
					System.out.println("색이 수정되었습니다.");
			}
		}
		
		
	}
	
	public void printInformation(String type) {
		//매개변수에 따라 삼각형/사각형의 정보를 출력하는 메소드
		String result="";
		if(type=="삼각형") {
			result=type+tc.print();
		}else if(type=="사각형") {
			result=type+src.print();
		}
		System.out.println(result);
	}
	
}
