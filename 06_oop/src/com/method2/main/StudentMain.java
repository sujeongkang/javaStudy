package com.method2.main;
import com.method2.controller.StudentController;
import com.method2.model.vo.Student;

public class StudentMain {
	
	public static void main(String[] args) {
		StudentController con=new StudentController();
		Student s=con.insertStudent();
		String result="�̸�: "+s.getName()+"\n�г�: "+s.getGrade()+"\n����: "+s.getKor()+"\n����: "+s.getMath()+"\n����: "+s.getEng()+"\n����: "+s.getSum()+"\n���: "+s.getAvg();
		System.out.println(result);
	}
}
