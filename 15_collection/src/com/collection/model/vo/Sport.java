package com.collection.model.vo;

import java.util.Arrays;

public class Sport/* implements Comparable<Sport>*/{
	private String type;
	private String name;
	private int player;
	private String[] rule;
	
	public Sport() {
		// TODO Auto-generated constructor stub
	}

	public Sport(String type, String name, int player, String[] rule) {
		this.type = type;
		this.name = name;
		this.player = player;
		this.rule = rule;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public String[] getRule() {
		return rule;
	}

	public void setRule(String[] rule) {
		this.rule = rule;
	}

	@Override
	public String toString() {
		return "Sport [type=" + type + ", name=" + name + ", player=" + player + ", rule=" + Arrays.toString(rule)
				+ "]";
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Sport) {
			Sport s=(Sport)o;
			if(this.name.equals(s.name)
					&&this.type.equals(s.type)
					&&this.player==s.player) {
				return true;
			}
		}
		return false;
	}
//	@Override
//	public int compareTo(Sport s) {
//		//compare메소드와 마찬가지로 기준 값을 가지고
//		//0,양수,음수를 반환
//		//이름을 기준으로 정렬하기
//		//return this.name.compareTo(s.name); //매개변수가 뒤에 있으면 오름차순
//		//return s.name.compareTo(this.name); //내림차순
//		
//		//인원수를 기준으로 정렬
////		if(this.name.compareTo(s.name)==0) {//두개 이상 비교시. 하나는 같을때 배교
////			return this.player-s.player; 
////		}else if() {
//		return this.player-s.player;//오름차순
		
	}
	
	
	

