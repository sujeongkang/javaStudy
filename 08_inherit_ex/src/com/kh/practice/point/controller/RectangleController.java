package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	Rectangle r=new Rectangle();
	
	public String calcArea(int x, int y,int height,int width) {
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		String result="면적: "+r.toString()+" / "+(height*width);
		return result;
	}
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		String result="면적: "+r.toString()+" / "+(2*(height+width));
		return result;
	}
	
}
