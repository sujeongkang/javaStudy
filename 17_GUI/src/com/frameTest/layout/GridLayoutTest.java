package com.frameTest.layout;

import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame {
	public GridLayoutTest() {
		
		setTitle("GridLayout");
		setBounds(100,200,500,800);
		
		//레이아수 설정
		//그리드레이아웃 바둑판식으로 배치!
		setLayout(new GridLayout(5,5,10,10)); 
		//(5,5)앞에 low는 고정(항상 우선시됨), 뒤에는 컴퍼넌트에 따럿 자동으로
		//(5,5,10,10)하면 간격이 생김.
		
//		for(int i=0;i<25;i++) {
//			add(new JButton(i+"번"));
//		}
		//빙고판 만들기
		Set number=new HashSet();
		while(number.size()!=25) {
			number.add(String.valueOf((int)(Math.random()*25)+1));
		}
		
		Iterator<String>it=number.iterator();
		
		for(int i=0;i<25;i++) {
				this.add(new JButton(it.next()));
			
			
		}
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
}
