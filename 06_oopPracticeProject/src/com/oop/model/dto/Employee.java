package com.oop.model.dto;

import java.util.Scanner;

public class Employee {
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonus;
	private String phone;
	private String address;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonus,
			String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonus = bonus;
		this.phone = phone;
		this.address = address;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String newName) {
		this.empName = newName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void empInput() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("사원 정보를 입력하세요.");
		
		System.out.print("사번: ");
		int empNo=sc.nextInt();
		setEmpNo(empNo);
		
		System.out.print("이름: ");
		sc.nextLine();
		String name=sc.nextLine();
		setEmpName(name);
		
		System.out.print("소속부서: ");
		sc.nextLine();
		String dept=sc.nextLine();
		setDept(dept);
		
		System.out.print("직급: ");
		String job=sc.nextLine();
		setJob(job);
		
		System.out.print("나이: ");
		int age=sc.nextInt();
		setAge(age);
		System.out.print("성별: ");
		sc.nextLine();
		char gender=sc.nextLine().charAt(0);
		setGender(gender);
		System.out.print("급여: ");
		int salary=sc.nextInt();
		setSalary(salary);
		System.out.print("보너스포인트: ");
		double bonus=sc.nextDouble();
		setBonus(bonus);
		System.out.print("핸드폰: ");
		sc.nextLine();
		String phone=sc.nextLine();
		setPhone(phone);
		System.out.print("주소: ");
		sc.nextLine();
		String address=sc.nextLine();
		setAddress(address);
		
		
	}
	
	public void empOutput(Employee emp) {
		System.out.println(empNo+empName+dept+job+age+gender+salary+bonus+phone+address);
	}
}
