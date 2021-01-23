package com.frameTest.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.frameTest.panel.view.LoginPanel;

public class BorderLayoutTest extends JFrame{
	public BorderLayoutTest() {
		setTitle("border레이아웃");
		setBounds(100,100,800,500);
		//레이아웃 설정하기
		setLayout(new BorderLayout());
		//레이아웃을 설정하지 않으면 기본으로 borderLayout이 설정됨.
		
		//레이아웃은 컴포넌트배치를 설정하는 것
		JButton btn=new JButton("왼쪽");
		JButton btn1=new JButton("오른쪽");
		JButton btn2=new JButton("위");
		JButton btn3=new JButton("아래");
		JButton btn4=new JButton("중앙");

		//생성된 컴포넌트를 borderLayout에 맞춰 배치  //크기설정은 안됨
		//"West","East","North","South" 첫글자 대문자로 쓰고 고정값임
		add(btn,"West");
		add(btn1,"East");
		add(btn2,"North");
		add(btn3,"South");  
//		add(btn4,"Center");
		add(new LoginPanel(),"Center");
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
