package com.repeat.controller;
import java.util.Scanner;
import java.util.*;//자바 유틸에 있는 전체 패키지를 다 쓰겠다.
public class RepeatTest {
	Scanner sc=new Scanner(System.in);
	public void basicRepeat() {
		//기본 for문 작성하기
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
	//	.
	//	.
	//	.
		//for문을 이용하면 간단하게 처리할 수 있음.
		System.out.println("=====for문으로 출력하기=====");
		for(int i=0;i<10;i++) {
			System.out.println(i);
			System.out.println("안녕하세요!");
		}
		//1부터 100까지의 수를 출력해보세요
		/*for(int i=1;i<=100;i++) {
			System.out.println(i);
		}*/
		for(int i=0;i<100;i++){
		System.out.println("i: "+(i+1));
		//위에 식 대신 ("i: "+i++)가능? 불가능.
		//i+1은 i값을 건들지 않지만, i++는 i값 자체가 증가. 짝수만 나옴.
		}
		//100부터 1까지
		/*for(int i=100;i>0;i--) {
			System.out.println(i);
		}*/
		int su=100;
		for(int i=0;i<100;i++) {
			int sum=0;
			System.out.println(su--); //i값을 쓸수 있게 외부 변수를 이용해서 처리
		}
		//sum+=1  //for문안에서 선언된 변수값(i,sum)은 안에서만 사용가능 외부에서는 이용불가.
		
		//1~100까지 홀수만 출력하자.
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		/*for(int i=1;i<=100;i++) {
			System.out.println(i++);
		}
		for(int i=1;i<=100;i+=2) {
			System.out.println(i);
		}*/
		//1~100까지의 전체합을 더하세요.
		System.out.println("====1~100까지의 전체 합====");
		int sum = 0; //누적시킬 변수 선언 필요
		for(int i=1;i<=100;i++) {
			sum+=i; //sum=sum+i;
		}
		System.out.println(sum);
		//1~100까지 짝수 합을 더하세요.
		int sum1=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum1+=i; //i가 짝수일때만 합산
			}
		}
		System.out.println(sum1);
		
		//입력받은 값만큼 "안녕" 출력 반복하세요.
		System.out.print("몇 번 입력: ");
		int count=sc.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("for문은 너무 즐겁고 사랑스러워!");
		}
		
		//정수 세개를 입력받고 그 정수의 합계를 출력하세요
		//합계는 한번만 출력이 되어야 합니다.
		int isum=0;
		for(int i=0;i<3;i++) {
			System.out.print("정수입력: ");
			isum+=sc.nextInt();
		}
		System.out.println(isum);
		
		//for문의 다른 사용법
		//for(초기식;조건식;증감식){  로직   }
		/*for(;;) { //무한 루프
			System.out.println("====메뉴판=======");
			System.out.println("1.캐비어");
			System.out.println("2.곱창");
			System.out.println("3.송로버섯");
			System.out.println("0.프로그램종료");
			System.out.print("입력 : ");
			int choice=sc.nextInt();
			switch(choice) {
				case 1 : System.out.println("비싼 캐피어");break;
				case 2 : System.out.println("곱창은 소주와!!");break;
				case 3 : System.out.println("송로버섯....??.....무식해서 ㅠㅠ");break;
				case 0 : System.out.println("프로그램을 종료합니다.");return; 
				//return으로 무한로프 종료, 메소드가 실행 되다가  return를 만나면 밑에 코드 안 읽음.메소드가 그자리에서 종료. 반환값
			}
		}*/
		//for문에 조건식을 빼면??
		for(int i=0;;i++) {//무한루프
			System.out.println(i);
			if(i==100000) {
				break;
			}
		}
		int a=0;
		for(;a<10;a++) {//초기식 없이 외부 변수 int a=0을 이용/ 10회 반복
			System.out.println(a);
		}
		//조건식만 for문에 넣을 수 있다. //무한루프에 빠지지않도록 조건을 잘 둘것.
		for(;a<20;) {
			System.out.println(a++);//그냥(a)일 경우에는 10이 계속 반복해서 찍힘. 조건식이 false가 되어 종료될 수 없음.
		}
		//초기식 증감식 여러값을 선언/변경시킬 수 있다.
		for(int i=0,j=10;i<10;i++,j+=20) { //i는 1씩증가. j는  20씩 증가.
			System.out.println(i+" "+j);
		}
		
	}
	//입력할 학생수를 입력받고 학생의 영어,수학, 국어 점수를 입력받고
	//그 합계와 평균을 구하는 프로그램 만들기
	//유병승 100 100 100 합계300 평균100
	//조  현  90 90 90 합계270 평균 100
	//각 과목의 변수는 한개
	//출력내용에 대한 변수 한개
	public void studentGrade() {
	System.out.println("========학생성적 관리 프로그램v01==========");
	System.out.print("학생수: ");
	int student=sc.nextInt();
	sc.nextLine();
	String result="";
	for(int i=1;i<=student;i++) {
		//System.out.println("확인 입력한 만큼 도니?");
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("영어: ");
		int eng=sc.nextInt();
		int total=0; //변수 선언으로 쓰레기 비워주기
		total+=eng;
		System.out.print("수학: ");
		int math=sc.nextInt();
		total+=math;
		System.out.print("국어: ");
		int kor=sc.nextInt();
		total+=kor;
		double avg=total/3.0;
		sc.nextLine();
		//System.out.println{ //1번 돌고 출력 1번돌고 출력
		result+=name+" "+eng+" "+math+" "+kor
				+" 합계: "+(eng+math+kor)
				+" 평균: "+((eng+math+kor)/3.0)+"\n";
		}
		System.out.println(result); //결과를 모아서 한번에 출력
	}
	
	public void whileTest() {
		//이제 곧 오늘 수업끝이에요.
		int i=0; // 초기식
		while(i<3) { //조건식
			System.out.println("이제 곧 수업 끝!");
			//증감식
			i++;
		}
		//while문을 이용하여 1부터 30까지 출력하기
		i=0;
		while(i<30) {
			System.out.println(i);
			i++;
		}
		//사용자가 입력하는 3개 문자열을 한번에 출력하는 프로그램 작성
		int j=0;
		String msg="";
		while(j<3) {
			System.out.print("문자 입력: ");
			msg+=sc.nextLine(); 
			//msg=msg+sc.nextLine();//문자+문자  가능 문자-문자 불가능
			//System.out.println(msg);
			//증감식.. 없으면 무한루프 계속 True
			j++;  //j=3
		}
		System.out.println(msg);
		
		//do while문
		//do{  수행 로직  }while(조건식);
		//1.do{}문 먼저 무조건 한번은 실행 2.while(조건문)이 True면 do문 또 실행
		do {
			System.out.println("do while문!!");
			j++;
		}while(j<5); //while(false);로 해도 실행가능
		
		while(j<3) { //while문은 true일때만 실행.
			System.out.println("while문!");
		}
		/*while(true) { //while문 true일때 무한루프
			System.out.println("여기까지!! 정리하세요!!");
		}*/
		
		//while문 사용 예
		Set<String> test=new HashSet();
		test.add("하나");
		test.add("둘");
		test.add("셋");
		Iterator iterator=test.iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next()); //계속 true로 실행되다가 자동으로 false로 변환되어 종료.
		
	}

	
}
