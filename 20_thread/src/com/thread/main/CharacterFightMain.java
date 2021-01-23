package com.thread.main;

import common.thread.CharacterFight;
import com.thread.model.vo.Character;

public class CharacterFightMain {
	public static void main(String[] args) {
		
		CharacterFight rock=new CharacterFight(new Character("강경록",100));
		CharacterFight jisun=new CharacterFight(new Character("남지선",1000));
		CharacterFight jinho=new CharacterFight(new Character("설진호",50));
		CharacterFight hyen=new CharacterFight(new Character("조현",1500));
		
		rock.start();
		jisun.start();
		jinho.start();
		hyen.start();
		
	}
}
