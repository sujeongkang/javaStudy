package com.stream.main;

import java.util.Scanner;

import com.streamtest.DataFile;
import com.streamtest.FileStreamTest;

public class Run {
	public static void main(String[] args) {
		FileStreamTest fst=new  FileStreamTest();
		Scanner sc=new Scanner(System.in);
		//System.out.println("�޼��� �Է�: ");
		//fst.outputStream(sc.nextLine());
		//fst.outputStream("ABCDEFG");//���Ͽ� ������ ����!->File SAVE
		//fst.InputStreamTest();//���Ͽ��� ������ �о���� ��.->File LOAD
		
		//fst.writerTest();
		fst.readerTest();
	//---------------------------------------------------------------------------	
		//����ڿ��� �޼����� �Է¹ް� (0������������ �ݺ������� ����) �� �޼����� msg.data���Ͽ� ������
		//msg.data������ ������ ����ϴ� ��� ����
		//*�޼��� ������ main���� ���޹޾Ƽ� ó���� ��
		System.out.println("������ �޼����� �Է�:");
		String msg="";
//		while(true) {
//			String temp=sc.nextLine();
//			if(temp.equals("0")) {
//				break;//�ݺ��� ����������
//			}
//			msg+=temp;
//		}
		//�Է¹��� ���� msg�� ������ ��. -->OutputStream, Writer
		String result="";
//		System.out.println("���ϸ�: ");
//		String fname=sc.nextLine();
//		String result=new FileStreamTest().saveMsgData(msg,fname);
//		System.out.println("���� ���: " +result);
//		
		
		//����� ����Ŀ �ҷ�����
//		System.out.println("�ҷ��� ���ϸ�: ");
//		result=new FileStreamTest().loadMsgData(sc.nextLine());
//		System.out.println(result);
		//���ϴ� ���ϸ����� �����ϰ� ���ϴ� ������ ������ �ҷ��� �� �ְ� ������Ʈ �ϱ�
		//-----------------------------------------------------

		//������ �����ϱ�
		new DataFile().savePerson();
		new DataFile().loadPerson();
		
		
	}
}
