package com.kh.practice.chap02.loop;
import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc=new Scanner(System.in);
	
	public void practice1() {
		//����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
		//��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�. 
		//���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.

		System.out.print("1�̻��� ���ڸ� �Է��ϼ���: ");
		int num=sc.nextInt();
		if(num>=1) {
			for(int i=1;i<=num;i++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}else {
			System.out.println("1�̻��� ���ڸ�  �Է����ּ���.");
		}
		/*System.out.println("1�̻��� ���ڸ� �Է��ϼ���: ");
		int su=sc.nextInt();
		int i,j;
		for(j=1;j<=su;j++) {
			for(i=su;i>0;i--) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		*/
		
	}
	public void practice2() {
		//����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
		//��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�. 
		//�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		//��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���. 
		int num=0;
		do {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ���: ");
			num=sc.nextInt();
			if(num>=1) {
				for(int i=1;i<=num;i++) {
					System.out.print(i+" ");
				}
				System.out.println("");
			}else if(num<1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			}
		}while(num<1);
		
	}	
	public void practice3() {
		//����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
		//��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		System.out.print("1�̻��� ���ڸ� �Է��ϼ���: ");
		int num=sc.nextInt();
		int r=num+1;
		if(num>=1) {
			for(int i=0;i<num;i++) {
				r--;
				System.out.print(r+" ");
			}
			System.out.println("");
		}else {
			System.out.println("1�̻��� ���ڸ�  �Է����ּ���.");
		}
	}
	public void practice4() {
		//�� ������ ��� ���� �����ϳ�, 
		//1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���. 
		int num = 0, r;
		do{ 		
			System.out.print("1�̻��� ���ڸ� �Է��ϼ���: ");
			num=sc.nextInt();
			r=num+1;
			if(num>=1) {
				for(int i=1;i<=num;i++) {
					r--;
					System.out.print(r+" ");
				}
			}else if(num<1){
				System.out.println("1�̻��� ���ڸ�  �Է����ּ���.");
			}
		}while(num<1);
		System.out.println("");
	}
	public void practice5() {
		System.out.print("������ �ϳ� �Է��ϼ���:");
		//1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���
		int num=sc.nextInt();
		String result ="";
		int sum=0;
		for(int i=1;i<=num;i++) {
			System.out.print(i);
				if(i<num) {
					System.out.print("+");
				}
			sum+=i;
			}
		System.out.println("="+sum);
	}
	

	public void practice6() {
		//����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���. 
		//���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.

		System.out.print("ù��° ����: ");
		int n1=sc.nextInt();
		System.out.print("�ι�° ����: ");
		int n2=sc.nextInt();
		if(n1<1||n2<1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
		}else {
			if(n1<n2) {
				for(int i=n1;i<=n2;i++) {
						System.out.print(i+" ");
				}
			}else if(n1>n2) {
				for(int i=n2;i<=n1;i++) {
						System.out.print(i+" ");
					}
			}else {
				System.out.println(n1);
			}
		}
		System.out.println("");
			
	}
	
	public void practice7() {
		//�� ������ ��� ���� �����ϳ�, 
		//1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭
		//�ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		int n1,n2=0;
		do {
			System.out.print("ù��° ����: ");
			n1=sc.nextInt();
			System.out.print("�ι�° ����: ");
			n2=sc.nextInt();
			if(n1<1||n2<1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���");
			}else {
				if(n1<n2) {
					for(int i=n1;i<=n2;i++) {
							System.out.print(i+" ");
					}
				}else if(n1>n2) {
					for(int i=n2;i<=n1;i++) {
							System.out.print(i+" ");
						}
				}
			}
		}while(n1<1||n2<1);
		System.out.println("");
	}
	public void practice8() {
		//����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
		System.out.print("����: ");
		int num=sc.nextInt();
		System.out.println("===== "+num+"�� ====");
		for(int i=1;i<=9;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
		
	}
	public void practice9() {
		//����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���. 
		//��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.
		System.out.print("����: ");
		int num=sc.nextInt();
		int a = 0;
		int j = 0;
		
		if(num>9) {
			System.out.println("9������ ���ڸ� �Է����ּ���.");
			
		}else {
			 for(int i=num;i<=9;i++) {
				 System.out.println("===== "+i+"�� ====");
				 for(j=1;j<=9;j++) {
					 System.out.println(i+"*"+j+"="+(i*j));
				 }
			 }
		}
	}
	public void practice10() {
		//�� ������ ��� ���� �����ϳ�, 
		//9�� �ʰ��ϴ� ���ڰ� �Էµƴٸ� ��9 ������ ���ڸ� �Է����ּ��䡱�� ��µǸ鼭
		//�ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
	int num, j=0;
		do {
			System.out.print("����: ");
			num=sc.nextInt();
		
			if(num<=9) {
				 for(int i=num;i<=9;i++) {
					 System.out.println("===== "+i+"�� ====");
					 for(j=1;j<=9;j++) {
						 System.out.println(i+"*"+j+"="+(i*j));
					 }
				 }
			}else if(num>9) {
				System.out.println("9������ ���ڸ� �Է����ּ���.");	 
			}
		}while(num>9);
	}
	public void practice11() {
		//����ڷκ��� ���� ���ڿ� ������ �Է� �޾� ������ ������ 
		//���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ϼ���. ��, ��µǴ� ���ڴ� �� 10���Դϴ�.
		//* ���������� ���ڵ� ���̿��� ������ ������ ���� �����ϴ� ���� ���Ѵ�. 
		//ex) 2, 7, 12, 17, 22 �� 5  5    5    5  => ���⼭ ������ 5
		System.out.print("���ۼ���: ");
		int s=sc.nextInt();
		System.out.print("����: ");
		int g=sc.nextInt();
		int count=0;
		do {
			System.out.print(s+" ");
			s+=g;
			count++;
		}while(count<10);
		System.out.println("");
	}
	public void practice12() {
		//���� �� ���� �����ڸ� �Է� �ް� �Էµ� �����ڿ� ���� �˸��� ����� ����ϼ���. 
		//��, �ش� ���α׷��� ������ �Է¿� ��exit����� ���� ���� ������ ���� �ݺ��ϸ�
		// exit�� ������ �����α׷��� �����մϴ�.���� ����ϰ� �����մϴ�. 
		//���� �����ڰ� �������̸鼭 �� ��° ������ 0���� ������ ��0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.���� ����ϸ�, 
		//���� �����ڰ� ���� �� ������ �������Դϴ�. �ٽ� �Է����ּ���.����� ����ϰ�
		//�� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϼ���.
		String oper="";
		int i1,i2;
		do{
			System.out.print("������(+,-,*,/,%): ");
			oper=sc.nextLine();
			System.out.print("����1: ");
			i1=sc.nextInt();
			System.out.print("����2: ");
			i2=sc.nextInt();
			switch(oper) {
			case "+": System.out.println(i1+"+"+i2+"="+(i1+i2));break;
			case "-": System.out.println(i1+"-"+i2+"="+(i1-i2));break;
			case "*": System.out.println(i1+"*"+i2+"="+i1*i2);break;
			case "%": System.out.println(i1+"%"+i2+"="+i1%i2);break;
			case "/": 
				if(i2!=0) {System.out.println(i1+"/"+i2+"="+i1/i2);break;
				}else {
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���");
				};break;
			case "exit":System.out.println("���α׷��� �����մϴ�.");return;
			default: System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���."); 
			}
			sc.nextLine();
		}while(!equals(oper)||i2==0);

	}
	public void practice13() {
		//���� �Է� : 4 * ** *** ****
		System.out.print("���� �Է�: ");
		int j=sc.nextInt();
		String result="";
		for(int i=1;i<=j;i++) {
			result+=("*");
			System.out.println(result);
		}
		
	}
	public void practice14() {
		//������ ���� ���� ������ �����ϼ���.
		//ex. ���� �Է� : 4 ****/ ***/ **/ *
		int i,j,k;
		System.out.print("���� �Է�: ");
		j=sc.nextInt();
		for(i=0;i<j;i++) { //4���ݺ�
			
			for(k=j;i<k;k--) { //���ǿ� ���� �Է°��� �ְ� �� �� ���� ���� ������ * �ݺ�
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
}
