package com.oper.single;

public class BitOperator {
	public static void main(String[] args) {
		//비트 연산 확인하기
		//&,|,^
		//쉬프트 연산 곱하기(*2), 나누기(/2)
		int a=10,b=22; //32bit
		String basic="00000000000000000000000000000000";
		//a비트값
		String bit=basic+Integer.toBinaryString(a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//b비트값
		bit=basic+Integer.toBinaryString(b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a&b연산
		bit=basic+Integer.toBinaryString(a&b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a|b연산
		bit=basic+Integer.toBinaryString(a|b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a^b
		bit=basic+Integer.toBinaryString(a^b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//~a보수
		bit=basic+Integer.toBinaryString(~a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a<<1 2곱하기  쉬프트연산이 곱하기 연산보다 빠름. 가독성이떨어지고 2의배수로 밖에 계산을 못하는 건 단점.
		bit=basic+Integer.toBinaryString(a<<1);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit); //10*2->20
		//a>>1 2나누기
		bit=basic+Integer.toBinaryString(a>>1);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit); // 10/2 ->5
	}

}
