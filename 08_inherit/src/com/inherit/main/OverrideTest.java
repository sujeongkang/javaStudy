package com.inherit.main;

import com.override.model.vo.Cat;
import com.override.model.vo.Chicken;
import com.override.model.vo.Dog;

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog("개과","뽀삐",'F',"잡식");
		Cat c=new Cat("고양이과","톰",'M',"잡식");
		Chicken ch=new Chicken("조류","교촌",'F',"잡식");
		System.out.println(d.bark());
		System.out.println(c.bark());
		System.out.println(ch.bark());
		//new Animal().info(); //protected 라 접근안됨.
		d.info();//
		
		
	}

}
