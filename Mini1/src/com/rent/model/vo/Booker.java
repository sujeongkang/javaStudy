
package com.rent.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Booker  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4904673580871736467L;
	
	private String type;
	private String model;
	private String brand;
	private int price;
	private String name;
	private String phone;
	private Calendar rent;
	private Calendar collect;
	private String license;
	private String birthday;
	private String reserveNo;
	private String insurance;
	
	SimpleDateFormat sdf=new SimpleDateFormat("YY년MM월dd일HH시");
	
	
	public Booker() {
		// TODO Auto-generated constructor stub
	}

	public Booker(String name, String phone, Calendar rent, Calendar collect, String license, String birthday,
			String reserveNo) {
		super();
		this.name = name;
		this.phone = phone;
		this.rent = rent;
		this.collect = collect;
		this.license = license;
		this.birthday = birthday;
		this.reserveNo = reserveNo;
	}
	
	
	
	


	public Booker(String type, String model, String brand, int price, String name, String phone, Calendar rent,
			Calendar collect, String license, String birthday, String reserveNo,String insurance) {
		super();
		this.type = type;
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.name = name;
		this.phone = phone;
		this.rent = rent;
		this.collect = collect;
		this.license = license;
		this.birthday = birthday;
		this.reserveNo = reserveNo;
		this.insurance = insurance;
		
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Calendar getRent() {
		return rent;
	}

	public void setRent(Calendar rent) {
		this.rent = rent;
	}

	public Calendar getCollect() {
		return collect;
	}

	public void setCollect(Calendar collect) {
		this.collect = collect;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getReserveNo() {
		return reserveNo;
	}

	public void setReserveNo(String reserveNo) {
		this.reserveNo = reserveNo;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}
	
	

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Booker [name=" + name + ", phone=" + phone + ", rent=" +sdf.format(rent.getTimeInMillis()) + ", collect=" + sdf.format(collect.getTimeInMillis()) + ", license="
				+ license + ", birthday=" + birthday + ", reserveNo=" + reserveNo + ", getType()=" + type
				+ ", getModel()=" + model + ", getBrand()=" + brand + ", getPrice()=" + price +", getInsurance()= "+getInsurance()+"]";
	}

//	@Override
//	public String toString() {
//		return "Booker [name=" + name + ", phone=" + phone + ", rent=" + sdf.format(rent.getTimeInMillis()) + ", collect=" + sdf.format(collect.getTimeInMillis()) + ", license="
//				+ license + ", birthday=" + birthday + ", reserveNo=" + reserveNo + "]";
//	}
	
	@Override
	public boolean equals(Object o) {
		
		
		if(o instanceof Booker) {
			Booker b=(Booker)o;
			if(this.reserveNo.equals(b.getReserveNo())) {
				return true;
			}
		}
		
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(reserveNo);
	}
	

	
}
