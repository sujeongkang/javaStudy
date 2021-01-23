package com.collection.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.collection.model.vo.Member;

public class SetTest {
	
	public void setTest() {
		//Set�� ���� �˾ƺ���
		//Ư¡: ������ ����, �����͸� ������ �� �ִ� �����ڰ� ����. �ߺ������� �Ұ���
		//����:HashSet,TreeSet
		//��ü ������� ... �޼ҵ带 ȣ���ؼ� ����,ȣ��,
		HashSet set=new HashSet();
		//������ ����
		//add(��) �޼ҵ带 �����.
		set.add("����ȣ");//Object�� ���� ������.
		set.add("����");
		set.add("�����");
		set.add("�̼���");
		set.add("Ȳ��ȣ");
		set.add("������");
		//set�� ����� �����ʹ� �����͸� ������ �� �ִ� �����ڰ� ���� ������
		//��� �ڷḦ �ҷ��� ���ִ� ��ü(Iterator)�� �̿��ؼ� �����.
		Iterator it=set.iterator(); //set�� ������ �ִ� ��� ��ü�� �������� Ʈ���̿� �Ѱ���.
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println(o);  //�ι� ����ϰ� ������ �̿� ����.. �Ʒ��� ����
//			//System.out.println(it.next()); //ó�� ����. �� ���Ŀ��� ������� ����
//			//System.out.println(it.next()); //���� //�� ������ ��ü ���µ�...NoSuchElementException
//			//¦���϶��� �Ǳ�� �ϳ�, ���� ����. �ϳ� �������� �������� ���ư�.
		}
		
		
		//set����� �̼����� ã������
		//Iterator it2=set.iterator();
		it=set.iterator();
		while(it.hasNext()) { 
			Object o=it.next();  //next �ι� ���� �ȵ�..�ι� �Ѿ 
			if(o.equals("�̼���")) { //�̼��� 
				System.out.println(o);
			}
		}
		
		
		
		
		System.out.println("====forEach�̿�====");
		//set�� �ִ� ���� ��ü�� ��ȸ�Ҷ���
		//forEach�� ��밡��
		for(Object o:set) {
			System.out.println(o);
		
		}
		//set �ߺ��� ������ �ɱ��??
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����ȣ");
		set.add("����ȣ");
		set.add("����ȣ");
		set.add("����ȣ");
		set.add("����ȣ");
		set.add("����ȣ");
		
		//��ü����ϱ�
		Iterator it3=set.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next()); //�ߺ��� ���� �ȵ�.
		}
		

		//Lotto�ߺ���
		HashSet lotto=new HashSet();
//		for(int i=0;i<7;i++) {
//			lotto.add((int)(Math.random()*44)+1); //���� 7���� �����߿� �ߺ��� �����ϰ� ���
//		}
		while(true) {
			lotto.add((int)(Math.random()*44)+1);
			if(lotto.size()==7) {//������ 7�� ä�ﶧ���� �ݺ�
				break;  //�ߺ����ȳ����� 7���� ���ڰ�����
			}
		}
		for(Object o:lotto) {
			System.out.print(o+" ");
		}
		System.out.println();
		
		//set�� �ִ� �����͸� Ȯ�� �� �� ����.
		//size()�޼ҵ带 ���ؼ� ������.
		lotto.clear();
		if(lotto.size()==0) {
			System.out.println("�����Ͱ� �����ϴ�.");
		}
		
		//set�� ���� ���� ��ü�� �־��.
		//MemberŬ������ �����, id,pw,name,age
		//id�� ������ ���� �ʰ�. �־��.
		//1. admin,1234,������,19
		//2. user01,1111,����1,20
		//3 user02,2222,����2,21
		//4. user03,3333,����3,22
		//5.admin,1234,������,19
		
		Set members=new HashSet();
		
		members.add(new Member("admin","1234","������",19));
		members.add(new Member("user01","1111","����1",20));
		members.add(new Member("user02","2222","����2",21));
		members.add(new Member("user03","3333","����3",22));
		members.add(new Member("admin","1234","������",19));
		
		
		for(Object o:members) { //������Ʈ ��ü���� ���� �� �ִ� �޼ҵ� ����
			System.out.println(o);
		}
		
		//set
		//������ ����
		//��ü����, �Ϻλ��� �Ѵ� ����
		//remove(��ü);
		//�Ϻλ������
		members.remove(new Member("user01","5555","����1",19)); //��ü���� ���ϼ� �� �Ѱ͸� ��ġ�ϸ� ������.//MemberŬ������ ������ �ؽ��ڵ� �������̵�
		System.out.println("====������===");
//		for(Object o:members) {
//			System.out.println(o);
//		}
		System.out.println("====iterator�� ��Ȱ���� �Ұ���====");
		//Ʈ���̰� ��� ������ �־�, iterator�� �ٽ� Ȱ���Ϸ��� ���Ҵ��������.
		it=members.iterator();
		System.out.println(it.next());
		
		
		//Set, List�� Collection �ڽ�
		//set<-->List ���� ȣȯ�� ������.
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		System.out.println(list);
//		HashSet temp=new HashSet(list);
//		list=new ArrayList(temp);
		list=new ArrayList(new HashSet(list));
		System.out.println(list);  //abstractCollection�� toString ó���� �Ǿ�����.
		
		
	}
	
	
	
}
