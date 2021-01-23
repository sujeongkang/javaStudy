package objectStream.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import objectStream.vo.Student;

public class StudentController { //작동 안됨
	private Student []students=new Student[2];
	public void saveData() {
		Scanner sc=new Scanner(System.in);
		Student students=null;
		System.out.println("======학생등록하기=====");
		//for(int i=0;i<students.length;i++) {
			//Student s=new Student();
			students=new Student();
			System.out.print("이름: ");
			students.setName(sc.nextLine());
			System.out.print("나이: ");
			students.setAge(sc.nextInt());
			System.out.print("학번: ");
			students.setStudentID(sc.nextInt());
			sc.nextLine();		
			System.out.print("학과: ");
			students.setDept(sc.nextLine());
			System.out.print("학년:");
			students.setGrade(sc.nextInt());
			sc.nextLine();
			//students[i]=s;
				
		//}	
		//입력바은 데이터를 file에 저장	
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student.txt"))){
			//데이터 넣기
		//for(Student s:students) {
			//oos.writeObject(students);
			oos.writeObject(students);//스트림이 바뀌면 마지막것 만 불러오므로 통째로 저장 필요
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
			System.out.println("파일을 모두 불러왔습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("=====불러온 내용======");
		for(Student s: students) {
			System.out.println(s);
		}
		
		//EOFException 다 읽었는데 왜 또?
	}
}
