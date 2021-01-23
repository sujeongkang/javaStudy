package com.inherit.model.vo;
//public class Student extends Person{
public class Student extends Teacher {
	//클래스 하나만 골라서 상속할 수 있음!
	//단, Person 상속받은 Teacher도 상속 받을 수 있다.
	//person이 할머니, teacher가 엄마, student이 자식

	// 이름, 나이, 주소, 전화번호, 학년, 반, 번호
//	private String name;
//	private int age;
//	private String address;
//	private String phone;
	private int grade;
	private int classRoom;
	private int number;

	// 기본생성자 만드는 단축키 ctrl space enter
	public Student() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 잇는 생성자 : alt+s+a+g
	//public Student(String name, int age, String address, String phone, 
	//		char gender, int grade, int classRoom, int number) {
	public Student(int grade, int classRoom, int number) {
		//기본 생성자에 없어도 상속받으면 default값으로 상속받은 공간이 생겨남.
		//super();
		//부모의 생성자를 호출
		//super();//부모의 기본생성자를 호출
		//super(name,age,address,phone,gender);//부모의 매개변수있는 생성자를 호출
		//반드시 첫줄에
		//부모생성자의 생성자 자료형 순서를및 개수 맞춰야함.
//		super.setName(name);
//		super.setAge(age);
//		super.setAddress(address);
//		super.setPhone(phone);
//		super.setGender(gender);
//		
//		if(name.length()>2) {
//			
//			this.name = name;
//		}
//		this.age = age;
//		this.address = address;
//		this.phone = phone;
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
	}

	// getter/setter만들기 alt s r a r
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		if(name.length()>2) {
//			
//			this.name = name;
//		}
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddress() {
		return "자식";
	}
	//자식객체에서 부모객체 변수에 접근하기
	public String information() {
		//부모객체에 접근하려면? ->super
		//부모변수의 접근제한자가 private면 
		//getter/setter를 이용해서 접근해야함.
		return super.getName()+" "+super.getAge()+" "+//부모의 name, age가져옴
				super.getAddress()+" "+super.getPhone()+" "+
				super.getGender()+" "+	//중복되는 메서드가 없을 때는 생략가능.둘다 있을 경우는 자기자신게 먼저 우선
				grade+" "+classRoom+" "+number;
		
		
	}
	
}
