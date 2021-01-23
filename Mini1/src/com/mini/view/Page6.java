package com.mini.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.rent.controller.Controller;
import com.rent.db.BookerDB;
import com.rent.db.CarDB;
import com.rent.model.vo.Booker;

public class Page6 extends JPanel{
	 private JFrame main;
	 private BookerDB bd=MainFrame.getDB();

	   
	   public Page6(JFrame main) {
	      this.main=main;
	      
	      setLayout(null);
	      setSize(1200,800);
	       
	      JLabel label1 = new JLabel("찾아주신 고객님 감사합니다.");
	      label1.setFont(new Font("굴림", Font.PLAIN, 40));
	      label1.setForeground(new Color(255, 255, 255));
	      label1.setBounds(335, 100, 530, 50);
	      add(label1);
	      
	      JLabel label2 = new JLabel("예약번호는 "+Controller.getReserveNo()+"입니다."); //예약번호 변수를 받아서 집어넣는다. 
	      label2.setFont(new Font("굴림", Font.PLAIN, 40));
	      label2.setForeground(new Color(255, 255, 255));
	      label2.setBounds(315, 200, 570, 50);
	      add(label2);
	   
	      JLabel label3 = new JLabel("\uC608\uC57D \uBC88\uD638\uB97C \uBC1C\uC1A1\uD588\uC2B5\uB2C8\uB2E4.");
	      label3.setFont(new Font("굴림", Font.PLAIN, 40));
	      label3.setForeground(new Color(255, 255, 255));
	      label3.setBounds(330, 300, 613, 50);
	      add(label3);
	      
		
	      JButton btn=new JButton("\uBA54\uC778\uD654\uBA74\uC73C\uB85C");
	      btn.setFont(new Font("굴림", Font.BOLD, 30));
	      btn.setForeground(new Color(255, 0, 0));
	      btn.setBackground(new Color(0, 0, 0));
	      btn.setBounds(419, 516, 329, 79);
	      
	      add(btn);
	      btn.addMouseListener(new MouseAdapter() {
		
	      @Override
	      public void mouseClicked(MouseEvent e) {
	    	  
	    	  CarDB.search.clear();
	    	  
	    	  Booker b=(Booker)BookerDB.getBk().get(BookerDB.getBk().size()-1);
		        b.setReserveNo(Controller.getReserveNo());
		        System.out.println(b);
		        ArrayList bb=BookerDB.getBk();
		        bd.fileSave(bb);
	    	  
	    	  setVisible(false);
	    	  new Page1(main).setVisible(true);
	    	  
	      }
	      
	      });
	      
	      
	      JLabel image = new JLabel("");//뒷배경화면.
	      image.setHorizontalAlignment(SwingConstants.CENTER);
	      image.setBounds(0, 0, 1200, 800);
	      add(image);
	      image.setIcon(new ImageIcon("avan3.jpg"));
	      
	   
	      
	      
	      
	      
	      
	   }
	   

}
