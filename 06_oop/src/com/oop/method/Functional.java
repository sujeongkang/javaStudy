package com.oop.method;

import java.util.Scanner;

import com.oop.model.vo.Member1;
import com.oop.model.vo.Student;
//2020-06-23
//기능제공용 클래스
//메소드 다수 구현
public class Functional {
	
	//public Functional() {}//기본생성자
	//매개변수있는 생성자가 있으면 기본생성자가 자동생성이 안됨!
	
	//계산기 계산하는 것!
	//매개변수가 없고, 반환형도 없는 계산기메소드
	public void calculator() {
		Scanner sc=new Scanner(System.in);
		System.out.println("=======계산기 프로그램========");
		System.out.print("정수: ");
		int su=sc.nextInt();
		System.out.print("정수: ");
		int su2=sc.nextInt();
		System.out.println(su+"+"+su2+"="+su+su2);
//		System.out.println("연산자(+,-,*,/): ");
//		char op=sc.next().charAt(0);
//		int rsult=0;
	}
	
	//반환형이 없고 매개변수가 있는 메소드로 구현
	//계산하는 기능 구현 이항연산 두개값이 정수
	//연산이 변경되려면, 연산도 매개변수도 받아야함.
	public void calculator2(int su, int su2,String[] operation) {
		//두개의 값(정수)을 전달해주면 계산해주는 메소드
		System.out.println("=======계산기 프로그램=====");
		System.out.println("정수: "+su);
		System.out.println("정수: "+su2);
		double result=0;
		for(String op: operation) {//for each문 0번 인덱스부터 하나씩 순차적 입력
			switch(op) {
//		for(int i=0;i<operation.length;i++) {
//			switch(operation[i])
			case "+": result=su+su2;break;
			case "-": result=su-su2;break;
			case "*": result=su*su2;break;
			case "/": result=(double)su/su2;break;
			}
			//System.out.println(su+operation[i]+su2+"="+(result));
			System.out.println(su+op+su2+"="+(result));
		}
	}
	
	//반환형이 있고 매개변수가 없는 메소드 구현
	//두개의 수를 더하고 그 결과를 반환하는 기능
	public int calculator3() { 
		System.out.println("=======계산기 프로그램========");
		Scanner sc=new Scanner(System.in);
		System.out.print("정수: ");
		int su=sc.nextInt();
		System.out.print("정수: ");
		int su2=sc.nextInt();
		return su+su2;//리턴은 단 한개의 자료형만 가능
		//return su+su2 ,su, su2; //여러개 반환 불가!  
		//여러개 봔환시에는 자료형이 같으면 배열, 다르면 클래스를 이용
		//반환형(여기서는 int)이 있으면 반드시!!! return!!!
		//return뒤에는 반환형과 일치하는 자료형 변수나 리터럴이 오면 된다!
		//return으로 메소드를 호출한 곳에 1개!!!!!!의 결과값을 반환함.
	}
	
	
	//반환형이 있고 매개변수가 있는 메소드 구현.
	public int calculator4(int su, int su2) {
		return su+su2;
	}
	
	//---------------------------------------------------------------	
	//문자열 두개를 전달받고 두 문자열을 결합하고 리턴해주는 메소드 만들기
	//1번 문제//
	public String munjang(String str1,String str2) {
		return str1+str2;
	}
	//2번 문제//
	//정수 두개를 전달받아 첫번째수부터 두번쟤 수까지 합을 리턴해주는 메소드 만들기
	//단, 무조건 첫번째 수가 커야함. 만약 첫번째 수가 작으면 에러출력
	public int sum (int first, int second) {
		int result=0;
		if(first<second) {
			System.out.println("에러출력");
		}
		else{
			for(int i=second;i<=first;i++) {
				result+=i;			}
		}
		return result;
	}
	//3번 문제//
	//문자 한개를 전달받아 영문자인지 확인 후 결과를 리턴해주는 메소드 만들기
	//true/false
	public boolean checkChar(char check) {
		return ('a'<=check&&check<='z')||('A'<=check&&check<='Z');
	}
	
	
	//---------------------------------------------------------------		
	
	
	//배열을 매개변수로 받는 메소드 생성
	public void updateArray(int[] nums) {
		//배열을 입력받는 값으로 초기화하기
		//heap에 있는 공간의 주소값을 같이 받음. 수정시 결국 같은 값을 가짐
		//객체, 배열같은 참조형자료형은 가지고 있는 주소를전달하기 때문에
		//배열의 얕은 복사와 같은 개념으로 사용되어 원본값이 수정되는 결과를 가져온다.
		Scanner sc=new Scanner(System.in);
		System.out.println("========배열 수정하기=======");
		for(int i=0;i<nums.length;i++) {
			System.out.print("수정값: ");
			nums[i]=sc.nextInt();
		}
	}
	
	//기본자료형을 매개변수로 받고 수정하기
	
//	public void basicUpdate(int su) {
//		su=200; //변경안됨,  값 변경후 리턴x 메소드 종료시 변경값 사라짐.
//	}
	public int basicUpdate() {
		return 200;
	}

	
	
	
	//---------------------------------------------------------------	
	//student 객체를 만들고 이름, 학년, 반, 번호, 키, 몸무게 기본으로 자신의 정보로 세팅하고 
	//studentUpdate매소드를 만들어 입력받은 값으로 수정한뒤 출력할 것.	
	
	//첫번째 학생 정보 수정하는 로직 : 반환x 매개 o 
	//주소값이 하나 수정하면 바로 수정..따로메모리할당 안하고 heap영역에서 가져다 씀.
	//이게 두번째보다 효율적.
	public void studentUpate(Student s) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=======학생정보수정하기======");
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("학년: ");
		int grade=sc.nextInt();
		System.out.print("반: ");
		int cl=sc.nextInt();
		System.out.print("번호: ");
		int num=sc.nextInt();
		System.out.print("키: ");
		double height=sc.nextDouble();
		System.out.print("몸무게: ");
		double weight=sc.nextDouble();
		
		//전달된 매개변수 값을 수정
		s.setName(name);
		s.setGrade(grade);
		s.setCl(cl);
		s.setNum(num);
		s.setHeight(height);
		s.setWeight(weight);
	}
	
	//두번째 학생정보 수정하는 로직 : 반환o 매개 x
	//heap영역에 주소 두개가 gc가 없애기 전까지 살아있음
	public Student studentUpdate() {// 반환형이 Student
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=======학생정보수정하기======");
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("학년: ");
		int grade=sc.nextInt();
		System.out.print("반: ");
		int cl=sc.nextInt();
		System.out.print("번호: ");
		int num=sc.nextInt();
		System.out.print("키: ");
		double height=sc.nextDouble();
		System.out.print("몸무게: ");
		double weight=sc.nextDouble();	
		
//		return new Student(name,grade,cl,num,height,weight);
//		//수정한 객체를반환.  아래와 같음
		Student s=new Student(name,grade,cl,num,height,weight);
		return s;//수정한 객체를반환
	}

	//---------------------------------------------------------------	
	//cilent에게 이름.나이,전화번호를전달받고 그내용을 String을 반환햐여 출력해보기
	public String strReturn() {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("나이: ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("전화번호: ");
		String phone=sc.nextLine();
		
		String result=name+age+phone;
		return result; 
	}
	//insertMember매소드를 만드시오
	//1. Member객체생성  id, pw, name, email, address
	//2. client에게  id, pw, name, email,addr을 전달 받아 Member객체를 생성하여 출력할것, 반환없음.	
	public void insertMember(Member1 m) {
		Scanner sc=new Scanner(System.in);
		System.out.print("id: ");
		String id=sc.nextLine();
		System.out.print("pw: ");
		String pw=sc.nextLine();
		System.out.print("name: ");
		String name=sc.nextLine();
		System.out.print("email: ");
		String email=sc.nextLine();
		System.out.print("address: ");
		String address=sc.nextLine();
		
		m.setId(id);
		m.setPw(pw);
		m.setName(name);
		m.setEmail(email);
		m.setAddress(address);
		
		
		
	}

	
}

