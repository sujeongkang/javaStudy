package objectStream.vo;

import java.io.Serializable;

public class Student implements Serializable{//직렬화 처리
	/**
	 * 
	 */
	private static final long serialVersionUID = -6483663832239801599L;
	private String name;
	private int age;
	private int studentID;
	private String dept;
	private int grade;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int studentID, String dept, int grade) {
		this.name = name;
		this.age = age;
		this.studentID = studentID;
		this.dept = dept;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentID=" + studentID + ", dept=" + dept + ", grade="
				+ grade + "]";
	}
	
	
	
}
