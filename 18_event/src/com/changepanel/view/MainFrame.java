package com.changepanel.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame() {
		
		setTitle("panel�����ϱ�");
		setBounds(100,100,300,200);
		
		//����Panel������ ����Panel�� �ٲ��...
		
		new MainPanel(this);//����Panel�ֱ�
		
		
		
		
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
}
