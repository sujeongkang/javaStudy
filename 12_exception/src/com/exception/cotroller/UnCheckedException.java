package com.exception.cotroller;

import java.util.Calendar;
import java.util.Date;

public class UnCheckedException {//���ܰ� �߻��Ҷ� �������� ó���� ���ư� �� �ֵ��� ó��
	
	public static void main(String[] args) {
		//UncheckedException �ڵ�󿡼� �����ڰ� ó������ �ʾƵ� �Ǵ�
		//Exception�� ����.//�ڵ�󿡴� ���� �ȶ� ó���϶�� �������� ����. ��������ְ� ����.
		int a=0;
		int b=10;
		//System.out.println(b/a);//ArithmeticExceptiondl �߻���!
		String name=null;
		//System.out.println(name.charAt(0));//NullPointerException�߻�
		//int[]nums=new int[-3];//�����Ͻÿ��� ���� ���� ��Ÿ�ӽÿ� �����߻�//NegativeArraySizeException
		int[]nums=new int[2];
//		Scanner sc=new Scanner(System.in);
//		while(true) {
//			System.out.println("����");
//			int cho=sc.nextInt();
//			if(cho==0)break;
//			try {
//				System.out.println(nums[3]);//ArrayIndexOutOfBoundsException
//			}catch(ArrayIndexOutOfBoundsException e) {
//				nums=new int[nums.length+5];
//				System.out.println("�ذ���");
//			}
//
//		}
		Object obj=new Date();
		//Calendar c=(Calendar)obj; //ClassCastException
		
		//���ܴ� ������ �߻���ų �� ����
		//throw���� �̿��ؼ� Exception�� �߻���Ŵ
		throw new NullPointerException("����! ����!");
		//printStackTrace(); //��𼭺��� �����ؼ� ��� �����߻��� ��� ����ϴ� �޼ҵ�
		
		
	}
}
