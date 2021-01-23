package com.inherit.main;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.ObjectTest;
import com.inherit.model.vo.Student;
import com.inherit.model.vo.Teacher;

public class inheritUse {
	public static void main(String[] args) {
		//생각을 해보니, 내가 관리하고 있는 객체들의 (student, employee,teacher)
		//이름은 2글자 이상만 들어갈 수 있게 하자
		Teacher t=new Teacher();
		t.getName();
		t.getAge();
		t.setName("한");
		Student s=new Student();
		s.setName("한");
		Employee e=new Employee();
		e.setName("한");
		//관리하고 있는 전체 객체에 성별추가한다.
		//상속해주고 있는 부모 클래스 수정한다. 부모클래스만 수정하면 쉽게 수정및 추가가능
		e.setGender('남');
		s.setGender('여');
		t.setGender('M');
		s=new Student();
		System.out.println(s.information());
		s=new Student(3,1,2);
		System.out.println(s.information());
		//s.Person();
		s.getName();
		
		//모든 객체는 Object의 후손이다.
		//자바에서 Object 최상위 객체!! 
		ObjectTest test=new ObjectTest();//무조건 Object는 있다.
		//test.
		//s.
		Object obj; //자료형이 안맞아도 객체라면 다 담음.
		
	}
}
