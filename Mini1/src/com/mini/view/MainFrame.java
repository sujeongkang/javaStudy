package com.mini.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import com.rent.db.BookerDB;


public class MainFrame extends JFrame{
	 ImageIcon icon;
	   JScrollPane scrollPane;
	   
	   private static BookerDB db;
	   public static BookerDB getDB(){
	      if(MainFrame.db==null) {
	         MainFrame.db=new BookerDB();
	      }
	      return MainFrame.db;
	   }
	   
	   public MainFrame() {
	      
	      
	      setTitle("The Love ·»Æ®Ä« by Team. the LOVE Byte ");
	      setSize(1200,800);
	      setResizable(false);
	      setLocationRelativeTo(null);
	      
	      try {
	         setIconImage(ImageIO.read(new File("devil.jpg")));
	         }catch(IOException e) {
	            e.printStackTrace();
	         }
	      
	      new Page1(this);


	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	      setVisible(true);
	      
	   
	   }
	   
	   
	   
	}

