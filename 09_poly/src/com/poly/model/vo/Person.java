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
	@Override//�θ����� �ش� ��ü�� �ִ��� Ȯ��
	public String toString() {//Object�� �ִ� toString�޼ҵ带 ������ �Ѱ���.
		//return "Person �̸�"+name+" ����"+age+" �ּ�"+address;	
		return	 name+age+address;
	}
	
	@Override //����δ� ����δ� �Ȱ��̽���Ѵ�.����������, ��ȯ�� �޼ҵ�� �Ű���������...
	public boolean equals(Object obj) {
		//��ü�� ���ٰ� �Ǵ��� �� �ִ� ���ǹ� ����
		//��������� �����͸� �������� ����
		if(obj instanceof Person) {
		Person p=(Person)obj; //�θ� ��ü�� �ڽ� ��ü�� ���� �Ұ� �ϹǷ� ����ȯ�Ͽ� ����
		
		if(this.name.equals(p.getName())
				&&this.age==p.getAge()
				&&this.address.equals(p.getAddress())) {
			
			return true;  //����? �� ����.
			}
		
		}
		return false; //�ƴ� �޶�.
	}
}
