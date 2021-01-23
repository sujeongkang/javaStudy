package practice3.model.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[]ani=new Animal[5];
		ani[0]=new Dog("짱구","개",3);
		ani[1]=new Cat("톰","고양이","동물카페","치즈색");
		ani[2]=new Dog("럭키","개",5);
		ani[3]=new Dog("구름","개",10);
		ani[4]=new Cat("라라","고양이","집","검은색");
		
		for(int i=0;i<ani.length;i++) {
			ani[i].speak();
		}
		
	}
	
}
