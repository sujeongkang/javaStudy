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
		
		
		System.out.println("======학생등록하기=====");
		for(int i=0;i<students.length;i++) {
			Student s=new Student();
			s=new Student();
			System.out.print("이름: ");
			s.setName(sc.nextLine());
			System.out.print("나이: ");
			s.setAge(sc.nextInt());
			System.out.print("학번: ");
			s.setStudentID(sc.nextInt());
			sc.nextLine();		
			System.out.print("학과: ");
			s.setDept(sc.nextLine());
			System.out.print("학년:");
			s.setGrade(sc.nextInt());
			sc.nextLine();
			students[i]=s;	
		}	
		//입력바은 데이터를 file에 저장	
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student2.txt"))){
			//데이터 넣기
		//for(Student s:students) {
			oos.writeObject(students);
			//스트림이 바뀌면 불러올수 없다. 반복문으로 돌아갈 시 oos가 계속  바뀜. //전체를 저장해야함.
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
		System.out.println("=====불러온 내용 출력======");
		for(Student s: students) {
			System.out.println(s);
		}
		
		//EOFException 다 읽었는데 왜 또?
	}
}

