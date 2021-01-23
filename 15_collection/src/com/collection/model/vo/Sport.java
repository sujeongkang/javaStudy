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
//		//compare�޼ҵ�� ���������� ���� ���� ������
//		//0,���,������ ��ȯ
//		//�̸��� �������� �����ϱ�
//		//return this.name.compareTo(s.name); //�Ű������� �ڿ� ������ ��������
//		//return s.name.compareTo(this.name); //��������
//		
//		//�ο����� �������� ����
////		if(this.name.compareTo(s.name)==0) {//�ΰ� �̻� �񱳽�. �ϳ��� ������ �豳
////			return this.player-s.player; 
////		}else if() {
//		return this.player-s.player;//��������
		
	}
	
	
	

