package com.exception.cotroller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchTest {
	public static void main(String[] args) {
		//try~catch���� ����ó���ϱ�. �Ѵ� �־���� �ݵ��. �׷����� ��������
		//
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) { //��ӵ��ư��� ����.
			System.out.println("�����Է�:");
			String name=sc.nextLine();
			//�Է¹��� ���ڿ��� 3��°���� ����ϱ�
			try {
				System.out.println(name.charAt(2));//���ܰ� �߻��ϴ� ����
				//System.out.println("��Ӱ��");
				
			}catch(StringIndexOutOfBoundsException e) {//�߻��� ����Ǵ� Exception���� .�Ű�������.
				//e.printStackTrace();//���� ��¹�  �Ⱦ��� ������� �ȵ�
				//a();//�ٸ� �޼ҵ�� �帧�� �ѱ�.
				return;
			}finally {
				
				System.out.println("���α׷� ����"); //������ �ϴ��� �����ǽ����. 
				//Try���� �ɸ��� �Ȱɸ��� �����ǽ���.
					
			}
			System.out.println("��Ӱ��");
		}
		fileTry();
	}
	
	public static void fileTry() {
		
		File f=new File("test.txt");//file�� �� checkedException
		FileInputStream fis=null;;//�ʱ�ȭ
		try {
			//�ԼǼ� �߻��� ������ �ȳ�����.
			 fis=new FileInputStream(f);//��Ʈ���� �������� �ݵ�� �ݾƾ� ��.�׷��� ���������� ������ ��
			 //�ؿ� �ݵ�� �ؾ��ϴ� ó���� finally��
			 //Unhandled exception type FileNotFoundException ���� ó�� ���ߴ�.
			 
			 fis.read();//������ �ҷ����� �༮. IOException;
//		}catch(FileNotFoundException e) {
//			 fileCreate();
//			 return;
//		}catch(IOException e) {	//IOException�θ�, FileNotFoundException �ڽ�
//			 iotest();
//			 return;
			//IOException�� ���������� �θ�� �� ó���ع��� //�ؿ��� �����ڵ� ��.
		}catch(Exception e) {	
			//� Exception�� �߻��ߴ��� �����Ͽ� ó���ϱⰡ ��������.
			//Exception�� �־ ������. ��Ȯ�� � Exception�� ���Դ����� ������ Exceptionó���� �־� �����ϴ�. 
			//catch�� ���� �������� �����ͺ��� ������ ������ ũ�� �Ѱ�.
			//FileNotFoundException < IOException < Exception<Throw<Object
			
			//e.printStackTrace(); //������±���
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
//			if() {
//				
//			}
		}finally{//������ �����. ��Ʈ���� �ݱ� ���ؼ� �ڵ����� ������.
			try {
				fis.close();//��Ʈ���ݱ�!!!!!!/��Ʈ������ ������ ���ݱ�. �ȴ����� ��ӿ���Ȼ���. 
				//try���ȿ� ������ ���� fis �� ã��. �ܺο� �����ʿ�//cannot be resolved ���� ��ã�´�.
				
			}catch(IOException e) {
				e.printStackTrace();
				}
		}
	}
	
	public static void trywithresoureceTest() {
		//try with resource: ��ü�� ��ȯ(��ȯ�ϰ� ����)������ϴ� ������ �ڵ����� �����ؼ� ó��.
		//try{   }catch(���� Ŭ���� e){    }finally{try...)
		//try(��ȯ��ü�� ����/����){ }catch(���� Ŭ���� e){    }
		
		File f=new File("test.txt");
		try(FileInputStream fis=new FileInputStream(f); //�ϳ��̻��϶��� ;����Ŭ��.�ϳ����̰ų� �������϶��� ��������.
				BufferedInputStream bis=new BufferedInputStream(fis);){
			
			bis.read();//�ڵ����� ����.
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
