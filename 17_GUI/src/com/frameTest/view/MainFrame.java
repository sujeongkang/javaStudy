package com.frameTest.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		//setBounds(200, 200, 100, 100);//��ġ(x,y) ũ��(width,height)
		//���� ������ �Ʒ��� ���ٷ� ǥ������
		setSize(400,300);//ũ�⸸ ����
		setLocation(300,300);
		
		//�����ӿ� ������
		setTitle("���� ù ������~!");
		
		//������ icon�����ϱ�
		try {
			setIconImage(ImageIO.read(new File("peng.jpg")));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//������ ũ�⸦ �����ϱ�
		setResizable(false);
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
}
