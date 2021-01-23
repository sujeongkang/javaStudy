package com.test.inputout;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		//키보드에 입력된 값을 가져오기위해
		//Scanner객체를 이용
		//1.import java.util.Scanner를 추가
		//2.Scanner생성 -->Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		//3.Scanner가 제공하는 기능(메소드)을 이용해서 값을 받아옴
		//nextInt():정수, nextFloat()/nextDouble():실수,
		//next()/nextLine():문자열
		//System.out.println(sc.nextInt());
		
		System.out.print("당신의 주소: ");
		String address=sc.nextLine();
		System.out.println("주소: "+address);
		
		System.out.print("나이를 입력: ");
		int age=sc.nextInt(); //입력받은 값을 변수에 저장
		System.out.println("당신이 입력한 나이는: "+age); //저장된 변수의 값을 사용
		System.out.print("문자입력: ");
		String msg=sc.next(); 
		//띄어쓰기를 기준으로 앞에 글자만 가져옴.
		//저녁 맛있게 먹었어요? 
		//띄어쓰기까지 모든 문자를 받아오려면 sc.nextLine();
		sc.nextLine();//버퍼를 비워주는 역할!
		System.out.println("당신이 입력한 문자:"+msg);
		System.out.print("당신의 키: ");
		double height=sc.nextDouble();
		System.out.println("당신의 키는:"+height+"cm");
		
		//sc.nextChar();//오류
		//입력받을 수 있는 자료형?
		//int, double, float, 문자열, lnog,
		sc.nextLine();//위에 nextDouble()값 정리
		
		//char형으로 입력받기!
		//문자열로 받으다음 char형으로 잘라 가져옴.
		System.out.println("성별: "); //남자
		//글자 위치에 있는 한글자만 가져옴.
		char gender=sc.nextLine().charAt(0);//남
		System.out.println(gender);
		String key="하호히후";
		char ch1=key.charAt(0); //하
		char ch2=key.charAt(1); //호
	}

}
