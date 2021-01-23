package com.rent.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.rent.db.BookerDB;
import com.rent.db.CarDB;
import com.rent.model.vo.Booker;

public class Controller {
	
	CarDB cd=new CarDB();
	//BookerDB bd=new BookerDB();
	
	BookerDB bd=new BookerDB();
	private static String reserveNo;
	int index=0;
	
	public void searchCar(String type) {
		
		cd.searchCar(type);
		
				
		//cd.searchCar(type);
		//return bd.searchCar(type,rentDay,returnDay);
	}
	
	public int payment(int num) {
		if(num==1) {
			return 10000;
		}else if(num==2) {
			return 15000;
		}else if(num==3) {
			return 20000;
		}
	
		return 0;
	}
	
	public void plus(Booker b) {
		
		bd.plus(b);
	}

//	public void reserveNum() {
//		
//		HashSet num=new HashSet();
//		String v="";
//		for(int i=0;num.size()<8;i++) {
//			int su=(int)(Math.random()*10);
//			num.add(su);
//		}
//		System.out.print("���� ��ȣ: ");
//		for(Object o:num) {
//			System.out.print(o);
//		}
//		System.out.println();
//		
//	}
//	
	public ArrayList searchbk() {
		return bd.searchbk();
	}
	
	public int sumprice(Calendar rent,Calendar collect,int insurance,int carprice) {
		
		
		 Date d=new Date(rent.getTimeInMillis());
	      Date d1=new Date(collect.getTimeInMillis());
	      
	      Long diff=d.getTime()-d1.getTime();
	      Long dd=diff/(1000*60*60);
	      
	      int dd1=(int)(Math.abs(dd));//���밪-�������� ����
	      int day = dd1/24;//��
	      int hour=dd1%24; //�ð�
	      
//	      int a=rent.get(Calendar.DATE)-collect.get(Calendar.DATE);
//	      int a1=Math.abs(a);
//	      
//	         int cc=0;
//	         int b=dd1-24;
//	         for(int i=0;i<b;i++) {
//	            cc+=5000;
//	         
//	      }
//	      int df=cc*a1;//cc=�ð����� 5000���� �߰��� �ݾ� a1=������ �ϼ����� ���� �� �����³�-�ݳ���
	      int result = day*carprice+hour*5000;
	      
	      
	      //return df+insurance+carprice;
	   
	      return result+insurance;
	      
	      
	      
	   
		
		
	}
	
public String reserveNum() {//�����ȣ�� �����ϰ�, �Է¹��� ������ �����Ͽ� DB�� �����ϴ� ���
		
		List reserveList=new ArrayList();
		StringBuffer temp=new StringBuffer();
		Random rnd=new Random();//Random ��ü ���!
		for(int i=0;i<8;i++) {
			int r=(int)(Math.random()*3);
			switch(r) {
			case 0: temp.append((char)((int)(rnd.nextInt(26))+97)); break;//�ҹ��� ����
			case 1: temp.append((char)((int)(rnd.nextInt(26))+65)); break;//�빮�� ����
			case 2: temp.append((int)(Math.random()*10)); break;//���� ����
			}
		}
		//System.out.println("�����ȣ: "+temp);//�����ȣ ������ְ�
		String bookNo=new String(temp);//StringBuffer�� String���� ��ȯ���ְ�,
		//if(BookerDB.getBk().get(BookerDB.getBk().size()-1) instanceof Booker) {
			//Booker b=((Booker)(BookerDB.getBk().get(BookerDB.getBk().size()-1)));
			//b.setReserveNo(bookNo);//BookerDB�� String�������� ��ȯ�� �����ȣ ����!
		//}
			reserveNo=bookNo;
		return reserveNo;
	}
	
	public Calendar cl(int y,int m,int d,int h) {
		
		Calendar c=Calendar.getInstance();
		c.set(Calendar.YEAR,y);
		c.set(Calendar.MONTH,m);
		c.set(Calendar.DATE,d);
		c.set(Calendar.HOUR_OF_DAY,h);
		
		return c;
	}

	public static String getReserveNo() {
		return reserveNo;
	}

	public static void setReserveNo(String reserveNo) {
		Controller.reserveNo = reserveNo;
	}
	
//	public void fileSave(Object o) {
//
//		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("booker.txt"))) {
//			oos.writeObject(o);
//
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	public void fileLoad() {
//		Booker b=null;
//		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("booker.txt"))){
//			b=(Booker)ois.readObject();
//		}catch(ClassNotFoundException e) {
//
//		}
//		catch(IOException e) {
//
//		}
	
	public void saveCar(String model) {
		bd.saveCar(model);
		System.out.println(model);
	}
	
	
}
