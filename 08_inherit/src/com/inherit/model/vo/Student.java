package com.inherit.model.vo;
//public class Student extends Person{
public class Student extends Teacher {
	//Ŭ���� �ϳ��� ��� ����� �� ����!
	//��, Person ��ӹ��� Teacher�� ��� ���� �� �ִ�.
	//person�� �ҸӴ�, teacher�� ����, student�� �ڽ�

	// �̸�, ����, �ּ�, ��ȭ��ȣ, �г�, ��, ��ȣ
//	private String name;
//	private int age;
//	private String address;
//	private String phone;
	private int grade;
	private int classRoom;
	private int number;

	// �⺻������ ����� ����Ű ctrl space enter
	public Student() {
		// TODO Auto-generated constructor stub
	}

	// �Ű����� �մ� ������ : alt+s+a+g
	//public Student(String name, int age, String address, String phone, 
	//		char gender, int grade, int classRoom, int number) {
	public Student(int grade, int classRoom, int number) {
		//�⺻ �����ڿ� ��� ��ӹ����� default������ ��ӹ��� ������ ���ܳ�.
		//super();
		//�θ��� �����ڸ� ȣ��
		//super();//�θ��� �⺻�����ڸ� ȣ��
		//super(name,age,address,phone,gender);//�θ��� �Ű������ִ� �����ڸ� ȣ��
		//�ݵ�� ù�ٿ�
		//�θ�������� ������ �ڷ��� �������� ���� �������.
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

	// getter/setter����� alt s r a r
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
		return "�ڽ�";
	}
	//�ڽİ�ü���� �θ�ü ������ �����ϱ�
	public String information() {
		//�θ�ü�� �����Ϸ���? ->super
		//�θ𺯼��� ���������ڰ� private�� 
		//getter/setter�� �̿��ؼ� �����ؾ���.
		return super.getName()+" "+super.getAge()+" "+//�θ��� name, age������
				super.getAddress()+" "+super.getPhone()+" "+
				super.getGender()+" "+	//�ߺ��Ǵ� �޼��尡 ���� ���� ��������.�Ѵ� ���� ���� �ڱ��ڽŰ� ���� �켱
				grade+" "+classRoom+" "+number;
		
		
	}
	
}
