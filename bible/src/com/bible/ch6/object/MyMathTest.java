package com.bible.ch6.object;

public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm=new MyMath();
		long result1=mm.add(5L, 3L);
		long result2=mm.subtract(5L, 3L);
		long result3=mm.mutiply(5L, 3L);
		double result4=mm.divide(5L,3L);
		System.out.println("add(5L,3L) = "+result1);
		System.out.println("subtract(5L,3L) = "+result2);
		System.out.println("mutiply(5L, 3L) = "+result3);
		System.out.println("divide(5L,3L) = "+result4);
	
	}
}

class MyMath{
	long add(long a, long b) {
		long result=a+b;
		return result;
	}
	long subtract(long a, long b) {
		return a-b;
	}
	long mutiply(long a, long b) {
		return a*b;
	}
	double divide(double a,double b) {
		return a/b;
	}
}
