package com.kh.practice.chap01;
import java.util.Scanner;
public class ControlPractice {
	Scanner sc=new Scanner(System.in);
	public void practice1() {
		//�Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���, 
		//���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���.
		//ex. 1. �Է� 	2. ����	 3. ��ȸ 		4. ����	7. ����
		//�޴� ��ȣ�� �Է��ϼ��� : 3
		//��ȸ �޴��Դϴ�.
		Scanner sc=new Scanner(System.in);
		System.out.println("===�޴�===");
		System.out.println("1.�Է�");
		System.out.println("2.����");
		System.out.println("3.��ȸ");
		System.out.println("4.����");
		System.out.println("7.����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ���:");
		int menu=sc.nextInt();
		String mi="�޴��Դϴ�.";
		switch(menu){
			case 1 : System.out.println("�Է�"+mi);break;
			case 2 : System.out.println("����"+mi);break;
			case 3 : System.out.println("��ȸ"+mi);break;
			case 4 : System.out.println("����"+mi);break;
			case 7 : System.out.println("���α׷��� ����˴ϴ�.");break;
			default : System.out.println("���� �޴��Դϴ�.");
		}
	}
	public void practice2() {
		//Ű����� ������ �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ� 
		//¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���. ����� �ƴϸ� ������� �Է����ּ���.���� ����ϼ���.

		Scanner sc=new Scanner(System.in);
		System.out.print("���ڸ� �Ѱ� �Է��ϼ���: ");
		int i=sc.nextInt();
		if(i>0) {
			if(i%2==0) {
				System.out.println("¦����");
			}else {
				System.out.println("Ȧ����");
			}
		}
		else {
			System.out.println("����� �Է����ּ���");
		}
	}
	public void practice3() {
		//����, ����, ���� �� ������ ������ Ű����� �Է� �ް� 
		//�հ�� ����� ����ϰ� �հ�� ����� �̿��Ͽ� �հ� / ���հ� ó���ϴ� ����� �����ϼ���. 
		//(�հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���) 
		//�հ� ���� ��� ���� �� ������ �հ�, ���, �������մϴ�, �հ��Դϴ�!���� ����ϰ� 
		//���հ��� ��쿡�� �����հ��Դϴ�.���� ����ϼ���.

		Scanner sc=new Scanner(System.in);
		System.out.print("��������: ");
		int kor=sc.nextInt();
		System.out.print("��������: ");
		int math=sc.nextInt();
		System.out.print("��������: ");
		int eng=sc.nextInt();
		int total=kor+math+eng;
		double avg=total/3.0;
		if(kor>=40&&math>=40&&eng>=40&&avg>=60) {
				System.out.printf("����: %d\n����: %d\n����: %d\n�հ�: %d\n���: %.1f\n",kor,math,eng,total,avg);
				System.out.println("�����մϴ�, �հ��Դϴ�!");
		}else {
				System.out.println("���հ��Դϴ�.");
		}
		
	}
	public void practice4() {
		// if������ �Ǿ��ִ� ��, ����, ����, �ܿ� ������ switch������ �ٲ㼭 ����ϼ���
		Scanner sc=new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է�: ");
		int month=sc.nextInt();
		switch(month){
		case 12: case 1: case 2: System.out.println(month+"���� �ܿ� �Դϴ�.");break;
		case 3: case 4: case 5: System.out.println(month+"���� �� �Դϴ�.");break;
		case 6: case 7: case 8: System.out.println(month+"���� ���� �Դϴ�.");break;
		case 9: case 10: case 11: System.out.println(month+"���� ���� �Դϴ�.");break;
		default : System.out.println(month+"���� �߸� �Էµ� ���Դϴ�.");
		}		
	}
	public void practice5() {
		//���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���. 
		//�α��� ���� �� ���α��� ������, 
		//���̵� Ʋ���� �� �����̵� Ʋ�Ƚ��ϴ�.��, ��й�ȣ�� Ʋ���� �� ����й�ȣ�� Ʋ�Ƚ��ϴ�.���� ����ϼ���
		Scanner sc=new Scanner(System.in);
		System.out.print("���̵�: ");
		String id=sc.nextLine();
		System.out.print("��й�ȣ: ");
		String pw=sc.nextLine();
		String pass1="myid";
		String pass2="1234";
		if (id.equals(pass1)&&pw.equals(pass2)) {
			System.out.println("�α��� ����");
		}else if(!id.equals(pass1)&&pw.equals(pass2)){
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}else if(id.equals(pass1)&&!pw.equals(pass2)){
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}else {
			System.out.println("���̵�� ��й�ȣ�� �ٽ� Ȯ�����ּ���");
		}
	}
	public void practice6() {
		//����ڿ��� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է� �޾� �� ����� ���� �� �ִ� ������ ����ϼ���. 
		//��, �����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
		//ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ� ��ȸ���� �Խñ� ��ȸ�� �����մϴ�.
		Scanner sc=new Scanner(System.in);
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ���: ");
		String level=sc.nextLine();
		if(level.equals("������")) {
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�,�Խñ� ��ȸ, ��� �ۼ� ");
		}else if(level.equals("ȸ��")) {
			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
		}else if(level.equals("��ȸ��")) {
			System.out.println("�Խñ� ��ȸ");
		}
	}
	
	public void practice7() {
		//Ű, �����Ը� double�� �Է� �ް� BMI������ ����Ͽ� 
		//��� ����� ���� ��ü��/����ü��/��ü��/���� ����ϼ���.
		//BMI = ������ / (Ű(m) * Ű(m)) 
		//BMI�� 18.5�̸��� ��� ��ü�� /  18.5�̻� 23�̸��� ��� ����ü�� BMI�� 23�̻� 25�̸��� ��� ��ü�� 
		//  25�̻� 30�̸��� ��� �� BMI�� 30�̻��� ��� �� ��

		Scanner sc=new Scanner(System.in);
		System.out.print("Ű(m)�� �Է����ּ���: ");
		double height=sc.nextDouble();
		System.out.print("������(kg)�� �Է����ּ���: ");
		double weight=sc.nextDouble();
		double bmi=weight/(height*height);
		String result ="";
		if(bmi>30) {
			result="��ü��";
		}else if(bmi>=25) {
			result="��";
		}else if(bmi>=23) {
			result="��ü��";
		}else if(bmi>18.5) {
			result="����ü��";
		}else {
			result="��ü��";
		}
		System.out.println("BMI ����:"+bmi);
		System.out.println(result);	
	}
	public void practice8() {
		//Ű����� �� ���� ������ ���� ��ȣ�� �Է� �޾� ���� ��ȣ�� ���� ���� ����� ����ϼ���. 
		//(��, �� ���� ���� ��� ����� ���� �۵��ϸ� ���� ���� ��ȣ�� �Է� ���� �� ���߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.�� ���)

		Scanner sc=new Scanner(System.in);
		System.out.print("�ǿ�����1 �Է�: ");
		int i1=sc.nextInt();
		System.out.print("�ǿ�����2 �Է�: ");
		int i2=sc.nextInt();
		System.out.print("�����ڸ� �Է�(+,-,*,/): ");
		sc.nextLine();
		char oper=sc.nextLine().charAt(0);
		if(i1>0&&i2>0) {
			switch(oper) {
			case '+':System.out.printf("%d %c %d = %d\n",i1,oper,i2,(i1+i2));break;
			case '-':System.out.printf("%d %c %d = %d\n",i1,oper,i2,(i1-i2));break;
			case '*':System.out.printf("%d %c %d = %d\n",i1,oper,i2,(i1*i2));break;
			case '/':System.out.printf("%d %c %d = %f\n",i1,oper,i2,((double)i1/i2));break;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
		}
	}
	public void practice9() {
		//�߰����, �⸻���, ��������, �⼮ȸ���� �Է��ϰ� Pass �Ǵ� Fail�� ����ϼ���. 
		//�� ������ �߰���� 20%, �⸻��� 30%, ���� 30%, �⼮ 20%�� �̷���� �ְ� 
		//�� ��, �⼮ ������ �⼮ ȸ���� �� ���� ȸ�� 20ȸ �߿��� �⼮�� ���� ���� ������ ����ϼ���. 
		//70�� �̻��� ��� Pass, 70�� �̸��̰ų� ��ü ���ǿ� 30% �̻� �Ἦ �� Fail�� ����ϼ���.
		Scanner sc=new Scanner(System.in);
		System.out.print("�߰���� ����: ");
		double mid=sc.nextInt()*0.2;
		System.out.print("�⸻��� ����: ");
		double fin=sc.nextInt()*0.3;
		System.out.print("���� ����: ");
		double hw=sc.nextInt()*0.3;
		System.out.print("�⼮ ȸ��: ");
		double at=sc.nextInt()*1.0;
		double total=mid+fin+hw+at;
		
		System.out.println("=============���==============");
		if(at>6) {
			System.out.println("�߰���� ����(20) : "+mid);
			System.out.println("�⸻��� ����(30) : "+fin);
			System.out.println("���� ����\t(30) : "+hw);
			System.out.println("�⼮ ����\t(20) : "+at);
			
			if(total>=70) {
				System.out.println("���� : "+total+"\nPASS");
			}else {
				System.out.println("���� : "+total+"\nFail [�����̴�]");
			}
		}else {
			System.out.printf("Fail [�⼮ ȸ�� ����(%d/20)]",(int)at);
		}
	}
	public void practice10() {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���\n2. ¦��/Ȧ��\n3. �հ�/���հ�\n4. ����\n5. �α���\n6. ���� Ȯ�� \n7. BMI\n8. ����\n9. P/F ");
		System.out.print("����: ");
		int func=sc.nextInt();
		System.out.printf("(�ǽ�����%d ����)\n",func);
		switch(func) {
		case 1:new ControlPractice().practice1();break;
		case 2:new ControlPractice().practice2();break;
		case 3:new ControlPractice().practice3();break;
		case 4:new ControlPractice().practice4();break;
		case 5:new ControlPractice().practice5();break;
		case 6:new ControlPractice().practice6();break;
		case 7:new ControlPractice().practice7();break;
		case 8:new ControlPractice().practice8();break;
		case 9:new ControlPractice().practice9();
		}
	}
}
	
