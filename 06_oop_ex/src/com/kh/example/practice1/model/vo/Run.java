package com.kh.example.practice1.model.vo;

import java.util.Scanner;

import com.kh.example.practice1.run.Member;

public class Run {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Member m=new Member();
		System.out.print("변경할 이름: ");
		String name=sc.nextLine();
		m.changeName(name);
		m.printName();
	}
}
