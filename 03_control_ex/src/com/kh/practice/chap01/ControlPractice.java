package com.kh.practice.chap01;
import java.util.Scanner;
public class ControlPractice {
	Scanner sc=new Scanner(System.in);
	public void practice1() {
		//아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를, 
		//종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		//ex. 1. 입력 	2. 수정	 3. 조회 		4. 삭제	7. 종료
		//메뉴 번호를 입력하세요 : 3
		//조회 메뉴입니다.
		Scanner sc=new Scanner(System.in);
		System.out.println("===메뉴===");
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");
		System.out.print("메뉴 번호를 입력하세요:");
		int menu=sc.nextInt();
		String mi="메뉴입니다.";
		switch(menu){
			case 1 : System.out.println("입력"+mi);break;
			case 2 : System.out.println("수정"+mi);break;
			case 3 : System.out.println("조회"+mi);break;
			case 4 : System.out.println("삭제"+mi);break;
			case 7 : System.out.println("프로그램이 종료됩니다.");break;
			default : System.out.println("없는 메뉴입니다.");
		}
	}
	public void practice2() {
		//키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고 
		//짝수가 아니면 “홀수다“를 출력하세요. 양수가 아니면 “양수만 입력해주세요.”를 출력하세요.

		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 한개 입력하세요: ");
		int i=sc.nextInt();
		if(i>0) {
			if(i%2==0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}
		else {
			System.out.println("양수만 입력해주세요");
		}
	}
	public void practice3() {
		//국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 
		//합계와 평균을 계산하고 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요. 
		//(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우) 
		//합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고 
		//불합격인 경우에는 “불합격입니다.”를 출력하세요.

		Scanner sc=new Scanner(System.in);
		System.out.print("국어점수: ");
		int kor=sc.nextInt();
		System.out.print("수학점수: ");
		int math=sc.nextInt();
		System.out.print("영어점수: ");
		int eng=sc.nextInt();
		int total=kor+math+eng;
		double avg=total/3.0;
		if(kor>=40&&math>=40&&eng>=40&&avg>=60) {
				System.out.printf("국어: %d\n수학: %d\n영어: %d\n합계: %d\n평균: %.1f\n",kor,math,eng,total,avg);
				System.out.println("축하합니다, 합격입니다!");
		}else {
				System.out.println("불합격입니다.");
		}
		
	}
	public void practice4() {
		// if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요
		Scanner sc=new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력: ");
		int month=sc.nextInt();
		switch(month){
		case 12: case 1: case 2: System.out.println(month+"월은 겨울 입니다.");break;
		case 3: case 4: case 5: System.out.println(month+"월은 봄 입니다.");break;
		case 6: case 7: case 8: System.out.println(month+"월은 여름 입니다.");break;
		case 9: case 10: case 11: System.out.println(month+"월은 가을 입니다.");break;
		default : System.out.println(month+"월은 잘못 입력된 달입니다.");
		}		
	}
	public void practice5() {
		//아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요. 
		//로그인 성공 시 “로그인 성공”, 
		//아이디가 틀렸을 시 “아이디가 틀렸습니다.“, 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디: ");
		String id=sc.nextLine();
		System.out.print("비밀번호: ");
		String pw=sc.nextLine();
		String pass1="myid";
		String pass2="1234";
		if (id.equals(pass1)&&pw.equals(pass2)) {
			System.out.println("로그인 성공");
		}else if(!id.equals(pass1)&&pw.equals(pass2)){
			System.out.println("아이디가 틀렸습니다.");
		}else if(id.equals(pass1)&&!pw.equals(pass2)){
			System.out.println("비밀번호가 틀렸습니다.");
		}else {
			System.out.println("아이디와 비밀번호를 다시 확인해주세요");
		}
	}
	public void practice6() {
		//사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요. 
		//단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		//회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고 비회원은 게시글 조회만 가능합니다.
		Scanner sc=new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급: ");
		String level=sc.nextLine();
		if(level.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성,게시글 조회, 댓글 작성 ");
		}else if(level.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}else if(level.equals("비회원")) {
			System.out.println("게시글 조회");
		}
	}
	
	public void practice7() {
		//키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 
		//계산 결과에 따라 저체중/정상체중/과체중/비만을 출력하세요.
		//BMI = 몸무게 / (키(m) * 키(m)) 
		//BMI가 18.5미만일 경우 저체중 /  18.5이상 23미만일 경우 정상체중 BMI가 23이상 25미만일 경우 과체중 
		//  25이상 30미만일 경우 비만 BMI가 30이상일 경우 고도 비만

		Scanner sc=new Scanner(System.in);
		System.out.print("키(m)를 입력해주세요: ");
		double height=sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요: ");
		double weight=sc.nextDouble();
		double bmi=weight/(height*height);
		String result ="";
		if(bmi>30) {
			result="과체중";
		}else if(bmi>=25) {
			result="비만";
		}else if(bmi>=23) {
			result="과체중";
		}else if(bmi>18.5) {
			result="정상체중";
		}else {
			result="저체중";
		}
		System.out.println("BMI 지수:"+bmi);
		System.out.println(result);	
	}
	public void practice8() {
		//키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요. 
		//(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시 “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)

		Scanner sc=new Scanner(System.in);
		System.out.print("피연산자1 입력: ");
		int i1=sc.nextInt();
		System.out.print("피연산자2 입력: ");
		int i2=sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/): ");
		sc.nextLine();
		char oper=sc.nextLine().charAt(0);
		if(i1>0&&i2>0) {
			switch(oper) {
			case '+':System.out.printf("%d %c %d = %d\n",i1,oper,i2,(i1+i2));break;
			case '-':System.out.printf("%d %c %d = %d\n",i1,oper,i2,(i1-i2));break;
			case '*':System.out.printf("%d %c %d = %d\n",i1,oper,i2,(i1*i2));break;
			case '/':System.out.printf("%d %c %d = %f\n",i1,oper,i2,((double)i1/i2));break;
			default : System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
			}
		}
	}
	public void practice9() {
		//중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요. 
		//평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고 
		//이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요. 
		//70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		Scanner sc=new Scanner(System.in);
		System.out.print("중간고사 점수: ");
		double mid=sc.nextInt()*0.2;
		System.out.print("기말고사 점수: ");
		double fin=sc.nextInt()*0.3;
		System.out.print("과제 점수: ");
		double hw=sc.nextInt()*0.3;
		System.out.print("출석 회수: ");
		double at=sc.nextInt()*1.0;
		double total=mid+fin+hw+at;
		
		System.out.println("=============결과==============");
		if(at>6) {
			System.out.println("중간고사 점수(20) : "+mid);
			System.out.println("기말고사 점수(30) : "+fin);
			System.out.println("과제 점수\t(30) : "+hw);
			System.out.println("출석 점수\t(20) : "+at);
			
			if(total>=70) {
				System.out.println("총점 : "+total+"\nPASS");
			}else {
				System.out.println("총점 : "+total+"\nFail [점수미달]");
			}
		}else {
			System.out.printf("Fail [출석 회수 부족(%d/20)]",(int)at);
		}
	}
	public void practice10() {
		Scanner sc=new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력\n2. 짝수/홀수\n3. 합격/불합격\n4. 계절\n5. 로그인\n6. 권한 확인 \n7. BMI\n8. 계산기\n9. P/F ");
		System.out.print("선택: ");
		int func=sc.nextInt();
		System.out.printf("(실습문제%d 실행)\n",func);
		switch(func) {
		case 1:new ControlPractice().practice1();break;
		case 2:new ControlPractice().practice2();break;
		case 3:new ControlPractice().practice3();break;
		case 4:new ControlPractice().practice4();break;
		case 5:new ControlPractice().practice5();break;
		case 6:new ControlPractice().practice6();break;
		case 7:new ControlPractice().practice7();break;
		case 8:new ControlPractice().practice8();break;
		case 9:new ControlPractice().practice9();
		}
	}
}
	
