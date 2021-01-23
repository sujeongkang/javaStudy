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
		//list에 대해 알아보자.->인터페이스
		//특징: 배열과 유사한 자료구조를 가지고 있음.
		//->인덱스 값을 가지고 있음, 순서가 있음, 중복값을 저장 할 수 있음
		//종류:ArrayList, LinkedList, Vector
		//ArrayList
		//객체를 보관하는 데이터보관용 클래스== Object[]방식으로 보관(오브젝트 배열)
		//클래스를 생성(인스턴스화)하여 활용을 함.
		ArrayList list=new ArrayList();
		//활용하는 방식은 배열과 거의 비슷함!
		//배열은 출력, 대입  []를 이용.
		//list객체이기 때문에 메소드를 이용해서 처리함.
		//list에 값을 넣는 방법
		//add(객체)메소드를 이용
		list.add("유병승");//0번인덱스
		//add메소드에 값을 넣으면 순차적으로 0번 인덱스로부터 값이 대입됨.
		list.add("조현");//1번 인덱스
		//list는 다양한 객체를 보관할 수 있음.
		list.add(new GregorianCalendar());//2번 인덱스
		list.add(new Scanner(System.in));//3번 인덱스
		
		//list에 저장된 객체 출력하기
		//get(인덱스)메소드 이용
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		//list.get(00)=>변수명=>객체의 주소
		//Object형으로 저장을 하고 있기 때문에 형변환을 하여 사용함.
		System.out.println(((String)list.get(0)).charAt(0));
		
		//반복문을 활용해서 데이터에 접근하여 처리 할 수 있음.
		int[]a=new int[10];//a.length
		//list의 길이는? -> list.size();
		System.out.println(list.size());//4//list에 대입되어있는 객체의 수!
		//실제 들어가 있는 데이터의 개수를 의미.
//		list=new ArrayList();
//		System.out.println(list.size());//0
		//list데이터 중 GregorianCalendar객체면 년도 출력
		for(int i=0;i<list.size();i++) {
			if(list.get(i) instanceof GregorianCalendar) {
				GregorianCalendar gc=(GregorianCalendar)list.get(i);
				System.out.println(gc.get(Calendar.YEAR));
			}
		}
		
		//List인터페이스를 구현->ArrayList
		List sports=new ArrayList();
		//내가 좋아하는 스포츠 4개를 대입해보자!
		//규칙은 생략
		sports.add(new Sport("구기종목","축구",11,new String[5]));
		//sports.get(0)=new Sport("구기종목","축구",11,new String[5]);//오류
		//객체기때문에 대입 연산자 못씀.
		sports.add(new Sport("구기종목","야구",9,null));
		sports.add(new Sport("기구종목","헬스",1,null));
		sports.add(new Sport("물종목","수영",8,null));
		
		//for문을 이용해서 전체 출력하기
//		for(int i=0;i<sports.size();i++) {
//			System.out.println(sports.get(i));
//		}
		
		for(Object o:sports) {
			System.out.println(o);
		}
		//종목이 구기 종목인 스포츠만 출력하기
		for(Object o:sports) {
			if(o instanceof Sport) {
				Sport s=(Sport)o;
				if(s.getType().equals("구기종목")) {
					System.out.println(s);
				}
			}
		}
		
		for(int i=0;i<sports.size();i++) {
			if(sports.get(i) instanceof Sport) {
				Sport s=(Sport)sports.get(i);
				if(s.getType().equals("구기종목")) {
					System.out.println(s);
				}
			}
		}
		
	
		//list는 원하는 위치에 손쉽게 데이터를 넣을 수 있음
		//add(index,data); index위치에 data를 대입!
		System.out.println("====원하는 위치에 값넣기====");
		System.out.println(sports.get(2));//헬스

		sports.add(2,new Sport("구기종목","농구",5,null));
		//자동으로 2번에 넣어지고, 2번에 있던 거는 3번으로 밀림
		System.out.println(sports.get(2));//농구
		System.out.println(sports.get(3));//헬스
		
		//list의 특정위치의 값을 변경할 수도 있음.
		//set(intdex,data); 특정위치의 값을 변경
		System.out.println("===특정위치 값 변경하기===");
		System.out.println(sports.get(list.size()-2));
		sports.set(sports.size()-2,"오늘 비와요??");
		System.out.println(sports.get(sports.size()-2));
		System.out.println(sports.get(sports.size()-1));
		
		System.out.println(sports);
	
		//list에 데이터가 있는지 없는 지 확인은 어떻게?
		//sports.clear();//데이터 한번에 지우는 것!
		//if(sports.size()>0) {
		if(!sports.isEmpty()) {
			System.out.println("데이터가 있다.");
		}else {
			System.out.println("데이터가 없다.");
		}
		
		//원하는 데이터 삭제해보자.
		//remove(index);
		System.out.println(sports.size());
		sports.remove(3);
		System.out.println(sports.size());
		System.out.println(sports.get(3));//지우면 뒤에거 앞으로 땡겨짐.
		//System.out.println(sports.get(5));
		//remove(객체) 
		System.out.println("지우기 전 갯수");//4
		System.out.println(sports.size());
		sports.remove(new Sport("구기종목","축구",11,new String[5]));
		//@Override equals()  sport.ge(1).equals(new..);
		
		System.out.println("지운후 갯수");
		System.out.println(sports.size());//3
		System.out.println(sports.get(0));//야구 //축구 지워짐
		
		//list내부에서 특정 객체를 찾는 메소드!
		//contains() true/false
		System.out.println(sports.contains(new Sport("물종목","수영",8,null)));
		//true
		System.out.println(sports.contains(new Sport("구기종목","축구",11,new String[5])));
		//false
	
		//list는 중복값 저장이 가능함.
		list=new ArrayList();
		for(int i=0;i<10;i++) {
			list.add("유병승");
		}
		for(Object n:list) {
			System.out.println(n);
		}
		
	}
	
	
	//list에는 인덱스를 기준으로
	//순서가 존재 한다!
	public void listSort() {
		//list자료 정렬해보기
		List nums=new ArrayList();
		for(int i=0;i<10;i++) {
			nums.add((int)(Math.random()*30)+1);
		}
//		for(Object o:nums) {
//			System.out.println(o);
//		}
		printList(nums);
		//정렬 ->오름차순
		Collections.sort(nums);
		System.out.println("===정렬 후==");
		printList(nums);//오름차순 정렬

		//내림차순?? 어떻게??
		//내림차순을 위한 객체를 생성->Comparator인터페이스를 구현 implements Comparator<Sport>
		//객체 내부에서 정렬순서를 정하는 방법->comparable 인터페이스를 구현 
		//compare()/compareTo()메소드를 구현
	
		//Comparator는 별도의 클래스에서 만들때 사용,
		//Comparable은 데이터보관용 객체에서 사용함. this값 비교를 위해서
		Collections.sort(nums, new NumberSort()); //quick정렬
		System.out.println("===내림차순 정렬후==");
		printList(nums);
		
		//문자열 정렬하기
		nums.clear();
		nums.add("남지선");
		nums.add("강수정");
		nums.add("황진호");
		nums.add("설진호");
		nums.add("김다희");
		nums.add("유병승");
		System.out.println("===문자열 정렬하기===");
		printList(nums);
		//오름차순 정렬해보세요!
		Collections.sort(nums);
		System.out.println("=====문자열 오름차순 정렬====");
		printList(nums);
		System.out.println("=====문자열 내림차순 정렬====");
		Collections.sort(nums,new StringSort());
		printList(nums);
		
		
		//객체가 들어가 있는 list정렬하기
		nums.clear();
		nums.add(new Sport("구기종목","축구",11,null));
		nums.add(new Sport("구기종목","농구",5,null));
		nums.add(new Sport("헬스","헬스",1,null));
		nums.add(new Sport("구기종목","테니스",2,null));
		nums.add(new Sport("구기종목","골프",9,null));
		System.out.println("===정렬전====");
		printList(nums);
		Collections.sort(nums,new SportPlayerSort(true)); //오름차순
		System.out.println("====정렬 후===");
		printList(nums);
		Collections.sort(nums,new SportPlayerSort(false)); //내림차순
		System.out.println("====정렬 후===");
		printList(nums);
		
		//정렬 익명클래스를 이용해서 정렬하기  //일회용 임시클래스.  명칭이 없어 다시 못부름.
		//한번쓸거는 다른 클래스 만드는 것보다 임시클래스로 만들어서 실행하고 끝내는게 효율적
		Collections.sort(nums, new Comparator() { //인터페이스인데 불구하고 생성가능
			@Override
			public int compare(Object o1, Object o2) {
				
				return ((Sport)o1).getPlayer()-((Sport)o2).getPlayer();
			}
		});
		printList(nums);//내림차순
		
		//람다식을 이용해서 정렬하는 것.
		//하나의 메소드가 있을때 이를 바로 실행시킴. 화살표함수..
		//자바 람다형은 클래스, 객체를 생성하지 않아도 메소드를 생성 할 수 있다.
		//한번 밖에 사용 못하는, 다시 호출 불가능한 익명 클래스와 비슷한 양락이라 볼 수 있다
		Collections.sort(nums,(o1,o2)->(((Sport)o2).getPlayer()-((Sport)o1).getPlayer()));
		
		printList(nums);
		//o1,o2는 매개변수 //(((Sport)o2).getPlayer()-((Sport)o1).getPlayer()))는 리턴값

	}
	
	
	
	public void printList(List list) {
		for(Object o:list) {
			System.out.print(o+" ");
		}
		System.out.println();
	}
	
	public void linkedList() {
		//LinkedList 는 ArrayList와 비슷,  저장방식에만 차이가 있음
		LinkedList list=new LinkedList();
		//값대입
		list.add("유병승");
		list.add("설진호");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println(list.getFirst());//첫번째 값
		System.out.println(list.getLast());//마지막 값
		
		list.add(1,"박현우"); //수정삭제가 빈번할때는 linkedList가 빠름.
		list.remove(1);
		
		
		
		
		
	}
}
