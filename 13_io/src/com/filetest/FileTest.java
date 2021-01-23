package com.filetest;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		//자바에서 파일을 다뤄보자.
		File f=new File("test.txt");//test.txt.파일명을 가진 파일 생성
		//따로 생성 안하면 ram공간에 있다 그냥 사라짐.
				
		//파일 객체를 만들때 경로까지 추가해서 생성할 수 있음
		//f=new File("c:\\Users\\sy175\\test\\a\\test.txt");//없는 경로폴더에 들어갈 수 없다.
		f=new File("test.txt");
		//자바에서 폴더를 생성하고 파일생성하면 됨.
		//폴더를 생성하는 방법: mkdir, mkdirs
		//File dir=new File("c:\\Users\\sy175\\test\\a\\b\\c"); 
		File dir=new File("c:\\Users\\sy175\\");
		//System.out.println(dir.mkdirs());
		if(!dir.exists())System.out.println(dir.mkdirs());
		//파일있니?  -->없으면 생성. 있으면 생성하지마
		//생성성공 true, 실패나 이미만들어져 있으면  false
		//이미 만들어진 폴더에 하나만 추가시는 mkdir//생성폴더가 경로에 두개 이상 생성시에는.mkdirs
	
		try {// IOException. 
			if(!f.exists()) {//없을 때만 생성해라
				
				f.createNewFile();//자동갱신 안됨.. 프로젝트누르고 우클릭 Refresh
			}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일의 크기: "+f.length());//바이트크기 9바이트
		System.out.println("경로 확인: "+f.getAbsolutePath());//D:\KH\work\13_io\test.txt
		for(String file:dir.list()) {//리스트 자료형으로 가져옴.
			System.out.println("파일들 확인하기: "+file); //폴더목록 다나옴.
		}
		
		
	}
}
