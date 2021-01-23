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
		//������ Ȱ���ϱ�
		//�θ�Ÿ������ �����Ǿ� �ִ� ������
		//�ڽ�Ÿ���� ��ü�� ���Ե� �� �ִ� ��
		Cat tom=new Cat();
		Duck donald=new Duck();
		Animal ani=new Animal();
		ani=new Cat();//������
		System.out.println(ani);//ani�ϳ��� ���� ��ü�� ���� �� �ִٴ� ����
		ani=new Duck();//������!
		System.out.println(ani);
		ani=new Lion();
		System.out.println(ani);
		//Lion��ü� extends Animal ���Ұ��, ����! ��Ӱ��谡 ���� ������ ! �������� ������ �ȵ�.
		//��Ӱ��谡 ���������� ��!
		
		//�θ�� �ڽ�Ÿ���� ������ �� �� �ִ�?
		//tom=new Animal();//�θ�Ÿ���� �ڽ�Ÿ�Կ��� ���Ե� �� ����!
		
		//�������� ���� �ڽİ�ü�� �θ�Ÿ������ ���ԵǸ�,
		//�θ�ü�� ���븸 ���� �ְ� ������(��ĳ����)
		Person p=new Employee("����ȣ",48,"��õ","������","������",100);
		//�θ� ������ �ִ� ������Person�� (name,age,address)�� �� �� ����.
		//Employee�� Person��ô , ������������
		System.out.println(p);
		System.out.println(p.getName());
		//System.out.println(p.getDeparment());
		//undefined for the type Person ���ǰ� �ȵ��ְ� Ÿ���� Person
		//�ڽ��� ������ �� �� ���Ե�
		//Employee e=(Employee)p;
		
		//�θ�Ÿ������ ���Ե� �ڽİ�ü�� �����Ϳ� ������ �Ϸ���
		//��������ȯ�� �ؾ���
		System.out.println(((Employee)p).getDeparment());
		//������ ���ȴ� ���� �����ְ� ��������ȯ
		//����ȯ�� ������ �켱���� ������ p���� ����ȯ
		p=new Singer("�輼��",31,"������","�ʸ����δܸ��̾�~",2,"���");
		
		//Singer s=(Singer)p;
		
		//functional��ü���� �����ϴ� ��¸޼ҵ� �̿� ��ü ����ϱ�
		Employee e=new Employee("����ȣ",48,"��õ","������","������",100);
		Singer s=new Singer("�輼��",31,"������","�ʸ����δܸ��̾�~",2,"���");
		
		new Functional().print(e);//�Ű����� Employee
		new Functional().print(s);//�Ű����� Singer
		new Functional().print(new Person());
		//p���� Singer�� ����
		//��� p�� Person�ε� ���� �� �ִ� ��ü�� Ȯ��
		p=new Employee();
		System.out.println(p instanceof Employee);
		System.out.println(p instanceof Singer);
		
		
		//�θ�ü�� �̿��� ���� �ڽİ�ü �����ϱ�
		//��ü�迭�� �����ϱ�
		Person[] persons=new Person[5];
		//���� Person�� ������ �ڽİ�ü�� ��� �� �� ����
		// �θ� �ڷ����� ����� ���� �ڷ����� �����ϱ� ����.
		persons[0]=new Singer("�輼��",27,"��⵵������","�ʸ����δܸ��̾�",4,"����");
		persons[1]=new Employee("������",22,"����","������","������",100);
		persons[2]=new Person("����ȣ",32,"��������");
		persons[3]=new Singer("����",28,"����","��",10,"����");
		persons[4]=new Employee("�̼���",27,"����","������","������",20);
		//persons ���� ���α׷����� ��ϵǾ� �����ϰ� �ִ� ��ü�� ��� ����
		
		
		//���α׷��� ���� ��ϵǾ��ִ� ������ ����?
		//���α׷��� ���� ��ϵǾ���� ������ �����?
		int singerCount=0;
		int empCount=0;
		for(int i=0;i<persons.length;i++) {
			//System.out.println(persons[i] instanceof Singer);
			if(persons[i] instanceof Singer) {//persons[i]�� singer�� �ִ�?
				singerCount++;
			}else if(persons[i] instanceof Employee) {
				empCount++;
			}
		}
		System.out.println("������ "+singerCount+"�� ����");
		System.out.println("����� "+empCount+"�� ����");	
		
		//-----------------------------------------------------------------
		//��� ��ü�� Object--> ���Ŭ���� �θ�, �ֻ��� ��ü;
		Object obj=new Person();
		System.out.println(obj);//Person��ü
		obj=new Employee();
		Object[] objs=new Object[10];
		objs[0]=new Scanner(System.in);
		objs[1]=new Date();
		//��� Ŭ������ Object�� ������ �ִ� ��ü�� ����� �� �ִ�.
		
		//public boolean equals(Object obj) ��ü�� �����(�� �ִ� ��) �ϴ� �޼ҵ�.��ü �ڽŰ� ��ü obj�� ���� ��ü���� �˷��ش� (������ true)
		//protected Object clone()��ü�� �����ؼ� �������ؼ� ���.�ڽ��� ���纻�� ��ȯ
		//pub1ic int hashCode()  ��ü �ڽ��� �ؽ��ڵ带 ��ȯ�Ѵ�. �� ��ü�� ���� ��ü���� Ȯ���ϴ� Method
		//pub1ic String toString() //��ü �ڽ��� ������ ���ڿ��� ��ȯ�Ѵ�. 
		//�Ű����� ������������ �Է��ϸ� �ּҰ��� ������ �� toString(); �ڵ� ȣ��
		
		System.out.println(obj.toString());//Employee��ü
		//toString() //com.poly.model.vo.Employee@7f31245a//(16����)
		//Object.toString() //���������� �����ϸ� toString �ڵ����� ����
		
		//���� ���ε� employee�� �������̵� ���ص� �θ� Ŭ���� �������̵� �ϸ�  ����.
		//�������̵� �ؼ� �ڽ��� ������ �ϸ� ȣ��� �θ�� ���� �ڽİ� ����.
		//�ڽ�Ŭ������ override �� ������ �� �θ���� �ö󰣴�

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
		System.out.println("======�������ε��� �̿��� ���=====");
		//�������ε��� �̿��ϸ� �˾Ƽ� ������ �� �ִ� ��ü�� �������̵��Ǿ��ִ� �޼ҵ带 ȣ���ϰ� �Ǿ�
		//����ȯ���� ������ �� �ִ� ��ü�� �޼ҵ带 �̿��� �� �ִ�. <-����
	
		for(int i=0;i<persons.length;i++) {
			System.out.println(persons[i]);//Object.toString �޼ҵ� ȣ����.
			//��������: �θ� ��ü�� ������ �ִ� �޼ҵ带 �������̵� �Ͽ�����
			//�������̵��Ѱ� Object�� toString()�� �̿��Ѱű� ������ ���������ڴ� public�� !

		}
		
		
		System.out.println("========�������ε� �缳��=======");
		Person person=new Person("�̼���", 44,"�źϼ�");
		System.out.println(person.getName());
		person=new Employee("������",19,"��⵵ �����","�ڹ��к�","����",100);
		System.out.println(person.getName());
		//�������ε��ÿ��� ����ȯ���� �ʰ� Employee�� getName���ٰ���
		
		//�θ�Ÿ���� ������ �ڽ� ��ü�� �־��� ��(������), �ڽİ�ü�� �θ�޼��带 �������̵� �ϴ� �� ���� ���ε�

		//toString()--> ���������� System.out.println() �Ű������� ������
		//������ ������ ������ ����Ͽ��ϴµ� �ּҰ� �� �ִ��� �ִ� �״�� ����ϴ� �� �ƴϰ� 
		///���� ���� ����ϱ� ���� �ڵ����� toString()�޼ҵ带 ȣ���Ͽ� ���
		//��� ��ü�� �ݿ��Ǳ� ���� Object��ü�� ����
		Date d=new Date();  //d ��������
		System.out.println(d);//���������� ����  toString����
		
		String str=new String("�ȳ�");
		System.out.println(str);
		
		Animal ani1=new Animal();
		System.out.println(ani1.toString());
		//�������̵� �� com.poly.model.vo.Animal@7f31245a//�������̵� �� Animal��
		System.out.println(ani1);
		//�������̵� �� com.poly.model.vo.Animal@7f31245a//�������̵� �� Animal��
		
		Object obj2=ani1;
		System.out.println(obj2.toString());//Animal��
		//toStirng�� String java.lang.Object.toString()���� ������ ���������� ����Ǵ°� Animal
		
		//-----------------------------------------------------------------
		//��ü�� �����
		System.out.println("====��ü�����===");
		Person jo=new Person("����",28,"����");
		Person jo2=new Person("����",28,"��õ");
		System.out.println(jo==jo2);//false
		//��ü�� ���Ҷ�? how? equals String..
		System.out.println(jo.equals(jo2)); //jo�� this/ jo2�� obj
		//���� �����͸� ���Ҷ� equals�� �������̵� �ؼ� ��ü�� ���ϰ� ����/
		//��ü�� ����� ���Ҷ��� object�� �ִ� equals()�޼ҵ带
		//Override�ϸ� ����Ѵ�.
	//	System.out.println(jo.equals("��������"));//����ClassCastException:
		//-----------------------------------------------------------------

		//��ü���� clone() Override�ϱ� ��������.
		System.out.println("====��ü����===");
		Employee emp=new Employee("�����",30,"����","������","����",5);
		System.out.println(emp);
		Employee emp2=emp.clone();
		System.out.println(emp2);
		
		
		
		
		
	}
}
