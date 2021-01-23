package com.oop.main;
import java.util.Scanner;
import com.oop.model.vo.Car;

public class TestMain3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("모델: ");
		String model=sc.nextLine();
		System.out.print("배기량: ");
		int cc=sc.nextInt();
		System.out.print("도어수: ");
		int door=sc.nextInt();
		sc.nextLine();
		System.out.print("색상: ");
		String color=sc.nextLine();

		Car c=new Car(model,cc,door,color);
		
	
		System.out.println("모델: "+c.getMoedel()+", 배기량: "+c.getCc()+", 도어수: "+c.getDoor()+", 색상: "+c.getColor());
	}
}
