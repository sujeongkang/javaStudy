package com.oop.main;

import com.oop.method.Functional;
import com.oop.model.vo.Member1;
import com.oop.model.vo.Student;
//2020-06-23
public class MethodMain {
	public static void main(String[] args) {
		
		Functional fun=new Functional();
		
//		//��ȯ���̾���, �Ű����� ���� �޼ҵ� ȣ��
//		//fun.calculator();
		
//		//��ȯ������, �Ű����� �ִ� �޼ҵ� ȣ��
//		int su=10;
//		int su2=20;
//		fun.calculator2(10,20,new String[] {"*","/"}); 
		
//		//��ȯ���� �ְ�, �Ű����� ���� �޼ҵ� ȣ��
//		//fun.calculator3();//��ȯ���� ������ ����. ��ݾȵ�.
//		//System.out.println(fun.calculator3());
//		int result=fun.calculator3();
//		System.out.println(result*100);
//		 
//		//10;
		
//		//��ȯ���� �ְ� �Ű����� �ִ� �޼ҵ� ȣ��
//		result=fun.calculator4(20,20);
//		System.out.println(result);
//
//		//---------------------------------------------------------------	
//		//�ǽ����� 3��//
		//1��° ���� ȣ��//
//		String result1=fun.munjang("�ȳ�","�ϼ���");
//		System.out.println(result1);
//		//2��° ���� ȣ��//
//		int res=fun.sum(2, 10);
//		System.out.println(res==0?"":res);
		//(res==0?"":res)��������Ҷ� �ؿ� 0�� ������ �� ���ִ°�.
		//fun.printer �޼ҵ忡�� �������! �̶�� ���� �� ��
		//result�� ���� �ƹ��͵� �� ���鼭 result 0�� �����µ� res�� 0�� �� ""�� �ʱ�ȭ
//		//3��° ���� ȣ��//
//		Scanner sc=new Scanner(System.in);
//		System.out.println("�����Է�: ");
//		System.out.println(fun.checkChar(sc.next().charAt(0)));
//	
//		//--------------------------------------------------			
//		//��ü, �迭 �������ڷ��� �Ű�����, �������� �ۼ��غ���
//		//��ü, �迭���� �������ڷ����� ������ �ִ� �ּҸ������ϱ� ������
//		//�迭�� ���� ����� ���� �������� ���Ǿ� �������� �����Ǵ� ����� �����´�.
//		int[] nums= {1,2,3,4};
//		System.out.println("=======������========");
//		for(int a: nums){
//			System.out.print(a+" ");
//		}
//		System.out.println();//����ǥ��
//		
//		fun.updateArray(nums);//�迭�� �ִ� ���� �����ϴ� ����
//		
//		System.out.println("=======������========");
//		for(int a: nums){
//			System.out.println(a+" ");
//		}
//		System.out.println();//����ǥ��
//		
//		//�⺻�ڷ����� �Ű������� �ް� �����ϱ�																																																																																																																																																																								
//		System.out.println("���� ��: "+su);
//		//fun.basicUpdate(su);
//		su=fun.basicUpdate();
//		System.out.println("���� ��: " +su);
//		
//		
//		//---------------------------------------------------------------	
		
		//student ��ü�� ����� �̸�, �г�, ��, ��ȣ, Ű, ������ �⺻���� �ڽ��� ������ �����ϰ� 
		//studentUpdate�żҵ带 ����� �Է¹��� ������ �����ѵ� ����� ��.
//		Student s=new Student("ȫ�浿",3,1,10,180.5,65.5);
		
		//ù��° �л� ���� �����ϴ� ���� : ��ȯx �Ű� o 
//		fun.studentUpate(s);
//		System.out.println(s.getName()+s.getGrade()+s.getCl()+s.getNum()+s.getHeight()+s.getWeight());
		
	
		//�ι�° �л����� �����ϴ� ���� : ��ȯo �Ű� x
//		s=fun.studentUpdate();
//		System.out.println(s.getName()+s.getGrade()+s.getCl()+s.getNum()+s.getHeight()+s.getWeight());
//		//---------------------------------------------------------------	
		//cilent���� �̸�.����,��ȭ��ȣ�����޹ް� �׳����� String�� ��ȯ�Ῡ ����غ���
		System.out.println(fun.strReturn());
		
		//insertMember�żҵ带 ����ÿ�
		//1. Member��ü����  id, pw, name, email, address
		//2. client����  id, pw, name, email,addr�� ���� �޾� Member��ü�� �����Ͽ� ����Ұ�, ��ȯ����.
		Member1 m=new Member1();
		fun.insertMember(m);
		System.out.println(m.getId()+" "+m.getPw()+" "+m.getName()+" "+m.getEmail()+" "+m.getAddress());
		
		
		
		
		
	}
	
}
