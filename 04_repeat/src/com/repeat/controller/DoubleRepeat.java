package com.repeat.controller;
import java.util.Scanner;
public class DoubleRepeat {
	Scanner sc=new Scanner(System.in);
	public void doubleRepeatTest() {
		//구구단 출력하기
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
		
		for(int i=2;i<10;i++) { //1단씩 개행하기!
			System.out.println(i+"단");
			for(int j=1;j<10;j++) {
				System.out.print(i+"X"+j+"="+(i*j)+" ");
			}
			System.out.println("");
		}
		
		
		//중첩반복문은 정렬할때도 사용
		//1 2 3 4
		//1 2 3 4
		//1 2 3 4
		//1 2 3 4
		for(int i=0;i<4;i++) { //2차원 배열과 같이 많이 쓰임.
			for(int j=1;j<=4;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		//1 2 3
		//4 5 6
		//7 8 9
		int su=1;
		for(int i=0;i<3;i++) {
			System.out.println("하");
			for(int j=0;j<3;j++) {
				System.out.print(su+++" "); //su++후위 연산  값을 '먼저'출력하고 +1;
			}
			System.out.println("");//개행
		}
		//9 8 7
		//6 5 4
		//3 2 1
		int su1=9;
		for(int i=0;i<3;i++) {  //한가지 고정하고 순차적으로 반복
			for(int j=0;j<3;j++) {
				System.out.print(su1--+" ");
			}
			System.out.println("");
		}
		//이중 반복문을 이용하여 중복값 찾기
		String msg="apple";
		//a:0
		//p:1
		//p:1
		//l:0
		//e:0
		for(int i=0;i<5;i++) {//글자수로 몇 번 반복할지 범위 잡기. 한 개 고정 시켜 놓고 비교시작<=for 중첩문
			int count=0;
			//count를 외부에 선언하지 말고 내부에 선언하여 반복되었을 때 값이 중첩되는값을 비워줌,  
			//count를 외부에 선언할 경우에는 마지막에 count 값 선언하여 값 비우기
			//System.out.println(msg.charAt(i));
			for(int j=0;j<5;j++) {
				if(i!=j&&msg.charAt(i)==msg.charAt(j)){ //i!=j i랑 j가 다를때만 카운트. 글자 자신을 뺴고 중첩개수세기.
					count++;//1증가 count=count+1
				}
				//System.out.println(i+":"+j);
				//System.out.println(msg.charAt(i)+":"+msg.charAt(j));
			}
			System.out.println(msg.charAt(i)+":"+count);
			//count=0;
		}

		
	}
		
	

	public void breakTest() {
		for(int i=0;;i++) {
			System.out.println(i);
			if(i==200) {
				break;
			}
			
		}
	//무한반복되는 메뉴를 종료시킬대
		String msg="";
		while(true) {
			System.out.print("값 입력: ");
			String temp=sc.nextLine();
			if(temp.equals("끝")) {
				break;
			}else {
				msg = temp;
			}
		}
		//중첩 반복문에서 break사용하기
		dinner:
		for(int i=2;i<10;i++) {
			//if(i%2==1) {
			//	break;//내부 for문 을 중단
			//}
			for(int j=1;j<10;j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}
			if(i%2==1) {
				break dinner;
			}
		}
		//continue
		//로직에서 continue문을 만나면 continue문 아래에 있는 로직을 실행하지 않고
		//증가연산으로 가서 실행함.
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue; //continue문 아래에 있는 로직을 실행하지 않고 증가연산으로 가서 실행함.
			}
			System.out.println(i);//0~9까지 홀수만
		}
	}
}
