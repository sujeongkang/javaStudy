package com.exception.cotroller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchTest {
	public static void main(String[] args) {
		//try~catch구문 예외처리하기. 둘다 있어야함 반드시. 그룹으로 묶여있음
		//
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) { //계속돌아가게 만듬.
			System.out.println("문자입력:");
			String name=sc.nextLine();
			//입력받은 문자열의 3번째값을 출력하기
			try {
				System.out.println(name.charAt(2));//예외가 발생하는 구문
				//System.out.println("계속고고");
				
			}catch(StringIndexOutOfBoundsException e) {//발생이 예상되는 Exception적기 .매개변수임.
				//e.printStackTrace();//에러 출력문  안쓰면 에러출력 안됨
				//a();//다른 메소드로 흐름을 넘김.
				return;
			}finally {
				
				System.out.println("프로그램 종료"); //리턴을 하더라도 무조건실행됨. 
				//Try문에 걸리던 안걸리던 무조건실행.
					
			}
			System.out.println("계속고고");
		}
		fileTry();
	}
	
	public static void fileTry() {
		
		File f=new File("test.txt");//file은 다 checkedException
		FileInputStream fis=null;;//초기화
		try {
			//입션션 발생시 밑으로 안내려감.
			 fis=new FileInputStream(f);//스트림을 열였으면 반드시 닫아야 함.그래야 안정적으로 관리가 됨
			 //밑에 반드시 해야하는 처리를 finally에
			 //Unhandled exception type FileNotFoundException 예외 처리 안했다.
			 
			 fis.read();//파일을 불러오는 녀석. IOException;
//		}catch(FileNotFoundException e) {
//			 fileCreate();
//			 return;
//		}catch(IOException e) {	//IOException부모, FileNotFoundException 자식
//			 iotest();
//			 return;
			//IOException이 위에있으면 부모라 다 처리해버림 //밑에는 데드코드 됨.
		}catch(Exception e) {	
			//어떤 Exception이 발생했는지 구분하여 처리하기가 복잡해짐.
			//Exception만 넣어도 되지만. 정확히 어떤 Exception이 나왔는지와 각각의 Exception처리에 있어 불편하다. 
			//catch문 쓸때 위에서는 작은것부터 밑으로 갈수록 크게 둘것.
			//FileNotFoundException < IOException < Exception<Throw<Object
			
			//e.printStackTrace(); //오류출력구문
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
//			if() {
//				
//			}
		}finally{//무조건 써야함. 스트림을 닫기 위해서 자동으로 못닫음.
			try {
				fis.close();//스트림닫기!!!!!!/스트림열릴 때마다 꼭닫기. 안닫으면 계속연결된상태. 
				//try문안에 선언한 변수 fis 못 찾음. 외부에 선언필요//cannot be resolved 변수 못찾는다.
				
			}catch(IOException e) {
				e.printStackTrace();
				}
		}
	}
	
	public static void trywithresoureceTest() {
		//try with resource: 객체를 반환(반환하고 지움)해줘야하는 구문을 자동으로 생성해서 처리.
		//try{   }catch(예외 클래스 e){    }finally{try...)
		//try(반환객체의 선언/생성){ }catch(예외 클래스 e){    }
		
		File f=new File("test.txt");
		try(FileInputStream fis=new FileInputStream(f); //하나이상일때는 ;세미클론.하나뿐이거나 마지막일때는 생략가능.
				BufferedInputStream bis=new BufferedInputStream(fis);){
			
			bis.read();//자동으로 닫음.
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
