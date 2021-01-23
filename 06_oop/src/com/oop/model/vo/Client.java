package com.oop.model.vo;

public class Client {
	//id,pw,email,평점->데이터->변수->자료형변수명
	private String id;//회원아이디 4~8글자 설정
	private String pw;//회원비밀번호 8글자 이상
	private String email;//회원 이메일주소
	private double point;//좋아요 평균횟수
	
	//객체를 생성할때 필요한 생성자 작성
	//기본생성자
	public Client() {
		//this()   -->  this생성자는 반드시 무도건 맨위에 선언되어야 한다. 밑에 들어가면  에러발생
		// this생성자내에서 해당클래스의 다른 생성자중 하나를 호출할때 사용.
		//생성자는 타입별로 구분
		
		this("userId","1111","prinrt"); 
		this.point=100.10;
//		this.id="uderId";
//		this.pw="1111";
//		this.email="print";
//		this.point=0.0;
	}
	
	//매개변수 있는 생성자
	public Client (String id, String pw, String email, double point) {
		this.id=id;
		this.pw=pw;
		this.email=email;
		this.point=point;
	}
	public Client (String id, String pw, String email) {
		this(id,pw,email,0);
//		this.id=id;
//		this.pw=pw;
//		this.email=email;
	}	

	//getter/setter->객체에 생성된 변수에 접근해서 값을 가져오고 값을 대입하는 기능하는 것

	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw=pw;
	}
	public String getPw() {
		return pw;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setPoint(double point) {
		this.point=point;
	}
	public double getPoint() {
		return point;
	}

	
	
}