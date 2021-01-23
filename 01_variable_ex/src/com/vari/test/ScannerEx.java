package com.vari.test;

import java.util.Scanner;

public class ScannerEx {
	//사용자한테 이름,나이,주소,전화번호(문자), 키를 입력받아
	//출력하는 프로그램 작성
	//프로젝트 생성해서 해볼것!
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("님 이름: ");
		//String name=sc.next(); //이름은 문자열
		String name=sc.nextLine();
		System.out.print("님 나이: ");
		int age=sc.nextInt();//나이는 정수
		
		sc.nextLine(); //버퍼를 비워줌
		//nextLine()값을 받기전에
		//nextInt(),next(),nextDouble()로 이전에 값을 받아왔으면
		//입력버퍼를 nextLine() 비워주고 사용을 해야한다.

		System.out.print("님 주소: ");
		String address=sc.nextLine();//주소 문자열
				
		System.out.print("님 전화번호: ");
		String phone=sc.nextLine();
		
		System.out.println("님 키: ");
		double height=sc.nextDouble();
		
		System.out.println(name+" "+age+" "+address+" "+phone+" "+height);
		
		
	}
}
