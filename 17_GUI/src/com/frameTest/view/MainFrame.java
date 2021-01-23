package com.frameTest.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		//setBounds(200, 200, 100, 100);//위치(x,y) 크기(width,height)
		//위에 한줄은 아래의 두줄로 표현가능
		setSize(400,300);//크기만 설정
		setLocation(300,300);
		
		//프레임에 제목설정
		setTitle("나의 첫 프레임~!");
		
		//프레임 icon설정하기
		try {
			setIconImage(ImageIO.read(new File("peng.jpg")));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//프레임 크기를 고정하기
		setResizable(false);
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
}
