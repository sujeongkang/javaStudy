package com.oop.run;

import java.util.Scanner;

import com.oop.model.dto.Employee;

public class EmpTest {
	
	
	public static void mainMenu() {
		menu:
			while(true) {
			Employee emp=new Employee();
			
			System.out.println("=====��� ���� ���� ���α׷�=====");
			System.out.println("1. �� ��� ���� �Է�");
			System.out.println("2. ��� ���� ����");
			System.out.println("3. ��� ���� ����");
			System.out.println("4. ��� ���� ���");
			System.out.println("9. ������");
			System.out.print("�޴�: ");
			Scanner sc=new Scanner(System.in);
			int cho=sc.nextInt();
			switch(cho) {
			case 1:emp.empInput();break;
			case 2:modifyMenu(emp);;break;
			case 3:empDelete(emp);break;
			case 4:emp.empOutput(emp);break;
			case 9:;break menu;
			
			}
		}
	}
	public static void modifyMenu(Employee emp){
		
		System.out.println("=====��� ���� ���� �޴�====");
		System.out.println("1. �̸�����");
		System.out.println("2. �޿�����");
		System.out.println("3. �μ�����");
		System.out.println("4. ���޺���");
		System.out.println("5. ���� �޴��� �̵�");
		System.out.print("�޴�: ");
		Scanner sc=new Scanner(System.in);
		int cho=sc.nextInt();
		switch(cho) {
		case 1:
			System.out.print("�̸�: ");
			String newName=sc.nextLine();
			emp.setEmpName(newName);break;
		case 2:
			System.out.print("�޿�: ");
			int salary=sc.nextInt();
			emp.setSalary(salary);;break;
		case 3:
			System.out.print("�μ�: ");
			String dept=sc.nextLine();
			emp.setDept(dept);break;
		case 4:
			System.out.print("����: ");
			String job=sc.nextLine();
			emp.setJob(job);break;
		case 9:;return;
		
		
		}
	}
	public static void empDelete(Employee emp) {
			emp=null;
	}
}
