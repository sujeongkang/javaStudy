package practice3.model.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[]ani=new Animal[5];
		ani[0]=new Dog("¯��","��",3);
		ani[1]=new Cat("��","�����","����ī��","ġ���");
		ani[2]=new Dog("��Ű","��",5);
		ani[3]=new Dog("����","��",10);
		ani[4]=new Cat("���","�����","��","������");
		
		for(int i=0;i<ani.length;i++) {
			ani[i].speak();
		}
		
	}
	
}
