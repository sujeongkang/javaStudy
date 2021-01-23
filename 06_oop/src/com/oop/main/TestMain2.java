package com.oop.main;

import com.oop.model.vo.Board;

public class TestMain2 {
	public static void main(String[] args) {
		Board b1=new Board(0,"Áø´Þ·¡","±è¼Ò¿ù","2020-01-01",0);
		Board b2=new Board(0,"º°Çì´Â ¹ã¿¡","À±µ¿ÁÖ","2000-07-04",0);
		Board b3=new Board(0,"´ÔÀÇ Ä§¹¬","ÇÑ¿ë¿î","2010-08-12",0);
		
		System.out.println(b1.getNumber()+" "+b1.getTitle()+" "+b1.getWriter()+" "+b1.getDate()+" "+b1.getViews());
		System.out.println(b2.getNumber()+" "+b2.getTitle()+" "+b2.getWriter()+" "+b2.getDate()+" "+b2.getViews());
		System.out.println(b3.getNumber()+" "+b3.getTitle()+" "+b3.getWriter()+" "+b3.getDate()+" "+b3.getViews());

	}
}
