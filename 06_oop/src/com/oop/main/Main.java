package com.oop.main;

import com.oop.model.vo.AccessTest;
import com.oop.model.vo.FieldAccessTest;
import com.oop.model.vo.FinalTest;
import com.oop.model.vo.InitialTest;
//import com.oop.model.vo.DefaultTest; 
//not visible ->��������� ������. ���� �����ڿ� ���� ������ ���щ��� �� ������ ����
//import com.oop.model.vo.ABCTest;
//cannot be resolved ->�ش� ������ ���� ���
import com.oop.model.vo.StaticVariableTest;

public class Main {
	
	public static void main(String[] args) {
		//��ü ���ٰ��� ����Ȯ��-> ���������Ѱ� Ȯ���غ���
		
		new AccessTest(); //��ü ���� ����
		//new DefaultTest();//���������ڰ� defaultŬ���� ����
		//new com.oop.model.vo.AccessTest();
		//import���� ���ҽ� �ѹ� ���ÿ��� �̷��� ���� ����
		//������ ���ÿ��� import�� �� ����.
		
		//�ʵ� ���� �׽�Ʈ
		FieldAccessTest fct=new FieldAccessTest(); //new Ŭ������ -->����  
		FieldAccessTest fct1=new FieldAccessTest(); 
		FieldAccessTest fct3=new FieldAccessTest(); 
		//<--FieldAccessTestŬ������ ��üȭ ->heap������ ��������� Ȯ�� ->Ȯ���� ������ �ּҸ� ��ȯ
		//ctrl+shift+o import �ڵ��ϼ�
		//  Ŭ�������� �ϳ��� �ڷ����� �ɼ� ����, FieldAccessTest fct�� ��ü�� �����ϴ� ����
		
		//�ʵ� ���� ������ 4����
		//fct.publicInt=100; //public�� �ٸ� ��Ű������ ���������� �����ϴ�.
		//fct.protectedChar='��'; //�ڼհ�ü, ���� ��Ű��, ����Ŭ����
		//fct.defaultString="�̰� ����??";//���� ��Ű��, ���� Ŭ����
		//fct.privateDouble=180.5;//���� Ŭ���������� ���� ����.
		
		//ĸ��ȭ �ϴ� ����
		//fct.age=19; //������ ������ �ɱ�?
		//System.out.println(fct.age);
		//fct.age=-19;
		//System.out.println(fct.age);
		
		//fct.setAge(); //�޼ҵ� ȣ��=>�޼ҵ� ����
		//fct.setAge(19);//fct�� �ִ� age������ 19 ����
		//System.out.println(fct.getAge());//fct�� �ִ� age���� �� ��������
		//fct.age�� fct.getAge()�� ���� �ǹ�
		fct.setAge(-19);
		System.out.println(fct.getAge());//???? -19�� ����� default �� 0
		//default�� ������ �迭, ��ü������
		
		//static����(Ŭ���� ����)�� 
		//System.out.println(StaticVariableTest.name);
		//StaticVariableTest.name="������";
		//System.out.println(StaticVariableTest.name);//��𿡼���  �����ؼ� ��밡��
		
		System.out.println(StaticVariableTest.getName()); //�޼ҵ� ���鶧�� ȣ���Ҷ���()
		StaticVariableTest.setName("������");
		System.out.println(StaticVariableTest.getName());
		
		
		StaticVariableTest svt=new StaticVariableTest(); 
		StaticVariableTest svt2=new StaticVariableTest(); 
		StaticVariableTest svt3=new StaticVariableTest(); 
		svt.setName("static");
		System.out.println(svt.getName());
		System.out.println(svt2.getName());
		svt2.setName("svt2����");
		System.out.println(svt.getName());
		System.out.println(svt2.getName());
		System.out.println(StaticVariableTest.getName());
		
		svt.setSu(100); //new ���� ��������� �����ٲ�.
		System.out.println(svt.getSu()); //100
		System.out.println(svt2.getSu());//0
		
		//��� �̿��ϱ�
		FinalTest ft=new FinalTest();
		System.out.println(ft.ID);
	//	ft.ID=200; // ���� cannot be assigned����� ���̻� ���� ���� �� ����.
		
		System.out.println("=====�ʱ�ȭ ���====");
		//�ʱ�ȭ��� �����ϱ�
		InitialTest it=new InitialTest();
		System.out.println("it id: "+it.getId());
		System.out.println(it.getName());
		System.out.println(it.getSize());
		
		InitialTest it2=new InitialTest();
		System.out.println(("it2 id: "+it.getId()));
		System.out.println(it2.getName());
		System.out.println(it2.getSize());
		
		for(int i=0;i<10;i++) {
			System.out.println("for�� id: "+new InitialTest().getId());
		}
		
		
		
		
	}
}
