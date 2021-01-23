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
	
	//�͸�Ŭ������ �̿��ؼ� �̺�Ʈ �����ϱ�
	public static void main(String[] args) {
		AnnonyEvent an=new AnnonyEvent();
		
		
		JFrame f=new JFrame();
		
		f.setBounds(100,100,400,500);
		JPanel p=new JPanel();  //�Ʒ��� JButton�� JLabel�� �ǳڿ� �ְ�
		JButton btn=new JButton("�̺�Ʈ �ǽ�!");
		
		JLabel str=new JLabel();
		p.add(btn);
		p.add(str);
		
		
		
		
		//��ư�� �̺�Ʈ �����ϱ�
		btn.addMouseListener(new MouseListener() {
			//alt s v
		
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("��ư Ŭ����!!!");
				str.setText("��ư����!!");
				System.out.println(e.getSource());
				//JButton btn=(JButton)e.getSource();
				btn.setText("��ưŬ����");
				btn.setBackground(Color.blue);//�����ٲٱ�
				btn.setForeground(Color.white);//���ڻ� �ٲٱ�
				System.out.println(e.getX()+" : "+e.getY());
			
			}

			@Override
			public void mousePressed(MouseEvent e) {
				//�������� Ư�� �̺�Ʈ�߻���ų��!
				System.out.println("���콺����!");
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("���콺��������!");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("���콺����!");
				JButton btn=(JButton)e.getSource();
				btn.setBackground(Color.CYAN);
				
				
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("���콺����!");
				JButton btn=(JButton)e.getSource();
				btn.setBackground(Color.MAGENTA);
			}

			
		});
		
		JTextField text=new JTextField(10);
		p.add(text);
		
		
		//�ܺΰ�ü�� �̿��� �̺�Ʈ ó��!
		str.addMouseListener(new MouseEventHandler());
		
		
		
		
		
		//�̺�Ʈ �����ϱ�
		//���� �̺�Ʈ�ڵ鷯 Ŭ������ �̿��ؼ� ó��  //����Ŭ������ ������ ���ؼ� ������ ����
		text.addKeyListener(an.new TextEventHandler());
		
		
		JButton btn2=new JButton("��ư�ϱ�!");
		btn2.addMouseListener(new MouseAdapterTest(text,p));
		p.add(btn2);
		//�̺�Ʈ�� �ɶ��� �����ʸ� ��!!! ���ϰ�
		//�ִ� �� �� �����ؾ��� ������ ���� implements MouseListener
		//�Ϻθ� ���� �� �Ÿ� ����� ��� extends MouseAdapter
		
		
		
		f.add(p); //�ǳ��� �����ӿ� ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}
	
	//�̺�Ʈ ó�� ���� Ŭ����!
	class TextEventHandler implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("Ű����ġ������");
			System.out.println(e.getKeyChar());
		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("Ű���崩��");

		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("Ű�����!");
			
			//System.out.println(e.getKeyChar());//������ ���� Ȯ��
			JTextField text=(JTextField)e.getSource();
			if(text.getText().length()>5) {
				System.out.println("���� 5���̻� �Է���!");
			}
			//e.isAltDown()//Alt ������ ������ ��
			
		}
		
	}
	
	
	
	
}
