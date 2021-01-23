package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	private Shape s=new Shape();
	
	public double calcArea(double height,double width) {
		s=new Shape(null, height, width,null);
		double area=height*width/2;
		return area;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		String print=s.information();
		return print;
	}
	
	
}
