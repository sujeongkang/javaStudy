package com.frameTest.view;


import javax.swing.JFrame;

public class InheritFrame extends JFrame{
	
	
	public InheritFrame() {
		//프레임이나 기본 container를 상속받은 클래스는
		//생성자에서 모든 설정을 지정함.
		//프레임 기본설정 3가지  //기본사항..
		//1.프레임의 크기, 위치 설정  ->setBounds(); //JFrame상속한 것
		setBounds(100,100,800,1000);   //앞에 두개는 위치, 뒤에 두개(가로,세로)는 크기
		
		//2.창의 닫는 이벤트 설정->setDefaultCloseOperation()
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.프레임객체는 기본적으로 안보이게 설정이 되어있음
		//setVisible() 메소드로 보이게 설정하기
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new InheritFrame(); //프레임하나가 생성!
	}
}
