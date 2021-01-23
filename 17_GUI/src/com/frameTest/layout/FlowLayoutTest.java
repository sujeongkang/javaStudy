package com.frameTest.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlowLayoutTest extends JFrame {
	public FlowLayoutTest() {
		setTitle("Flow레이아웃");
		setBounds(100,100,400,500);
		
		//레이아웃 설정
//		setLayout(new FlowLayout());  //default 중앙정렬
//		setLayout(new FlowLayout(FlowLayout.LEFT));//왼쪽정렬!
		setLayout(new FlowLayout(FlowLayout.RIGHT));//오른쪽정렬!
		//순차적인 흐름... 버튼크기등은 고정
		
		for(int i=0;i<20;i++) {
			if(i%2==0) add(new JButton(i+"번"));
			else add(new JLabel("빈자리       "));
		}
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
