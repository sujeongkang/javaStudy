package com.test.inputout;

public class InputOutputTest {
	public static void main(String[] args) {
	//print(), println() 차이!!!
	System.out.println("안녕하세요");
	System.out.println("저는 유병승입니다.");
	System.out.print("안녕하세요");
	System.out.print("저는 설진호입니다.");
	System.out.println("");//개행
	System.out.println("이거는 어디에 출력?");//글 뒤를 개행
	System.out.println("이거는???");
			
	//printf사용하기
	System.out.printf("%d살 내이름은 %s 입니다.\n", 19,"유병승");
	double dnum=1234.567678;
	System.out.println(dnum);
	System.out.printf("%.2f\n", dnum);
	String name="유병승";
	int age=19;
	char gender='남';
	String name2="조현";
	int age2=28;
	char gender1='남';
	System.out.println(name+" "+age+" "+gender);
	System.out.println(name2+" "+age+" "+gender1);
	System.out.printf("%-5s %d %c\n",name,age,gender);
	System.out.printf("%-7s %d %c\n",name2,age2,gender1);
	
	//이스케이프문 이용하기
	System.out.print("안녕하세요.저는 \n");
	System.out.print("유병승\t입니다.");
	System.out.println("내가 말했다.\"우앗!\"");
	System.out.println("c:\\aser01\\");
	String msg="안녕\t 안녕하세요\n하하";
	System.out.println(msg);
	String page="<p onclick='tset(\"안녕\");'>";
	
	
	
	
	}
}

