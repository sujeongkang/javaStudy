package com.thread.main;

import common.thread.CharacterFight;
import com.thread.model.vo.Character;

public class CharacterFightMain {
	public static void main(String[] args) {
		
		CharacterFight rock=new CharacterFight(new Character("�����",100));
		CharacterFight jisun=new CharacterFight(new Character("������",1000));
		CharacterFight jinho=new CharacterFight(new Character("����ȣ",50));
		CharacterFight hyen=new CharacterFight(new Character("����",1500));
		
		rock.start();
		jisun.start();
		jinho.start();
		hyen.start();
		
	}
}
