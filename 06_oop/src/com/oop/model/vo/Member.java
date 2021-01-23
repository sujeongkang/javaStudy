package com.oop.model.vo;
//생성자 테스트 객체
public class Member {
	private String name;
	private String memberId;
	private String memberPw;
	private String phone;
	private String personNo;
	private int memberNo;
	private static int count;
	//고정하여 값이 생성되고 유지하기 위해  static 공간에 넣음. static 공간->공용사용공간
	//객체 내에 생성자를 작성하지 않으면
	//기본생성자를 자동으로 생성하여 컴파일함.
	
	//기본생성자 선언!
	//기본생성자: 처리하는 로직 없음. 매개변수도 없음
	//접근제한자(public) 클래스명(){}
	public Member() {
		memberId="test";
		System.out.println("기본생성자 호출!");
	} //매개변수 생성자가 하나라도 있으면 default생성자도 꼭!
	
	//매개변수가 있는 생성자
	public Member(String memberId, String memberPw, String name, String phone, String personNo) {
		System.out.println("매개변수 memberId: "+memberId);
		System.out.println("매개변수 memberPw: "+memberPw);
		System.out.println("매개변수 name: "+name);
		System.out.println("매개변수 phone: "+phone);
		System.out.println("매개변수 personNo: "+personNo);
		this.memberId=memberId;
		this.memberPw=memberPw;
		this.name=name;
		this.phone=phone;
		this.personNo=personNo;
	}
	//객체의 일부멤버변수만 초기화하는 매개변수 있는 생성자
	//오버로딩
	public Member(String memberId, String memberPw) {
		this.memberId=memberId;
		this.memberPw=memberPw;
	}
	
	public Member(String name, String phone, String personNo) {
		
	}
//	public Member(String memberId, String memberPw, String name) {
//		//매개변수의 자료형이나 수를 보고 구분/변수명으로 구분 불가.
//	}
	
	public Member(String name, String phone, int personNo) {
		
	}
	
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setMemberId(String id) {
		this.memberId=id;
	}
	public String getMenberId() {
		return memberId;
	}
//	public void setMemberPw(String memberPw) {
//		this.memberPw=memberPw;
//	}
	public void setMemberPw(String pw) {
		memberPw=pw;//this 안쓸경우 기본적으로 중괄호 안에서는 이름이 동일한 변수를 먼저 접근. 노란줄-로컬변수{}안에서만 쓸수 있음.
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setPersonNo(String no) {
		personNo=no;
	}
	public String getPersonNo() {
		return personNo;
	}
	//외부에서 수정을 못하게 set을 만들어주지 않음!
	public int getMemberNo() {
		return memberNo;
	}
	
}
