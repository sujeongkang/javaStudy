package com.rent.db;

import java.util.ArrayList;


import com.rent.model.vo.Car;

public class CarDB {
	
	public static ArrayList<Car> car=new ArrayList<Car>();
	
	public static ArrayList<Car> search=new ArrayList<Car>();
	
	{
		car.add(new Car("����","����","�̴�����",65000));
		car.add(new Car("����","�ƿ��A5","�ƿ��",75000));
		car.add(new Car("����","����ι������110","����ι�",85000));
		car.add(new Car("����","���","���",50000));
		car.add(new Car("����","����ũ","������",50000));
		car.add(new Car("����","����GSLŬ����","����",110000));
		car.add(new Car("����","K9","���",90000));
		car.add(new Car("����","�ƹݶ�","����",70000));
		car.add(new Car("����","G90L","����",100000));
	}
	
	
	public void searchCar(String type) {
		
		for(Object v:car) {
			if(v instanceof Car) {
				Car c=(Car)v;
				if(c.getType().equals(type)) {
					search.add(c);
					
					}
				}
			}

	}
	
	
	
//	
//	
//	
//	
//	public void searchSave(String type) {
//		for(int i=0;i<car.size();i++) {
//			if(car.get(i) instanceof Car){
//				Car c=(Car)car.get(i);
//				if(c.getType().contentEquals(type)) {
//					search.add(c);
//				}
//			}
//		}
//	}
//	public ArrayList searchReturn() {
//		return this.search;
//	}







	public static ArrayList<Car> getSearch() {
		System.out.println(search);
		return search;
	}



	public static ArrayList<Car> getCar() {
		return car;
	}





	
	
	
	
	
	
}
		
		
	


