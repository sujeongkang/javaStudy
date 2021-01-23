package com.subio.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.subio.model.vo.Person;

public class ObjectInputOutput {
	
	public void saveObject() {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("Object.dat");
			oos=new ObjectOutputStream(fos);
			//������ file�� ����!
			oos.writeObject(new Person("������",19,'��',"01036446259"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(oos!=null) {
				try {
					oos.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	public void loadObject() {
		Person p=null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Object.dat"))){
//			try {
			p=(Person)ois.readObject();
//				
//			}catch(ClassCastException e) {
//				e.printStackTrace();
//			}
			
		}catch(ClassNotFoundException e) { //������ ����ȯ�� class�� ��ã�� �� ���� �� �߻��� ����ó��
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(p);
	}
}
