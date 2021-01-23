package com.api.controller;

import java.util.StringTokenizer;

public class StringTest {
	public static void main(String[] args) {
		
		
		//String ��ü �̿��غ���...
		//String�� String�� �ִ� ���� ����, ����, ������ �Ұ�����.
		String name="������";
		//hashCode()-->Heap������ �ּҰ��� �ǹ���. �������ġ
		System.out.println(name+" : "+name.hashCode());
		
		name+="õ��";
		System.out.println(name+ ":"+name.hashCode());
		
		//���ڰ����� ���� �Ұ�  -->�Һ�
		
		//String ��ü���� �����ϰ� ����ϴ� �޼ҵ�
		//���ڿ��� �ִ� ����ã��: contains();
		String test="�����ٶ󸶹ٻ����ī";
//		for(int i=0;i<test.length;i++) {
//			if(test.charAt(i).equals('��')) {
//				
//			}
//		}
		System.out.println(test.contains("��"));//t
		System.out.println(test.contains("��"));//f
		test="����ȣ ȭ����! ���� ������ �ϼ��� ��Ʈ���̶� �׸� �ο��!";
		System.out.println(test.contains("����"));//t
		System.out.println(test.contains("Ȳ��ȣ"));//f
		
		
		//Ư�������� ��ġ�� ã���ִ� �޼ҵ�: indexOf(����);
		//ã�� ������ �ε����� ��ȯ����. ��ã���� -1�� ��ȯ
		System.out.println(test.indexOf("��"));//0
		System.out.println(test.indexOf("��Ʈ��"));//20 ��Ʈ�� �ܾ��� ù �����ε���
		System.out.println(test.indexOf("Ȳ��ȣ"));//-1 ����
		System.out.println(test.indexOf(" "));//3 ���ϸ������� ���� ��ġ �ε��� .ó���� ã�� ���� �ε�����.
		
		char ch='a';
		int ich=ch;
		
		//�ߺ����� ������ �ι�± �� ã��
		//test.indexOf(ch, fromIndex)
		System.out.println(test.indexOf(" ",test.indexOf(" ")+1));//8//ù��° ���������� ���� ������ ã�ƶ�
		test="ttt.file.txt"; //Ȯ���� ã��
		//lastIndexOf() ������ �ڿ������� ã��
		System.out.println(test.lastIndexOf("."));//8
		
		//���ڿ��� �������ִ� �޼ҵ�: replace();
		System.out.println(test.replace("txt","hwp"));//�������� ������� ����.//ttt.file.hwp
		
		String test2=test.replace("txt","jpg");// ������ ��ƾ߸� ����.
		System.out.println(test2);
		
		System.out.println(test);//ttt.file.txt ������ �״��..
		
		
		//���ڿ� ������ �������ִ� �޼ҵ�:trim();
		test="          ��        ��            ";
		System.out.println(test); //�����ְ� ��µ�
		test2="����";
		
		System.out.println(test.trim());//�յ� ������ �����. ��� ������ ������� ����.�ǵ��� �ִٰ� �ľ�
		System.out.println(test.trim().replace(" ",""));//��� ���� ���ﶧ ������ ã���� ������
		System.out.println(test.equals(test2)); //����            ��  ������ �ٸ��� ��.//false
		System.out.println(test.trim().equals(test2)); //true
		System.out.println(test);//�������� �ȹٲ�.
//		if(id.equals(dbid)) { //���γ����� ������ ������ ���� �ʿ����� �ʰ�, �����ؼ� ��� �ϸ� ������ ���� 
//			
//		} //������ ������ �����ü� �־� �׶� ���
		
		
		//���ڿ��� ���ϴ� ��ŭ �߶� ���� �޼ҵ�:substring();
		test="�Ļ�ð� ����ð� ����޴� ���Ÿ��!";
		//substring(�����ε���,���ε���) //���ε��� �������� ǥ��
		System.out.println(test.substring(0,4));	//(0,3)�Ļ��//(0,4)�Ļ�ð�
		//substring(�ε���) //�����ε������� ������ ����.
		System.out.println(test.substring(9));// ����޴� ����Ÿ��
		//substring() indexOf() �����Ͽ�  ���
		System.out.println(test.substring(test.indexOf("����޴�"),test.indexOf("��")+1));
		//����޴�
		
		//���Ͽ� ���� �����ڸ� �߶󳻱�
		test="test.txt";
		System.out.println(test.substring(test.lastIndexOf(".")+1));//txt
		
		//���ڿ��� Ư�������ڷ� ������ �� ������ �� �����ڸ� �������� 
		//�迭�� ������ִ� �޼ҵ�: split(������);
		test="������,����,����ȣ,������,�����,������";
		String[] names=test.split(",");
		System.out.println(names[3]);//������
		//���ڿ�--> ���ڿ��迭: split();
		//���ڿ��迭->���ڿ�: join();
		for(String v:names) {
			System.out.println(v);
		}
		String returnStr=String.join("*^.~*",names);
		//������*^.~*����*^.~*����ȣ*^.~*������*^.~*�����*^.~*������
		System.out.println(returnStr);
	
		
		
		System.out.println("===StringBuffer===");
		//StringBuffer:���ڿ��� �����ϴ� ��ü
		//����� ���ڿ��� �����ϴ� ���� ������.
		//��ü -->����, ����, ���Ը޼ҵ带 ���ؼ� �̷����.
		
		StringBuffer sb=new StringBuffer("������");
		//StringBuffer�� ����Ϸ���
		System.out.println(sb+":"+sb.hashCode());//������:705927765  
		//toString(); �������̵� �Ǿ��ִ�.
		//StringBuffer�� �� �����ϱ�
		
		//���ڿ� �߰��ϱ�(��)
		sb.append("������");//�������� ������. String+=
		System.out.println(sb+":"+sb.hashCode());//�����¼�����:705927765
		
		//�������� Ư����ġ�� ���� ���� ���� ����
		//insert�޼ҵ� �̿�
		sb.insert(3,"�ƺ���");//(��������ġ,�����ҹ���)
		System.out.println(sb);//�����¾ƺ���������
		
		//Ư����ġ�� ���ڸ� ���� �� �� ����
		//delete�޼ҵ�
		sb.delete(1, 3);
		System.out.println(sb);//���ƺ���������
		
		//Ư����ġ�� ���ڸ� ����
		//replace()
		sb.replace(3, 6, "õ��");
		System.out.println(sb);//���ƺ�õ���
		
		//String�� StringBuffer ȣȯ��
		String str=new String(sb);
		System.out.println(str); //���ƺ�õ���
		sb=new StringBuffer(str);
		
		//StringBuilder
		StringBuilder sbu=new StringBuilder("������");
		sbu.append("������");
		System.out.println(sbu);//������������		
		
		stringTokenTest();
		
	}
	
	
	public static void stringTokenTest() {
		
		System.out.println("=====StringTokenizer======");//��ũ������
		//StringTokenizerŬ���� �̿��ϱ�
		//���ڿ��� Ư�� �����ڷ� �и��س��� ��ü //���ڿ��� �����ڷ� ������ ����ū�� ����.
		String str="java,oracle_c_c++,html,css,javascript,jquery,spring";
		//String[] lang=str.split(",");
		StringTokenizer st=new StringTokenizer(str,",_");
		while(st.hasMoreTokens()) {//�ݺ������� ��ū�� ����������.
			String temp=st.nextToken(); 
			//if(temp.contains("c")) {  //c�� �ִ� �ܾ� ���
				System.out.println(temp);
			}
			
//			if(st.nextToken().contains("c")) {  //c�� ����ִ� ������ ����غ�//����
//				System.out.println(st.nextToken());
			//ù��°���� ��� �������, �ι�°�ٿ� �ٽ���� �������.  ���� �ٸ�.
//			}
//			//System.out.println(st.nextToken()); //�������� �����.
			//System.out.println(st.nextToken());//NoSuchElementException ����
					//��¹��� ���ϰ�� 2���� ���Ʊ⶧���� ���ڿ��� Ȧ���� ����
//		}
		
		
	}
	
	
	
}
