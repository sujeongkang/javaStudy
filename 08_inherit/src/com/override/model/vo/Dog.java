package com.override.model.vo;

public class Dog extends Animal {
	
	public Dog(String category, String name, char gender, String diet) {
		super(category,name,gender,diet);
	}
	//오버라이딩 처리하여 맞게 변경,재정의
	//메소드 선언부는 부모의 메소드와 동일하게 작성함
	//구현부는 각 객체에 맞게 로직을 구성
	//메소드선언부 위에 어노이테션 Override
	@Override
	public String bark() {
	//protected String bark() { //에러
		//접근제한자 Cannot reduce the visibility of the inherited method from Animal
		//부모가 선언한 접근제한자 보다 작게 하면 에러발생
	//@Override
	//public String barkbark() {	
		//@Override 선언시  선언하자마자 부모클래스에 barkbark가 있는지 자동 검색. 없으면 에러
		//없는 경우 에러. 안해도 되긴하지만 하는게 정확
		return "에프에프에프";
	}
	@Override
	public String info() {
		return "재정의";
	}
	@Override
	public double calculator(int su, int su2) { 
		//오버라이딩 선언부는 매개변수까지 완전히 똑같아야함.
		return su*su2;
	}
	
}
