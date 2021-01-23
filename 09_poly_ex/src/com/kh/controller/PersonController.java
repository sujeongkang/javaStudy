package com.kh.controller;

import com.kh.model.vo.Driver;
import com.kh.model.vo.Employee;
import com.kh.model.vo.Person;
import com.kh.model.vo.Student;

public class PersonController {

	public static void main(String[] args) {

		Person[] persons = new Person[10];
		persons[0] = new Driver("톰", 25, '남', 5, true);
		persons[1] = new Student("미라", 18, '여', 3, 6, 1);
		persons[2] = new Student("준", 15, '남', 2, 5, 7);
		persons[3] = new Driver("수잔", 35, '여', 10, false);
		persons[4] = new Employee("아톰", 25, '남', "개발부", "팀장", 500);
		persons[5] = new Driver("해리", 55, '남', 25, true);
		persons[6] = new Employee("아리아", 35, '여', "연구부", "부장", 1000);
		persons[7] = new Student("라라", 13, '여', 6, 5, 8);
		persons[8] = new Employee("노아", 55, '남', "개발부", "과장", 1500);

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
		System.out.println("등록된 사람수: " + personCount + "명");
		System.out.println("학생: " + studentCount + "명");
		System.out.println("회사원: " + employeeCount + "명");
		System.out.println("운전수: " + driverCount + "명");

		
			System.out.println("===학생====");
			for (int i = 0; i < persons.length; i++) {
				if(persons[i] instanceof Student){
					Student s=(Student) persons[i];
					System.out.println(s.getName()+", "+s.getAge()+", "+s.getGender()+"살, "+s.getGrade()+" 학년, "+s.getBan()+"반, "+s.getNumber()+"번");
				}
			}
			System.out.println("===회사원====");
			for (int i = 0; i < persons.length; i++) {
				if (persons[i] instanceof Employee) {
					Employee e = (Employee) persons[i];
					System.out.println(e.getName() + ", " + e.getAge() + "살, " + e.getGender() + ", 부서: " + e.getDepartment()+"직책: "+ e.getPosition()+" 월급:  "
							+ e.getSalary());
				} 
			}
			System.out.println("===운전자====");
			for (int i = 0; i < persons.length; i++) {
				if(persons[i] instanceof Driver) {
					Driver d=(Driver)persons[i];
					System.out.println(d.getName()+", "+d.getAge()+"살, "+d.getGender()+" 경력: "+d.getCareer()+"년, 사고이력: "+d.isAccident());
				}
			}

	}

	

}
