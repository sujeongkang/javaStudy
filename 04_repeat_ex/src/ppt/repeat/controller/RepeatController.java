package ppt.repeat.controller;
import java.util.Scanner;
public class RepeatController {
	Scanner sc=new Scanner(System.in);
	public void test1() {
		//문자열과 문자열에서 검색될 문자를 입력 받아 문 자열에 그 문자가 몇 개이었는지 
		//개수를 확인하는 프로그램을 작성하세요
		System.out.print("문자열 입력: ");
		String str=sc.nextLine();
		System.out.print("문자입력: ");
		char ch=sc.nextLine().charAt(0);
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			if('a'<=str.charAt(i)&&str.charAt(i)<='z'){
				
				if(str.charAt(i)==ch) count++; 
			}else {
				System.out.println("영문자가 아닙니다.");return;
				}
			
		
		}System.out.println("포함된 갯수: "+count+"개");
	}
		
			

	public void test2() {
		//5명의 회원정보를 입력 받아 저장하고 출력하는 프로그램을 만드세요 
		//입력 : 이름, 나이, 주소, 키, 몸무게, 연락처
		System.out.println("회원 정보를 입력하세요.");
		int i;
		String[]member=new String[5];

		for(i=0;i<5;i++) {
			System.out.print("이름: ");
			String name=sc.next();
			System.out.print("나이: ");
			int age=sc.nextInt();
			System.out.print("주소: ");
			sc.nextLine();
			String add=sc.nextLine();
			System.out.print("키: ");
			double height=sc.nextDouble();
			System.out.print("몸무게: ");
			double weight=sc.nextDouble();
			System.out.print("연락처: ");
			sc.nextLine();
			String phone=sc.nextLine();
			member[i]= name+" "+age+"세 "+add+" "+height+"cm "+weight+"kg "+phone;
		}
		
		System.out.println("=========저장회원==========");
		for(String v:member) {
			System.out.println(v);
		}
	}

	
	public void test3() {
		// 등록된 회원의 평균나이, 평균 키, 평균 몸무게를 계산하고 출력해보세요 
		System.out.println("회원 정보를 입력하세요.");
		int i;
		String[]member=new String[5];
		int asum=0;
		int hsum=0;
		int wsum=0;
		for(i=0;i<5;i++) {
			System.out.print("이름: ");
			String name=sc.next();
			System.out.print("나이: ");
			int age=sc.nextInt();
			System.out.print("주소: ");
			sc.nextLine();
			String add=sc.nextLine();
			System.out.print("키: ");
			double height=sc.nextDouble();
			System.out.print("몸무게: ");
			double weight=sc.nextDouble();
			System.out.print("연락처: ");
			sc.nextLine();
			String phone=sc.nextLine();
			member[i]= name+" "+age+"세 "+add+" "+height+"cm "+weight+"kg "+phone;
			
			asum+=age;
			hsum+=height;
			wsum+=weight;
		}
		
		System.out.println("=========저장회원==========");
		for(String v:member) {
			System.out.println(v);
		}
		
		System.out.println("평균나이: "+asum/5+"세/ 평균 키: "+hsum/5.0+"cm/ 평균 몸무게: "+wsum/5.0+"kg");
		
	}
	public void test4() {
		
		System.out.println("회원 정보를 입력하세요.");
		System.out.println("몇명 입력하시겠습니까? ");
		String[]member=new String[sc.nextInt()];
		int asum=0;
		int hsum=0;
		int wsum=0;
		for(int i=0;i<member.length;i++) {
			System.out.print("이름: ");
			String name=sc.next();
			System.out.print("나이: ");
			int age=sc.nextInt();
			System.out.print("주소: ");
			sc.nextLine();
			String add=sc.nextLine();
			System.out.print("키: ");
			double height=sc.nextDouble();
			System.out.print("몸무게: ");
			double weight=sc.nextDouble();
			System.out.print("연락처: ");
			sc.nextLine();
			String phone=sc.nextLine();
			member[i]= name+" "+age+"세 "+add+" "+height+"cm "+weight+"kg "+phone;
			
			asum+=age;
			hsum+=height;
			wsum+=weight;
		}
		
		System.out.println("=========저장회원==========");
		for(String v:member) {
			System.out.println(v);
		}
		
		System.out.println("평균나이: "+asum/(member.length)+"세/ 평균 키: "+hsum/(member.length)+"cm/ 평균 몸무게: "+wsum/(member.length)+"kg");
	}
	public void test5() {
		String [] p=new String[5];
		for(int i=0;i<p.length;i++) {
			
			System.out.print("상품id:");
			String id=sc.nextLine();
			System.out.print("종류:");
			String kind=sc.nextLine();
			System.out.print("상품명:");
			String name=sc.nextLine();
			System.out.print("가격:");
			int price=sc.nextInt();
			sc.nextLine();
			p[i]=id+" "+kind+" "+name+" "+price;
		}
		System.out.println("===저장상품===");
		for(String v:p) {
			System.out.println(v);
		}
	}
	public void test6() {
		int exp=0;
		int count=0;
		while(true) {
		System.out.println("사용법");
		System.out.println("0.사냥시작  1.오크사냥  2.용사냥  3.사람사냥  99.끝내기");
		System.out.print("선택:");
		int cho=sc.nextInt();
			switch(cho) {
			case 0: System.out.println("사냥을 시작합니다.");break;
			case 1: 
				exp+=1; 
				count+=1;
				System.out.println("1.오크사냥 완료 +1exp");break;
			case 2: 
				exp+=15; 
				count+=1;
				System.out.println("2.용사냥 완료 +15exp");break;
			case 3: 
				exp+=10; 
				count+=1;
				System.out.println("3.사람사냥 완료 +10exp");break;
			case 99:
				System.out.println("사냥을 마쳤습니다. 사냥한 몹의 수는"+count+"마리, 획득한 경험지는 "+exp+"exp입니다.");return;
			}
		
		}
		
		
	}
	public void test7() {


		System.out.println("==========분식집 주문 프로그램============");
		System.out.println("김밥류================");
		System.out.println("1.원조김밥======1000원");
		System.out.println("2.치즈김밥======1200원");
		System.out.println("3.참치김밥======2000원");
		System.out.println("라면=================");
		System.out.println("4.그냥라면======1200원");
		System.out.println("5.치즈라면======1500원");
		System.out.println("6.짬뽕라면======2000원");
		System.out.println("기타=================");
		System.out.println("7.튀김=========1200원");
		System.out.println("8.순대=========2500원");
		System.out.println("9.오뎅=========1000원");
		System.out.println("10.음료수========800원");

		int total=0;
		
		String choice="";
		String[] menuA= {"원조김밥","치즈김밥","참치김밥","그냥라면","치즈라면","짬뽕라면","튀김","순대","오뎅","음료수"};
		int[]priceA= {1000,1200,2000,1200,1500,2000,1200,2500,1000,800};
		
		for(int i=0;;i++) {	
			System.out.print("1.메뉴선택:");
			int menu=sc.nextInt();
			String chom=menuA[menu-1];
			int price=priceA[menu-1];
			System.out.print("2.수량선택:");
			int count=sc.nextInt();
			System.out.println(count+"개 주문 하셨습니다.");
			price=price*count;
			total+=price;
			choice+= (chom+" : "+count+"개 - "+price+"원\n");			
			
			System.out.print("3.추가주문선택(y/n): ");
			sc.nextLine();
			char plus=sc.nextLine().charAt(0);
			if(plus=='n') {
				System.out.println("주문하신 정보는 다음과 같습니다.");
				System.out.println("=========================");
				System.out.println(choice);
				System.out.println("========================");
				System.out.println("총가격"+total+"원"); break;
			}else if(plus=='y') {
				
				continue;
			}	
		}
	}
}
			
			
			
		
	
	


