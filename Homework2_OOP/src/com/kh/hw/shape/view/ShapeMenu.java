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
		
		System.out.println("======�������α׷�=====");
		System.out.println("3.�ﰢ��");
		System.out.println("4.�簢��");
		System.out.println("9.���α׷�����");
		System.out.print("�޴���ȣ: ");
		int menuNum=sc.nextInt();
		switch(menuNum) {
		case 3:	triangleMenu();break;
		case 4:	SquareMenu();break;
		case 9: System.out.println("���α׷� �����մϴ�."); break menu;
		default: System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���"); continue;
			}
		}
	}
	
	public void triangleMenu() {
		
		while(true) {
			
			System.out.println("======�ﰢ��=====");
			System.out.println("1.�ﰢ�� ����");
			System.out.println("2.�ﰢ�� ��ĥ");
			System.out.println("3.�ﰢ�� ����");
			System.out.println("9.��������");
			System.out.print("�޴���ȣ: ");
			int menuNum=sc.nextInt();
			String type="�ﰢ��";
			switch(menuNum) {
			case 1:inputSize(type,1);break;		
			case 2: inputSize(type,2);break;
			case 3: printInformation("�ﰢ��");break;
			case 9: System.out.println("�������� ���ư��ϴ�");
					inputMenu();break;
			default: System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���");continue;
			}
		}
		
		
	}
	
	public void SquareMenu() {
		
		while(true) {
		System.out.println("======�ﰢ��=====");
		System.out.println("1.�簢�� �ѷ�");
		System.out.println("2.�簢�� ����");
		System.out.println("3.�簢�� ��ĥ");
		System.out.println("4.�簢�� ����");
		System.out.println("9.��������");
		System.out.print("�޴���ȣ: ");
		int menuNum=sc.nextInt();
		String type="�簢��";
		switch(menuNum) {
			case 1:inputSize(type,1);break;		
			case 2: inputSize(type,2);break;
			case 3: inputSize(type,3);break;
			case 4: printInformation("�簢��");break;
			case 9: System.out.println("�������� ���ư��ϴ�");
					inputMenu();break;
			default: System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���");continue;
			}
		}
	}
	
	public void inputSize(String type, int menuNum) {
		double height=0;
		double width=0;
		String color="";
		if(type== "�ﰢ��") {
			switch (menuNum) {
				case 1:
					System.out.print("����: ");
					height = sc.nextDouble();
					System.out.print("�ʺ�: ");
					width = sc.nextDouble();
					System.out.println(type+" ����: "+tc.calcArea(height, width));break;
				case 2:
					System.out.print("������ �Է��ϼ���: ");
					sc.nextLine();
					color = sc.nextLine();
					tc.paintColor(color);
					System.out.println("���� �����Ǿ����ϴ�.");
			}
		}else if(type== "�簢��") {
			switch(menuNum) {
				case 1:
					System.out.print("����: ");
					height = sc.nextDouble();
					System.out.print("�ʺ�: ");
					width = sc.nextDouble();
					System.out.println(type+" �ѷ�: "+src.calcPerimeter(height, width));break;
				case 2:
					System.out.print("����: ");
					height = sc.nextDouble();
					System.out.print("�ʺ�: ");
					width = sc.nextDouble();
					System.out.println(type+" ����: "+src.calcArea(height, width));break;
				case 3:
					System.out.print("������ �Է��ϼ���: ");
					sc.nextLine();
					color = sc.nextLine();
					src.paintColor(color);
					System.out.println("���� �����Ǿ����ϴ�.");
			}
		}
		
		
	}
	
	public void printInformation(String type) {
		//�Ű������� ���� �ﰢ��/�簢���� ������ ����ϴ� �޼ҵ�
		String result="";
		if(type=="�ﰢ��") {
			result=type+tc.print();
		}else if(type=="�簢��") {
			result=type+src.print();
		}
		System.out.println(result);
	}
	
}
