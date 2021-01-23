package com.objarr.main;

import com.objarr.model.vo.Nation;

public class Main {
	public static void main(String[] args) {
		//객체배열 사용하기
		//객체배열 선언하기
		Nation[] nations;
		//배열할당->저장공간확보
		nations=new Nation[3];
		
		//착각하면 안되요!
		//System.out.println(nations[0].getName());//절대 안됨! 에러
		//ava.lang.NullPointerException
		//아래에서 객체를넣기 전, 위에서 공간만들고 빈공간임, null라 참조 불가! 인덱스마다 주소값 넣는 게 필요
		
		//할당한다음 꼭 객체를 넣어야 접근가능!!!!!!!

		//배열에 객체 넣기!
		//index이용하여 객체 넣기!
		nations[0]=new Nation("한국",6000,"한국어",100,"무궁화");
		//nations[0]이 하나의 객체랑 똑같음
		nations[1]=new Nation("미국",30000,"영어",10000,"장미");
		nations[2]=new Nation("중국",150000,"중국말",1000,"매화");
		//Nation이 자료형이 됨
		Nation n=new Nation("한국",6000,"한국어",100,"무궁화"); //위에 nations[0]이랑 n이랑 같음.
		//위에 nations[0]은 하나의 변수명과 같다.
		n.getName();
		
		//배열에 저장된 객체 불러오ss기
		System.out.println(nations[0].getName());
		
		
		//for문을 이용한 초기화 방법
		Nation[] nations2=new Nation[10];
		for(int i=0;i<nations2.length;i++) {
			nations2[i]=new Nation(); //default값으로 초기화
		}
		for(int i=0;i<nations2.length;i++) {
			System.out.println(nations2[i]);
		}
		
		
		//객체 배열은 foreach문 사용이 가능한가?ㅇ
		for(Nation na: nations) {
			System.out.println(na.getName());
		}
		
		//객체 배열 선언과 동시에 초기화
		nations2=new Nation[] {new Nation(),new Nation()};
		Nation[] na= {new Nation(), new Nation(), new Nation()};
		
		
		
		
		
		
	}
	
	
}







