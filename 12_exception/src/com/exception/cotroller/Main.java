package com.exception.cotroller;

public class Main {

	public static void main(String[] args){
		//��������ؼ� ���ܹ߻����� �������� ���ִ�
		//System.out.println("�̰� ����Ǵ�?");
		//new ThrowsTest().exceptionTest();//ȣ�����ڸ��� �����߻�//ȣ���� ������ ó���ؾ���.
		//System.out.println("Exception �Ʒ� ����!");//�ؿ��� ���� �ȵ�.������ �޼ҵ�� �Ѿ...
		try {
			throw new MyException("����!! ������~");//������������ ������ �� �ִ�.
		}catch(MyException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		
	}

}
