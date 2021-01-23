package com.frameTest.view;


import javax.swing.JFrame;

public class InheritFrame extends JFrame{
	
	
	public InheritFrame() {
		//�������̳� �⺻ container�� ��ӹ��� Ŭ������
		//�����ڿ��� ��� ������ ������.
		//������ �⺻���� 3����  //�⺻����..
		//1.�������� ũ��, ��ġ ����  ->setBounds(); //JFrame����� ��
		setBounds(100,100,800,1000);   //�տ� �ΰ��� ��ġ, �ڿ� �ΰ�(����,����)�� ũ��
		
		//2.â�� �ݴ� �̺�Ʈ ����->setDefaultCloseOperation()
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.�����Ӱ�ü�� �⺻������ �Ⱥ��̰� ������ �Ǿ�����
		//setVisible() �޼ҵ�� ���̰� �����ϱ�
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new InheritFrame(); //�������ϳ��� ����!
	}
}
