package com.oper.single;

public class BitOperator {
	public static void main(String[] args) {
		//��Ʈ ���� Ȯ���ϱ�
		//&,|,^
		//����Ʈ ���� ���ϱ�(*2), ������(/2)
		int a=10,b=22; //32bit
		String basic="00000000000000000000000000000000";
		//a��Ʈ��
		String bit=basic+Integer.toBinaryString(a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//b��Ʈ��
		bit=basic+Integer.toBinaryString(b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a&b����
		bit=basic+Integer.toBinaryString(a&b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a|b����
		bit=basic+Integer.toBinaryString(a|b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a^b
		bit=basic+Integer.toBinaryString(a^b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//~a����
		bit=basic+Integer.toBinaryString(~a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a<<1 2���ϱ�  ����Ʈ������ ���ϱ� ���꺸�� ����. �������̶������� 2�ǹ���� �ۿ� ����� ���ϴ� �� ����.
		bit=basic+Integer.toBinaryString(a<<1);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit); //10*2->20
		//a>>1 2������
		bit=basic+Integer.toBinaryString(a>>1);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit); // 10/2 ->5
	}

}
