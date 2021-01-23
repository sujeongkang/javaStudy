package com.exception.cotroller;

public class Main {

	public static void main(String[] args){
		//계속위임해서 예외발생으로 끝내버릴 수있다
		//System.out.println("이거 실행되니?");
		//new ThrowsTest().exceptionTest();//호출하자마자 에러발생//호출한 곳에서 처리해야함.
		//System.out.println("Exception 아래 실행!");//밑에는 실행 안됨.위임한 메소드로 넘어감...
		try {
			throw new MyException("에러!! 내꺼당~");//에러페이지를 지정할 수 있다.
		}catch(MyException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		
	}

}
