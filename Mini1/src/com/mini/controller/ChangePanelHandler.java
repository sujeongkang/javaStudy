package com.mini.controller;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.mini.view.Page2;
import com.mini.view.Page3;


public class ChangePanelHandler extends MouseAdapter{
	private JFrame main;
	private JPanel prev;
	private JPanel next;
	
	public ChangePanelHandler(JFrame main, JPanel prev,JPanel next) {
		
		this.main=main;
		this.prev=prev;
		this.next=next;
		
		
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("»£¿’");
		
		main.remove(prev);
//		main.invalidate();
//		System.out.println(next);
		if(prev instanceof Page2) {
			JPanel p=new Page3(main,prev);
			main.add(p);
			p.revalidate();
		}else {
			main.add(next);
			next.setVisible(true);
			
			next.revalidate();
		}
		
		main.repaint();
		
		
	}
}

