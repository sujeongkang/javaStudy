package com.bible.ch6.object;

class TvTest2 {
	public static void main(String[] arg) {
		Tv t1=new Tv();
		Tv t2=new Tv();
		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");//0
		System.out.println("t2의 channel값은 "+t2.channel+"입니다.");//0
		
		t1.channel=7;//채널 값을 7으로 한다.
		System.out.println("t1의 channel값을 7으로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");//7
		System.out.println("t2의 channel값은 "+t2.channel+"입니다.");//0

	}
}
