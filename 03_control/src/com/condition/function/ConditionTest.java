package com.condition.function;
import java.util.Scanner;

public class ConditionTest {
	Scanner sc=new Scanner(System.in);
	public void basicIfTest() {
		//�⺻ if�� ����ϱ�
		//if(���ǽ�(���:true/false)){ if���� �ش��ϴ� ���� }
		//���ǽ��� true�� �Ǹ�{}�κ��� ����, �ƴϸ� if�� ������.
		
		//�Է¹��� ���� ����� ����Դϴ�.�� ���
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int su=sc.nextInt();
		//���ǿ� ���� ����Դϴ� ����� ���� ���� �����Ҷ� if���� ���
		if(su>0) {
			System.out.println("����Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
		}
		//Ƽ�Ϲ�ȣ�� �Է¹ް� Ƽ�Ϲ�ȣ777�̸� �����Ǿ����ϴ�, �����ϼ���. �������
		System.out.print("Ƽ�Ϲ�ȣ �Է�: ");
		int ticket=sc.nextInt();
		int count=0;
		if(ticket==777/*&&age>19&&height>180*/) {
	
			System.out.println("�����Ǿ����ϴ�.");
			System.out.println("�����ϼ���.");//������ true�̸� {}���� ���೻���� �������̶� ���� ����
			//if���� ���ǽĿ��� ��� ������, ��������/����� �� ������.
			count++; //���� �� ���. if�� �ۿ��� ���� ������ ���� if�ȿ��� ����� ������.
			int su1=100; //if�� �ȿ��� �������𰡴�
			int su2=200;
			int result=su1+su2; //if���� true�϶�, {����} ���� ����
			System.out.println(result);
		}
		//if(ticket!=777) {//������ �涧 �ι� �� �ʿ���� if else�� Ȱ�� 
		else { //false�� else���� �����. ����� ���� if�� else�� �� �� �ϳ��� ������ ����!
			System.out.println("�������еǾ����ϴ�.");
			System.out.println("�� �� �����ϴ�.");
		}
		//System.out.println(su1+""+su2+""+result);//if���� �ȿ� ����Ǿ��ִ� ������ �ܺο��� ���� �Ұ�.  //if�� ���� ����Ұ�!
		System.out.println("�����: "+count); 
		
		//if~else������ else�� ����� �� ������? NO  //if~else ������ �ѹ���
		boolean flag=true;
		if(flag) {
			
		}
		else {
			
		}
		//Ȧ���� Ȧ��, ¦���� ¦�� ����ϴ� ���α׷� �ۼ�
		System.out.print("�����Է�: ");
		int su4=sc.nextInt();
		if(su4%2==1) {
			System.out.println("Ȧ��");
		}
		else {
			System.out.println("¦��");
		}
		
		
	}//�޼ҵ�(���)
	
	//����, ����,���� ������ �Է¹޾� �հ�, ����� ����ϰ� 
	//�հ谡 250�� �̻��̸� "������Դϴ�"�� ���
	
	//A,B,C ������ �Է¹ް� ������ 5000�̻��̸� 
	//00�� "��׿����� �Դϴ�."�� ���
	
	//����, ����, ���� ������ ���������� �Է¹پ� 
	//������ ����� ������ �հݿ��θ� ó��, ������ ������ ���� 40�� �̻��̸鼭, ����� 60�� �̻��̸� �հ� �ƴϸ� ���հ��� ����ϱ�
	
	
	//����, ����,���� ������ �Է¹޾� �հ�, ����� ����ϰ� 
	//�հ谡 250�� �̻��̸� "������Դϴ�"�� ���
	public void testA() {
		Scanner sc=new Scanner(System.in);
		System.out.print("����: ");
		int kor=sc.nextInt();
		System.out.print("����: ");
		int eng=sc.nextInt();
		System.out.print("����: ");
		int math=sc.nextInt();
		int total=kor+eng+math;
		double score=total/3.0;
		if(total>=250) {
			System.out.println("������Դϴ�.");
		}
	}
	//A,B,C ������ �Է¹ް� ������ 5000�̻��̸� 
	//00�� "��׿����� �Դϴ�."�� ���
	public void testB() {
		Scanner sc=new Scanner(System.in);
		System.out.print("A�� ����: ");
		int a=sc.nextInt();
		System.out.print("B�� ����: ");
		int b=sc.nextInt();
		System.out.print("C�� ����: ");
		int c=sc.nextInt();
		if(a>=5000) {
			System.out.println("A�� ��׿����� �Դϴ�.");
		}
		if(b>=5000) {
			System.out.println("B�� ��׿����� �Դϴ�.");
		}
		if(c>=5000) {
			System.out.println("C�� ��׿����� �Դϴ�.");
		}
			
	}
	//����, ����, ���� ������ ���������� �Է¹޾� 
	//������ ����� ������ �հݿ��θ� ó��, ������ ������ ���� 40�� �̻��̸鼭, ����� 60�� �̻��̸� �հ� �ƴϸ� ���հ��� ����ϱ�
	public void testC() {
		Scanner sc=new Scanner(System.in);
		System.out.print("����: ");
		int kor1=sc.nextInt();
		System.out.print("����: ");
		int eng1=sc.nextInt();
		System.out.print("����: ");
		int math1=sc.nextInt();
		int total1=kor1+eng1+math1;
		double avg=total1/3.0;
		
		if(kor1>=40&&eng1>=40&&math1>=40&&avg>=60) {
			System.out.println("�հ�");
		}
		else {
			System.out.println("���հ�");
		}
	}
	public void ifElseifTest() {  //�α��� ���α׷� ����
		//if~else if~else
		//���� ��� ���� ���α׷�
		//100��~90�� �̻� A
		//89��~80�� �̻� B
		//�Է¹��� ������ �������� ���
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է�: ");
		int jumsu=sc.nextInt();
		char grade=' ';
		//������ ���� ��޻���
		if(jumsu>=90) {
			grade='A';
		}
		else if(jumsu>=80) { //if(jumsu<90&&jumsu>=80)�� ����.
			grade='B';
		}
		else if(jumsu>=70) { 
			grade='C';
		}
		else if(jumsu>=60) {
			grade='D';
		}
		else {
			grade='F';
		}
		System.out.println(jumsu+"�� ����� "+grade+"�Դϴ�.");
		//���࿡ else �� ���� if���� �ۼ��Ѵٸ�.
		
		if(jumsu>=90) {
			grade='A';
		}
		if(jumsu<90&&jumsu>=80) {
			grade='B';
		}
		if(jumsu<80&&jumsu>=70) {
			grade='C';
		}
		else if(jumsu<70&&jumsu>=60) { 
			grade='D';
		}
		if(jumsu<60) {
			grade='F';
		}
		System.out.println(jumsu+"�� ����� "+grade+"�Դϴ�.");

	}
	//���� �����
	//���� �ΰ� �Է¹ް� ������(*,+,-,/)�� �Է¹޾�
	//����� ����ϱ�
	//��� ��) �Է� 5
	//		�Է� 6
	//		������:+
	//		5+6=11
	/*public void test2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է� 1: ");
		int num1=sc.nextInt();
		System.out.print("���� �Է� 2: ");
		int num2=sc.nextInt();
		System.out.print("������ �Է�(+,-,*,/): ");
		sc.nextLine();
		char oper=sc.nextLine().charAt(0);
		double result=0;
		if(oper=='+') {
			System.out.println(num1+""+oper+num2+"="+(num1+num2)); //�����ڴ� ""+'+' ���ڿ� �� �ٲٱ�
			//result=num1+num2;
		}
		else if(oper=='-') {
			System.out.println(num1+""+oper+num2+"="+(num1-num2));
			//result=num1+num2;
		}
		else if(oper=='*') { 
			System.out.println(num1+""+oper+num2+"="+(num1*num2));
			//result=num1*num2;
		}
		else if(oper=='/') {
			System.out.println(num1+""+oper+num2+"="+(num1/num2));
			//result=(double)num1/num2;
		} //else�� ���� ����
	}*/
	/*public void test3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է� 1: ");
		int num1=sc.nextInt();
		System.out.print("���� �Է� 2: ");
		int num2=sc.nextInt();
		System.out.print("������ �Է�(+,-,*,/): ");
		sc.nextLine();
		String oper=sc.nextLine();
		if(oper.equals("+")) {
			System.out.println(num1+oper+num2+"="+(num1+num2));
		}
		else if(oper.equals("-")) {
			System.out.println(num1+oper+num2+"="+(num1-num2));
		}
		else if(oper.equals("*")) {
			System.out.println(num1+oper+num2+"="+(num1*num2));
		}
		else if(oper.equals("/")) {
			System.out.println(num1+oper+num2+"="+(num1/num2));
		}
	}*/
	public void calc() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է� 1: ");
		int num1=sc.nextInt();
		System.out.print("���� �Է� 2: ");
		int num2=sc.nextInt();
		System.out.print("������ �Է�(+,-,*,/): ");
		sc.nextLine();
		char oper=sc.nextLine().charAt(0);
		double result=0;
		if(oper=='+') {
			result=num1+num2;
		}
		else if(oper=='-') {
			result=num1-num2;
		}
		else if(oper=='*') { 
			result=num1*num2;
		}
		else if(oper=='/') {
			result=(double)num1/num2;
		} //else�� ���� ����
		System.out.println(""+num1+oper+num2+"="+result);//result ��� (oper=='/'?result:(int)result)����
		//System.out.println(oper=='/'?""+num1+oper+num2+"="+result:""+num1+oper+num2+"="+(int)result);
	}
	
	//���θ� ���� �� �� �ִ� Ŭ��
	//�����̸� �޴��� ����Ͽ� ���� �ϰ� �ƴϸ�  ���� ������! ��� ���
	//1.����, 2.����, 3.���ɸ�
	//1 ���� ���ִ� ���
	//2 ���� ���ִ� ��
	//3 ���� ���ɸ��� �Ӹ�����
	public void acChoice() {
			//Scanner sc=new Scanner(System.in); //���� �޼ҵ忡 �Է½� �޼ҵ帶�� �Է� ���ص� ��.
			System.out.print("����� ���̴�?: ");
			int age=sc.nextInt();
			//if((msg.equals("����))
			if(age>19) {
				System.out.println("====�޴�====");
				System.out.println("1.����");
				System.out.println("2.����");
				System.out.println("3.���Ÿ�");

				System.out.print("���ϴ� ���� ��ȣ�� �Է��Ͻÿ�: ");
				int ac=sc.nextInt();
				
				if(ac==1) {
					System.out.println("���ִ� ���");
				}
				else if(ac==2) {
					System.out.println("���ִ� ��");
				}
				else if(ac==3) {
					System.out.println("���ɸ��� �Ӹ�����");
				}
			}
			else {
				System.out.println("���� ������");
			}
	}
	
	
	
	
}
