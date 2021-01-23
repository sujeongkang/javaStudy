package com.thread.main;

import common.thread.InheritThread;
import common.thread.InterThread;

public class BasicThread {
	//���� �޼ҵ嵵 �ϳ��� ������
	public static void main(String[] args) {
		//��ӹ��� ������ Ȱ���ϱ�
		InheritThread t1=new InheritThread();
		//������ �����Ű�� ���
		//start()�޼ҵ带 ȣ���Ͽ� �����带 �����Ŵ.
		t1.start();  //����� InheritThread�� run�޼ҵ尡 �ڵ����� ���� //��Ƽ�� ������
		//t1.run();//������� ������ ������� Ȯ���� �ʿ���. ������ ȣ��� ��Ƽx,���������� ��.
		
		
		//Runnable ������ ��ü�� ������ Ȱ���ϱ�
		InterThread it=new InterThread();
		Thread t2=new Thread(it);
		t2.start();
		
		
		try {
			t1.join();//t1�����尡 �����ϰ� �����϶�! //�����������
			//t1.join(8000);//8�ʵ��� ��ٷȴٰ� ����
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		for(int i=0;i<10;i++) {
			System.out.println("main "+i+"��");
			try {//�и�������
				Thread.sleep(2000);//1�ʵ��� ����ߴٰ� �����ض� �߰��� ���鼭 �����.
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		System.out.println("���ξ����� ����!");
	}
}
