package com.rent.db;

import java.util.ArrayList;


import com.rent.model.vo.Car;

public class CarDB {
	
	public static ArrayList<Car> car=new ArrayList<Car>();
	
	public static ArrayList<Car> search=new ArrayList<Car>();
	
	{
		car.add(new Car("소형","쿠퍼","미니쿠페",65000));
		car.add(new Car("중형","아우디A5","아우디",75000));
		car.add(new Car("중형","랜드로버디펜더110","랜드로버",85000));
		car.add(new Car("소형","모닝","기아",50000));
		car.add(new Car("소형","스파크","쉐보레",50000));
		car.add(new Car("대형","벤츠GSL클래스","벤츠",110000));
		car.add(new Car("대형","K9","기아",90000));
		car.add(new Car("중형","아반떼","현대",70000));
		car.add(new Car("대형","G90L","현대",100000));
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
		
		
	


