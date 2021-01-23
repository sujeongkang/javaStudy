package com.oper.single;
import java.util.Scanner;

public class ComplexOperator {
	public void test() {
	//public static void main(String[] args) {
		//복합대입연산자
		//원하는 수를 지정한 변수에 산술연산후 대입하는 연산자.
		int account=100000000;
		//1.입급
		account+=10; //account=account+10; 둘이 같음
		System.out.println(account);
		//2.인출 5000000
		account-=5000000;
		System.out.println(account);
		
		//입력받은 값의 합계를 구하는 프로그램 만드시오
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력: ");
		int sum=sc.nextInt();
		System.out.print("정수입력: ");
		sum+=sc.nextInt();
		System.out.print("정수입력: ");
		sum+=sc.nextInt();
		System.out.println("합계: "+sum);
		
		//사용자에게 문자를 3번 입력하게 하고 입력받은 문자를
		//모두 출력하는 프로그램
		System.out.print("메시지 입력: ");
		sc.nextLine();
		//String msg=""; 밑에 처럼 바로 복합대입 연산을 쓰기 위해서는 초기화필요
		//String msg+=sc.nextLine();//msg=msg+입력값;
		String msg=sc.nextLine(); //초기화
		System.out.print("메세지 입력: ");
		msg+=sc.nextLine();
		System.out.print("메시지 입력: ");
		msg+=sc.nextLine();
		System.out.println("입력한 메세지: "+msg);
		
		//국어, 영어, 수학, 코딩 성적을
		//입력받아 합계와 평균을 구하는 프로그램
		//*국어,영어,수학,코딩점수는 따로 보관할 필요가 없음
		//int kor=sc.nextInt();
		int sum1=0;
		int count=0;//개수셀때,
		System.out.print("국어 점수: ");
		sum1+=sc.nextInt();
		count++;
		System.out.print("영어 점수: ");
		sum1+=sc.nextInt();
		count++;
		System.out.print("수학 점수: ");
		sum1+=sc.nextInt();
		count++;
		System.out.print("코딩 점수: ");
		sum1+=sc.nextInt();
		count++;

		System.out.println("합계: "+sum1+" 평균: "+(sum1/4.0));
		//결과값이 4로 나눴을때 소수점이 발생할 수 있어 double로 변경하기  위해.
		//4.0 double형으로 나눔.
		System.out.printf("합계: %d, 평군: %.1f",sum1,(sum1/4.0));
		//평균 한자리수만 표기시.
		System.out.println("합계: "+sum1+" 평균: "+((double)sum1/count));
	}
}
