package com.changepanel.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame() {
		
		setTitle("panel변경하기");
		setBounds(100,100,300,200);
		
		//메인Panel누르면 서브Panel로 바뀌게...
		
		new MainPanel(this);//메인Panel넣기
		
		
		
		
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
}
