package ppt.repeat.controller;
import java.util.Scanner;
public class RepeatController {
	Scanner sc=new Scanner(System.in);
	public void test1() {
		//���ڿ��� ���ڿ����� �˻��� ���ڸ� �Է� �޾� �� �ڿ��� �� ���ڰ� �� ���̾����� 
		//������ Ȯ���ϴ� ���α׷��� �ۼ��ϼ���
		System.out.print("���ڿ� �Է�: ");
		String str=sc.nextLine();
		System.out.print("�����Է�: ");
		char ch=sc.nextLine().charAt(0);
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			if('a'<=str.charAt(i)&&str.charAt(i)<='z'){
				
				if(str.charAt(i)==ch) count++; 
			}else {
				System.out.println("�����ڰ� �ƴմϴ�.");return;
				}
			
		
		}System.out.println("���Ե� ����: "+count+"��");
	}
		
			

	public void test2() {
		//5���� ȸ�������� �Է� �޾� �����ϰ� ����ϴ� ���α׷��� ���弼�� 
		//�Է� : �̸�, ����, �ּ�, Ű, ������, ����ó
		System.out.println("ȸ�� ������ �Է��ϼ���.");
		int i;
		String[]member=new String[5];

		for(i=0;i<5;i++) {
			System.out.print("�̸�: ");
			String name=sc.next();
			System.out.print("����: ");
			int age=sc.nextInt();
			System.out.print("�ּ�: ");
			sc.nextLine();
			String add=sc.nextLine();
			System.out.print("Ű: ");
			double height=sc.nextDouble();
			System.out.print("������: ");
			double weight=sc.nextDouble();
			System.out.print("����ó: ");
			sc.nextLine();
			String phone=sc.nextLine();
			member[i]= name+" "+age+"�� "+add+" "+height+"cm "+weight+"kg "+phone;
		}
		
		System.out.println("=========����ȸ��==========");
		for(String v:member) {
			System.out.println(v);
		}
	}

	
	public void test3() {
		// ��ϵ� ȸ���� ��ճ���, ��� Ű, ��� �����Ը� ����ϰ� ����غ����� 
		System.out.println("ȸ�� ������ �Է��ϼ���.");
		int i;
		String[]member=new String[5];
		int asum=0;
		int hsum=0;
		int wsum=0;
		for(i=0;i<5;i++) {
			System.out.print("�̸�: ");
			String name=sc.next();
			System.out.print("����: ");
			int age=sc.nextInt();
			System.out.print("�ּ�: ");
			sc.nextLine();
			String add=sc.nextLine();
			System.out.print("Ű: ");
			double height=sc.nextDouble();
			System.out.print("������: ");
			double weight=sc.nextDouble();
			System.out.print("����ó: ");
			sc.nextLine();
			String phone=sc.nextLine();
			member[i]= name+" "+age+"�� "+add+" "+height+"cm "+weight+"kg "+phone;
			
			asum+=age;
			hsum+=height;
			wsum+=weight;
		}
		
		System.out.println("=========����ȸ��==========");
		for(String v:member) {
			System.out.println(v);
		}
		
		System.out.println("��ճ���: "+asum/5+"��/ ��� Ű: "+hsum/5.0+"cm/ ��� ������: "+wsum/5.0+"kg");
		
	}
	public void test4() {
		
		System.out.println("ȸ�� ������ �Է��ϼ���.");
		System.out.println("��� �Է��Ͻðڽ��ϱ�? ");
		String[]member=new String[sc.nextInt()];
		int asum=0;
		int hsum=0;
		int wsum=0;
		for(int i=0;i<member.length;i++) {
			System.out.print("�̸�: ");
			String name=sc.next();
			System.out.print("����: ");
			int age=sc.nextInt();
			System.out.print("�ּ�: ");
			sc.nextLine();
			String add=sc.nextLine();
			System.out.print("Ű: ");
			double height=sc.nextDouble();
			System.out.print("������: ");
			double weight=sc.nextDouble();
			System.out.print("����ó: ");
			sc.nextLine();
			String phone=sc.nextLine();
			member[i]= name+" "+age+"�� "+add+" "+height+"cm "+weight+"kg "+phone;
			
			asum+=age;
			hsum+=height;
			wsum+=weight;
		}
		
		System.out.println("=========����ȸ��==========");
		for(String v:member) {
			System.out.println(v);
		}
		
		System.out.println("��ճ���: "+asum/(member.length)+"��/ ��� Ű: "+hsum/(member.length)+"cm/ ��� ������: "+wsum/(member.length)+"kg");
	}
	public void test5() {
		String [] p=new String[5];
		for(int i=0;i<p.length;i++) {
			
			System.out.print("��ǰid:");
			String id=sc.nextLine();
			System.out.print("����:");
			String kind=sc.nextLine();
			System.out.print("��ǰ��:");
			String name=sc.nextLine();
			System.out.print("����:");
			int price=sc.nextInt();
			sc.nextLine();
			p[i]=id+" "+kind+" "+name+" "+price;
		}
		System.out.println("===�����ǰ===");
		for(String v:p) {
			System.out.println(v);
		}
	}
	public void test6() {
		int exp=0;
		int count=0;
		while(true) {
		System.out.println("����");
		System.out.println("0.��ɽ���  1.��ũ���  2.����  3.������  99.������");
		System.out.print("����:");
		int cho=sc.nextInt();
			switch(cho) {
			case 0: System.out.println("����� �����մϴ�.");break;
			case 1: 
				exp+=1; 
				count+=1;
				System.out.println("1.��ũ��� �Ϸ� +1exp");break;
			case 2: 
				exp+=15; 
				count+=1;
				System.out.println("2.���� �Ϸ� +15exp");break;
			case 3: 
				exp+=10; 
				count+=1;
				System.out.println("3.������ �Ϸ� +10exp");break;
			case 99:
				System.out.println("����� ���ƽ��ϴ�. ����� ���� ����"+count+"����, ȹ���� �������� "+exp+"exp�Դϴ�.");return;
			}
		
		}
		
		
	}
	public void test7() {


		System.out.println("==========�н��� �ֹ� ���α׷�============");
		System.out.println("����================");
		System.out.println("1.�������======1000��");
		System.out.println("2.ġ����======1200��");
		System.out.println("3.��ġ���======2000��");
		System.out.println("���=================");
		System.out.println("4.�׳ɶ��======1200��");
		System.out.println("5.ġ����======1500��");
		System.out.println("6.«�Ͷ��======2000��");
		System.out.println("��Ÿ=================");
		System.out.println("7.Ƣ��=========1200��");
		System.out.println("8.����=========2500��");
		System.out.println("9.����=========1000��");
		System.out.println("10.�����========800��");

		int total=0;
		
		String choice="";
		String[] menuA= {"�������","ġ����","��ġ���","�׳ɶ��","ġ����","«�Ͷ��","Ƣ��","����","����","�����"};
		int[]priceA= {1000,1200,2000,1200,1500,2000,1200,2500,1000,800};
		
		for(int i=0;;i++) {	
			System.out.print("1.�޴�����:");
			int menu=sc.nextInt();
			String chom=menuA[menu-1];
			int price=priceA[menu-1];
			System.out.print("2.��������:");
			int count=sc.nextInt();
			System.out.println(count+"�� �ֹ� �ϼ̽��ϴ�.");
			price=price*count;
			total+=price;
			choice+= (chom+" : "+count+"�� - "+price+"��\n");			
			
			System.out.print("3.�߰��ֹ�����(y/n): ");
			sc.nextLine();
			char plus=sc.nextLine().charAt(0);
			if(plus=='n') {
				System.out.println("�ֹ��Ͻ� ������ ������ �����ϴ�.");
				System.out.println("=========================");
				System.out.println(choice);
				System.out.println("========================");
				System.out.println("�Ѱ���"+total+"��"); break;
			}else if(plus=='y') {
				
				continue;
			}	
		}
	}
}
			
			
			
		
	
	


