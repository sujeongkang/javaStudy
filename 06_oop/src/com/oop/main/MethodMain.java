package com.oop.main;

import com.oop.method.Functional;
import com.oop.model.vo.Member1;
import com.oop.model.vo.Student;
//2020-06-23
public class MethodMain {
	public static void main(String[] args) {
		
		Functional fun=new Functional();
		
//		//반환형이없고, 매개변수 없는 메소드 호출
//		//fun.calculator();
		
//		//반환형없고, 매개변수 있는 메소드 호출
//		int su=10;
//		int su2=20;
//		fun.calculator2(10,20,new String[] {"*","/"}); 
		
//		//반환형이 있고, 매개변수 없는 메소드 호출
//		//fun.calculator3();//반환형을 가져만 왔음. 출격안됨.
//		//System.out.println(fun.calculator3());
//		int result=fun.calculator3();
//		System.out.println(result*100);
//		 
//		//10;
		
//		//반환형이 있고 매개변수 있는 메소드 호출
//		result=fun.calculator4(20,20);
//		System.out.println(result);
//
//		//---------------------------------------------------------------	
//		//실습문제 3개//
		//1번째 문제 호출//
//		String result1=fun.munjang("안녕","하세요");
//		System.out.println(result1);
//		//2번째 문제 호출//
//		int res=fun.sum(2, 10);
//		System.out.println(res==0?"":res);
		//(res==0?"":res)에러출력할때 밑에 0이 나오는 거 없애는것.
		//fun.printer 메소드에서 에러출력! 이라는 문구 뜰 때
		//result에 값이 아무것도 안 들어가면서 result 0이 나오는데 res가 0일 때 ""로 초기화
//		//3번째 문제 호출//
//		Scanner sc=new Scanner(System.in);
//		System.out.println("문자입력: ");
//		System.out.println(fun.checkChar(sc.next().charAt(0)));
//	
//		//--------------------------------------------------			
//		//객체, 배열 참조형자료형 매개변수, 리턴으로 작성해보기
//		//객체, 배열같은 참조형자료형은 가지고 있는 주소를전달하기 때문에
//		//배열의 얕은 복사와 같은 개념으로 사용되어 원본값이 수정되는 결과를 가져온다.
//		int[] nums= {1,2,3,4};
//		System.out.println("=======수정전========");
//		for(int a: nums){
//			System.out.print(a+" ");
//		}
//		System.out.println();//개행표시
//		
//		fun.updateArray(nums);//배열에 있는 값을 수정하는 로직
//		
//		System.out.println("=======수정후========");
//		for(int a: nums){
//			System.out.println(a+" ");
//		}
//		System.out.println();//개행표시
//		
//		//기본자료형을 매개변수로 받고 수정하기																																																																																																																																																																								
//		System.out.println("수정 전: "+su);
//		//fun.basicUpdate(su);
//		su=fun.basicUpdate();
//		System.out.println("수정 후: " +su);
//		
//		
//		//---------------------------------------------------------------	
		
		//student 객체를 만들고 이름, 학년, 반, 번호, 키, 몸무게 기본으로 자신의 정보로 세팅하고 
		//studentUpdate매소드를 만들어 입력받은 값으로 수정한뒤 출력할 것.
//		Student s=new Student("홍길동",3,1,10,180.5,65.5);
		
		//첫번째 학생 정보 수정하는 로직 : 반환x 매개 o 
//		fun.studentUpate(s);
//		System.out.println(s.getName()+s.getGrade()+s.getCl()+s.getNum()+s.getHeight()+s.getWeight());
		
	
		//두번째 학생정보 수정하는 로직 : 반환o 매개 x
//		s=fun.studentUpdate();
//		System.out.println(s.getName()+s.getGrade()+s.getCl()+s.getNum()+s.getHeight()+s.getWeight());
//		//---------------------------------------------------------------	
		//cilent에게 이름.나이,전화번호를전달받고 그내용을 String을 반환햐여 출력해보기
		System.out.println(fun.strReturn());
		
		//insertMember매소드를 만드시오
		//1. Member객체생성  id, pw, name, email, address
		//2. client에게  id, pw, name, email,addr을 전달 받아 Member객체를 생성하여 출력할것, 반환없음.
		Member1 m=new Member1();
		fun.insertMember(m);
		System.out.println(m.getId()+" "+m.getPw()+" "+m.getName()+" "+m.getEmail()+" "+m.getAddress());
		
		
		
		
		
	}
	
}
