package com.method2.controller;


import java.util.Scanner;

import com.method2.model.vo.Student;

public class StudentController {
	public Student insertStudent() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("�г�: ");
		int grade=sc.nextInt();
		System.out.print("����: ");
		int kor=sc.nextInt();
		System.out.print("����: ");
		int math=sc.nextInt();
		System.out.print("����: ");
		int eng=sc.nextInt();
		
		Student s=new Student(name,grade,kor,math,eng,(kor+math+eng),(kor+math+eng)/3.0);
		return s;
	}

}
