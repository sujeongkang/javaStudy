package com.bible.ch6.object;

class TvTest3 {
	public static void main(String[] args) {
		Tv t1=new Tv();
		Tv t2=new Tv();
		System.out.println("t1�� channel���� "+t1.channel+"�Դϴ�.");//0
		System.out.println("t2�� channel���� "+t2.channel+"�Դϴ�.");//0
	
		t2=t1;//t1�� �����ϰ� �ִ� ��(�ּ�)�� t2�� �����Ѵ�.
		t1.channel=7;
		System.out.println("t1�� channel���� 7���� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� "+t1.channel+"�Դϴ�.");//7
		System.out.println("t2�� channel���� "+t2.channel+"�Դϴ�.");//7
	}
	
}
