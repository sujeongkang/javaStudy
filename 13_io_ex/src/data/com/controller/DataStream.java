package data.com.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import data.com.vo.Product;

public class DataStream {
	Scanner sc=new Scanner(System.in);
	Product[] p=new Product[5];
	public void addFile() {
		try(ObjectOutputStream dos=new ObjectOutputStream(new FileOutputStream("product.dat"))){
			for(int i=0;i<p.length;i++) {
				
				System.out.print("��ǰ��: ");
				String name=sc.nextLine();
				System.out.print("����: ");
				int price=sc.nextInt();
				System.out.print("����: ");
				int count=sc.nextInt();
				System.out.print("������: ");
				double discount=sc.nextDouble();
				sc.nextLine();
				 
				dos.writeUTF(name);
				dos.writeInt(price);
				dos.writeInt(count);
				dos.writeDouble(discount);
			}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
			
	
	}
	public void printFile() {
		Product[] p=new Product[5];

		try(ObjectInputStream dis=new ObjectInputStream(new FileInputStream("product.dat"))){
			for(int i=0;i<p.length;i++) {
				
					String name=dis.readUTF();
					int price=dis.readInt();
					int count=dis.readInt();
					double discount=dis.readDouble();
					
					p[i]=new Product(name,price,count,discount);
				
			}
			System.out.println("====���幰ǰ===");
			for(int i=0;i<p.length;i++) {
				
				System.out.println("��ǰ��:"+p[i].getName()+"\n����: "+p[i].getPrice()+"��\n����:"+p[i].getCount()+"��\n������:"+p[i].getDiscount()+"%");
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
