package com.streamtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamTest {
	//������ �������Ϸ� ���(����)�ϱ�
	public void outputStream(String data) {
		//RAM ->file�� �̵��Ͻ�Ű��.
		//1.�����͸� �ű� ��ġ(file) ->File ����
		//2.file�� Stream���� -> OutputStream��ü ����! why?���� �ִ� �� ���Ϸ� �Ű� ���Ӽ��ְ� �����ϱ����ؼ� ���Ͽ� ����
		//3.�޼ҵ带 ���ؼ� data�� ������->write();
		//4.OutputStream��ȯ -> close();
		
		File saveFile=new File("data.bs");//�������� ����. �������� ����
		//byte�� �����͸� �ְ�޴� FileOutputStream�� ����غ���.
		FileOutputStream fos=null;//finally���������� ��� �ϱ�빮�� �ۿ� ����
		//checkedException���� �ݵ�� ����ó���� ����� ��.
		try {
			fos=new FileOutputStream(saveFile);//�ڵ����� �Ű������� ���� ������ ����� ����
			//Stream�� ���鼭 �Ű������� ���� ���ϰ�ü�� ��������
			//fos.write("123456".getBytes());//������ �����͸� ���Ͽ� �Ѱ��ִ� ��ɾ�(�ϵ��� ����). ����Ʈ�� �ٲ㼭 ����Ʈ������ ����
			
			//�ܺο��� ���޹��� ��(�Ű�����)�� file�� �����ϱ�
			fos.write(data.getBytes());
			
			//fos.write("function test(){alert('����');}".getBytes());
		}catch(IOException e){
			e.printStackTrace();
		}
		finally {//�ݵ�� Ŭ���� ���ֱ�
			if(fos!=null) {
				try {
					fos.close();
				}catch(IOException e) {
					e.printStackTrace();//consoleâ�� ������������ϴ� �޼ҵ�
				}
			}
		}
		
	}
	//����Ȱ� �о����
	public void InputStreamTest() {
		//file�� ����� ������ �о����
		//InputStream�� �����
		//1.file�� ���� ->File��ü
		//2.FileInputStream�� ������.
		//3.read()�޼ҵ�� �����͸� �о���.
		//4.Stream�� �ݾ���.
		File load=new File("data.bs");
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(load);
			//������ �о�ö��� read�� �о��...
			//byte������ data�� �о���� ������,
			//��ü �����͸� ��������... data�� ������ ����������.
			//�ݺ����� ����Ͽ� �޾ƿ�.
			int value=0;//byte�� int�� ����ó��
			StringBuffer sb=new StringBuffer();
			
			while((value=fis.read())!=-1) { //int������ �޾ƿ�.
				//-1�� ���ذ��� file�� ���̻� �о�� �����Ͱ� ���� ���
				//-1�� ��ȯ����. -1: ������ �� �о���!
				//System.out.println((char)value); //�ѱ��� �ҷ��ö� ����.
				sb.append((char)value);
			}
			System.out.println(sb); //���ٷ� ��~���

		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fis!=null) {//������ fis�� ������ �ȉ��� ���,������������ ���̱� ������
							//�ο� �����Ͽ� ������ ���� �־�, ��������  ����ó��  
				try {
					fis.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
				
	}
	//���ڿ� ���� ��Ʈ��!!
	//Writer/Reader  ���� ���� �״��� ��������
	public void writerTest() {
		//1.file ����
		//2.Stream����
		//3.������ ���� ->write();
		//4.��Ʈ����ȯ
		File f=new File("strData.bs");
		//FileWriter fw=null;
		try(FileWriter fw=new FileWriter(f);){ //try~with~resource
			String msg="������� ��������Ͱ� ����ģst";
			fw.write(msg);
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	//���Ͽ� ����� ���ڿ� ������ �ҷ�����
	public void readerTest() {
		//1.���ϼ���->File
		//2.��Ʈ������->FileReader
		//3.���Ϻҷ�����->read();// ����Ʈ �������� �о��
		//4.��Ʈ����ȯ->close();
		File f=new File("strData.bs");
		try(FileReader fr=new FileReader(f)){
			int value=0;
			String msg="";
			while((value=fr.read())!=-1) {
				//System.out.println((char)value);
				msg+=(char)value;
			}
			System.out.println(msg);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//-----------------------------------------------------------

	//����ڿ��� �޼����� �Է¹ް� (0������������ �ݺ������� ����) �� �޼����� msg.data���Ͽ� ������
	//msg.data������ ������ ����ϴ� ��� ����
	//*�޼��� ������ main���� ���޹޾Ƽ� ó���� ��
	
	//	public String saveMsgData(String msg) {
//		//�����͸� �޾Ƽ� �����ϴ� ���
//		File f=new File("msg.data");
//		String returnMsg="���������� ����Ǿ����ϴ�.";
//		try(FileWriter fw=new FileWriter(f)){
//			
//			fw.write(msg);//������ file�� ����!
//			
//			
//		}catch(IOException e) {
//			e.printStackTrace(); //�ͼ��� �߻��� ���� ���
//			returnMsg="���������� ó������ �ʾҽ��ϴ�. �ٽ� �õ��ϼ���";
//		}
//		return returnMsg;
//	}

//	public String loadMsgData() {
//		String result="";
//		try(FileReader fr=new FileReader("msg.data")){
//			
//			int value=0;
//			while((value=fr.read())!=-1) {
//				result+=(char)value;
//			}
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//			result="������ �ҷ����µ� ������ �߻��߽��ϴ�.";
//		}
//		return result;
//	}
	
	//���ϴ� ���ϸ����� �����ϰ� ���ϴ� ������ ������ �ҷ��� �� �ְ� ������Ʈ �ϱ�
	public String saveMsgData(String msg,String fname) {
		//�����͸� �޾Ƽ� �����ϴ� ���
		//File f=new File("msg.data");
		File f=new File(fname);
		String returnMsg="���������� ����Ǿ����ϴ�.";
		try(FileWriter fw=new FileWriter(f)){
			
			fw.write(msg);//������ file�� ����!
			
			
		}catch(IOException e) {
			e.printStackTrace(); //�ͼ��� �߻��� ���� ���
			returnMsg="���������� ó������ �ʾҽ��ϴ�. �ٽ� �õ��ϼ���";
		}
		return returnMsg;
	}
	public String loadMsgData(String fname) {
		String result="";
		try(FileReader fr=new FileReader(fname)){
			
			int value=0;
			while((value=fr.read())!=-1) {
				result+=(char)value;
			}
			
		}catch(IOException e) {
			e.printStackTrace();
			result="������ �ҷ����µ� ������ �߻��߽��ϴ�.";
		}
		return result;
	}
	
}
