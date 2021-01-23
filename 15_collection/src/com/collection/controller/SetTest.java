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
		//Set에 대해 알아보자
		//특징: 순서가 없음, 데이터를 구분할 수 있는 구분자가 없다. 중복값저장 불가능
		//종류:HashSet,TreeSet
		//객체 방식으로 ... 메소드를 호출해서 저장,호출,
		HashSet set=new HashSet();
		//데이터 대입
		//add(값) 메소드를 사용함.
		set.add("설진호");//Object로 들어가고 나오고.
		set.add("조현");
		set.add("강경록");
		set.add("이세현");
		set.add("황진호");
		set.add("남지선");
		//set에 저장된 데이터는 데이터를 구분할 수 있는 구분자가 없기 때문에
		//모든 자료를 불러올 수있는 객체(Iterator)를 이용해서 출력함.
		Iterator it=set.iterator(); //set이 가지고 있는 모든 객체를 무작위로 트레이에 넘겨줌.
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println(o);  //두번 출력하고 싶으면 이와 같이.. 아래는 에러
//			//System.out.println(it.next()); //처음 랜덤. 그 이후에는 어느정도 고정
//			//System.out.println(it.next()); //오류 //더 가져갈 객체 없는데...NoSuchElementException
//			//짝수일때는 되기는 하나, 쓰지 말것. 하나 쓸때마다 다음으로 날아감.
		}
		
		
		//set저장된 이세현을 찾으세요
		//Iterator it2=set.iterator();
		it=set.iterator();
		while(it.hasNext()) { 
			Object o=it.next();  //next 두번 쓰면 안됨..두번 넘어감 
			if(o.equals("이세현")) { //이세현 
				System.out.println(o);
			}
		}
		
		
		
		
		System.out.println("====forEach이용====");
		//set에 있는 전제 객체를 조회할때는
		//forEach문 사용가능
		for(Object o:set) {
			System.out.println(o);
		
		}
		//set 중복갑 저장이 될까요??
		set.add("조현");
		set.add("조현");
		set.add("조현");
		set.add("조현");
		set.add("조현");
		set.add("조현");
		set.add("조현");
		set.add("조현");
		set.add("조현");
		set.add("조현");
		set.add("설진호");
		set.add("설진호");
		set.add("설진호");
		set.add("설진호");
		set.add("설진호");
		set.add("설진호");
		
		//전체출력하기
		Iterator it3=set.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next()); //중복값 저장 안됨.
		}
		

		//Lotto중복값
		HashSet lotto=new HashSet();
//		for(int i=0;i<7;i++) {
//			lotto.add((int)(Math.random()*44)+1); //랜덤 7가지 숫자중에 중복값 제외하고 출력
//		}
		while(true) {
			lotto.add((int)(Math.random()*44)+1);
			if(lotto.size()==7) {//사이즈 7개 채울때까지 반복
				break;  //중복값안나오고 7가지 숫자가나옴
			}
		}
		for(Object o:lotto) {
			System.out.print(o+" ");
		}
		System.out.println();
		
		//set에 있는 데이터를 확인 할 수 있음.
		//size()메소드를 통해서 가능함.
		lotto.clear();
		if(lotto.size()==0) {
			System.out.println("데이터가 없습니다.");
		}
		
		//set에 내가 만든 객체를 넣어보자.
		//Member클래스를 만들고, id,pw,name,age
		//id가 같으면 들어가지 않게. 넣어보자.
		//1. admin,1234,관리자,19
		//2. user01,1111,유저1,20
		//3 user02,2222,유저2,21
		//4. user03,3333,유저3,22
		//5.admin,1234,관리자,19
		
		Set members=new HashSet();
		
		members.add(new Member("admin","1234","관리자",19));
		members.add(new Member("user01","1111","유저1",20));
		members.add(new Member("user02","2222","유저2",21));
		members.add(new Member("user03","3333","유저3",22));
		members.add(new Member("admin","1234","관리자",19));
		
		
		for(Object o:members) { //오브젝트 겍체지만 실제 들어가 있는 메소드 실행
			System.out.println(o);
		}
		
		//set
		//삭제가 가능
		//전체삭제, 일부삭제 둘다 가능
		//remove(객체);
		//일부삭제방법
		members.remove(new Member("user01","5555","유저1",19)); //객체에서 동일성 비교 한것만 일치하면 지워짐.//Member클래스에 이퀄스 해스코드 오버라이딩
		System.out.println("====삭제후===");
//		for(Object o:members) {
//			System.out.println(o);
//		}
		System.out.println("====iterator는 재활용이 불가능====");
		//트레이가 비어 있을수 있어, iterator를 다시 활용하려면 재할당해줘야함.
		it=members.iterator();
		System.out.println(it.next());
		
		
		//Set, List는 Collection 자식
		//set<-->List 서로 호환이 가능함.
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
		System.out.println(list);  //abstractCollection에 toString 처리가 되었있음.
		
		
	}
	
	
	
}
