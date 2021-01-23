package com.kh.hw.employee.view;
import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;
import com.kh.hw.employee.model.vo.Employee;

public class EmployeeMenu {
	Scanner sc=new Scanner(System.in);
	EmployeeController ec=new EmployeeController();
	
	
	public EmployeeMenu() {
		int menuNum=0;
		main:
		while(true) {
		System.out.println("1.���  �߰�");
		System.out.println("2.��� ����");
		System.out.println("3.��� ����");
		System.out.println("4.��� ���");
		System.out.println("9.���α׷� ����");
		System.out.print("�޴� ��ȣ�� ��������: ");
		menuNum=sc.nextInt();
		switch(menuNum) {
		case 1: insertEmp();break;
		case 2: updateEmp();break;
		case 3: deleteEmp();break;
		case 4: printEmp();break;
		case 9: System.out.println("���α׷��� ����Ǿ����ϴ�");break main;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");continue;
		}
	}
		// �޴� �ȳ��� �ǰ� �޴� ��ȣ�� ���� ���� Ŭ������ �ִ� �޼ҵ� ����
		// ��ȣ�� �߸� �Է������� �߸� �Է��ߴٴ� �ȳ��� ��
	}
	
	public void insertEmp() {
		
		System.out.print("���  ��ȣ:");
		int empNo=sc.nextInt();
		sc.nextLine();
		System.out.print("��� �̸�: ");
		String name=sc.nextLine();
		System.out.print("��� ����: ");
		char gender=sc.nextLine().charAt(0);
		System.out.print("��ȭ ��ȣ: ");
		String phone=sc.nextLine();
		
		System.out.print("�߰������� ���Է��Ͻðڽ��ϱ�(y/n): ");
		char choice=sc.nextLine().charAt(0);
		
		if(choice=='y'||choice=='Y') {
			
			System.out.print("��� �μ�: ");
			String dept=sc.nextLine();
			System.out.print("��� ����: ");
			int salary=sc.nextInt();
			System.out.print("���ʽ� ��: ");
			double bonus=sc.nextDouble();
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
			
		}else if(choice=='n'||choice=='N') {
			ec.add(empNo, name, gender, phone);
			
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		// ��� ��ȣ, ��� �̸�, ��� ����, ��ȭ ��ȣ�� �⺻������ �ް�
		// �߰����� ������ �� �Է��� ������ ��� ��
		// �Է��ϰڴٰ� �ϸ� ����μ�, ��� ����, ���ʽ� ���� �߰��� �� �ް�
		// ��� �����͸� EmployeeController�� add�޼ҵ� ���ڷ� ����
		// �߰������� �Է����� �ʰڴٰ� �ϸ� �⺻������ add�޼ҵ� ���ڷ� ����
		
	}
	

	public void updateEmp() {
		System.out.println("���� �ֽ��� ��� ������ �����ϰ� �˴ϴ�.\n����� � ������ �����Ͻðڽ��ϱ�?");
		System.out.println("1.��ȭ ��ȣ");
		System.out.println("2.��� ����");
		System.out.println("3.���ʽ��� ");
		System.out.println("9.���ư���");
		System.out.print("�޴� ��ȣ�� ��������: ");
		int menuNum=sc.nextInt();
		
		switch(menuNum) {
		case 1:
			System.out.print("������ ��ȭ��ȣ:");
			sc.nextLine();
			String phone=sc.nextLine();
			ec.modify(phone);break;
		case 2:
			System.out.print("������ �������:");
			int salary=sc.nextInt();
			ec.modify(salary);break;
		case 3:
			System.out.print("������ ���ʽ���:");
			double bonus=sc.nextDouble();
			ec.modify(bonus);break;
		case 9: ;return;
			
		}
		
		// ��� ���� ������ ���� �޴� �ȳ��� ��µǰ�
		// ����ڰ� �����ϰ� ���� ���뿡 ���� ��ȣ�� �Է�
		// �Է��� �޴��� �´� �ش� �����͸� EmployeeController���� ����

	}
	

	public void deleteEmp() {
		System.out.print("���� �����Ͻðڽ��ϱ�?(y/n): ");
		sc.nextLine();
		char choice=sc.nextLine().charAt(0);
		if(choice=='y') {
			Employee e=ec.remove();
			if(e==null) {
				System.out.println("������ ������ �����Ͽ����ϴ�.");
			}else {
				System.out.println("������ ������ �����Ͽ����ϴ�.");
			}
		}
		
		// ���� ������ ������ ��� �� �����ϰڴٰ� �ϸ�
		// EmployeeController�� remove()�޼ҵ带 ȣ���Ͽ� ��ȯ ���� ����
		// ������ ������ �����Ͽ����� �����Ͽ����� ���
	}
	public void printEmp() {
		// ��������� �ִٸ� ������� ���, ���ٸ� ����� �����Ͱ� �����ϴ١����
		String result=ec.inform();
		
		if(result==null) {
			System.out.println("��� �����Ͱ� �����ϴ�.");
		}
		
	}
	
	
}
