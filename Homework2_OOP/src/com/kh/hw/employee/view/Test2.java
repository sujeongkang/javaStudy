package com.kh.hw.employee.view;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		String[] colors = {"red", "yellow", "green", "blue", "orange"};
		
		Scanner sc=new Scanner(System.in);
//키보드 입력용 객체 생성 구문 작성
		System.out.print("검색할 색깔 : ");
		
		String searchColor = sc.nextLine(); //키보드로 색상문자열을 입력받음
		
		for(int i = 0; i < colors.length ; i++){ //배열 안에 값들을 배교할 수 있도록 루프 실행
			
			if( colors[i].equals(searchColor) ){ //입력값과 배열 색상값이 일치하는지 확인
				
				System.out.println(searchColor + "색은 목록에 존재합니다.");
				
				break; //일치하는 값이 있으면 루프 종료함.
				
			}
			
		}
	}
}
