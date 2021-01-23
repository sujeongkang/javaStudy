package com.bible.ch6.object;

class CardTest {
	public static void main(String[] args) {
		//Ŭ���� ����(static ����)�� ��ü���� ����'Ŭ�����̸�.Ŭ��������'�� ���� ��� ����
		System.out.println("Card.width= "+Card.width);
		System.out.println("Card.height= "+Card.height);
		
		//�ν��Ͻ� ������ ���� �����Ѵ�.
		Card c1=new Card();
		c1.kind="Heart";
		c1.number=7;
		
		Card c2=new Card();
		c2.kind="Spade";//�ν��Ͻ� ������ ���� �����Ѵ�.
		c2.number=4; 
		
		System.out.println("c1�� "+c1.kind+", "+c1.number+
				"�̸�, ũ��� ("+c1.width+","+c1.height+")");
		System.out.println("c2�� "+c2.kind+", "+c2.number+
				"�̸�, ũ��� ("+c2.width+","+c2.height+")");
		
		System.out.println("c1�� width�� height�� ���� 50,80���� �����մϴ�.");
		//Ŭ���� ������ ���� �����Ѵ�.
		//Ŭ���������� �ϳ��� ��������� �����ϹǷ�, �׻� ����� ���� ����.
//		c1.width=50; 
		Card.width=50; 
//		c1.height=80;
		Card.height=80;
		//Ŭ���� ������ 'Ŭ�����̸�.Ŭ��������'���°� �ν��Ͻ� ������ �����ϱ� ����.
		
		System.out.println("c1�� "+c1.kind+", "+c1.number+
				"�̸�, ũ��� ("+c1.width+","+c1.height+")");
		System.out.println("c2�� "+c2.kind+", "+c2.number+
				"�̸�, ũ��� ("+c2.width+","+c2.height+")");
		
	}
}
class Card{
	//Card �ν��Ͻ��� �ڽŹ��� ���̿� ���ڸ� �����ϰ� �־�� �ϹǷ� �ν��Ͻ�����
	String kind; //ī���� ����-�ν��Ͻ� ����
	int number; //ī���� ����-�ν��Ͻ� ����
	
	//ī���� ���� ���̴� ��� �ν��Ͻ��� ���������� ���� ���� �����ؾ� �ϹǷ� Ŭ��������.
	static int width=100; //ī���� �� -Ŭ���� ����
	static int height=250;//ī���� ����-Ŭ���� ����
	
}
