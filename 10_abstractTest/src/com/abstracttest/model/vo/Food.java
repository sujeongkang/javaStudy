package com.abstracttest.model.vo;
//abstract class는 미완성 클래스, 자체 생성불가 -->반드시 상속하여 객체생성
//abstract 메소드 없어도 abstract클래스 선언 가능
//단, abstract메소드가 있을 경우는 반드시 abstract클래스 선언
//abstract클래스내에 일반변수, 메소드 포함가능
//객체 생성은 안되지만, 참조형 변수타입으로는 가능.
//생성이 피룡없으면서 자체설계하지 않고 상속받아 써야하는 게  있을 때 씀
public abstract class Food{
//public class Food {
	
	private String kind;
	private String name;
	private String nation;
	private int portion;
	private int calory;
	
	public Food() {
		// TODO Auto-generated constructor stub
	}
	
	public Food(String kind, String name, String nation, int portion, int calory) {
		this.kind = kind;
		this.name = name;
		this.nation = nation;
		this.portion = portion;
		this.calory = calory;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public int getPortion() {
		return portion;
	}
	public void setPortion(int portion) {
		this.portion = portion;
	}
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}
	
	//alt+s+s+s
	@Override //Object.toString()메소드 재정의
	public String toString() {
		return "Food [kind=" + kind + ", name=" + name + ", nation=" + nation + ", portion=" + portion + ", calory="
				+ calory + "]";
	}
	
	
	
	
}
