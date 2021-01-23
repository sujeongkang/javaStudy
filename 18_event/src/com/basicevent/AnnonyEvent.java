package com.basicevent;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AnnonyEvent {
	
	//익명클래스를 이용해서 이벤트 적용하기
	public static void main(String[] args) {
		AnnonyEvent an=new AnnonyEvent();
		
		
		JFrame f=new JFrame();
		
		f.setBounds(100,100,400,500);
		JPanel p=new JPanel();  //아래의 JButton과 JLabel을 판넬에 넣고
		JButton btn=new JButton("이벤트 실습!");
		
		JLabel str=new JLabel();
		p.add(btn);
		p.add(str);
		
		
		
		
		//버튼에 이벤트 연결하기
		btn.addMouseListener(new MouseListener() {
			//alt s v
		
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("버튼 클릭함!!!");
				str.setText("버튼눌림!!");
				System.out.println(e.getSource());
				//JButton btn=(JButton)e.getSource();
				btn.setText("버튼클릭함");
				btn.setBackground(Color.blue);//배경색바꾸기
				btn.setForeground(Color.white);//글자색 바꾸기
				System.out.println(e.getX()+" : "+e.getY());
			
			}

			@Override
			public void mousePressed(MouseEvent e) {
				//눌렸을때 특정 이벤트발생시킬때!
				System.out.println("마우스눌림!");
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("마우스눌림해제!");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("마우스들어옴!");
				JButton btn=(JButton)e.getSource();
				btn.setBackground(Color.CYAN);
				
				
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스나감!");
				JButton btn=(JButton)e.getSource();
				btn.setBackground(Color.MAGENTA);
			}

			
		});
		
		JTextField text=new JTextField(10);
		p.add(text);
		
		
		//외부객체를 이용한 이벤트 처리!
		str.addMouseListener(new MouseEventHandler());
		
		
		
		
		
		//이벤트 연결하기
		//내부 이벤트핸들러 클래스를 이용해서 처리  //내부클래스라 접근을 못해서 위에서 생성
		text.addKeyListener(an.new TextEventHandler());
		
		
		JButton btn2=new JButton("버튼하기!");
		btn2.addMouseListener(new MouseAdapterTest(text,p));
		p.add(btn2);
		//이벤트를 걸때는 리스너를 꼭!!! 붙일것
		//있는 거 다 구현해쓰면 리스너 구현 implements MouseListener
		//일부만 구현 할 거면 어댑터 상속 extends MouseAdapter
		
		
		
		f.add(p); //판넬은 프레임에 넣음
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}
	
	//이벤트 처리 내부 클래스!
	class TextEventHandler implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("키보드치고있음");
			System.out.println(e.getKeyChar());
		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("키보드누름");

		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("키보드뗌!");
			
			//System.out.println(e.getKeyChar());//들어오는 글자 확인
			JTextField text=(JTextField)e.getSource();
			if(text.getText().length()>5) {
				System.out.println("문자 5개이상 입력합!");
			}
			//e.isAltDown()//Alt 누르고 있을때 등
			
		}
		
	}
	
	
	
	
}
