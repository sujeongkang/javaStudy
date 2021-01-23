package com.override.main;

import com.override.model.vo.Cat;
import com.override.model.vo.Chicken;
import com.override.model.vo.Lion;

public class Main {
	public static void main(String[] args) {
		Cat cat=new Cat("톰","고양이",4);
		Chicken chicken=new Chicken("꼬꼬","조류",2);
		Lion lion=new Lion("레오","고양이과",4);
		System.out.println(cat.action());
		System.out.println(chicken.action());
		System.out.println(lion.action());
		
		System.out.println(cat.clone().equals(cat));		
	}
}
