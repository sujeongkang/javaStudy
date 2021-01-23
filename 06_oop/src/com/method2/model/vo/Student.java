package com.method2.model.vo;

public class Student {
//Student°´Ã¼ »ý¼º name, grade, kor, math, eng, sum, avg
	private String name;
	private int grade;
	private int kor;
	private int math;
	private int eng;
	private int sum;
	private double avg;
	
	public Student(){};
	public Student(String name, int grade, int kor, int math, int eng, int sum, double avg){
		this.name=name;
		this.grade=grade;
		this.kor=kor;
		this.math=math;
		this.eng=eng;
		this.sum=sum;
		this.avg=avg;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public int getGrade() {
		return grade;
	}
	public void setKor(int kor) {
		this.kor=kor;
	}
	public int getKor() {
		return kor;
	}
	public void setMath(int math) {
		this.math=math;
	}
	public int getMath() {
		return math;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public int getEng() {
		return eng;
	}
	public void setSum(int sum) {
		this.sum=sum;
	}
	public int getSum() {
		return sum;
	}
	public void setAvg(double avg) {
		this.avg=avg;
	}
	public double getAvg() {
		return avg;
	}
	
	
}
