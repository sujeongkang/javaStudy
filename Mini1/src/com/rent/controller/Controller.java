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
//		System.out.print("예약 번호: ");
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
	      
	      int dd1=(int)(Math.abs(dd));//절대값-몇일인지 구함
	      int day = dd1/24;//날
	      int hour=dd1%24; //시간
	      
//	      int a=rent.get(Calendar.DATE)-collect.get(Calendar.DATE);
//	      int a1=Math.abs(a);
//	      
//	         int cc=0;
//	         int b=dd1-24;
//	         for(int i=0;i<b;i++) {
//	            cc+=5000;
//	         
//	      }
//	      int df=cc*a1;//cc=시간마다 5000원씩 추가된 금액 a1=빌리는 일수마다 곱할 값 빌리는날-반납날
	      int result = day*carprice+hour*5000;
	      
	      
	      //return df+insurance+carprice;
	   
	      return result+insurance;
	      
	      
	      
	   
		
		
	}
	
public String reserveNum() {//예약번호를 생성하고, 입력받은 정보를 취합하여 DB에 저장하는 기능
		
		List reserveList=new ArrayList();
		StringBuffer temp=new StringBuffer();
		Random rnd=new Random();//Random 객체 사용!
		for(int i=0;i<8;i++) {
			int r=(int)(Math.random()*3);
			switch(r) {
			case 0: temp.append((char)((int)(rnd.nextInt(26))+97)); break;//소문자 랜덤
			case 1: temp.append((char)((int)(rnd.nextInt(26))+65)); break;//대문자 랜덤
			case 2: temp.append((int)(Math.random()*10)); break;//숫자 랜덤
			}
		}
		//System.out.println("예약번호: "+temp);//예약번호 출력해주고
		String bookNo=new String(temp);//StringBuffer를 String으로 변환해주고,
		//if(BookerDB.getBk().get(BookerDB.getBk().size()-1) instanceof Booker) {
			//Booker b=((Booker)(BookerDB.getBk().get(BookerDB.getBk().size()-1)));
			//b.setReserveNo(bookNo);//BookerDB에 String형식으로 변환된 예약번호 저장!
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
