package com.objarr.main;

import com.objarr.model.vo.Nation;

public class Main {
	public static void main(String[] args) {
		//��ü�迭 ����ϱ�
		//��ü�迭 �����ϱ�
		Nation[] nations;
		//�迭�Ҵ�->�������Ȯ��
		nations=new Nation[3];
		
		//�����ϸ� �ȵǿ�!
		//System.out.println(nations[0].getName());//���� �ȵ�! ����
		//ava.lang.NullPointerException
		//�Ʒ����� ��ü���ֱ� ��, ������ ��������� �������, null�� ���� �Ұ�! �ε������� �ּҰ� �ִ� �� �ʿ�
		
		//�Ҵ��Ѵ��� �� ��ü�� �־�� ���ٰ���!!!!!!!

		//�迭�� ��ü �ֱ�!
		//index�̿��Ͽ� ��ü �ֱ�!
		nations[0]=new Nation("�ѱ�",6000,"�ѱ���",100,"����ȭ");
		//nations[0]�� �ϳ��� ��ü�� �Ȱ���
		nations[1]=new Nation("�̱�",30000,"����",10000,"���");
		nations[2]=new Nation("�߱�",150000,"�߱���",1000,"��ȭ");
		//Nation�� �ڷ����� ��
		Nation n=new Nation("�ѱ�",6000,"�ѱ���",100,"����ȭ"); //���� nations[0]�̶� n�̶� ����.
		//���� nations[0]�� �ϳ��� ������� ����.
		n.getName();
		
		//�迭�� ����� ��ü �ҷ���ss��
		System.out.println(nations[0].getName());
		
		
		//for���� �̿��� �ʱ�ȭ ���
		Nation[] nations2=new Nation[10];
		for(int i=0;i<nations2.length;i++) {
			nations2[i]=new Nation(); //default������ �ʱ�ȭ
		}
		for(int i=0;i<nations2.length;i++) {
			System.out.println(nations2[i]);
		}
		
		
		//��ü �迭�� foreach�� ����� �����Ѱ�?��
		for(Nation na: nations) {
			System.out.println(na.getName());
		}
		
		//��ü �迭 ����� ���ÿ� �ʱ�ȭ
		nations2=new Nation[] {new Nation(),new Nation()};
		Nation[] na= {new Nation(), new Nation(), new Nation()};
		
		
		
		
		
		
	}
	
	
}







