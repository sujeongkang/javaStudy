package com.frameTest;

import javax.swing.JFrame;

public class MainFrameTest {
	
	public static void main(String[] args) {
		//������->������ â �Ѱ�
		JFrame f=new JFrame();
		f.setBounds(100,100,300,400);//â�� ���� ��ġ, ũ�� ����
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ư
		f.setVisible(true);//������ �������� ���̰� �ϴ� �Ӽ�
	}
}
