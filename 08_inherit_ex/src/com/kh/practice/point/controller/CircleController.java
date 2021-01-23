package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	Circle c=new Circle();
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		String result="면적: "+c.toString()+" / "+(Math.PI*radius*radius);
		return result;
		
	}
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		String result="둘레: "+c.toString()+" / "+(Math.PI*radius*2);
		return result;
	}
}
