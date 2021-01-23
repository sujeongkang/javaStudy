package com.kh.model.vo;

public class Employee extends Person{
	private String department;
	private String position;
	private int salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String department, String position, int salary) {
		this.department = department;
		this.position = position;
		this.salary = salary;
	}
	public Employee(String name, int age, char gender, String department, String position, int salary) {
		super(name, age, gender);
		this.department = department;
		this.position = position;
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
