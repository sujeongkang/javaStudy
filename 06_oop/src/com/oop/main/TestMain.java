package com.oop.main;

import com.oop.model.vo.Client;

public class TestMain {
	public static void main(String[] args) {
		//회원3명의 정보를 저장하는 객체를 만들고 출력하기
		Client c=new Client();
		c.setId("user01");
		c.setPw("1234");
		c.setEmail("wwf@naver.com");
		c.setPoint(100.55);
		Client c1=new Client("hkd123","1111","bbb@nnnn.com");
		Client c2=new Client("yjs123","3333","eee@nnnn.com",70.55);

		System.out.println(c.getId()+" "+c.getPw()+" "+c.getEmail()+" "+c.getPoint());
		System.out.println(c1.getId()+" "+c1.getPw()+" "+c1.getEmail()+" "+c1.getPoint());
		System.out.println(c2.getId()+" "+c2.getPw()+" "+c2.getEmail()+" "+c2.getPoint());

	}
	
}
