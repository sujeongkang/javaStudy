package com.mini.controller;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.rent.db.BookerDB;


public class ChangePanelHandler2 extends MouseAdapter{
	private JFrame main;
	private JPanel prev;
	private JPanel next;
	
	public ChangePanelHandler2(JFrame main, JPanel prev,JPanel next) {
		
		this.main=main;
		this.prev=prev;
		this.next=next;
		
		
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {

			main.remove(prev);
			//BookerDB.bk.remove(BookerDB.bk.size()-1);
			main.add(next);
			next.setVisible(true);
			
			next.revalidate();
		
		
			main.repaint();
		
		
	}
}
