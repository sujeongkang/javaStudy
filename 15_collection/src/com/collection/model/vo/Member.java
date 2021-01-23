package com.collection.model.vo;

import java.util.Objects;

public class Member {
	private String id;
	private String pw;
	private String name;
	private int age;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Member) {
			Member m=(Member)o;
			if(this.id.equals(m.id)&&this.age==m.age) {
				return true;
			}
		}
		return false;
	}
	

	//set,Map���� ��ü�� �����ϰ� �ҷ��� 
	//�ּҰ��� ��ġ�ϰ� �������.
	
	@Override
	public int hashCode() {
		return Objects.hash(id,age);  //���ϼ��񱳸� ���ؼ��� ���� �Ű������� ��� �־�� �Ѵ�. ���ڴ� hash�ڵ尡 ���� �Ҵ�...
	}
	

}
