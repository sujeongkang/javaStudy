package com.rent.model.vo;

public class Car {
	
	private String type;
	private String model;
	private String brand;
	private int price;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String type, String model, String brand, int price) {
		super();
		this.type = type;
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}
	
	

}
