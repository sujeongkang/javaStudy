package com.mini.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.mini.controller.ChangePanelHandler;

public class Page1 extends JPanel{

	private JFrame main;
	
	public Page1(JFrame main) {
		this.main=main;
		
		setLayout(null);
		setSize(1200,800);
		setBackground(Color.darkGray);
		JLabel grim=new JLabel(new ImageIcon("car2.jpg"));
		grim.setBounds(0, 0, 1200, 415);
		add(grim);
		
		
		JLabel lab1 = new JLabel("어서오세요.");
		lab1.setFont(new Font("고딕체", Font.PLAIN, 30));
		lab1.setForeground(Color.WHITE);
		lab1.setHorizontalAlignment(SwingConstants.CENTER);
		lab1.setBounds(502, 427, 184, 40);
		add(lab1);
		
		JLabel lab2 = new JLabel("The LOVE 렌트카입니다.");
		lab2.setForeground(Color.WHITE);
		lab2.setFont(new Font("고딕체", Font.PLAIN, 30));
		lab2.setHorizontalAlignment(SwingConstants.CENTER);
		lab2.setBounds(423, 477, 361, 40);
		add(lab2);
		
		JLabel lab3 = new JLabel("원하는 메뉴를 선택해주세요. ");
		lab3.setHorizontalAlignment(SwingConstants.CENTER);
		lab3.setForeground(Color.WHITE);
		lab3.setFont(new Font("고딕체", Font.PLAIN, 30));
		lab3.setBounds(394, 532, 420, 40);
		add(lab3);
		
		
		JButton btnBooking= new JButton("예약하기");
		btnBooking.setFont(new Font("고딕체", Font.PLAIN, 30));
		btnBooking.setForeground(Color.WHITE);
	    btnBooking.setBackground(new Color(204,51,51));
		btnBooking.setBounds(150, 600, 400, 150);
		add(btnBooking);
		
		JButton btnSearch= new JButton("예약조회");
		btnSearch.setFont(new Font("고딕체", Font.PLAIN, 30));
		btnSearch.setForeground(Color.WHITE);
	    btnSearch.setBackground(new Color(204,51,51));
		btnSearch.setBounds(650, 600, 400, 150);
		add(btnSearch);
	
		
		//화면전환	
		btnBooking.addMouseListener(new ChangePanelHandler(main,this,new Page2(main,this))); //
		btnSearch.addMouseListener(new ChangePanelHandler(main,this,new page1_2(main,this)));
		
		
		
		main.add(this);
		
	}	
	
}
