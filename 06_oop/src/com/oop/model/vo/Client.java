package com.oop.model.vo;

public class Client {
	//id,pw,email,����->������->����->�ڷ���������
	private String id;//ȸ�����̵� 4~8���� ����
	private String pw;//ȸ����й�ȣ 8���� �̻�
	private String email;//ȸ�� �̸����ּ�
	private double point;//���ƿ� ���Ƚ��
	
	//��ü�� �����Ҷ� �ʿ��� ������ �ۼ�
	//�⺻������
	public Client() {
		//this()   -->  this�����ڴ� �ݵ�� ������ ������ ����Ǿ�� �Ѵ�. �ؿ� ����  �����߻�
		// this�����ڳ����� �ش�Ŭ������ �ٸ� �������� �ϳ��� ȣ���Ҷ� ���.
		//�����ڴ� Ÿ�Ժ��� ����
		
		this("userId","1111","prinrt"); 
		this.point=100.10;
//		this.id="uderId";
//		this.pw="1111";
//		this.email="print";
//		this.point=0.0;
	}
	
	//�Ű����� �ִ� ������
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

	//getter/setter->��ü�� ������ ������ �����ؼ� ���� �������� ���� �����ϴ� ����ϴ� ��

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