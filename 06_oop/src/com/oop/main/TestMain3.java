package com.oop.main;
import java.util.Scanner;
import com.oop.model.vo.Car;

public class TestMain3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("��: ");
		String model=sc.nextLine();
		System.out.print("��ⷮ: ");
		int cc=sc.nextInt();
		System.out.print("�����: ");
		int door=sc.nextInt();
		sc.nextLine();
		System.out.print("����: ");
		String color=sc.nextLine();

		Car c=new Car(model,cc,door,color);
		
	
		System.out.println("��: "+c.getMoedel()+", ��ⷮ: "+c.getCc()+", �����: "+c.getDoor()+", ����: "+c.getColor());
	}
}
