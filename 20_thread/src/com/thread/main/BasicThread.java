package com.thread.main;

import common.thread.InheritThread;
import common.thread.InterThread;

public class BasicThread {
	//메인 메소드도 하나의 스레드
	public static void main(String[] args) {
		//상속받은 쓰레드 활용하기
		InheritThread t1=new InheritThread();
		//쓰레드 실행시키는 방법
		//start()메소드를 호출하여 쓰레드를 실행시킴.
		t1.start();  //실행시 InheritThread의 run메소드가 자동으로 실행 //멀티로 움직임
		//t1.run();//쓰레드는 별도의 저장공간 확보가 필요함. 런으로 호출시 멀티x,순차적으로 돔.
		
		
		//Runnable 구현한 객체로 쓰레드 활용하기
		InterThread it=new InterThread();
		Thread t2=new Thread(it);
		t2.start();
		
		
		try {
			t1.join();//t1쓰레드가 종료하고 실행하라! //실행순서조율
			//t1.join(8000);//8초동안 기다렸다가 실행
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		for(int i=0;i<10;i++) {
			System.out.println("main "+i+"번");
			try {//밀리세컨즈
				Thread.sleep(2000);//1초동안 대기했다가 실행해라 중간에 쉬면서 끼어듬.
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		System.out.println("메인쓰레드 종료!");
	}
}
