package com.network.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.lang.model.element.UnknownElementException;

public class BasicNetwork {
	public static void main(String[] args) throws UnknownHostException{
		//InetAddress를 이용해보자.
		//주소값을 가져올 수 있다.
		InetAddress loacalIp=InetAddress.getLocalHost();//지금 현재접속한 컴퓨터의 아이피 정소를 가져옴.
	
		System.out.println(loacalIp.getHostAddress());//내 아이피주소
		System.out.println(loacalIp.getHostName());//내 컴퓨터 이름
		//서버에 접속할 때 내 주소로 접속 하면 안됨.
		
		//IPv4 0~255.0  4otec --> IPv6 8otec 무한...
		InetAddress naver=InetAddress.getByName("www.naver.com");
		InetAddress localIp=InetAddress.getLocalHost();

		System.out.println(naver.getHostAddress());
		System.out.println(naver.getHostName());
		
		
	}
}
