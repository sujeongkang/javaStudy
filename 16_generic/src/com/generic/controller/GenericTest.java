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
		
		//���׸��̶�
		//Ŭ���� ����ÿ� �ڷ����� ������ �ʰ� �����ÿ� �ڷ����� Ȯ������ ���
		//�������, �޼ҵ� ��ȯ��, �޼ҵ� �Ű����� �ڷ��� ����
		//Collection���� ����
		
		ArrayList<Student> students=new ArrayList();//�л���ü�� �����Ҳ���!
		
		students.add(new Student("������",3,1));
		students.add(new Student("������",2,22));
		students.add(new Student("������",2,33));
		
		//students.add(new Date());//��.. � ���̾�.. �л������϶�..����
		
		students.get(0).getName();//����ȯ �������ϳ�, ���׸����п� ����ȯ ���ص���
		//((Student)students.get(0)).getName();
		
		
		ArrayList<String> names=new ArrayList(); //�Ȱ��� ���������� ���׸��� ���� �� �� �ִ� ���� �޶���.
		names.add("������");
		names.add("�����");
		//names.add(new Student());//��Ʈ���� ����.������
		
		Set<Integer> number=new HashSet<Integer>();//�յڿ� ���ϴ� ���� ������
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		//number.add
		Set<Student> s=new HashSet<Student>(students);
		
		Iterator<Student> it=s.iterator();
		while(it.hasNext()) {
			//�л��̸��� ����ϼ���.
			System.out.println(it.next().getName()); //����ȯ �ʿ����!!!
			
		}
		
		HashMap<String, Student> studentsMap=new HashMap();//map�� ��� Ű���̶� ������ �Ѵ� ����
		studentsMap.put("1", new Student("�����",3,1));
		studentsMap.put("2", new Student("������",3,2));
		studentsMap.put("3", new Student("�̼���",2,1));
		studentsMap.put("4", new Student("������",3,1));

		//��ȸ�ϱ�! �г��� 3�г��� ����� �̸��� ���
		System.out.println("===3�г� ���=====");
		Set<String> key=studentsMap.keySet();
		Iterator<String> it1=key.iterator();
		while(it1.hasNext()) {
			Student s1=studentsMap.get(it1.next());
			if(s1.getGrade()==3) {
				
				System.out.println(s1.getName());
				//System.out.println(((Student)s1).getName());//���׸��� ��������
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
		g.setTestValue("�ȳ�");
		System.out.println(g.getTestValue());
		MyGeneric<ArrayList<Integer>,HashMap>arr=new MyGeneric();
		arr.setTestValue(new ArrayList());
		
		//arr.getTestValue().add(new Student());
		
	}


}
