package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	
	private Shape s=new Shape();
	
	public double calcPerimeter(double height, double width) {
		s=new Shape(null, height, width,null);
		double round=(height*2)+(width*2);
		return round;
	}
	
	public double calcArea(double height,double width) {
		s=new Shape(null, height, width,null);
		double area=height*width;
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
