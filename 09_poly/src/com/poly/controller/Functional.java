package com.poly.controller;

import com.poly.model.vo.Employee;
import com.poly.model.vo.Person;
import com.poly.model.vo.Singer;

public class Functional {
	//�����ε�
//	//Employee������ ����ϴ� ���
//	public void print(Employee e) {
//		System.out.println(e.getName()+e.getAge()+e.getAddress());
//	}
//	//Singer������ ����ϴ� ���
//	public void print(Singer s) {
//		System.out.println(s.getName()+s.getAge()+s.getAddress());
//	}
	
	
	//�������� �̿��ϸ� �����ε��� ���� �� �ִ�.
	//�������� ��������: ���
	public void print(Person p) {//p���� ��Ư�� �ټ��� ��ü (Person�� ��ӹ��� ��� ��ü)�� �� �� �ִ�.
		//������ ��ӹ޴� ��� ��ü instanceof ���������� ��ӹ��� Ŭ������.
		if(p instanceof Employee) {//�����  equals()�޼ҵ�
			//instanceof ->type�� ��. type ���氡���ϴ� ?  /equals,== ���� ��/ 
			//employee ��� �������
			System.out.println(p.getName()+p.getAge()
			+p.getAddress()+((Employee)p).getDeparment()
			+((Employee)p).getJob()+((Employee)p).getSalary());
		}else if(p instanceof Singer) {
			//Singer ������� ���
			System.out.println(p.getName()+p.getAge()
			+p.getAddress()+((Singer)p).getTitle()
			+((Singer)p).getYear()+((Singer)p).getGenre());
		}else if(p instanceof Person) {
			System.out.println("person�̾�!");
		}
		
	}
}
