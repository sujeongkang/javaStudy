package com.generic.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.generic.model.vo.MyGeneric;
import com.generic.model.vo.Student;

public class GenericTest {
	
	public static void main(String[]args) {
		
		//제네릭이란
		//클래스 설계시에 자료형을 정하지 않고 생성시에 자료형을 확정짓는 방법
		//멤버변수, 메소드 반환형, 메소드 매개변수 자료형 선언
		//Collection에서 적용
		
		ArrayList<Student> students=new ArrayList();//학생객체만 저장할꼬얌!
		
		students.add(new Student("유병승",3,1));
		students.add(new Student("유다해",2,22));
		students.add(new Student("박현우",2,33));
		
		//students.add(new Date());//헐.. 어떤 놈이야.. 학생저장하라구..오류
		
		students.get(0).getName();//형변환 헀었야하나, 제네릭덕분에 형변환 안해도됨
		//((Student)students.get(0)).getName();
		
		
		ArrayList<String> names=new ArrayList(); //똑같이 선언했을때 제네릭에 따라 들어갈 수 있는 값이 달라짐.
		names.add("유병승");
		names.add("강경록");
		//names.add(new Student());//스트링만 가능.오류남
		
		Set<Integer> number=new HashSet<Integer>();//앞뒤에 다하는 것이 안정적
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		//number.add
		Set<Student> s=new HashSet<Student>(students);
		
		Iterator<Student> it=s.iterator();
		while(it.hasNext()) {
			//학생이름만 출력하세요.
			System.out.println(it.next().getName()); //형변환 필요없어!!!
			
		}
		
		HashMap<String, Student> studentsMap=new HashMap();//map의 경우 키값이랑 벨류값 둘다 설정
		studentsMap.put("1", new Student("김다희",3,1));
		studentsMap.put("2", new Student("정로희",3,2));
		studentsMap.put("3", new Student("이세현",2,1));
		studentsMap.put("4", new Student("남지선",3,1));

		//순회하기! 학년이 3학년인 사람의 이름만 출력
		System.out.println("===3학년 출력=====");
		Set<String> key=studentsMap.keySet();
		Iterator<String> it1=key.iterator();
		while(it1.hasNext()) {
			Student s1=studentsMap.get(it1.next());
			if(s1.getGrade()==3) {
				
				System.out.println(s1.getName());
				//System.out.println(((Student)s1).getName());//제네릭이 없었을때
			}
			
		}
		
		
		
		
		Set<Map.Entry<String, Student>> entry=studentsMap.entrySet();
		Iterator<Map.Entry<String,Student>> it2=entry.iterator();
		while(it2.hasNext()) {
			Map.Entry<String,Student> e=it2.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		for(Map.Entry<String, Student>e:studentsMap.entrySet()) {
			if(e.getValue().getGrade()==3) {
				System.out.println(e.getValue().getName());
			}
		}
		
		MyGeneric<String,Integer>g=new MyGeneric();
		g.setTestValue("안녕");
		System.out.println(g.getTestValue());
		MyGeneric<ArrayList<Integer>,HashMap>arr=new MyGeneric();
		arr.setTestValue(new ArrayList());
		
		//arr.getTestValue().add(new Student());
		
	}


}
