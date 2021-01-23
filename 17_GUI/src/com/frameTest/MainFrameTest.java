package com.frameTest;

import javax.swing.JFrame;

public class MainFrameTest {
	
	public static void main(String[] args) {
		//프레임->윈도우 창 한개
		JFrame f=new JFrame();
		f.setBounds(100,100,300,400);//창에 대한 위치, 크기 설정
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫힘버튼
		f.setVisible(true);//생성된 프레임을 보이게 하는 속성
	}
}
