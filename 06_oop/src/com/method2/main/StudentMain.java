package com.method2.main;
import com.method2.controller.StudentController;
import com.method2.model.vo.Student;

public class StudentMain {
	
	public static void main(String[] args) {
		StudentController con=new StudentController();
		Student s=con.insertStudent();
		String result="이름: "+s.getName()+"\n학년: "+s.getGrade()+"\n국어: "+s.getKor()+"\n수학: "+s.getMath()+"\n영어: "+s.getEng()+"\n총점: "+s.getSum()+"\n평균: "+s.getAvg();
		System.out.println(result);
	}
}
