package com.oper.single;
import java.util.Scanner;
public class LogicOperator {
	public static void main(String[] args) {
		//�������� Ȱ���ϱ�
		//�������� �ΰ��� ���� ���ϴ� ������
		//�ַ� �񱳿����ڸ� �����Ͽ� �����.
		//������� ��(true,false);
		//1<10<20��?? ������ �����ٶ� -> ������
		int su=10;
		System.out.println(1<su&&su<20);//su�� 1~20���̿� �ִ�?
		System.out.println(1<su||su<20);//��ü ����
		System.out.println(1<su||su>20);// ������ �����ϰ� ���� �� ���� ���
		
		//��� ���̱ⱸ ž��üũ ���α׷�
		//1.Ƽ���� �־���ϰ� Ű�� 140cm�̻�
		boolean ticket=false;
		double height=150;
		System.out.println(ticket&&height>=140);
		
		//id�� admin�̰� password�� 1234�� ���
		//�Է¹޾Ƽ� ���ϱ�
		Scanner sc=new Scanner(System.in);
		System.out.print("���̵�: ");
		String id=sc.nextLine();
		System.out.print("�н�����: ");
		String password=sc.nextLine();
		//�Է¹޾Ƽ� ���ϱ�
		System.out.println(id+" "+password);
		System.out.println(id.equals("admin")
				&&password.equals("1234"));
		
		//������ ���԰���
		//Ƽ���̳� �ʴ����� ������ ����, �ƴϸ� ����Ұ�
		//Ƽ�� 0000, �ʴ��� 4444
		int ticket1=1234;
		int invate=4444;
		System.out.println(ticket1==1234||invate==4444);
		
		//�������� �������� ����� �����Ѱ�?
		//&& ||������ ��밡��? ������
		//Ƽ���̳� �ʴ����� �ְ� ������ ���
		int age=19;
		System.out.println((ticket1==1234||invate==4444)&&age>19);
		//&&�� ||���� �켱����
	}
}
