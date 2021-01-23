package objectStream.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import objectStream.vo.Student;

public class StudentDB {

	public void saveData() {
		Scanner sc=new Scanner(System.in);
		Student []students=new Student[2]; 
		
		
		System.out.println("======�л�����ϱ�=====");
		for(int i=0;i<students.length;i++) {
			Student s=new Student();
			s=new Student();
			System.out.print("�̸�: ");
			s.setName(sc.nextLine());
			System.out.print("����: ");
			s.setAge(sc.nextInt());
			System.out.print("�й�: ");
			s.setStudentID(sc.nextInt());
			sc.nextLine();		
			System.out.print("�а�: ");
			s.setDept(sc.nextLine());
			System.out.print("�г�:");
			s.setGrade(sc.nextInt());
			sc.nextLine();
			students[i]=s;	
		}	
		//�Է¹��� �����͸� file�� ����	
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student2.txt"))){
			//������ �ֱ�
		//for(Student s:students) {
			oos.writeObject(students);
			//��Ʈ���� �ٲ�� �ҷ��ü� ����. �ݺ������� ���ư� �� oos�� ���  �ٲ�. //��ü�� �����ؾ���.
		//oos.writeObject(s);
		//}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadData() {
		Student [] students=new Student[2];
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student2.txt"))){
			
					students=(Student[])ois.readObject();
				
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		//return Students;
		System.out.println("=====�ҷ��� ���� ���======");
		for(Student s: students) {
			System.out.println(s);
		}
		
		//EOFException �� �о��µ� �� ��?
	}
}

