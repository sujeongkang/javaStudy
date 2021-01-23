package com.poly.main;

import java.util.Date;
import java.util.Scanner;

import com.poly.controller.Functional;
import com.poly.model.vo.Animal;
import com.poly.model.vo.Cat;
import com.poly.model.vo.Duck;
import com.poly.model.vo.Employee;
import com.poly.model.vo.Lion;
import com.poly.model.vo.Person;
import com.poly.model.vo.Singer;

public class Main {
	public static void main(String[] args) {
		//다형성 활용하기
		//부모타입으로 설정되어 있는 변수에
		//자식타입의 객체가 대입될 수 있는 것
		Cat tom=new Cat();
		Duck donald=new Duck();
		Animal ani=new Animal();
		ani=new Cat();//다형성
		System.out.println(ani);//ani하나에 여러 객체를 담을 수 있다는 장점
		ani=new Duck();//다형성!
		System.out.println(ani);
		ani=new Lion();
		System.out.println(ani);
		//Lion객체어서 extends Animal 안할경우, 에러! 상속관계가 없기 때문에 ! 다형성이 적용이 안됨.
		//상속관계가 전제조건이 됨!
		
		//부모는 자식타입의 변수에 들어갈 수 있니?
		//tom=new Animal();//부모타입은 자식타입에게 대입될 수 없다!
		
		//다형성에 의해 자식객체가 부모타입으로 대입되면,
		//부모객체의 내용만 볼수 있게 설정됨(업캐스팅)
		Person p=new Employee("설진호",48,"포천","개발팀","연구원",100);
		//부모가 가지고 있는 데이터Person의 (name,age,address)만 볼 수 있음.
		//Employee가 Person인척 , 나머지를가림
		System.out.println(p);
		System.out.println(p.getName());
		//System.out.println(p.getDeparment());
		//undefined for the type Person 정의가 안되있고 타입이 Person
		//자식의 내용은 볼 수 없게됨
		//Employee e=(Employee)p;
		
		//부모타입으로 대입된 자식객체의 데이터에 접근을 하려면
		//강제형변환을 해야함
		System.out.println(((Employee)p).getDeparment());
		//위에서 가렸던 것을 보여주게 강제형변환
		//형변환시 연산자 우선순위 때문에 p부터 형변환
		p=new Singer("김세민",31,"남양주","너만보인단말이야~",2,"밴드");
		
		//Singer s=(Singer)p;
		
		//functional객체에서 지원하는 출력메소드 이용 객체 출력하기
		Employee e=new Employee("설진호",48,"포천","개발팀","연구원",100);
		Singer s=new Singer("김세민",31,"남양주","너만보인단말이야~",2,"밴드");
		
		new Functional().print(e);//매개변수 Employee
		new Functional().print(s);//매개변수 Singer
		new Functional().print(new Person());
		//p에는 Singer가 있음
		//사실 p는 Person인데 실제 들어가 있는 객체는 확인
		p=new Employee();
		System.out.println(p instanceof Employee);
		System.out.println(p instanceof Singer);
		
		
		//부모객체를 이용한 여러 자식객체 봐관하기
		//객체배열로 보관하기
		Person[] persons=new Person[5];
		//본인 Person을 포함한 자식객체가 모두 들어갈 수 있음
		// 부모 자료형을 만들고 여러 자료형을 보관하기 용이.
		persons[0]=new Singer("김세민",27,"경기도남양주","너만보인단말이야",4,"가요");
		persons[1]=new Employee("유다해",22,"서울","개발팀","연구원",100);
		persons[2]=new Person("설진호",32,"지역차별");
		persons[3]=new Singer("조현",28,"서울","깡",10,"힙합");
		persons[4]=new Employee("이세현",27,"서울","연구팀","연구원",20);
		//persons 에는 프로그램에서 등록되어 관리하고 있는 객체를 모두 보관
		
		
		//프로그램에 현재 등록되어있는 가수의 수는?
		//프로그램에 현재 들록되어었는 가수와 사원수?
		int singerCount=0;
		int empCount=0;
		for(int i=0;i<persons.length;i++) {
			//System.out.println(persons[i] instanceof Singer);
			if(persons[i] instanceof Singer) {//persons[i]에 singer가 있니?
				singerCount++;
			}else if(persons[i] instanceof Employee) {
				empCount++;
			}
		}
		System.out.println("가수는 "+singerCount+"명 있음");
		System.out.println("사원은 "+empCount+"명 있음");	
		
		//-----------------------------------------------------------------
		//모든 객체는 Object--> 모든클래스 부모, 최상위 객체;
		Object obj=new Person();
		System.out.println(obj);//Person객체
		obj=new Employee();
		Object[] objs=new Object[10];
		objs[0]=new Scanner(System.in);
		objs[1]=new Date();
		//모든 클래스는 Object가 가지고 있는 객체를 사용할 수 있다.
		
		//public boolean equals(Object obj) 객체의 동등비교(들어가 있는 값) 하는 메소드.객체 자신과 객체 obj가 같은 객체인지 알려준다 (같으면 true)
		//protected Object clone()객체를 복사해서 재정의해서 사용.자신의 복사본을 반환
		//pub1ic int hashCode()  객체 자신의 해시코드를 반환한다. 두 객체가 같은 객체인지 확인하는 Method
		//pub1ic String toString() //객체 자신의 정보를 문자열로 반환한다. 
		//매개변수 참조형변수명 입력하면 주소값이 나오는 게 toString(); 자동 호출
		
		System.out.println(obj.toString());//Employee객체
		//toString() //com.poly.model.vo.Employee@7f31245a//(16진수)
		//Object.toString() //참조변수를 실행하면 toString 자동으로 샐행
		
		//동적 바인딩 employee는 오버라이딩 안해도 부모 클래스 오버라이딩 하면  적용.
		//오버라이딩 해서 자식이 재정의 하면 호출시 부모것 말고 자식것 실행.
		//자식클래스에 override 가 없으면 그 부모까지 올라간다

		System.out.println(persons[0]);
		
		for(int i=0;i<persons.length;i++) {
				
			if(persons[i] instanceof Employee) {
				Employee ee=(Employee)persons[i];
				System.out.println(ee.getName()+ee.getAge()+ee.getAddress()+ee.getDeparment()+ee.getJob()+ee.getSalary());
			}else if(persons[i] instanceof Singer) {
				Singer ss=(Singer)persons[i];
				System.out.println(ss.getName()+ss.getAge()+ss.getAddress()+ss.getTitle()+ss.getYear()+ss.getGenre());
			}
			else if(persons[i] instanceof Person) {
				Person pp=persons[i];
				System.out.println(pp.getName()+pp.getAge()+pp.getAddress());
			}
		}	
		System.out.println("======동적바인딩을 이용한 출력=====");
		//동적바인딩을 이용하면 알아서 변수에 들어가 있는 객체의 오버라이딩되어있는 메소드를 호출하게 되어
		//형변환없이 변수에 들어가 있는 객체의 메소드를 이용할 수 있다. <-장점
	
		for(int i=0;i<persons.length;i++) {
			System.out.println(persons[i]);//Object.toString 메소드 호출함.
			//전제조건: 부모 객체가 가지고 있는 메소드를 오버라이딩 하였을때
			//오버라이딩한게 Object의 toString()을 이용한거기 때문에 접근제언자는 public만 !

		}
		
		
		System.out.println("========동적바인딩 재설명=======");
		Person person=new Person("이순신", 44,"거북선");
		System.out.println(person.getName());
		person=new Employee("유병승",19,"경기도 시흥시","자바학부","강사",100);
		System.out.println(person.getName());
		//동적바인딩시에는 형변환하지 않고도 Employee의 getName접근가능
		
		//부모타입의 변수에 자식 객체를 넣었을 때(다형성), 자식객체가 부모메서드를 오버라이딩 하는 게 동적 바인딩

		//toString()--> 참조변수를 System.out.println() 매개변수로 넣으면
		//참조형 변수의 내용을 출력하여하는데 주소가 들어가 있느니 있는 그대로 출력하는 게 아니고 
		///보기 쉽게 출력하기 위해 자동으로 toString()메소드를 호출하여 출력
		//모든 객체에 반영되기 위해 Object객체에 선언
		Date d=new Date();  //d 참조변수
		System.out.println(d);//참조형변수 쓰면  toString실행
		
		String str=new String("안녕");
		System.out.println(str);
		
		Animal ani1=new Animal();
		System.out.println(ani1.toString());
		//오버라이딩 전 com.poly.model.vo.Animal@7f31245a//오버라이딩 후 Animal꺼
		System.out.println(ani1);
		//오버라이딩 전 com.poly.model.vo.Animal@7f31245a//오버라이딩 후 Animal꺼
		
		Object obj2=ani1;
		System.out.println(obj2.toString());//Animal꺼
		//toStirng은 String java.lang.Object.toString()으로 나오나 실질적으로 실행되는건 Animal
		
		//-----------------------------------------------------------------
		//객체의 동등비교
		System.out.println("====객체동등비교===");
		Person jo=new Person("조현",28,"서울");
		Person jo2=new Person("조현",28,"인천");
		System.out.println(jo==jo2);//false
		//객체를 비교할때? how? equals String..
		System.out.println(jo.equals(jo2)); //jo가 this/ jo2가 obj
		//안의 데이터를 비교할때 equals를 오버라이딩 해서 객체를 비교하게 설정/
		//객체의 동등성을 비교할때는 object에 있는 equals()메소드를
		//Override하며 사용한다.
	//	System.out.println(jo.equals("하하하하"));//에러ClassCastException:
		//-----------------------------------------------------------------

		//객체복사 clone() Override하기 깊은복사.
		System.out.println("====객체복사===");
		Employee emp=new Employee("강경록",30,"수원","개발팀","팀장",5);
		System.out.println(emp);
		Employee emp2=emp.clone();
		System.out.println(emp2);
		
		
		
		
		
	}
}
