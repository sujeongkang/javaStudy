package com.frameTest.layout;

import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame {
	public GridLayoutTest() {
		
		setTitle("GridLayout");
		setBounds(100,200,500,800);
		
		//���̾Ƽ� ����
		//�׸��巹�̾ƿ� �ٵ��ǽ����� ��ġ!
		setLayout(new GridLayout(5,5,10,10)); 
		//(5,5)�տ� low�� ����(�׻� �켱�õ�), �ڿ��� ���۳�Ʈ�� ���� �ڵ�����
		//(5,5,10,10)�ϸ� ������ ����.
		
//		for(int i=0;i<25;i++) {
//			add(new JButton(i+"��"));
//		}
		//������ �����
		Set number=new HashSet();
		while(number.size()!=25) {
			number.add(String.valueOf((int)(Math.random()*25)+1));
		}
		
		Iterator<String>it=number.iterator();
		
		for(int i=0;i<25;i++) {
				this.add(new JButton(it.next()));
			
			
		}
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
}
