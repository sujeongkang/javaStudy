package com.array.controller;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayTest {
Scanner sc=new Scanner(System.in);
	public void basicArray() {
		//�⺻ �迭 ����� �Ҵ��ϱ�
		int[] intArr=new int[3]; //������ ���� �ڷ����� �迭�� �� �� ����.
		//��Ʈ���� �迭���� 3ĭ�� �迭 [0][1][2]
		//double �迭 �����ϱ�
		double[] doubleArr=new double[3]; //0.0
		//String �迭 �����ϱ�
		String[] strArr=new String[3];//null
		//char �迭 �����ϱ�
		char[] chArr=new char[3];//""
		//����Ʈ �� Ȯ��
		System.out.println(doubleArr[0]); //0.0
		System.out.println(strArr[0]);
		System.out.println(chArr[0]);
		
		
		//���� ����/����ϱ�
		intArr[0]=20;
		//intArr[2]="����"; //�ڷ����� �ٸ�.�ٸ� Ÿ���� �� ������.
		
		System.out.println(intArr[0]);
		System.out.println(intArr[1]); //heap���� �����Ǹ� �⺻���� defalt������ int����  0�� ����, String���� NULL, char����  ""
		int a = 0;
		System.out.println(a);
		
		//String 5���� ������ �� �ִ� ������ Ȯ���ϰ�
		//�ڽ��� �����ϴ� ���� �� 5�������� �����ϰ� ����ϱ�!
		String[] fruits=new String[5];
		//�ε��� ��ȣ: 0 1 2 3 4
		fruits[0]="������"; //���ڿ� ���� �ϳ��� ����
		fruits[1]="����";
		fruits[2]="����";
		fruits[3]="������";
		fruits[4]="����";
		//����ϱ�
		//System.out.println(); //syso + ctrl + space �ڵ��ϼ�
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		System.out.println(fruits[4]);
		//for���� �̿��Ͽ� ����ϱ�
		for(int i=0;i<5;i++) {
			//System.out.println(i); //0,1,2,3,4
			System.out.println(fruits[i]);
		}
		//fruits //��Ʈ�� �迭����
		fruits=new String[3];//5ĭ�̾��� �迭�� 3ĭ���� �ּҸ� �޸��� ���� ���� ���� , ������ �ִ� �迭�� ������ ���� ������ ����.GCġ��.
		
		System.out.println("[3]"+fruits.length);
		fruits=new String[100];
		System.out.println("[100]"+fruits.length);
		
		
		//for���� �̿��Ͽ� �� �����ϱ�
		
		//for(int i=0;i<5;i++) { //���� ���� �ƴ϶� length�� �̿��Ͽ� ���ϰ� �� �� ����.
		for(int i=0;i<fruits.length;i++) {
			fruits[i]="����"; //�ڵ����� �迭�� ��� "����"
			//ArratIndexOutOfBoundsException ���� �迭�� 3���� ��������� �� �������� ū �迭�� ����� �ߴ� ����
		}  //�迭 �Էµ���
		///////////////////////////////////////
		for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}  //�迭 ��� ���� �����ؼ� ȭ�鱸����.
		
		//���� 5���� ������ �� �ִ� ������ Ȯ���ϰ� 
		//�� ������ 1~5���� ���� �����ϱ�
		int[] nums=new int[5];
		for(int i=0;i<nums.length;i++) {
			nums[i]=i+1;
					
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		//�̸��� �Է¹ް� ��� ���α׷� �����
		//1.client�� ���� ����̸��� �Է����� �Է¹ް�
		//2.�� �� ��ŭ �迭�� ����� �̸��� �Է¹޾� �����ϱ�
		//3.�迭�� ����ϱ�
		
		System.out.print("�� ��? : ");
		int su=sc.nextInt();
		
		String[] names=new String[su]; //�Է��� �� ũ���� �迭 ����
		
		for(int i=0;i<names.length;i++) { //�迭 ���� ��ŭ �̸��Է�
			System.out.print("�̸�: ");
			names[i]=sc.next();
			
		}for(int i =0;i<names.length;i++) {
			System.out.println(names[i]); 
			//�̶����� �Է��� �� �ѹ��� ����ϱ� ���ؼ��� ���� ������ �ʿ�
			//�����Ҷ� �����ϱ� ������  ���������ʿ�
		}
		//�迭�� ������ �� ����� ���ÿ� �ʱ�ȭ
		int age=19; //����������
		
		int[] numbers= {1,2,3,4,5}; // �迭����{0�� ,1�� ,2�� ,3�� ,4�� �ε����� �����Ǵ�!}
		System.out.println(numbers[3]); //4
		String[] nn= {"����","������","���Ͽ�","������"};
		System.out.println(nn[0]); //����
		//names = {"����","���߱�","����","ȫ��õ"};//�̹� �Ҵ�� �迭�� �̷��� ���� �Ұ�
		names=new String[]{"����","���߱�","����","ȫ��õ"};//�Ҵ�� �迭 ���� �ٲٱ�
		System.out.println(names[0]);//����
		
	}
	//�迭�� ���� �ִ� ���
	public void inputArray(String[] temp) {
		
		for(int i=0;i<temp.length;i++) {
			System.out.print("�Է�: ");
			temp[i]=sc.nextLine();
		}
	}
	public void printArray(String[] t) {//��±��
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i]);
		}
	}
	 //����� ����� �ٸ� Ŭ������ �޼ҵ忡 ���� �� �ִ�.
	
	 
	public void arrayCopy() {
		//���� ����  //�ּҰ��� �����ؼ� ������ �迭������ ���� ���°�
		char[] chs= {'A','B','C','D'};
		char[] copyCh=chs; //chs�� ������ �ּҸ� copyCh�� �ֱ�
		chs[0]='��'; //�迭 chs�� �迭 copyCh �Ѵ� 'A'�� '��'�� ����
		//�ּҰ��� ���� �����ϱ� ������ heap�� �ִ� ���������� ����Ǿ� ���� ������.
		copyCh[copyCh.length-1]='��'; 
		//[length]�� �迭�� ũ��: 4, [length-1]�� [3],�ε��� ��ȣ 3 ���� 'D' 
		//���� �ν�  �� �ּҰ��� ���� ���������� �����
		System.out.println("======chs������=======");
		for(int i=0;i<chs.length;i++) {
			System.out.print(chs[i]);
		}
		System.out.println();
		System.out.println("=======����� ��======");
		for(int i=0;i<copyCh.length;i++) {
			System.out.print(copyCh[i]);
		}
		System.out.println();
		System.out.println(chs+":"+copyCh); 
		//�ּҰ��� ����. �Ȱ��� ��ġ�� ���� �ּҰ��� �����ϰ��ִ�.
		//[C@74a14482:[C@74a14482 16���� �ּҰ�
		
		
		//���� ����
		//heap������ �迭������ �߰������� ���� ���� �����ϴ� ��!
		//���� ���� ����Ҷ� ���纻�� ����� ��ġ(�ּ�)�� �ٸ�. ����!!!!!!! ����
		//���� ������ �����ص� ���� ���� ���� x
		
		//1.for��  
		//2.system.arraycopy(arr1,0,arr2,0,arr.length)
		// (������� �迭, ���۰� , ������ ��ġ�� �迭,  ���۰� , ����)
		
		
		String[] str= {"��","��","��","��"};
		String[] str2=new String[str.length]; //str�� ���� ũ���� �迭 �Ҵ�.
		//1. for���� �̿��� ����
		for(int i=0;i<str.length;i++) {
			str2[i]=str[i];
		}
		str[0]="����"; //���� ���� ����.���纻�� ���� ���� ����.
		str2[str2.length-1]="������";//str2�� ������ �ε����� �����.
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}
		System.out.println();
		for(int i=0;i<str2.length;i++) {
			System.out.print(str2[i]); 
		}		
		System.out.println();
		
		
		//2.System.arraycopy �޼ҵ� �̿� �����ϱ�
		//���ϴ� ��ġ�� ���� ���ϴ¸�ŭ ���ϴ� ��ġ�� ������ ������.
		String[] str3=new String[str.length]; //���� strũ���� str3 �迭 ���� ����
		//�Ҵ��ʿ�
		//System.arraycopy(str,0,str3,0,str.length);//length�� ����: ��ü����
		System.arraycopy(str,2,str3,2,2);
		//str[2]�� ���� 2��'��','��'�� str3[2]����2��[3]������ '��''��'�� ����
		//���� ���� str3�� �迭ũ�� ��� �ʿ�.
		
		//�迭�� ���� �Ҵ��ؼ�  �Ҵ��� ������ ���� �����ϴ� ��
		
		
		
		
		//for(i=0;i<str.leng....
		//for each���� ����غ���!
		//�迭�̳�, collection��ü�� ���� ������ �� ���
		//for(�迭 �ڷ����� ���� : �迭 OR collection��ü){  ����   }
		System.out.println();
		//for(�ʱ��,���ǽ�,������)����
		for(String v : str) { //str�� ���� �迭�� ���� ����.  ���� �� �� ��  
			//str �� [0]���� [3]���� �ڵ����� ������ �����ε����� �ڵ����� ���鼭 ���������� ���ư�.
			System.out.print(v);//�� ���� �ڵ� ���
		} 
		System.out.println();
		for(String v : str3) {
			//���������� v���� �ٸ� �̸����ε� ���𰡴�
			System.out.print(v);
		}
		System.out.println();
		
		
		//Array.copyOf(), clone() �迭������ �����ϰ� �������ָ� ��
		//*�Ҵ��� �ʿ���� new �ʿ�x
		
		//3.Arrays.copyOf() �޼ҵ� �̿��ؼ� ����
		//�迭�� �Ҵ����� �ʰ� ������ ������ �� ������
		String[] str4;
		str4=Arrays.copyOf(str, str.length);
		str4[0]="�� ���!";
		for(String temp:str4) {
			System.out.print(temp);
		}
		System.out.println();
		
		
		//Arrays.copyOf();
		String[] str5; //NULL
		//System.out.println(str5); //�ƹ��͵� ���»���
		str5=Arrays.copyOf(str,str.length);//Arrays.copyOf������ �迭�� ����!
		System.out.println(str5);
		for(String v:str5) {
			System.out.println(v);
		}
		
		//clone()  ->��ü�� �����ϴ� ����� �ϴ� �޼ҵ�
		//�迭������.clone();  
		str5=str.clone();
		for(String v: str5) {
			System.out.println(v);
		}
		
		
	}
	
	
	public void arrayTest() {
		int[] nums= {1,2,3,4,5};//�迭 ����� ���ÿ� �ʱ�ȭ
		//nums=new int[5];
		//nums[0]=1;
		//nums[1]=2;
		//nums[2]=3;
		//nums[3]=4;
		//nums[4]=5;
		nums=new int[]{4,5,6,7};//������ �迭���� �ʱ�ȭ
	}
	
	//������ �迭 ����ϱ�
	public void doubleArray() {
		//������ �迭 �����ϱ�
		int[][] numbers=new int[3][3];
		//������ �迭�� �� �����ϱ�
		numbers[0][0]=300;
		numbers[0][1]=100;
		numbers[0][2]=200;
		numbers[1][0]=30;
		numbers[1][1]=20;
		numbers[1][2]=50;
		
		//������ �迭 ����ϱ�
		System.out.println(numbers[1][1]);
		System.out.println(numbers);//number�� �ּҰ� ��� �ִ� �ּҰ�[[I@677327b6
		System.out.println(numbers[0]);//������ �ּҰ����� ����//[I@14ae5a5
		
		//������ �迭�� ����� ���ÿ� �ʱ�ȭ!
		int[] a= {1,2,3,4};
		int[][] num2= {{1,2,3,4},{5,6,7,8}};
		//new int[2][4];
		numbers= new int[][]{{10,20,},{50,60,}};
		numbers= new int[2][];
		numbers[0]=new int[10];
		numbers[1]=new int[2];
		//����� ������ �迭 �ʱ�ȭ;
		
		//for���� �̿��Ͽ� �������迭 ó���ϱ�!
		//numbers ����غ���
		//for(int i=0;i<3;i++) {
		//	for(int j=0;j<3;j++) {
		//	 System.out.println(i+":"+j);
		//	}
		//}
		//300 100 200 
		//30 20 50 
		//0 0 0 
		//for(int i=0;i<3;i++) { //�迭�� ���̰� �ٲ�� ArrayIndexOutOfBoundsException
			//for(int j=0;j<3;j++) {
		for(int i=0;i<numbers.length;i++) {	//�迭�� �ּҸ� ������ �־� length��밡��
			//�迭�� ���̰� �ٲ� �ڵ����� ����.
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
	public void test1() {
		int[][] num=new int[15][11];
		int a=1;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<11;j++) {
				num[i][j]=a;
				System.out.print(num[i][j]+" ");
				a++;
			}
			System.out.println("");
		}
	}
	public void test2() {
		int[][] stu=new int[2][6];
		
		
	}
	

}
