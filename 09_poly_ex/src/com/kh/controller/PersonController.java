package com.kh.controller;

import com.kh.model.vo.Driver;
import com.kh.model.vo.Employee;
import com.kh.model.vo.Person;
import com.kh.model.vo.Student;

public class PersonController {

	public static void main(String[] args) {

		Person[] persons = new Person[10];
		persons[0] = new Driver("��", 25, '��', 5, true);
		persons[1] = new Student("�̶�", 18, '��', 3, 6, 1);
		persons[2] = new Student("��", 15, '��', 2, 5, 7);
		persons[3] = new Driver("����", 35, '��', 10, false);
		persons[4] = new Employee("����", 25, '��', "���ߺ�", "����", 500);
		persons[5] = new Driver("�ظ�", 55, '��', 25, true);
		persons[6] = new Employee("�Ƹ���", 35, '��', "������", "����", 1000);
		persons[7] = new Student("���", 13, '��', 6, 5, 8);
		persons[8] = new Employee("���", 55, '��', "���ߺ�", "����", 1500);

		int personCount = 0;
		int studentCount = 0;
		int employeeCount = 0;
		int driverCount = 0;
		String StudentIn = "";

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null) {
				personCount++;
				if (persons[i] instanceof Student) {
					studentCount++;

				} else if (persons[i] instanceof Employee) {
					employeeCount++;
				} else if (persons[i] instanceof Driver) {
					driverCount++;
				}
			}
		}
		System.out.println("��ϵ� �����: " + personCount + "��");
		System.out.println("�л�: " + studentCount + "��");
		System.out.println("ȸ���: " + employeeCount + "��");
		System.out.println("������: " + driverCount + "��");

		
			System.out.println("===�л�====");
			for (int i = 0; i < persons.length; i++) {
				if(persons[i] instanceof Student){
					Student s=(Student) persons[i];
					System.out.println(s.getName()+", "+s.getAge()+", "+s.getGender()+"��, "+s.getGrade()+" �г�, "+s.getBan()+"��, "+s.getNumber()+"��");
				}
			}
			System.out.println("===ȸ���====");
			for (int i = 0; i < persons.length; i++) {
				if (persons[i] instanceof Employee) {
					Employee e = (Employee) persons[i];
					System.out.println(e.getName() + ", " + e.getAge() + "��, " + e.getGender() + ", �μ�: " + e.getDepartment()+"��å: "+ e.getPosition()+" ����:  "
							+ e.getSalary());
				} 
			}
			System.out.println("===������====");
			for (int i = 0; i < persons.length; i++) {
				if(persons[i] instanceof Driver) {
					Driver d=(Driver)persons[i];
					System.out.println(d.getName()+", "+d.getAge()+"��, "+d.getGender()+" ���: "+d.getCareer()+"��, ����̷�: "+d.isAccident());
				}
			}

	}

	

}
