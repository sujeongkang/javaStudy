package com.inherit.model.vo;

public class Employee extends Person {
	// �̸�, ����,�ּ�,��ȭ��ȣ, �μ�, ��å, ����
//	private String name;
//	private int age;
//	private String address;
//	private String phone;
	private String deparment;
	private String job;
	private int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	// �Ű����� �մ� ������ : alt+s+a+g

	public Employee(String name, int age, String address, String phone, String deparment, String job, int salary) {
		super();
//		this.name = name;
//		this.age = age;
//		this.address = address;
//		this.phone = phone;
		this.deparment = deparment;
		this.job = job;
		this.salary = salary;
	}

	// getter/setter����� alt s r a r
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public int getAge() {
//		return age;
//	}
//
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//
//	public String getAddress() {
//		return address;
//	}
//
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//
//	public String getPhone() {
//		return phone;
//	}
//
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
