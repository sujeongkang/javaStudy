package com.oop.method;

import java.util.Scanner;

import com.oop.model.vo.Member1;
import com.oop.model.vo.Student;
//2020-06-23
//��������� Ŭ����
//�޼ҵ� �ټ� ����
public class Functional {
	
	//public Functional() {}//�⺻������
	//�Ű������ִ� �����ڰ� ������ �⺻�����ڰ� �ڵ������� �ȵ�!
	
	//���� ����ϴ� ��!
	//�Ű������� ����, ��ȯ���� ���� ����޼ҵ�
	public void calculator() {
		Scanner sc=new Scanner(System.in);
		System.out.println("=======���� ���α׷�========");
		System.out.print("����: ");
		int su=sc.nextInt();
		System.out.print("����: ");
		int su2=sc.nextInt();
		System.out.println(su+"+"+su2+"="+su+su2);
//		System.out.println("������(+,-,*,/): ");
//		char op=sc.next().charAt(0);
//		int rsult=0;
	}
	
	//��ȯ���� ���� �Ű������� �ִ� �޼ҵ�� ����
	//����ϴ� ��� ���� ���׿��� �ΰ����� ����
	//������ ����Ƿ���, ���굵 �Ű������� �޾ƾ���.
	public void calculator2(int su, int su2,String[] operation) {
		//�ΰ��� ��(����)�� �������ָ� ������ִ� �޼ҵ�
		System.out.println("=======���� ���α׷�=====");
		System.out.println("����: "+su);
		System.out.println("����: "+su2);
		double result=0;
		for(String op: operation) {//for each�� 0�� �ε������� �ϳ��� ������ �Է�
			switch(op) {
//		for(int i=0;i<operation.length;i++) {
//			switch(operation[i])
			case "+": result=su+su2;break;
			case "-": result=su-su2;break;
			case "*": result=su*su2;break;
			case "/": result=(double)su/su2;break;
			}
			//System.out.println(su+operation[i]+su2+"="+(result));
			System.out.println(su+op+su2+"="+(result));
		}
	}
	
	//��ȯ���� �ְ� �Ű������� ���� �޼ҵ� ����
	//�ΰ��� ���� ���ϰ� �� ����� ��ȯ�ϴ� ���
	public int calculator3() { 
		System.out.println("=======���� ���α׷�========");
		Scanner sc=new Scanner(System.in);
		System.out.print("����: ");
		int su=sc.nextInt();
		System.out.print("����: ");
		int su2=sc.nextInt();
		return su+su2;//������ �� �Ѱ��� �ڷ����� ����
		//return su+su2 ,su, su2; //������ ��ȯ �Ұ�!  
		//������ ��ȯ�ÿ��� �ڷ����� ������ �迭, �ٸ��� Ŭ������ �̿�
		//��ȯ��(���⼭�� int)�� ������ �ݵ��!!! return!!!
		//return�ڿ��� ��ȯ���� ��ġ�ϴ� �ڷ��� ������ ���ͷ��� ���� �ȴ�!
		//return���� �޼ҵ带 ȣ���� ���� 1��!!!!!!�� ������� ��ȯ��.
	}
	
	
	//��ȯ���� �ְ� �Ű������� �ִ� �޼ҵ� ����.
	public int calculator4(int su, int su2) {
		return su+su2;
	}
	
	//---------------------------------------------------------------	
	//���ڿ� �ΰ��� ���޹ް� �� ���ڿ��� �����ϰ� �������ִ� �޼ҵ� �����
	//1�� ����//
	public String munjang(String str1,String str2) {
		return str1+str2;
	}
	//2�� ����//
	//���� �ΰ��� ���޹޾� ù��°������ �ι��� ������ ���� �������ִ� �޼ҵ� �����
	//��, ������ ù��° ���� Ŀ����. ���� ù��° ���� ������ �������
	public int sum (int first, int second) {
		int result=0;
		if(first<second) {
			System.out.println("�������");
		}
		else{
			for(int i=second;i<=first;i++) {
				result+=i;			}
		}
		return result;
	}
	//3�� ����//
	//���� �Ѱ��� ���޹޾� ���������� Ȯ�� �� ����� �������ִ� �޼ҵ� �����
	//true/false
	public boolean checkChar(char check) {
		return ('a'<=check&&check<='z')||('A'<=check&&check<='Z');
	}
	
	
	//---------------------------------------------------------------		
	
	
	//�迭�� �Ű������� �޴� �޼ҵ� ����
	public void updateArray(int[] nums) {
		//�迭�� �Է¹޴� ������ �ʱ�ȭ�ϱ�
		//heap�� �ִ� ������ �ּҰ��� ���� ����. ������ �ᱹ ���� ���� ����
		//��ü, �迭���� �������ڷ����� ������ �ִ� �ּҸ������ϱ� ������
		//�迭�� ���� ����� ���� �������� ���Ǿ� �������� �����Ǵ� ����� �����´�.
		Scanner sc=new Scanner(System.in);
		System.out.println("========�迭 �����ϱ�=======");
		for(int i=0;i<nums.length;i++) {
			System.out.print("������: ");
			nums[i]=sc.nextInt();
		}
	}
	
	//�⺻�ڷ����� �Ű������� �ް� �����ϱ�
	
//	public void basicUpdate(int su) {
//		su=200; //����ȵ�,  �� ������ ����x �޼ҵ� ����� ���氪 �����.
//	}
	public int basicUpdate() {
		return 200;
	}

	
	
	
	//---------------------------------------------------------------	
	//student ��ü�� ����� �̸�, �г�, ��, ��ȣ, Ű, ������ �⺻���� �ڽ��� ������ �����ϰ� 
	//studentUpdate�żҵ带 ����� �Է¹��� ������ �����ѵ� ����� ��.	
	
	//ù��° �л� ���� �����ϴ� ���� : ��ȯx �Ű� o 
	//�ּҰ��� �ϳ� �����ϸ� �ٷ� ����..���θ޸��Ҵ� ���ϰ� heap�������� ������ ��.
	//�̰� �ι�°���� ȿ����.
	public void studentUpate(Student s) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=======�л����������ϱ�======");
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("�г�: ");
		int grade=sc.nextInt();
		System.out.print("��: ");
		int cl=sc.nextInt();
		System.out.print("��ȣ: ");
		int num=sc.nextInt();
		System.out.print("Ű: ");
		double height=sc.nextDouble();
		System.out.print("������: ");
		double weight=sc.nextDouble();
		
		//���޵� �Ű����� ���� ����
		s.setName(name);
		s.setGrade(grade);
		s.setCl(cl);
		s.setNum(num);
		s.setHeight(height);
		s.setWeight(weight);
	}
	
	//�ι�° �л����� �����ϴ� ���� : ��ȯo �Ű� x
	//heap������ �ּ� �ΰ��� gc�� ���ֱ� ������ �������
	public Student studentUpdate() {// ��ȯ���� Student
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=======�л����������ϱ�======");
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("�г�: ");
		int grade=sc.nextInt();
		System.out.print("��: ");
		int cl=sc.nextInt();
		System.out.print("��ȣ: ");
		int num=sc.nextInt();
		System.out.print("Ű: ");
		double height=sc.nextDouble();
		System.out.print("������: ");
		double weight=sc.nextDouble();	
		
//		return new Student(name,grade,cl,num,height,weight);
//		//������ ��ü����ȯ.  �Ʒ��� ����
		Student s=new Student(name,grade,cl,num,height,weight);
		return s;//������ ��ü����ȯ
	}

	//---------------------------------------------------------------	
	//cilent���� �̸�.����,��ȭ��ȣ�����޹ް� �׳����� String�� ��ȯ�Ῡ ����غ���
	public String strReturn() {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("����: ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=sc.nextLine();
		
		String result=name+age+phone;
		return result; 
	}
	//insertMember�żҵ带 ����ÿ�
	//1. Member��ü����  id, pw, name, email, address
	//2. client����  id, pw, name, email,addr�� ���� �޾� Member��ü�� �����Ͽ� ����Ұ�, ��ȯ����.	
	public void insertMember(Member1 m) {
		Scanner sc=new Scanner(System.in);
		System.out.print("id: ");
		String id=sc.nextLine();
		System.out.print("pw: ");
		String pw=sc.nextLine();
		System.out.print("name: ");
		String name=sc.nextLine();
		System.out.print("email: ");
		String email=sc.nextLine();
		System.out.print("address: ");
		String address=sc.nextLine();
		
		m.setId(id);
		m.setPw(pw);
		m.setName(name);
		m.setEmail(email);
		m.setAddress(address);
		
		
		
	}

	
}

