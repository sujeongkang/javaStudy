package com.condition.function;
import java.util.Scanner;
public class SwitchTest {
		public void basicSwitch() {
			Scanner sc=new Scanner(System.in);
			//switch문 사용하기
			//switch(변수){case 값: 처리로직; break; case 값: 처리로직; break;.....}
			System.out.print("당신의 연령은(10대?20대?30대?): ");
			int choice=sc.nextInt();
			switch(choice) {
				case 10 : System.out.println("혈기 왕성한 10대!");break;//리터럴로 적용. 자료형 꼭 맞출것!
				case 20 : System.out.println("20대!");break;
				case 30 : System.out.println("꿈을 이루는 30대!");break;
			}
			//프로그램 메뉴만들기
			System.out.println("=====프로그램 v0.1=====");
			System.out.println("가. 메인화면");
			System.out.println("나. 회원가입");
			System.out.println("다. 로그인");
			System.out.print("입력(가,나,다): ");
			char cho=sc.next().charAt(0);
			switch(cho){
				case '가' : System.out.println("===메인화면===");break;
				case '나' : 
					System.out.println("===회원가입화면===");
					sc.nextLine();
					System.out.print("id: ");
					String id=sc.nextLine();
					System.out.print("password: ");
					String pw=sc.nextLine();
					break;
				case '다' : 
					System.out.println("===로그인==");
					sc.nextLine();
					System.out.print("id: ");
					String id1=sc.nextLine();
					System.out.print("password: ");
					String pw1=sc.nextLine();
					if(id1.equals("admin")&&pw1.equals("1234")) {
						System.out.println("로그인 성공");
					}else {
						System.out.println("로그인 실패");
					}
					break;
			}

			//switch문은 문자열도 가능함
			System.out.println("좋아하는 과일 선택");
			sc.nextLine();
			String fruit=sc.nextLine();
			switch(fruit) {
				case "수박" : System.out.println("시원한 수박 쩝쩝");break; 
				//break문이 없을 경우 해당줄에서부터 아래것 까지 모두 실행
				case "용과" : System.out.println("안 먹어봄");break;
				case "두리안" : System.out.println("이거 진짜?");break;
				case "복숭아" : System.out.println("달콤한 복숭아!");break;
				default : System.out.println("해당하는 과일이 없습니다."); 
			}//break 생략가능
			
			//월 31일, 1,3,5,7,8,10,12  //30일,  4,6,9,11,28  // 28일, 2
			//각 월에 일자를 출력하는 로직 구성하기
			//switch문으로 
			System.out.print("몇 월인지 입력하시오:");
			int month=sc.nextInt();
			switch(month) { //switch문은 리터럴만 입력가능
				case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
					System.out.println("31일");break;
				case 4: case 6: case 9: case 11: System.out.println("30일");break;
				case 2 : System.out.println("28일");break;
				default : System.out.println("없는 달 입니다.");
			}
			
		}
}
