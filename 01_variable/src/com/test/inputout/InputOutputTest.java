package com.test.inputout;

public class InputOutputTest {
	public static void main(String[] args) {
	//print(), println() ����!!!
	System.out.println("�ȳ��ϼ���");
	System.out.println("���� �������Դϴ�.");
	System.out.print("�ȳ��ϼ���");
	System.out.print("���� ����ȣ�Դϴ�.");
	System.out.println("");//����
	System.out.println("�̰Ŵ� ��� ���?");//�� �ڸ� ����
	System.out.println("�̰Ŵ�???");
			
	//printf����ϱ�
	System.out.printf("%d�� ���̸��� %s �Դϴ�.\n", 19,"������");
	double dnum=1234.567678;
	System.out.println(dnum);
	System.out.printf("%.2f\n", dnum);
	String name="������";
	int age=19;
	char gender='��';
	String name2="����";
	int age2=28;
	char gender1='��';
	System.out.println(name+" "+age+" "+gender);
	System.out.println(name2+" "+age+" "+gender1);
	System.out.printf("%-5s %d %c\n",name,age,gender);
	System.out.printf("%-7s %d %c\n",name2,age2,gender1);
	
	//�̽��������� �̿��ϱ�
	System.out.print("�ȳ��ϼ���.���� \n");
	System.out.print("������\t�Դϴ�.");
	System.out.println("���� ���ߴ�.\"���!\"");
	System.out.println("c:\\aser01\\");
	String msg="�ȳ�\t �ȳ��ϼ���\n����";
	System.out.println(msg);
	String page="<p onclick='tset(\"�ȳ�\");'>";
	
	
	
	
	}
}

