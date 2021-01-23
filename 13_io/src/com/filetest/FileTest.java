package com.filetest;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		//�ڹٿ��� ������ �ٷﺸ��.
		File f=new File("test.txt");//test.txt.���ϸ��� ���� ���� ����
		//���� ���� ���ϸ� ram������ �ִ� �׳� �����.
				
		//���� ��ü�� ���鶧 ��α��� �߰��ؼ� ������ �� ����
		//f=new File("c:\\Users\\sy175\\test\\a\\test.txt");//���� ��������� �� �� ����.
		f=new File("test.txt");
		//�ڹٿ��� ������ �����ϰ� ���ϻ����ϸ� ��.
		//������ �����ϴ� ���: mkdir, mkdirs
		//File dir=new File("c:\\Users\\sy175\\test\\a\\b\\c"); 
		File dir=new File("c:\\Users\\sy175\\");
		//System.out.println(dir.mkdirs());
		if(!dir.exists())System.out.println(dir.mkdirs());
		//�����ִ�?  -->������ ����. ������ ����������
		//�������� true, ���г� �̸̹������ ������  false
		//�̹� ������� ������ �ϳ��� �߰��ô� mkdir//���������� ��ο� �ΰ� �̻� �����ÿ���.mkdirs
	
		try {// IOException. 
			if(!f.exists()) {//���� ���� �����ض�
				
				f.createNewFile();//�ڵ����� �ȵ�.. ������Ʈ������ ��Ŭ�� Refresh
			}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("������ ũ��: "+f.length());//����Ʈũ�� 9����Ʈ
		System.out.println("��� Ȯ��: "+f.getAbsolutePath());//D:\KH\work\13_io\test.txt
		for(String file:dir.list()) {//����Ʈ �ڷ������� ������.
			System.out.println("���ϵ� Ȯ���ϱ�: "+file); //������� �ٳ���.
		}
		
		
	}
}
