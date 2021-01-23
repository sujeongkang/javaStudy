package com.rent.db;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;

import com.rent.controller.Controller;
import com.rent.model.vo.Booker;
import com.rent.model.vo.Car;

public class BookerDB {
	
	
//	Controller cl=new Controller();
	CarDB cd=new CarDB();
	
	private static ArrayList<Booker> bk=new ArrayList<Booker>();
	
	

	
	public void plus(Booker b) {
		bk.add(b);
		
		

		
//		for(Object o:bk) {
//			System.out.println(o);
//		}
	}
	
//	public ArrayList searchCar(String type,Calendar rentDay, Calendar returnDay) {
//		ArrayList car=new ArrayList();
//		if(type.equals("소형")) {
//			car=cd.searchCar(type);
//			if(!bk.contains(car)) {
//				return car;
//			
//			
//			
//			}
//			
//		}return car;
		
		
//	}
	public ArrayList searchbk() {
		return bk;
	}

	public static ArrayList getBk() {
		return bk;
	}
	
	public void fileSave(Object o) {

		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("booker.txt"))) {
			oos.writeObject(o);

		}catch(IOException e) {
			e.printStackTrace();
		}

	}

	public ArrayList fileLoad() {
		ArrayList b=null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("booker.txt"))){
			b=(ArrayList)ois.readObject();
		}catch(ClassNotFoundException e) {

		}
		catch(IOException e) {

		}
	
		return b;

	}
	
	public void saveCar(String model) {
		Booker lastBk= bk.get(bk.size()-1);
		for(Object v:CarDB.car) {
			if(v instanceof Car) {
				Car c=(Car)v;
				if(c.getModel().equals(model)) {
					lastBk.setBrand(c.getBrand());
					lastBk.setModel(c.getModel());
					lastBk.setPrice(c.getPrice());
					
					
					}
				}
			}
		//리스트 확인용
//		for(Object o:bk) {
//			System.out.println(o);
//		}
	}
	

	
	
}
