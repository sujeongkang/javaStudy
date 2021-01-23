package com.kh.hw.shape.model.vo;

public class Shape {
	private String type;
	private double height;
	private double width;
	private String color;

	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public Shape(String type, double height, double width, String color) {
		this.type = type;
		this.height = height;
		this.width = width;
		this.color = color;
	}

	public String information() {
		return height+" "+width+" "+color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
