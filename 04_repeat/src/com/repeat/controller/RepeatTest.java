package com.repeat.controller;
import java.util.Scanner;
import java.util.*;//�ڹ� ��ƿ�� �ִ� ��ü ��Ű���� �� ���ڴ�.
public class RepeatTest {
	Scanner sc=new Scanner(System.in);
	public void basicRepeat() {
		//�⺻ for�� �ۼ��ϱ�
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
	//	.
	//	.
	//	.
		//for���� �̿��ϸ� �����ϰ� ó���� �� ����.
		System.out.println("=====for������ ����ϱ�=====");
		for(int i=0;i<10;i++) {
			System.out.println(i);
			System.out.println("�ȳ��ϼ���!");
		}
		//1���� 100������ ���� ����غ�����
		/*for(int i=1;i<=100;i++) {
			System.out.println(i);
		}*/
		for(int i=0;i<100;i++){
		System.out.println("i: "+(i+1));
		//���� �� ��� ("i: "+i++)����? �Ұ���.
		//i+1�� i���� �ǵ��� ������, i++�� i�� ��ü�� ����. ¦���� ����.
		}
		//100���� 1����
		/*for(int i=100;i>0;i--) {
			System.out.println(i);
		}*/
		int su=100;
		for(int i=0;i<100;i++) {
			int sum=0;
			System.out.println(su--); //i���� ���� �ְ� �ܺ� ������ �̿��ؼ� ó��
		}
		//sum+=1  //for���ȿ��� ����� ������(i,sum)�� �ȿ����� ��밡�� �ܺο����� �̿�Ұ�.
		
		//1~100���� Ȧ���� �������.
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		/*for(int i=1;i<=100;i++) {
			System.out.println(i++);
		}
		for(int i=1;i<=100;i+=2) {
			System.out.println(i);
		}*/
		//1~100������ ��ü���� ���ϼ���.
		System.out.println("====1~100������ ��ü ��====");
		int sum = 0; //������ų ���� ���� �ʿ�
		for(int i=1;i<=100;i++) {
			sum+=i; //sum=sum+i;
		}
		System.out.println(sum);
		//1~100���� ¦�� ���� ���ϼ���.
		int sum1=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum1+=i; //i�� ¦���϶��� �ջ�
			}
		}
		System.out.println(sum1);
		
		//�Է¹��� ����ŭ "�ȳ�" ��� �ݺ��ϼ���.
		System.out.print("�� �� �Է�: ");
		int count=sc.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("for���� �ʹ� ��̰� ���������!");
		}
		
		//���� ������ �Է¹ް� �� ������ �հ踦 ����ϼ���
		//�հ�� �ѹ��� ����� �Ǿ�� �մϴ�.
		int isum=0;
		for(int i=0;i<3;i++) {
			System.out.print("�����Է�: ");
			isum+=sc.nextInt();
		}
		System.out.println(isum);
		
		//for���� �ٸ� ����
		//for(�ʱ��;���ǽ�;������){  ����   }
		/*for(;;) { //���� ����
			System.out.println("====�޴���=======");
			System.out.println("1.ĳ���");
			System.out.println("2.��â");
			System.out.println("3.�۷ι���");
			System.out.println("0.���α׷�����");
			System.out.print("�Է� : ");
			int choice=sc.nextInt();
			switch(choice) {
				case 1 : System.out.println("��� ĳ�Ǿ�");break;
				case 2 : System.out.println("��â�� ���ֿ�!!");break;
				case 3 : System.out.println("�۷ι���....??.....�����ؼ� �Ф�");break;
				case 0 : System.out.println("���α׷��� �����մϴ�.");return; 
				//return���� ���ѷ��� ����, �޼ҵ尡 ���� �Ǵٰ�  return�� ������ �ؿ� �ڵ� �� ����.�޼ҵ尡 ���ڸ����� ����. ��ȯ��
			}
		}*/
		//for���� ���ǽ��� ����??
		for(int i=0;;i++) {//���ѷ���
			System.out.println(i);
			if(i==100000) {
				break;
			}
		}
		int a=0;
		for(;a<10;a++) {//�ʱ�� ���� �ܺ� ���� int a=0�� �̿�/ 10ȸ �ݺ�
			System.out.println(a);
		}
		//���ǽĸ� for���� ���� �� �ִ�. //���ѷ����� �������ʵ��� ������ �� �Ѱ�.
		for(;a<20;) {
			System.out.println(a++);//�׳�(a)�� ��쿡�� 10�� ��� �ݺ��ؼ� ����. ���ǽ��� false�� �Ǿ� ����� �� ����.
		}
		//�ʱ�� ������ �������� ����/�����ų �� �ִ�.
		for(int i=0,j=10;i<10;i++,j+=20) { //i�� 1������. j��  20�� ����.
			System.out.println(i+" "+j);
		}
		
	}
	//�Է��� �л����� �Է¹ް� �л��� ����,����, ���� ������ �Է¹ް�
	//�� �հ�� ����� ���ϴ� ���α׷� �����
	//������ 100 100 100 �հ�300 ���100
	//��  ��  90 90 90 �հ�270 ��� 100
	//�� ������ ������ �Ѱ�
	//��³��뿡 ���� ���� �Ѱ�
	public void studentGrade() {
	System.out.println("========�л����� ���� ���α׷�v01==========");
	System.out.print("�л���: ");
	int student=sc.nextInt();
	sc.nextLine();
	String result="";
	for(int i=1;i<=student;i++) {
		//System.out.println("Ȯ�� �Է��� ��ŭ ����?");
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("����: ");
		int eng=sc.nextInt();
		int total=0; //���� �������� ������ ����ֱ�
		total+=eng;
		System.out.print("����: ");
		int math=sc.nextInt();
		total+=math;
		System.out.print("����: ");
		int kor=sc.nextInt();
		total+=kor;
		double avg=total/3.0;
		sc.nextLine();
		//System.out.println{ //1�� ���� ��� 1������ ���
		result+=name+" "+eng+" "+math+" "+kor
				+" �հ�: "+(eng+math+kor)
				+" ���: "+((eng+math+kor)/3.0)+"\n";
		}
		System.out.println(result); //����� ��Ƽ� �ѹ��� ���
	}
	
	public void whileTest() {
		//���� �� ���� �������̿���.
		int i=0; // �ʱ��
		while(i<3) { //���ǽ�
			System.out.println("���� �� ���� ��!");
			//������
			i++;
		}
		//while���� �̿��Ͽ� 1���� 30���� ����ϱ�
		i=0;
		while(i<30) {
			System.out.println(i);
			i++;
		}
		//����ڰ� �Է��ϴ� 3�� ���ڿ��� �ѹ��� ����ϴ� ���α׷� �ۼ�
		int j=0;
		String msg="";
		while(j<3) {
			System.out.print("���� �Է�: ");
			msg+=sc.nextLine(); 
			//msg=msg+sc.nextLine();//����+����  ���� ����-���� �Ұ���
			//System.out.println(msg);
			//������.. ������ ���ѷ��� ��� True
			j++;  //j=3
		}
		System.out.println(msg);
		
		//do while��
		//do{  ���� ����  }while(���ǽ�);
		//1.do{}�� ���� ������ �ѹ��� ���� 2.while(���ǹ�)�� True�� do�� �� ����
		do {
			System.out.println("do while��!!");
			j++;
		}while(j<5); //while(false);�� �ص� ���డ��
		
		while(j<3) { //while���� true�϶��� ����.
			System.out.println("while��!");
		}
		/*while(true) { //while�� true�϶� ���ѷ���
			System.out.println("�������!! �����ϼ���!!");
		}*/
		
		//while�� ��� ��
		Set<String> test=new HashSet();
		test.add("�ϳ�");
		test.add("��");
		test.add("��");
		Iterator iterator=test.iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next()); //��� true�� ����Ǵٰ� �ڵ����� false�� ��ȯ�Ǿ� ����.
		
	}

	
}
