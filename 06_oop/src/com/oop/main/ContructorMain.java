package com.oop.main;

import com.oop.model.vo.Member;

public class ContructorMain {
	public static void main(String[] args) {
		//"main"+ctrl+space+enter
		//객체생성
		Member m=new Member(); //기본 데이터가 변수 대입 ->기본 생성자를 호출
		m.setMemberId("admin");
		m.setMemberPw("1234");
		m.setName("유병승");
		m.setPhone("01036446259");
		m.setPersonNo("010224-1234567");
		
		System.out.println(m.getMemberNo()
				+" "+m.getMenberId()
				+" "+m.getMemberPw()
				+" "+m.getName()
				+" "+m.getPhone()
				+" "+m.getPersonNo());
		
		
		//매개변수있는 생성자 이용
		Member m2=new Member("user01","4444",
				"이세현","01012341234","94004261234567");
		
		System.out.println(m2.getMemberNo()
				+" "+m2.getMenberId()
				+" "+m2.getMemberPw()
				+" "+m2.getName()
				+" "+m2.getPhone()
				+" "+m2.getPersonNo());
		
		//일부 변수만 초기화하는 생성자 이용
		Member m3=new Member("user02","0987");
		
		System.out.println(m2.getMemberNo()
				+" "+m3.getMenberId()
				+" "+m3.getMemberPw()
				+" "+m3.getName()
				+" "+m3.getPhone()
				+" "+m3.getPersonNo());
	}
}
