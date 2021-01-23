package com.collection.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.collection.model.vo.Member;

public class MapTest {
	public void mapTest() {
		//Map:객체데이터를 보관하는 클래스
		//저장방식:   key:value  쌍!  형식으로 되어있음
		//key의 자료형:Object; -> String, Integer로 많이 사용!
		//value의 자료형: Object;->모든 객체 사용!
		//종류: HashMap, TreeMap, LinkedHashMap;
		
		//클래스이기 때문에 메소드를 이용해서 데이터를 처리함..
		
		//생성
		HashMap map=new HashMap();
		//Map자료형에 값을 넣는 방법
		//put(key,value);
		map.put(1,"유병승");
		map.put(2,"김세민");
		map.put(3,"윤테레사");
		
		//key,value에는 모든 객체가 들어갈 수 있음
		map.put("펭수", "남지선");
		map.put("admin",new Member("admin","1234","관리자",19));
		map.put(new Member("ueser01","1111","유저1",20),1);
		
		//map에 들어가 있는 값을 출력하기
		//get(key);  ->value값을 가져올 수 있음.
		System.out.println(map.get(1));//유병승
		System.out.println(map.get("admin"));
		System.out.println(map.get(new Member("ueser01","1111","유저1",20)));
		
		//web에서 프론트단에서 보내는 값을 key:value형식으로 가져오게됨.
		//request.getParameter("userId"); key:value  userId에 있는 값을 가져오게됨
		
		//map ->list특성, set의 특성을 둘다 가지고 있음
		//key는 중복이 안됨
		//key를 Set방식으로 저장함.
		//map에 보관하는 key 전체를 출력하려면 set으로 받아와서 출력해야함
		System.out.println("===key값 출력===");
		Set keys=map.keySet();
		
		Iterator it=keys.iterator();
		while(it.hasNext()) {//트레이에 값이 있는동안 반복
			Object key=it.next();
			System.out.println(key+" : "+map.get(key));
		}
		
		
		System.out.println("====Map.Entry객체로 출력===");
		//전체 출력방법2
		//map.Entry객체를 이용해서 한번에 key,value 값을 출력함
		
		Set mapEntry=map.entrySet(); //entrySet()  전체셋
		Iterator it2=mapEntry.iterator();
		while(it2.hasNext()) {
			Map.Entry entry=(Map.Entry)it2.next();
			//Map.Entry객체에는 key값과 value값을 동시에 보관하고 있음
			//key값: Map.Entry.getKey();
			//value값 : Map.Entry.getValue();
			//System.out.println(it2.next());
			System.out.println("key: "+entry.getKey());
			System.out.println("value:"+entry.getValue());
		}
		
		
	
		System.out.println("======for each문으로 처리하기=====");
		//키 값 가져오기
		for(Object o:map.keySet()) {
			System.out.println(o);
			System.out.println(map.get(o));
		}
		for(Object a: map.entrySet()) {
			Map.Entry entry=(Map.Entry)a;
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		
		//map 객체 저장하고 활용하기
		
		HashMap members=new HashMap();
		//member객체 3개만 넣으세요.
		members.put(1,new Member("prince","4444","유병승",19));
		members.put(2,new Member("seolseol","3125","설진호",19));
		members.put(3,new Member("rockrock","록록","강경록",30));
		
		
		//저장된 멤버의 id만 출력하기
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
		
		//map은 key값이 중복이 안 된다.
		System.out.println(members.get(1));
		members.put(1,"이거는 어떻게 되니??");
		System.out.println(members.get(1)); //key값을 유지 한 상태에서 덮어쓰기
		
		//value값은 중복이 된다.
		members.put(4,new Member("rockrock","록록","강경록",30));
		members.put(5,new Member("rockrock","록록","강경록",30));
		members.put(6,new Member("rockrock","록록","강경록",30));
		
		System.out.println(members);
		
		
		//map 객체갯수확인 가능
		System.out.println(members.size());
		
		//key값이 있는지. value가 있는지 확인하는 것
		//containsKey()/containsvalue();
		System.out.println(members.containsKey(1));
		System.out.println(members.containsKey(5));
		System.out.println(members.containsValue(new Member("rockrock","록록","강경록",30)));
		
		
		//map에 있는 데이터 지우기
		members.remove(5);
		System.out.println(members);
		members.remove(6,new Member("rockrock","록록","강경록",30));
		System.out.println(members);
		members.clear();
	}
}
