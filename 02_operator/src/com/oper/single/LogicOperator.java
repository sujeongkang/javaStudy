package com.oper.single;
import java.util.Scanner;
public class LogicOperator {
	public static void main(String[] args) {
		//논리연산자 활용하기
		//논리연산은 두개의 논리를 비교하는 연산자
		//주로 비교연산자를 연결하여 사용함.
		//결과값은 논리(true,false);
		//1<10<20니?? 범위를 보여줄때 -> 논리연산
		int su=10;
		System.out.println(1<su&&su<20);//su는 1~20사이에 있니?
		System.out.println(1<su||su<20);//전체 정수
		System.out.println(1<su||su>20);// 범위를 제외하고 싶을 때 많이 사용
		
		//어린이 놀이기구 탑승체크 프로그램
		//1.티켓이 있어야하고 키가 140cm이상
		boolean ticket=false;
		double height=150;
		System.out.println(ticket&&height>=140);
		
		//id가 admin이고 password가 1234인 사람
		//입력받아서 비교하기
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디: ");
		String id=sc.nextLine();
		System.out.print("패스워드: ");
		String password=sc.nextLine();
		//입력받아서 비교하기
		System.out.println(id+" "+password);
		System.out.println(id.equals("admin")
				&&password.equals("1234"));
		
		//공연장 출입관리
		//티켓이나 초대장이 있으면 입장, 아니면 입장불가
		//티켓 0000, 초대장 4444
		int ticket1=1234;
		int invate=4444;
		System.out.println(ticket1==1234||invate==4444);
		
		//논리연산은 다중으로 사용이 가능한가?
		//&& ||여러개 사용가능? 가능함
		//티켓이나 초대장이 있고 성인인 사람
		int age=19;
		System.out.println((ticket1==1234||invate==4444)&&age>19);
		//&&가 ||보다 우선순위
	}
}
