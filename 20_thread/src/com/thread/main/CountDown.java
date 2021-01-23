package com.thread.main;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDown extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3820123844647125530L;
	
	private JLabel count;
	private JLabel baby;
	private JLabel baby2;
	private JLabel baby3;
	private int x=20,x2=20,x3=20;//JLabel의 위치값!
	private int second=10;
	
	
	public CountDown() {
		
		setTitle("카운드 다운");
		setBounds(100,100,600,600);
		setLayout(null);
		count=new JLabel("start");
		count.setFont(new Font("Serit",Font.BOLD,100));
		count.setBounds(20,0,100,200);
		add(count);
		//Label추가하기
		baby =new JLabel();
		baby.setIcon(new ImageIcon("baby.PNG"));
		baby.setBounds(20,80,200,100);
		baby2 =new JLabel();
		baby2.setIcon(new ImageIcon("baby.PNG"));
		baby2.setBounds(20,180,200,100);
		baby3 =new JLabel();
		baby3.setIcon(new ImageIcon("baby.PNG"));
		baby3.setBounds(20,280,200,100);
		
		add(baby);
		add(baby2);
		add(baby3);
		
		
		//countThread실행하기
		new CountThread().start();
		new Race().start();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	
	//baby움직이는 쓰레드 만들기
	private class Race extends Thread{
		
		@Override
		public void run() {
			try {
				Integer.parseInt(count.getText());
			}catch(NumberFormatException e) {
				count.setText("10");
			}
			
			//for(int i=0;second!=0;i++) {
			while(Integer.parseInt(count.getText())!=0) {	
				try{
					sleep(200);
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				x+=(int)(Math.random()*10);
				baby.setLocation(x, 80);//label의 위치 변경
				x2+=(int)(Math.random()*10);
				baby2.setLocation(x2, 180);
				x3+=(int)(Math.random()*10);
				baby3.setLocation(x3, 280);
			}
		}
	}
	
	
	
	
	
	private class CountThread extends Thread{
		@Override
		public void run() {
			for(int i=10;i>=0;i--) {
				try {
					sleep(1000);
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				count.setText(""+i);
				second=i;
			}
		}
	}
	
	public static void main(String [] args) {
		new CountDown();
	}
	

}
