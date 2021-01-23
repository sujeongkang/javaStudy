package com.kh.practice.array;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class ArrayPractice {
	
	Scanner sc=new Scanner(System.in);
	
	public void practice1() {
		//���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ�
		//������� �迭 �ε����� ���� �� �� ���� ����ϼ���.

		int[] intArr=new int[10];
		for(int i=0;i<intArr.length;i++) {
			intArr[i]=i+1;
		}
		for(int i=0;i<intArr.length;i++) {
			System.out.print(intArr[i]+" ");
			
		}
		System.out.println("");
	}
	public void practice2() {
		//���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ� 
		//�������� �迭 �ε����� ���� �� �� ���� ����ϼ���.

		int[] iArr=new int[10];
		for(int i=iArr.length-1;i>=0;i--) {
			iArr[i]=i+1;
		}
		for(int i=iArr.length-1;i>=0;i--) {
			System.out.print(iArr[i]+" ");
		}
		System.out.println("");
	}
	public void practice3() {
		System.out.print("���� ����: ");
		int num=sc.nextInt();
		int[] iArr=new int[num];
		for(int i=0;i<iArr.length;i++) {
			iArr[i]=i+1;
		}
		for(int i=0;i<iArr.length;i++) {
			System.out.print(iArr[i]+" ");
		}
		System.out.println("");
	}
	public void practice4() {
		String[] fruits={"���","��","����","������","����"};
		System.out.println(fruits[1]);
	}
	public void practice5() {
		//���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ� �˻��� ���ڰ� 
		//���ڿ��� �� �� �� �ִ��� ������ �� ��° �ε����� ��ġ�ϴ��� �ε����� ����ϼ���
		System.out.print("���ڿ�: ");
		String str=sc.nextLine();
		System.out.print("����: ");
		char text=sc.nextLine().charAt(0);
		
		int count = 0;
		String tag = "";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==text) {
				tag += i+(" ");
				count++;
			}
		}
		System.out.println(str+"�� "+text+" �� �����ϴ� ��ġ(�ε���): "+tag);
		System.out.println(text+" ����: "+count);	
	}
	public void practice6() {
		//������ ~ ���ϡ����� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է� �޾� 
		//�Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ� 
		//������ ���� ���ڸ� �Է� �� ���߸� �Է��ϼ̽��ϴ١��� ����ϼ���.
		int i=0;
		
		System.out.print("0~6���� ���� �Է�: ");
		int num=sc.nextInt();
		String[] week={"��","ȭ","��","��","��","��","��"};
		
		if(num>=0&&num<=6) {
			i=num+1;
			System.out.println(week[num]+"����");
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
			
	}
	public void practice7() {
		System.out.print("����: ");
		int inum=sc.nextInt();
		int[] iArr=new int[inum];
		String str="";
		int sum=0;
		for(int i=0;i<inum;i++) {
			System.out.print("�迭"+i+"��° �ε����� ���� ��: ");
			int in=sc.nextInt();
			sum=sum+in;
			str+=(in+" ");
			
		}
		System.out.println(str);
		System.out.println("����: "+sum);
	}
	public void practice8() {
		//3�̻��� Ȧ�� �ڿ����� �Է� �޾� �迭�� �߰�������
		//1���� 1�� �����Ͽ� ������������ ���� �ְ�, 
		//�߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϼ���.
		//��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� ���ٽ� �Է��ϼ��䡱�� ����ϰ�
		//�ٽ� ������ �޵��� �ϼ���
		int i,a;
			do{	
				System.out.print("������ �Է��ϼ���: ");
				a=sc.nextInt();
				if(a>2&&a%2==1) {
					int[] Arr=new int[a];
					for(i=0;i<a;i++) {
						if(i<=(a/2)) {
							Arr[i]=i+1;
						}else if(i>(a/2)) {
							Arr[i]=a-i;
						}		    
						
					}
					for(i=0;i<Arr.length;i++) {
					System.out.print(Arr[i]+" ");
					}
				}
				else {
					System.out.println("�ٽ� �Է��ϼ���.");
				}
			}while(a<3||a%2==0);
			System.out.println("");
		}

	public void practice9() {
		//����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ� ������ ��OOO ġŲ ��� ���ɡ�, 
		//������ ��OOO ġŲ�� ���� �޴��Դϴ١��� ����ϼ���. 
		//��, ġŲ �޴��� ���ִ� �迭�� ���� ������ ���ϼ���.
		String[] chicken= {"���", "����", "��ǳ", "�Ĵ�"};
		System.out.print("ġŲ �̸��� �Է��ϼ���: ");
		String menu=sc.nextLine();
		for(int i=0;i<chicken.length;i++) {
			
			if(menu.equals(chicken[i])){
				System.out.println(menu+"ġŲ ��� ����");break;
			} 
			if(!menu.equals(chicken[i])&&i==chicken.length-1){
				System.out.println(menu+"ġŲ�� ���� �޴��Դϴ�.");
				
			}
		}
		
	}
	public void practice10() {
		//�ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ����ϼ���. 
		//��, ���� �迭 ���� ���� ���� �迭 ���纻���� �����ϼ���.
		String[] pn1=new String[14];
		System.out.print("�ֹε�Ϲ�ȣ(-����): ");
		String num=sc.nextLine();
		for(int i=0;i<pn1.length;i++) {
			pn1[i]=num.charAt(i)+"";
		}
		String pn2[];
		pn2=pn1.clone();
		for(int i=7;i<pn2.length;i++) {
			pn2[i]="*";
		}
		for(int i=0;i<pn2.length;i++) {
			System.out.print(pn2[i]);
		}
		System.out.println("");
	}

	public void practice11() {
		//10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		//1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ�� �� ����ϼ���.
		
		int[] su=new int[10];
		for(int i=0;i<su.length;i++) {
			su[i]=(int)(Math.random()*10)+1;
		}
		
		for(int i=0;i<su.length;i++) {
			System.out.print(su[i]+" ");
		}
		System.out.println("");
	}
	
	public void practice12() {
		//10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		//1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ �� �迭 ��ü ���� �� �� �߿��� �ִ밪�� �ּҰ��� ����ϼ���.
		int[] nums=new int[10];
		int max=0;
		int min=10;
		for(int i=0;i<nums.length;i++) {
			nums[i]=(int)(Math.random()*10)+1;
			}
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
			if(max<=nums[i]) {
				max=nums[i];
			}
			if(min>=nums[i]) {
				min=nums[i];			
			}
		}
		System.out.println("");
		System.out.println("�ִ밪: "+max+"\n�ּҰ�: "+min);
	}
	public void practice13() {
		//10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ� 1~10 ������ ������ �߻����� 
		//�ߺ��� ���� ���� �迭�� �ʱ�ȭ�� �� ����ϼ���.
		int[] su=new int[10];
		for(int i=0;i<su.length;i++) {
			su[i]=(int)(Math.random()*10)+1;

			for(int j=0;j<i;j++) {
				if(su[i]==su[j]) {
					i--;
				}
			}
		}
		for(int i=0;i<su.length;i++) {
			for(i=0;i<su.length-1;i++) {
				System.out.print(su[i]+",");
			}
			System.out.print(su[i]);
		}
		System.out.println("");
	}
	public void practice14() {
		//�ζ� ��ȣ �ڵ� ������ ���α׷��� �ۼ��ϴµ� 
		//�ߺ� �� ���� ������������ �����Ͽ� ����ϼ���.
		int[] lotto=new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=((int)(Math.random()*45)+1);
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
			}
			Arrays.sort(lotto);//�迭 �������� ���� 
		
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
			}
		System.out.println("");
		}
//	�������� ����.
//	 for (int i=0; i<6;i++) {
//	   for(int k=0;k<6;k++) {
//		    if (choice[i]>choice[k] && i!=k) {
//		     dep[i]++;
//		    }
//		   }
//		   nchoice[dep[i]] =choice[i] ;
//		  }
//		  for (int a : nchoice) {
//		   System.out.print(a+" ");
//		  }
	
	public void practice15() {
		//���ڿ��� �Է� �޾� ���ڿ��� � ���ڰ� ������ �迭�� �����ϰ�
		//������ ������ �Բ� ����ϼ���	
		System.out.print("���ڿ�: ");
		String a=sc.next();
		int i=0;
		int k=0;
		String b=""+a.charAt(0);
		int count=0;
		for(i=0;i<a.length();i++) {
			for(k=0;k<i;k++) {
				if(i!=k&&a.charAt(i)==a.charAt(k)) {
					count--;
					
				}
				if(k==i-1&&a.charAt(i)!=a.charAt(k)) {
					b+=a.charAt(i);
				}
			}count++;
		}
		char[] ch=new char[b.length()];
		for(int j=0;j<b.length();j++) {
			ch[j]=b.charAt(j);
		}
		for(char c:ch) {
			System.out.print(c+" ");
		}
		System.out.print("\n ���� ����: "+count+"\n");
	}	
//		
//		System.out.print("���ڿ�: ");
//		String str=sc.nextLine();
//		char[] t=new char[str.length()];
//		
//		int count=0;
//		
//		for(int i=0;i<t.length;i++) {
//			t[i] =str.charAt(i);
//			for(int j=0;j<t.length;j++) {
//				if(i!=j&&t[i]==t[j]) {
//					
//					count=count-1;
//				}
//			}
//			count++;
//		}
//		System.out.print("���ڿ��� �ִ� ����: ");
//		for(int i=0;i<t.length;i++) {
//			for(i=0;i<t.length-1;i++) {
//				System.out.print(t[i]+", ");
//			}
//			System.out.print(t[i]);
//		}
//		System.out.println("\n ���� ����: "+count);
//	}

	
	public void practice16() {
		//����ڰ� �Է��� �迭�� ���̸�ŭ�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
		//�迭�� �ε����� ���� �� ���� ����ڰ� �Է��Ͽ� �ʱ�ȭ �ϼ���. 
		//��, ����ڿ��� �迭�� ���� �� ������ ����� �� ���� �� �Է��� ����, 
		//�ø� ���� � �����͸� ���� ������ ��������. 
		//����ڰ� �� �̻� �Է����� �ʰڴٰ� �ϸ� �迭 ��ü ���� ����ϼ���.
		System.out.println("�迭�� ũ�⸦ �Է��ϼ���");
		int size = sc.nextInt();
		String [] arr = new String [size];
		String [] zrr;
		int i = 0;
		sc.nextLine();
		Repeater:
			while(true) {
				for (;i<size;i++) {
					System.out.print((i+1)+"��° ���� �Է� : ");
					arr[i] = sc.nextLine(); 
				}
			while(true) {
				System.out.println("�� ���� �Է��Ͻðڽ��ϱ�? (y/n)");
				char yn=sc.next().charAt(0);
				switch (yn) {
				case 'y': case 'Y' : 
					System.out.println("�� �Է��ϰ� ���� ����:");
					size+=sc.nextInt();
					zrr=arr.clone();
					arr=new String[size];
					System.arraycopy(zrr, 0, arr, 0, zrr.length);
					sc.nextLine(); continue Repeater;
					case 'n': case 'N' : break Repeater;
						}
					}
			}
		
		for (String v : arr) {
			System.out.print(v + " ");
			}
		}
	}
	
