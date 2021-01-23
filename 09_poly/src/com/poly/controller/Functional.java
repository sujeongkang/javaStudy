package com.poly.controller;

import com.poly.model.vo.Employee;
import com.poly.model.vo.Person;
import com.poly.model.vo.Singer;

public class Functional {
	//오버로딩
//	//Employee내용을 출력하는 기능
//	public void print(Employee e) {
//		System.out.println(e.getName()+e.getAge()+e.getAddress());
//	}
//	//Singer내용을 출력하는 기능
//	public void print(Singer s) {
//		System.out.println(s.getName()+s.getAge()+s.getAddress());
//	}
	
	
	//다형성을 이용하면 오버로딩을 줄일 수 있다.
	//다형성의 전제조건: 상속
	public void print(Person p) {//p에는 불특정 다수의 객체 (Person을 상속받은 모든 객체)가 들어갈 수 있다.
		//왼쪽은 상속받느 모든 객체 instanceof 오른쪽항은 상속받은 클래스명.
		if(p instanceof Employee) {//동등비교  equals()메소드
			//instanceof ->type을 비교. type 변경가능하니 ?  /equals,== 값을 비교/ 
			//employee 모든 정보출력
			System.out.println(p.getName()+p.getAge()
			+p.getAddress()+((Employee)p).getDeparment()
			+((Employee)p).getJob()+((Employee)p).getSalary());
		}else if(p instanceof Singer) {
			//Singer 모든정보 출력
			System.out.println(p.getName()+p.getAge()
			+p.getAddress()+((Singer)p).getTitle()
			+((Singer)p).getYear()+((Singer)p).getGenre());
		}else if(p instanceof Person) {
			System.out.println("person이야!");
		}
		
	}
}
