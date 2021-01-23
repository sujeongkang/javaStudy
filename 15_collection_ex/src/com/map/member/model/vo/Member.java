package com.map.member.model.vo;

import java.util.Objects;

public class Member implements Comparable<Member> {
	private String password;
	private String name;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String password, String name) {
		this.password = password;
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [password=" + password + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(name);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m =(Member)obj;
			if(this.name.equals((Member)obj)) {
				return true;
			}
		}
		return false;
	}

	

	@Override
	public int compareTo(Member m) {
		
		return this.name.compareTo(m.name);
	}
	
	
	
}
