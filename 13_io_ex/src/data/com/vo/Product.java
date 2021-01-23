package data.com.vo;

import java.io.Serializable;

public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6881847626136005348L;
	private String name;
	private int price;
	private int count;
	private double discount;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price, int count, double discount) {
		this.name = name;
		this.price = price;
		this.count = count;
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", count=" + count + ", discount=" + discount + "]";
	}
	
}
