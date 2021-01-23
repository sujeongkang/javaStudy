package test.array.premitive;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class ArraySample {
	
	Scanner sc=new Scanner(System.in);	
	
	public void test1() {
		int[] num=new int[10];
		int sum=0;
		for(int i=0;i<num.length;i++) {
			num[i]=(int)((Math.random()*100)+1);
		}
		for(int v: num) {
			sum+=v;
		}
		System.out.println(sum);
	}
	
	public void test2() {
		int max=0;
		int min=100;
		int[] num=new int[10];
		for(int i=0;i<num.length;i++) {
			num[i]=(int)((Math.random()*100)+1);	
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min){
				min=num[i];
			}
		}
//		for(int v: num) {
//			System.out.print(v+" ");
//		}//���� Ȯ��.
		System.out.println("�ִ밪: "+max+", �ּҰ�: "+min);
		
	}
	public void test3() {
		byte sum=0;
		byte[] b=new byte[10];
		for(int i=0;i<b.length;i++) {
			//Byte.MAX_VALUE byte �ִ밪
			b[i]=(byte)((Math.random()*Byte.MAX_VALUE));
			if(b[i]%2==0) {
				sum+=b[i];
			}
		}
//		for(byte v:b) {
//			System.out.print(v+" ");
//		}
		System.out.println(sum);
	}
	public void test4() {
		System.out.print("���ڿ�(����) �Է�: ");
		String input=sc.nextLine();
		
		String[]nums=new String[input.length()];
		int sum=0;
		for(int i=0;i<input.length();i++) {
			nums[i]=input.substring(i,i+1);
			sum+=Integer.parseInt(nums[i]);
		}
		System.out.println("�հ�: "+sum);
			
		
	}
	public void test5() {
		System.out.print("���ڿ�(����) �Է�: ");
		String input=sc.nextLine();
		
		char[] nums=new char[input.length()];
		int sum=0;
		for(int i=0;i<input.length();i++) {
			nums[i]=input.charAt(i);
			sum+=nums[i]-'0';
		}
		System.out.println(sum);
	}
	
	public void test6() {
		//1. ���ڿ� ���� �ʱ�ȭ 
		String personID="881225-1234567";
		//2. ���ڿ����� ����, ����, ����, ������ ���� ���� �и� ������
		String yearStr=personID.substring(0,2);
		String monthStr=personID.substring(2,4);
		String dateStr=personID.substring(4,6);
		String genderStr=personID.substring(7,8);
		int year=Integer.parseInt(yearStr)+1900;
		int month=Integer.parseInt(monthStr);
		int date=Integer.parseInt(dateStr);
		int gender=Integer.parseInt(genderStr);
		//3. java.util ��Ű���� ��¥ ���� Ŭ����
		//4. ������ ������ ���� �����̾����� �����Ǵ� �޼ҵ带 ����ؼ� Ȯ�����
		GregorianCalendar birth=new GregorianCalendar(year,(month-1),date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd�� E����");
		String strDate=sdf.format(birth.getTimeInMillis());
		//System.out.println(strDate);
		//5. �������� 1�̸� ����, 2�̸� ���ڶ�� �����
		String gen="";
		if(gender==1) {
			gen="����";
		}else if(gender==2) {
			gen="����";
		}
		//6. ��¥ �����ͷ� �ٲ� ������ �⵵��, ���� ��¥�� �⵵�� ���� ���� ��� �����
		GregorianCalendar today=new GregorianCalendar();
		int toyear=today.get(Calendar.YEAR);
		int biryear=birth.get(Calendar.YEAR);
		int age=toyear-biryear;
		
		
		System.out.println("����:"+strDate+"\n����:"+gen+"\n����:"+age);	
		
	}
}
