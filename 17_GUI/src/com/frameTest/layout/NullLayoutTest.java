package com.frameTest.layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NullLayoutTest extends JFrame{
	public NullLayoutTest() {
		setTitle("null레이아웃");
		setBounds(100,100,400,500);
		//null레이아웃 설정 .. 컴포넌트 크기 조절가능
		setLayout(null);
		
		
		JPanel p1=new JPanel();
		p1.setBounds(100,0,100,100);
		p1.setBackground(Color.MAGENTA);
		p1.setLayout(new BorderLayout());
		
		JPanel p2=new JPanel();
		p2.setBackground(Color.CYAN);
		p2.setLayout(new FlowLayout(FlowLayout.RIGHT));//오른쪽정렬
		p2.setBounds(200,0,100,100);
		
		for(int i=0;i<5;i++) {
			p2.add(new JLabel(i+"번 조현!"));
		}
		
		
		JLabel name=new JLabel("이름");
		name.setSize(100,30);
		name.setLocation(50,50);
		
		JButton btn=new JButton("버튼");
		btn.setBounds(100,100,50,80);
		
		p1.add(name,"North");
		p1.add(btn,"South");
		
		add(p1);
		add(p2);
		
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	
}
