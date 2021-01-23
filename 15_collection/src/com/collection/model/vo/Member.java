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
	

	//set,Map에서 객체를 동일하게 불려면 
	//주소값도 일치하게 해줘야함.
	
	@Override
	public int hashCode() {
		return Objects.hash(id,age);  //동일성비교를 위해서는 비교한 매개변수를 모두 넣어야 한다. 글자당 hash코드가 각각 할당...
	}
	

}
