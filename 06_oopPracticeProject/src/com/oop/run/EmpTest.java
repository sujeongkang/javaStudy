package com.oop.run;

import java.util.Scanner;

import com.oop.model.dto.Employee;

public class EmpTest {
	
	
	public static void mainMenu() {
		menu:
			while(true) {
			Employee emp=new Employee();
			
			System.out.println("=====사원 정보 관리 프로그램=====");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴: ");
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
		
		System.out.println("=====사원 정보 수정 메뉴====");
		System.out.println("1. 이름변경");
		System.out.println("2. 급여변경");
		System.out.println("3. 부서변경");
		System.out.println("4. 직급변경");
		System.out.println("5. 이전 메뉴로 이동");
		System.out.print("메뉴: ");
		Scanner sc=new Scanner(System.in);
		int cho=sc.nextInt();
		switch(cho) {
		case 1:
			System.out.print("이름: ");
			String newName=sc.nextLine();
			emp.setEmpName(newName);break;
		case 2:
			System.out.print("급여: ");
			int salary=sc.nextInt();
			emp.setSalary(salary);;break;
		case 3:
			System.out.print("부서: ");
			String dept=sc.nextLine();
			emp.setDept(dept);break;
		case 4:
			System.out.print("직급: ");
			String job=sc.nextLine();
			emp.setJob(job);break;
		case 9:;return;
		
		
		}
	}
	public static void empDelete(Employee emp) {
			emp=null;
	}
}
