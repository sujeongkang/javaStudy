package com.stream.main;

import java.util.Scanner;

import com.streamtest.DataFile;
import com.streamtest.FileStreamTest;

public class Run {
	public static void main(String[] args) {
		FileStreamTest fst=new  FileStreamTest();
		Scanner sc=new Scanner(System.in);
		//System.out.println("메세지 입력: ");
		//fst.outputStream(sc.nextLine());
		//fst.outputStream("ABCDEFG");//파일에 내용을 저장!->File SAVE
		//fst.InputStreamTest();//파일에서 내용을 읽어오는 것.->File LOAD
		
		//fst.writerTest();
		fst.readerTest();
	//---------------------------------------------------------------------------	
		//사용자에게 메세지를 입력받고 (0을누를때까지 반복적으로 받음) 그 메세지를 msg.data파일에 저장후
		//msg.data파일의 내용을 출력하는 기능 구현
		//*메세지 내용은 main에서 전달받아서 처리할 것
		System.out.println("저장할 메세지를 입력:");
		String msg="";
//		while(true) {
//			String temp=sc.nextLine();
//			if(temp.equals("0")) {
//				break;//반복문 빠져나가기
//			}
//			msg+=temp;
//		}
		//입력받은 값은 msg에 저장이 됨. -->OutputStream, Writer
		String result="";
//		System.out.println("파일명: ");
//		String fname=sc.nextLine();
//		String result=new FileStreamTest().saveMsgData(msg,fname);
//		System.out.println("실행 결과: " +result);
//		
		
		//저장된 데이커 불러오기
//		System.out.println("불러올 파일명: ");
//		result=new FileStreamTest().loadMsgData(sc.nextLine());
//		System.out.println(result);
		//원하는 파일명으로 저장하고 원하는 파일의 내용을 불러올 수 있게 업데이트 하기
		//-----------------------------------------------------

		//데이터 저장하기
		new DataFile().savePerson();
		new DataFile().loadPerson();
		
		
	}
}
