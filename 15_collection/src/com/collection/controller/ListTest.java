package com.collection.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.collection.model.vo.Sport;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

import common.sort.NumberSort;
import common.sort.SportPlayerSort;
import common.sort.StringSort;

public class ListTest {
	
	public void arrayListTest() {
		//list�� ���� �˾ƺ���.->�������̽�
		//Ư¡: �迭�� ������ �ڷᱸ���� ������ ����.
		//->�ε��� ���� ������ ����, ������ ����, �ߺ����� ���� �� �� ����
		//����:ArrayList, LinkedList, Vector
		//ArrayList
		//��ü�� �����ϴ� �����ͺ����� Ŭ����== Object[]������� ����(������Ʈ �迭)
		//Ŭ������ ����(�ν��Ͻ�ȭ)�Ͽ� Ȱ���� ��.
		ArrayList list=new ArrayList();
		//Ȱ���ϴ� ����� �迭�� ���� �����!
		//�迭�� ���, ����  []�� �̿�.
		//list��ü�̱� ������ �޼ҵ带 �̿��ؼ� ó����.
		//list�� ���� �ִ� ���
		//add(��ü)�޼ҵ带 �̿�
		list.add("������");//0���ε���
		//add�޼ҵ忡 ���� ������ ���������� 0�� �ε����κ��� ���� ���Ե�.
		list.add("����");//1�� �ε���
		//list�� �پ��� ��ü�� ������ �� ����.
		list.add(new GregorianCalendar());//2�� �ε���
		list.add(new Scanner(System.in));//3�� �ε���
		
		//list�� ����� ��ü ����ϱ�
		//get(�ε���)�޼ҵ� �̿�
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		//list.get(00)=>������=>��ü�� �ּ�
		//Object������ ������ �ϰ� �ֱ� ������ ����ȯ�� �Ͽ� �����.
		System.out.println(((String)list.get(0)).charAt(0));
		
		//�ݺ����� Ȱ���ؼ� �����Ϳ� �����Ͽ� ó�� �� �� ����.
		int[]a=new int[10];//a.length
		//list�� ���̴�? -> list.size();
		System.out.println(list.size());//4//list�� ���ԵǾ��ִ� ��ü�� ��!
		//���� �� �ִ� �������� ������ �ǹ�.
//		list=new ArrayList();
//		System.out.println(list.size());//0
		//list������ �� GregorianCalendar��ü�� �⵵ ���
		for(int i=0;i<list.size();i++) {
			if(list.get(i) instanceof GregorianCalendar) {
				GregorianCalendar gc=(GregorianCalendar)list.get(i);
				System.out.println(gc.get(Calendar.YEAR));
			}
		}
		
		//List�������̽��� ����->ArrayList
		List sports=new ArrayList();
		//���� �����ϴ� ������ 4���� �����غ���!
		//��Ģ�� ����
		sports.add(new Sport("��������","�౸",11,new String[5]));
		//sports.get(0)=new Sport("��������","�౸",11,new String[5]);//����
		//��ü�⶧���� ���� ������ ����.
		sports.add(new Sport("��������","�߱�",9,null));
		sports.add(new Sport("�ⱸ����","�ｺ",1,null));
		sports.add(new Sport("������","����",8,null));
		
		//for���� �̿��ؼ� ��ü ����ϱ�
//		for(int i=0;i<sports.size();i++) {
//			System.out.println(sports.get(i));
//		}
		
		for(Object o:sports) {
			System.out.println(o);
		}
		//������ ���� ������ �������� ����ϱ�
		for(Object o:sports) {
			if(o instanceof Sport) {
				Sport s=(Sport)o;
				if(s.getType().equals("��������")) {
					System.out.println(s);
				}
			}
		}
		
		for(int i=0;i<sports.size();i++) {
			if(sports.get(i) instanceof Sport) {
				Sport s=(Sport)sports.get(i);
				if(s.getType().equals("��������")) {
					System.out.println(s);
				}
			}
		}
		
	
		//list�� ���ϴ� ��ġ�� �ս��� �����͸� ���� �� ����
		//add(index,data); index��ġ�� data�� ����!
		System.out.println("====���ϴ� ��ġ�� ���ֱ�====");
		System.out.println(sports.get(2));//�ｺ

		sports.add(2,new Sport("��������","��",5,null));
		//�ڵ����� 2���� �־�����, 2���� �ִ� �Ŵ� 3������ �и�
		System.out.println(sports.get(2));//��
		System.out.println(sports.get(3));//�ｺ
		
		//list�� Ư����ġ�� ���� ������ ���� ����.
		//set(intdex,data); Ư����ġ�� ���� ����
		System.out.println("===Ư����ġ �� �����ϱ�===");
		System.out.println(sports.get(list.size()-2));
		sports.set(sports.size()-2,"���� ��Ϳ�??");
		System.out.println(sports.get(sports.size()-2));
		System.out.println(sports.get(sports.size()-1));
		
		System.out.println(sports);
	
		//list�� �����Ͱ� �ִ��� ���� �� Ȯ���� ���?
		//sports.clear();//������ �ѹ��� ����� ��!
		//if(sports.size()>0) {
		if(!sports.isEmpty()) {
			System.out.println("�����Ͱ� �ִ�.");
		}else {
			System.out.println("�����Ͱ� ����.");
		}
		
		//���ϴ� ������ �����غ���.
		//remove(index);
		System.out.println(sports.size());
		sports.remove(3);
		System.out.println(sports.size());
		System.out.println(sports.get(3));//����� �ڿ��� ������ ������.
		//System.out.println(sports.get(5));
		//remove(��ü) 
		System.out.println("����� �� ����");//4
		System.out.println(sports.size());
		sports.remove(new Sport("��������","�౸",11,new String[5]));
		//@Override equals()  sport.ge(1).equals(new..);
		
		System.out.println("������ ����");
		System.out.println(sports.size());//3
		System.out.println(sports.get(0));//�߱� //�౸ ������
		
		//list���ο��� Ư�� ��ü�� ã�� �޼ҵ�!
		//contains() true/false
		System.out.println(sports.contains(new Sport("������","����",8,null)));
		//true
		System.out.println(sports.contains(new Sport("��������","�౸",11,new String[5])));
		//false
	
		//list�� �ߺ��� ������ ������.
		list=new ArrayList();
		for(int i=0;i<10;i++) {
			list.add("������");
		}
		for(Object n:list) {
			System.out.println(n);
		}
		
	}
	
	
	//list���� �ε����� ��������
	//������ ���� �Ѵ�!
	public void listSort() {
		//list�ڷ� �����غ���
		List nums=new ArrayList();
		for(int i=0;i<10;i++) {
			nums.add((int)(Math.random()*30)+1);
		}
//		for(Object o:nums) {
//			System.out.println(o);
//		}
		printList(nums);
		//���� ->��������
		Collections.sort(nums);
		System.out.println("===���� ��==");
		printList(nums);//�������� ����

		//��������?? ���??
		//���������� ���� ��ü�� ����->Comparator�������̽��� ���� implements Comparator<Sport>
		//��ü ���ο��� ���ļ����� ���ϴ� ���->comparable �������̽��� ���� 
		//compare()/compareTo()�޼ҵ带 ����
	
		//Comparator�� ������ Ŭ�������� ���鶧 ���,
		//Comparable�� �����ͺ����� ��ü���� �����. this�� �񱳸� ���ؼ�
		Collections.sort(nums, new NumberSort()); //quick����
		System.out.println("===�������� ������==");
		printList(nums);
		
		//���ڿ� �����ϱ�
		nums.clear();
		nums.add("������");
		nums.add("������");
		nums.add("Ȳ��ȣ");
		nums.add("����ȣ");
		nums.add("�����");
		nums.add("������");
		System.out.println("===���ڿ� �����ϱ�===");
		printList(nums);
		//�������� �����غ�����!
		Collections.sort(nums);
		System.out.println("=====���ڿ� �������� ����====");
		printList(nums);
		System.out.println("=====���ڿ� �������� ����====");
		Collections.sort(nums,new StringSort());
		printList(nums);
		
		
		//��ü�� �� �ִ� list�����ϱ�
		nums.clear();
		nums.add(new Sport("��������","�౸",11,null));
		nums.add(new Sport("��������","��",5,null));
		nums.add(new Sport("�ｺ","�ｺ",1,null));
		nums.add(new Sport("��������","�״Ͻ�",2,null));
		nums.add(new Sport("��������","����",9,null));
		System.out.println("===������====");
		printList(nums);
		Collections.sort(nums,new SportPlayerSort(true)); //��������
		System.out.println("====���� ��===");
		printList(nums);
		Collections.sort(nums,new SportPlayerSort(false)); //��������
		System.out.println("====���� ��===");
		printList(nums);
		
		//���� �͸�Ŭ������ �̿��ؼ� �����ϱ�  //��ȸ�� �ӽ�Ŭ����.  ��Ī�� ���� �ٽ� ���θ�.
		//�ѹ����Ŵ� �ٸ� Ŭ���� ����� �ͺ��� �ӽ�Ŭ������ ���� �����ϰ� �����°� ȿ����
		Collections.sort(nums, new Comparator() { //�������̽��ε� �ұ��ϰ� ��������
			@Override
			public int compare(Object o1, Object o2) {
				
				return ((Sport)o1).getPlayer()-((Sport)o2).getPlayer();
			}
		});
		printList(nums);//��������
		
		//���ٽ��� �̿��ؼ� �����ϴ� ��.
		//�ϳ��� �޼ҵ尡 ������ �̸� �ٷ� �����Ŵ. ȭ��ǥ�Լ�..
		//�ڹ� �������� Ŭ����, ��ü�� �������� �ʾƵ� �޼ҵ带 ���� �� �� �ִ�.
		//�ѹ� �ۿ� ��� ���ϴ�, �ٽ� ȣ�� �Ұ����� �͸� Ŭ������ ����� ����̶� �� �� �ִ�
		Collections.sort(nums,(o1,o2)->(((Sport)o2).getPlayer()-((Sport)o1).getPlayer()));
		
		printList(nums);
		//o1,o2�� �Ű����� //(((Sport)o2).getPlayer()-((Sport)o1).getPlayer()))�� ���ϰ�

	}
	
	
	
	public void printList(List list) {
		for(Object o:list) {
			System.out.print(o+" ");
		}
		System.out.println();
	}
	
	public void linkedList() {
		//LinkedList �� ArrayList�� ���,  �����Ŀ��� ���̰� ����
		LinkedList list=new LinkedList();
		//������
		list.add("������");
		list.add("����ȣ");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println(list.getFirst());//ù��° ��
		System.out.println(list.getLast());//������ ��
		
		list.add(1,"������"); //���������� ����Ҷ��� linkedList�� ����.
		list.remove(1);
		
		
		
		
		
	}
}
