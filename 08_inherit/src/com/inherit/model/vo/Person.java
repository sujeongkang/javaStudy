package com.inherit.model.vo;

public class Person {
	private String name;
	private int age;
	private String address;
	private String phone;
	private char gender;

	public Person() {
		// 기본생성자를 만들면 상속 받는 곳에서 기본적으로 default값으로 만들어줌. 주석처리하면 에러
	}

	public Person(String name, int age, String address, String phone, char gender) {
		super();
		if (name.length() > 1) {
			this.name = name;

		}
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.gender = gender;

	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		if (name.length() > 1) {
			this.name = name;

		} else {
			System.out.println("이름은 두글자 이상 작성해야 합니다.");
		}

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
