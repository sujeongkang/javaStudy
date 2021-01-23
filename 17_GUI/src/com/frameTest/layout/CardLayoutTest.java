package com.frameTest.layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutTest extends JFrame{


	public CardLayoutTest() {
		
		setTitle("cardLayout");
		setBounds(100,100,200,200);
		
		CardLayout card=new CardLayout();
		setLayout(card);
		
		JPanel card1=new JPanel();
		JPanel card2=new JPanel();
		JPanel card3=new JPanel();
		
		card1.setBackground(Color.red);
		card2.setBackground(Color.black);
		//card3.setBackground(Color.CYAN);
		card3.setBackground(new Color(255,0,255));//RGB3���� 0~255

		
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==1) {
					card.next(card1.getParent());
				}
			}
		});
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==1) {
					card.next(card2.getParent());
				}
			}
		});
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==1) {
					card.next(card3.getParent());
				}
			}
		});
		
		
		
		card1.add(new JLabel("card1"));
		card2.add(new JLabel("card2"));
		card3.add(new JLabel("card3"));
		
		
		JButton btn=new JButton("ũ�� ����!");
		btn.setSize(300,300);
		btn.setLocation(20,20); //������ �ִ� ��� ����....���� �ٲٰ� ������ nullLayout
		
		card1.add(btn);
		
	
		//�����ӿ� �ǳ� �߰��ϱ�
		add(card1);
		add(card2);
		add(card3);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
}
