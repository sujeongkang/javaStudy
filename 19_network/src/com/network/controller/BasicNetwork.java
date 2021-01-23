package com.network.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.lang.model.element.UnknownElementException;

public class BasicNetwork {
	public static void main(String[] args) throws UnknownHostException{
		//InetAddress�� �̿��غ���.
		//�ּҰ��� ������ �� �ִ�.
		InetAddress loacalIp=InetAddress.getLocalHost();//���� ���������� ��ǻ���� ������ ���Ҹ� ������.
	
		System.out.println(loacalIp.getHostAddress());//�� �������ּ�
		System.out.println(loacalIp.getHostName());//�� ��ǻ�� �̸�
		//������ ������ �� �� �ּҷ� ���� �ϸ� �ȵ�.
		
		//IPv4 0~255.0  4otec --> IPv6 8otec ����...
		InetAddress naver=InetAddress.getByName("www.naver.com");
		InetAddress localIp=InetAddress.getLocalHost();

		System.out.println(naver.getHostAddress());
		System.out.println(naver.getHostName());
		
		
	}
}
