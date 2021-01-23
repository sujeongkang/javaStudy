package com.frameTest;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends JFrame {
	public Test()  {
		
		
		setTitle("CardLayout");
//		setBounds(100,100,800,800);
		setSize(800,800);
		setLocation(100,100);
		CardLayout card=new CardLayout();
		setLayout(card);
		
		
		JPanel card1=new JPanel();
		JPanel card2=new JPanel();
		JPanel card3=new JPanel();
		
		card1.setBackground(Color.cyan);
		card2.setBackground(Color.darkGray);
		card2.setBackground(Color.CYAN);
		
		card1.add(new JLabel("1"));
		card2.add(new JLabel("2"));
		card3.add(new JLabel("3"));
		
		
		add(card1);
		add(card2);
		add(card3);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
}
