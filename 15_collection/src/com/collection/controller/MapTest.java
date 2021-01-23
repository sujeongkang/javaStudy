package com.collection.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.collection.model.vo.Member;

public class MapTest {
	public void mapTest() {
		//Map:��ü�����͸� �����ϴ� Ŭ����
		//������:   key:value  ��!  �������� �Ǿ�����
		//key�� �ڷ���:Object; -> String, Integer�� ���� ���!
		//value�� �ڷ���: Object;->��� ��ü ���!
		//����: HashMap, TreeMap, LinkedHashMap;
		
		//Ŭ�����̱� ������ �޼ҵ带 �̿��ؼ� �����͸� ó����..
		
		//����
		HashMap map=new HashMap();
		//Map�ڷ����� ���� �ִ� ���
		//put(key,value);
		map.put(1,"������");
		map.put(2,"�輼��");
		map.put(3,"���׷���");
		
		//key,value���� ��� ��ü�� �� �� ����
		map.put("���", "������");
		map.put("admin",new Member("admin","1234","������",19));
		map.put(new Member("ueser01","1111","����1",20),1);
		
		//map�� �� �ִ� ���� ����ϱ�
		//get(key);  ->value���� ������ �� ����.
		System.out.println(map.get(1));//������
		System.out.println(map.get("admin"));
		System.out.println(map.get(new Member("ueser01","1111","����1",20)));
		
		//web���� ����Ʈ�ܿ��� ������ ���� key:value�������� �������Ե�.
		//request.getParameter("userId"); key:value  userId�� �ִ� ���� �������Ե�
		
		//map ->listƯ��, set�� Ư���� �Ѵ� ������ ����
		//key�� �ߺ��� �ȵ�
		//key�� Set������� ������.
		//map�� �����ϴ� key ��ü�� ����Ϸ��� set���� �޾ƿͼ� ����ؾ���
		System.out.println("===key�� ���===");
		Set keys=map.keySet();
		
		Iterator it=keys.iterator();
		while(it.hasNext()) {//Ʈ���̿� ���� �ִµ��� �ݺ�
			Object key=it.next();
			System.out.println(key+" : "+map.get(key));
		}
		
		
		System.out.println("====Map.Entry��ü�� ���===");
		//��ü ��¹��2
		//map.Entry��ü�� �̿��ؼ� �ѹ��� key,value ���� �����
		
		Set mapEntry=map.entrySet(); //entrySet()  ��ü��
		Iterator it2=mapEntry.iterator();
		while(it2.hasNext()) {
			Map.Entry entry=(Map.Entry)it2.next();
			//Map.Entry��ü���� key���� value���� ���ÿ� �����ϰ� ����
			//key��: Map.Entry.getKey();
			//value�� : Map.Entry.getValue();
			//System.out.println(it2.next());
			System.out.println("key: "+entry.getKey());
			System.out.println("value:"+entry.getValue());
		}
		
		
	
		System.out.println("======for each������ ó���ϱ�=====");
		//Ű �� ��������
		for(Object o:map.keySet()) {
			System.out.println(o);
			System.out.println(map.get(o));
		}
		for(Object a: map.entrySet()) {
			Map.Entry entry=(Map.Entry)a;
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		
		//map ��ü �����ϰ� Ȱ���ϱ�
		
		HashMap members=new HashMap();
		//member��ü 3���� ��������.
		members.put(1,new Member("prince","4444","������",19));
		members.put(2,new Member("seolseol","3125","����ȣ",19));
		members.put(3,new Member("rockrock","�Ϸ�","�����",30));
		
		
		//����� ����� id�� ����ϱ�
		Set memkey=members.keySet();
		Iterator it3=memkey.iterator();
		while(it3.hasNext()) {
			Object o=members.get(it3.next());//value
			System.out.println(((Member)o).getId());
		}
		
		
		Set memEntry=members.entrySet();
		it3=memEntry.iterator();
		while(it3.hasNext()) {
			Map.Entry en=(Map.Entry)it3.next();
			Member m=(Member)en.getValue();
			System.out.println(m.getId());
		}
		
		for(Object o: members.keySet()) {
//			Member m=(Member)members.get(o); 
//			System.out.println(m.getId());
			System.out.println(((Member)members.get(o)).getId());
		}
		
		//map�� key���� �ߺ��� �� �ȴ�.
		System.out.println(members.get(1));
		members.put(1,"�̰Ŵ� ��� �Ǵ�??");
		System.out.println(members.get(1)); //key���� ���� �� ���¿��� �����
		
		//value���� �ߺ��� �ȴ�.
		members.put(4,new Member("rockrock","�Ϸ�","�����",30));
		members.put(5,new Member("rockrock","�Ϸ�","�����",30));
		members.put(6,new Member("rockrock","�Ϸ�","�����",30));
		
		System.out.println(members);
		
		
		//map ��ü����Ȯ�� ����
		System.out.println(members.size());
		
		//key���� �ִ���. value�� �ִ��� Ȯ���ϴ� ��
		//containsKey()/containsvalue();
		System.out.println(members.containsKey(1));
		System.out.println(members.containsKey(5));
		System.out.println(members.containsValue(new Member("rockrock","�Ϸ�","�����",30)));
		
		
		//map�� �ִ� ������ �����
		members.remove(5);
		System.out.println(members);
		members.remove(6,new Member("rockrock","�Ϸ�","�����",30));
		System.out.println(members);
		members.clear();
	}
}
