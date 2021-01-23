package com.frameTest.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlowLayoutTest extends JFrame {
	public FlowLayoutTest() {
		setTitle("Flow���̾ƿ�");
		setBounds(100,100,400,500);
		
		//���̾ƿ� ����
//		setLayout(new FlowLayout());  //default �߾�����
//		setLayout(new FlowLayout(FlowLayout.LEFT));//��������!
		setLayout(new FlowLayout(FlowLayout.RIGHT));//����������!
		//�������� �帧... ��ưũ����� ����
		
		for(int i=0;i<20;i++) {
			if(i%2==0) add(new JButton(i+"��"));
			else add(new JLabel("���ڸ�       "));
		}
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
