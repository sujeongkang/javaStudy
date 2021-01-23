package com.bible.ch6.object;

class CardTest {
	public static void main(String[] args) {
		//클래스 변수(static 변수)는 객체생성 없이'클래스이름.클래스변수'로 직접 사용 가능
		System.out.println("Card.width= "+Card.width);
		System.out.println("Card.height= "+Card.height);
		
		//인스턴스 변수의 값을 변경한다.
		Card c1=new Card();
		c1.kind="Heart";
		c1.number=7;
		
		Card c2=new Card();
		c2.kind="Spade";//인스턴스 변수의 값을 변경한다.
		c2.number=4; 
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+
				"이며, 크기는 ("+c1.width+","+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+
				"이며, 크기는 ("+c2.width+","+c2.height+")");
		
		System.out.println("c1의 width와 height를 각각 50,80으로 변경합니다.");
		//클래스 변수의 값을 변경한다.
		//클래스변수는 하나의 저장공간을 공유하므로, 항상 공통된 값을 가짐.
//		c1.width=50; 
		Card.width=50; 
//		c1.height=80;
		Card.height=80;
		//클래스 변수는 '클래스이름.클래스변수'형태가 인스턴스 변수와 구분하기 좋음.
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+
				"이며, 크기는 ("+c1.width+","+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+
				"이며, 크기는 ("+c2.width+","+c2.height+")");
		
	}
}
class Card{
	//Card 인스턴스는 자신문의 무늬와 숫자를 유지하고 있어야 하므로 인스턴스변수
	String kind; //카드의 무늬-인스턴스 변수
	int number; //카드의 숫자-인스턴스 변수
	
	//카드의 폭과 높이는 모든 인스턴스가 공통적으로 같은 값을 유지해야 하므로 클래스변수.
	static int width=100; //카드의 폭 -클래스 변수
	static int height=250;//카드의 높이-클래스 변수
	
}
