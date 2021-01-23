package com.poly.model.vo;

public class Employee extends Person {
	private String deparment;
	private String job;
	private int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

	public Employee(String name, int age, String address, String deparment, String job, int salary) {
		super(name, age, address);
		this.deparment = deparment;
		this.job = job;
		this.salary = salary;
	}


	public Employee(String deparment, String job, int salary) {
		super();
		this.deparment = deparment;
		this.job = job;
		this.salary = salary;
	}

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
	@Override
	public String getName() {
		return "내가 누구게?";
	}
	
	
	@Override //동적바인딩의 전제조건
	public String toString() {
		//return "Employee부서"+deparment+"직책"+job+"월급"+salary;
		return getName()+getAge()+getAddress()+deparment+job+salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e=(Employee)obj;
			if(super.getName().equals(e.getName())
					&&this.salary==e.salary) {//내부클래스일때는 get생략가능 get붙여도 됨.
				
			}
		}
		return true;
	}
	@Override
	public Employee clone() {
		//깊은 복사
		return new Employee(getName(),getAge(),getAddress(), deparment,job,salary);
	}
}
