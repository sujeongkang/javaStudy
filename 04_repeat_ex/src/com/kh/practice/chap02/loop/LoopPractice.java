package com.kh.practice.chap02.loop;
import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc=new Scanner(System.in);
	
	public void practice1() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다. 
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

		System.out.print("1이상의 숫자를 입력하세요: ");
		int num=sc.nextInt();
		if(num>=1) {
			for(int i=1;i<=num;i++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}else {
			System.out.println("1이상의 숫자를  입력해주세요.");
		}
		/*System.out.println("1이상의 숫자를 입력하세요: ");
		int su=sc.nextInt();
		int i,j;
		for(j=1;j<=su;j++) {
			for(i=su;i>0;i--) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("1이상의 숫자를 입력해주세요.");
		*/
		
	}
	public void practice2() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다. 
		//위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		//“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요. 
		int num=0;
		do {
			System.out.print("1이상의 숫자를 입력하세요: ");
			num=sc.nextInt();
			if(num>=1) {
				for(int i=1;i<=num;i++) {
					System.out.print(i+" ");
				}
				System.out.println("");
			}else if(num<1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
		}while(num<1);
		
	}	
	public void practice3() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		System.out.print("1이상의 숫자를 입력하세요: ");
		int num=sc.nextInt();
		int r=num+1;
		if(num>=1) {
			for(int i=0;i<num;i++) {
				r--;
				System.out.print(r+" ");
			}
			System.out.println("");
		}else {
			System.out.println("1이상의 숫자를  입력해주세요.");
		}
	}
	public void practice4() {
		//위 문제와 모든 것이 동일하나, 
		//1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요. 
		int num = 0, r;
		do{ 		
			System.out.print("1이상의 숫자를 입력하세요: ");
			num=sc.nextInt();
			r=num+1;
			if(num>=1) {
				for(int i=1;i<=num;i++) {
					r--;
					System.out.print(r+" ");
				}
			}else if(num<1){
				System.out.println("1이상의 숫자를  입력해주세요.");
			}
		}while(num<1);
		System.out.println("");
	}
	public void practice5() {
		System.out.print("정수를 하나 입력하세요:");
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요
		int num=sc.nextInt();
		String result ="";
		int sum=0;
		for(int i=1;i<=num;i++) {
			System.out.print(i);
				if(i<num) {
					System.out.print("+");
				}
			sum+=i;
			}
		System.out.println("="+sum);
	}
	

	public void practice6() {
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

		System.out.print("첫번째 숫자: ");
		int n1=sc.nextInt();
		System.out.print("두번째 숫자: ");
		int n2=sc.nextInt();
		if(n1<1||n2<1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}else {
			if(n1<n2) {
				for(int i=n1;i<=n2;i++) {
						System.out.print(i+" ");
				}
			}else if(n1>n2) {
				for(int i=n2;i<=n1;i++) {
						System.out.print(i+" ");
					}
			}else {
				System.out.println(n1);
			}
		}
		System.out.println("");
			
	}
	
	public void practice7() {
		//위 문제와 모든 것이 동일하나, 
		//1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서
		//다시 사용자가 값을 입력하도록 하세요.
		int n1,n2=0;
		do {
			System.out.print("첫번째 숫자: ");
			n1=sc.nextInt();
			System.out.print("두번째 숫자: ");
			n2=sc.nextInt();
			if(n1<1||n2<1) {
				System.out.println("1이상의 숫자를 입력해주세요");
			}else {
				if(n1<n2) {
					for(int i=n1;i<=n2;i++) {
							System.out.print(i+" ");
					}
				}else if(n1>n2) {
					for(int i=n2;i<=n1;i++) {
							System.out.print(i+" ");
						}
				}
			}
		}while(n1<1||n2<1);
		System.out.println("");
	}
	public void practice8() {
		//사용자로부터 입력 받은 숫자의 단을 출력하세요.
		System.out.print("숫자: ");
		int num=sc.nextInt();
		System.out.println("===== "+num+"단 ====");
		for(int i=1;i<=9;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
		
	}
	public void practice9() {
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요. 
		//단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		System.out.print("숫자: ");
		int num=sc.nextInt();
		int a = 0;
		int j = 0;
		
		if(num>9) {
			System.out.println("9이하의 숫자만 입력해주세요.");
			
		}else {
			 for(int i=num;i<=9;i++) {
				 System.out.println("===== "+i+"단 ====");
				 for(j=1;j<=9;j++) {
					 System.out.println(i+"*"+j+"="+(i*j));
				 }
			 }
		}
	}
	public void practice10() {
		//위 문제와 모든 것이 동일하나, 
		//9를 초과하는 숫자가 입력됐다면 “9 이하의 숫자를 입력해주세요”가 출력되면서
		//다시 사용자가 값을 입력하도록 하세요.
	int num, j=0;
		do {
			System.out.print("숫자: ");
			num=sc.nextInt();
		
			if(num<=9) {
				 for(int i=num;i<=9;i++) {
					 System.out.println("===== "+i+"단 ====");
					 for(j=1;j<=9;j++) {
						 System.out.println(i+"*"+j+"="+(i*j));
					 }
				 }
			}else if(num>9) {
				System.out.println("9이하의 숫자만 입력해주세요.");	 
			}
		}while(num>9);
	}
	public void practice11() {
		//사용자로부터 시작 숫자와 공차를 입력 받아 일정한 값으로 
		//숫자가 커지거나 작아지는 프로그램을 구현하세요. 단, 출력되는 숫자는 총 10개입니다.
		//* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다. 
		//ex) 2, 7, 12, 17, 22 … 5  5    5    5  => 여기서 공차는 5
		System.out.print("시작숫자: ");
		int s=sc.nextInt();
		System.out.print("공차: ");
		int g=sc.nextInt();
		int count=0;
		do {
			System.out.print(s+" ");
			s+=g;
			count++;
		}while(count<10);
		System.out.println("");
	}
	public void practice12() {
		//정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요. 
		//단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
		// exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다. 
		//또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면 “0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며, 
		//없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
		//두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		String oper="";
		int i1,i2;
		do{
			System.out.print("연산자(+,-,*,/,%): ");
			oper=sc.nextLine();
			System.out.print("정수1: ");
			i1=sc.nextInt();
			System.out.print("정수2: ");
			i2=sc.nextInt();
			switch(oper) {
			case "+": System.out.println(i1+"+"+i2+"="+(i1+i2));break;
			case "-": System.out.println(i1+"-"+i2+"="+(i1-i2));break;
			case "*": System.out.println(i1+"*"+i2+"="+i1*i2);break;
			case "%": System.out.println(i1+"%"+i2+"="+i1%i2);break;
			case "/": 
				if(i2!=0) {System.out.println(i1+"/"+i2+"="+i1/i2);break;
				}else {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
				};break;
			case "exit":System.out.println("프로그램을 종료합니다.");return;
			default: System.out.println("없는 연산자입니다. 다시 입력해주세요."); 
			}
			sc.nextLine();
		}while(!equals(oper)||i2==0);

	}
	public void practice13() {
		//정수 입력 : 4 * ** *** ****
		System.out.print("정수 입력: ");
		int j=sc.nextInt();
		String result="";
		for(int i=1;i<=j;i++) {
			result+=("*");
			System.out.println(result);
		}
		
	}
	public void practice14() {
		//다음과 같은 실행 예제를 구현하세요.
		//ex. 정수 입력 : 4 ****/ ***/ **/ *
		int i,j,k;
		System.out.print("정수 입력: ");
		j=sc.nextInt();
		for(i=0;i<j;i++) { //4번반복
			
			for(k=j;i<k;k--) { //임의에 수에 입력값을 넣고 그 수 보다 작을 때까지 * 반복
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
}
