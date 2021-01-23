package com.poly.model.vo;

public class Person {
	private String name;
	private int age;
	private String address;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	@Override//부모한테 해당 객체가 있는지 확인
	public String toString() {//Object에 있는 toString메소드를 재정의 한것임.
		//return "Person 이름"+name+" 나이"+age+" 주소"+address;	
		return	 name+age+address;
	}
	
	@Override //선언부는 선언부는 똑같이써야한다.접근제한자, 반환형 메소드명 매개변수까지...
	public boolean equals(Object obj) {
		//객체가 같다고 판단할 수 있는 조건문 설정
		//멤버변수의 데이터를 기준으로 설정
		if(obj instanceof Person) {
		Person p=(Person)obj; //부모 객체는 자식 객체에 접근 불가 하므로 형변환하여 접근
		
		if(this.name.equals(p.getName())
				&&this.age==p.getAge()
				&&this.address.equals(p.getAddress())) {
			
			return true;  //같니? 응 같아.
			}
		
		}
		return false; //아니 달라.
	}
}
