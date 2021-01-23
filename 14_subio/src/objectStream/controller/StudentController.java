package objectStream.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import objectStream.vo.Student;

public class StudentController { //�۵� �ȵ�
	private Student []students=new Student[2];
	public void saveData() {
		Scanner sc=new Scanner(System.in);
		Student students=null;
		System.out.println("======�л�����ϱ�=====");
		//for(int i=0;i<students.length;i++) {
			//Student s=new Student();
			students=new Student();
			System.out.print("�̸�: ");
			students.setName(sc.nextLine());
			System.out.print("����: ");
			students.setAge(sc.nextInt());
			System.out.print("�й�: ");
			students.setStudentID(sc.nextInt());
			sc.nextLine();		
			System.out.print("�а�: ");
			students.setDept(sc.nextLine());
			System.out.print("�г�:");
			students.setGrade(sc.nextInt());
			sc.nextLine();
			//students[i]=s;
				
		//}	
		//�Է¹��� �����͸� file�� ����	
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student.txt"))){
			//������ �ֱ�
		//for(Student s:students) {
			//oos.writeObject(students);
			oos.writeObject(students);//��Ʈ���� �ٲ�� �������� �� �ҷ����Ƿ� ��°�� ���� �ʿ�
		//}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void loadData() {
		Student [] students=new Student[2];
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student.txt"))){
			
				for(int i=0;i<students.length;i++) {
					
					students[i]=(Student)ois.readObject();
				}
			
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			System.out.println("������ ��� �ҷ��Խ��ϴ�.");
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("=====�ҷ��� ����======");
		for(Student s: students) {
			System.out.println(s);
		}
		
		//EOFException �� �о��µ� �� ��?
	}
}
