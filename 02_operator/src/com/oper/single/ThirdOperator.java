package com.oper.single;

import java.util.Scanner;

public class ThirdOperator {
	public static void main(String[]args) {
		//���׿����� Ȱ���ϱ�
		int sum=30;
		int sum2=20;
		System.out.println(sum>sum2?"ũ��":"�۴�");
		//�̸��� �Է¹ް� �� �̸��� ����ȣ�� �����ϴ� ���, 
		//�ƴϸ� �ƴմϴ�!�� ����ϴ� ���α׷� �ۼ�
		Scanner sc=new Scanner(System.in);
		System.out.print("���� ������ �����: ");
		String name=sc.nextLine();
		String msg=name.equals("����ȣ")?"�����ϴ�.":"�ƴմϴ�!";
		System.out.println(msg);
		
		//Ƽ���� �ְ�, ���̰� 19�ʰ��� ��������! �ƴϸ� ����Ұ�!
		//Ƽ�Ϲ�ȣ:333
		//Ƽ�Ϲ�ȣ, ���̸� �Է¹޾� ó��
		System.out.print("Ƽ�Ϲ�ȣ �Է�: ");
		int ticket=sc.nextInt();
		System.out.print("����� ����: ");
		int age=sc.nextInt();
		String result=ticket==333&&age>19?"��������!":"����Ұ�!";
		System.out.println(result);
		//int plus=age>19?age++:age--;
		//System.out.println(plus+" "+age);
		
		//ȭ�� ���� ������ �������� �б�ó�� �� �� �̿� .html
		/*<input type='text' value='age>19?"�ȳ�":""'>*/
		
		//���׿��� ���ο� ���׿����� �ֱ�
		//���̰� 19�̻��̸� �����Դϴ�.���
		//�ƴϰ� 17�̻� 18���ϸ� ����л�
		//�ƴϸ� 14�̻� 16���ϸ� ���л�
		//�ƴϸ� �ʵ��л�
		System.out.println(age>19?"�����Դϴ�.":
								age>=17?"����л�":
									age>=14?"���л�":"�ʵ��л�");
	
		
		
	}
}
