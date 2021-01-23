package com.condition.function;
import java.util.Scanner;

public class ConditionTest {
	Scanner sc=new Scanner(System.in);
	public void basicIfTest() {
		//기본 if문 사용하기
		//if(조건식(결과:true/false)){ if문에 해당하는 지역 }
		//조건식이 true가 되면{}부분을 실행, 아니면 if문 무시함.
		
		//입력받은 값이 양수면 양수입니다.를 출력
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int su=sc.nextInt();
		//조건에 따라 양수입니다 출력을 할지 말지 결정할때 if문을 사용
		if(su>0) {
			System.out.println("양수입니다.");
		}
		else {
			System.out.println("음수입니다.");
		}
		//티켓번호를 입력받고 티켓번호777이면 인증되었습니다, 입장하세요. 문구출력
		System.out.print("티켓번호 입력: ");
		int ticket=sc.nextInt();
		int count=0;
		if(ticket==777/*&&age>19&&height>180*/) {
	
			System.out.println("인증되었습니다.");
			System.out.println("입장하세요.");//조건이 true이면 {}안의 실행내용이 여러줄이라도 실행 가능
			//if문의 조건식에는 모든 연산자, 변수선언/사용이 다 가능함.
			count++; //입장 수 계산. if문 밖에서 변수 선언한 것을 if안에서 사용이 가능함.
			int su1=100; //if문 안에서 변수선언가능
			int su2=200;
			int result=su1+su2; //if문이 true일때, {변수} 실행 가능
			System.out.println(result);
		}
		//if(ticket!=777) {//조건이 길때 두번 쓸 필요없이 if else문 활용 
		else { //false면 else문이 실행됨. 결과에 따라 if문 else문 둘 중 하나는 무조건 실행!
			System.out.println("인증실패되었습니다.");
			System.out.println("들어갈 수 없습니다.");
		}
		//System.out.println(su1+""+su2+""+result);//if문에 안에 선언되어있는 변수는 외부에서 실행 불가.  //if문 범위 고려할것!
		System.out.println("입장수: "+count); 
		
		//if~else문에서 else만 사용할 수 있을까? NO  //if~else 구문이 한묶음
		boolean flag=true;
		if(flag) {
			
		}
		else {
			
		}
		//홀수면 홀수, 짝수면 짝수 출력하는 프로그램 작성
		System.out.print("정수입력: ");
		int su4=sc.nextInt();
		if(su4%2==1) {
			System.out.println("홀수");
		}
		else {
			System.out.println("짝수");
		}
		
		
	}//메소드(기능)
	
	//국어, 영어,수학 점수를 입력받아 합게, 평균을 계산하고 
	//합계가 250점 이상이면 "우수생입니다"를 출력
	
	//A,B,C 연봉을 입력받고 연봉이 5000이상이면 
	//00은 "고액연봉자 입니다."를 출력
	
	//국어, 영어, 수학 점수를 정수형으로 입력바아 
	//총점과 평균을 가지고 합격여부를 처리, 세과목 점수가 각각 40점 이상이면서, 평균이 60점 이상이면 합격 아니면 불합격을 출력하기
	
	
	//국어, 영어,수학 점수를 입력받아 합게, 평균을 계산하고 
	//합계가 250점 이상이면 "우수생입니다"를 출력
	public void testA() {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어: ");
		int kor=sc.nextInt();
		System.out.print("영어: ");
		int eng=sc.nextInt();
		System.out.print("수학: ");
		int math=sc.nextInt();
		int total=kor+eng+math;
		double score=total/3.0;
		if(total>=250) {
			System.out.println("우수생입니다.");
		}
	}
	//A,B,C 연봉을 입력받고 연봉이 5000이상이면 
	//00은 "고액연봉자 입니다."를 출력
	public void testB() {
		Scanner sc=new Scanner(System.in);
		System.out.print("A의 연봉: ");
		int a=sc.nextInt();
		System.out.print("B의 연봉: ");
		int b=sc.nextInt();
		System.out.print("C의 연봉: ");
		int c=sc.nextInt();
		if(a>=5000) {
			System.out.println("A는 고액연봉자 입니다.");
		}
		if(b>=5000) {
			System.out.println("B는 고액연봉자 입니다.");
		}
		if(c>=5000) {
			System.out.println("C는 고액연봉자 입니다.");
		}
			
	}
	//국어, 영어, 수학 점수를 정수형으로 입력받아 
	//총점과 평균을 가지고 합격여부를 처리, 세과목 점수가 각각 40점 이상이면서, 평균이 60점 이상이면 합격 아니면 불합격을 출력하기
	public void testC() {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어: ");
		int kor1=sc.nextInt();
		System.out.print("영어: ");
		int eng1=sc.nextInt();
		System.out.print("수학: ");
		int math1=sc.nextInt();
		int total1=kor1+eng1+math1;
		double avg=total1/3.0;
		
		if(kor1>=40&&eng1>=40&&math1>=40&&avg>=60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
	}
	public void ifElseifTest() {  //로그인 프로그램 가능
		//if~else if~else
		//성적 등급 산출 프로그램
		//100점~90점 이상 A
		//89점~80점 이상 B
		//입력받은 점수를 기준으로 출력
		Scanner sc=new Scanner(System.in);
		System.out.print("점수입력: ");
		int jumsu=sc.nextInt();
		char grade=' ';
		//성적에 대한 등급산출
		if(jumsu>=90) {
			grade='A';
		}
		else if(jumsu>=80) { //if(jumsu<90&&jumsu>=80)와 같음.
			grade='B';
		}
		else if(jumsu>=70) { 
			grade='C';
		}
		else if(jumsu>=60) {
			grade='D';
		}
		else {
			grade='F';
		}
		System.out.println(jumsu+"의 등급은 "+grade+"입니다.");
		//만약에 else 문 없이 if문만 작성한다면.
		
		if(jumsu>=90) {
			grade='A';
		}
		if(jumsu<90&&jumsu>=80) {
			grade='B';
		}
		if(jumsu<80&&jumsu>=70) {
			grade='C';
		}
		else if(jumsu<70&&jumsu>=60) { 
			grade='D';
		}
		if(jumsu<60) {
			grade='F';
		}
		System.out.println(jumsu+"의 등급은 "+grade+"입니다.");

	}
	//계산기 만들기
	//정수 두개 입력받고 연산자(*,+,-,/)를 입력받아
	//계산결과 출력하기
	//출력 예) 입력 5
	//		입력 6
	//		연산자:+
	//		5+6=11
	/*public void test2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 1: ");
		int num1=sc.nextInt();
		System.out.print("정수 입력 2: ");
		int num2=sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/): ");
		sc.nextLine();
		char oper=sc.nextLine().charAt(0);
		double result=0;
		if(oper=='+') {
			System.out.println(num1+""+oper+num2+"="+(num1+num2)); //연산자는 ""+'+' 문자열 로 바꾸기
			//result=num1+num2;
		}
		else if(oper=='-') {
			System.out.println(num1+""+oper+num2+"="+(num1-num2));
			//result=num1+num2;
		}
		else if(oper=='*') { 
			System.out.println(num1+""+oper+num2+"="+(num1*num2));
			//result=num1*num2;
		}
		else if(oper=='/') {
			System.out.println(num1+""+oper+num2+"="+(num1/num2));
			//result=(double)num1/num2;
		} //else문 생략 가능
	}*/
	/*public void test3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 1: ");
		int num1=sc.nextInt();
		System.out.print("정수 입력 2: ");
		int num2=sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/): ");
		sc.nextLine();
		String oper=sc.nextLine();
		if(oper.equals("+")) {
			System.out.println(num1+oper+num2+"="+(num1+num2));
		}
		else if(oper.equals("-")) {
			System.out.println(num1+oper+num2+"="+(num1-num2));
		}
		else if(oper.equals("*")) {
			System.out.println(num1+oper+num2+"="+(num1*num2));
		}
		else if(oper.equals("/")) {
			System.out.println(num1+oper+num2+"="+(num1/num2));
		}
	}*/
	public void calc() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 1: ");
		int num1=sc.nextInt();
		System.out.print("정수 입력 2: ");
		int num2=sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/): ");
		sc.nextLine();
		char oper=sc.nextLine().charAt(0);
		double result=0;
		if(oper=='+') {
			result=num1+num2;
		}
		else if(oper=='-') {
			result=num1-num2;
		}
		else if(oper=='*') { 
			result=num1*num2;
		}
		else if(oper=='/') {
			result=(double)num1/num2;
		} //else문 생략 가능
		System.out.println(""+num1+oper+num2+"="+result);//result 대신 (oper=='/'?result:(int)result)가능
		//System.out.println(oper=='/'?""+num1+oper+num2+"="+result:""+num1+oper+num2+"="+(int)result);
	}
	
	//성인만 입장 할 수 있는 클럽
	//성인이면 메뉴를 출력하여 고르게 하고 아니면  집에 가세요! 라고 출력
	//1.양주, 2.소주, 3.막걸리
	//1 고르면 양주는 비싸
	//2 고르면 소주는 써
	//3 고르면 막걸리는 머리아파
	public void acChoice() {
			//Scanner sc=new Scanner(System.in); //메인 메소드에 입력시 메소드마다 입력 안해도 됨.
			System.out.print("당신의 나이는?: ");
			int age=sc.nextInt();
			//if((msg.equals("성인))
			if(age>19) {
				System.out.println("====메뉴====");
				System.out.println("1.양주");
				System.out.println("2.소주");
				System.out.println("3.막거리");

				System.out.print("원하는 술의 번호를 입력하시오: ");
				int ac=sc.nextInt();
				
				if(ac==1) {
					System.out.println("양주는 비싸");
				}
				else if(ac==2) {
					System.out.println("소주는 써");
				}
				else if(ac==3) {
					System.out.println("막걸리는 머리아파");
				}
			}
			else {
				System.out.println("집에 가세요");
			}
	}
	
	
	
	
}
