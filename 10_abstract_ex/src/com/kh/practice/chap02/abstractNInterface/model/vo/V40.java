package com.kh.practice.chap02.abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen {
	public V40() {
		super.setMaker("LG");
	}
	
	public String makeCall() {
		return "��ȣ�� ������ ��ȭ��ư�� ����";
	}
	
	public String takeCall() {
		return "���� ��ư�� ����";
	}
	
	public String picture() {
		return	"1200,1600�� Ʈ���� ī�޶�";
	}
	
	public String charge() {
		return "��� ����, ��� ���� ����";
	}
	
	public String touch() {
		return "������";
	}
	
	public boolean bluetoothPen() {
		return false;
	}
	@Override
	public String printInformation() {
		return	"V40�� "+getMaker()+"���� ��������� ������ ������ ����.\n"+ 
				makeCall()+"\n"+
				takeCall()+"\n"+
				picture()+"\n"+
				charge()+"\n"+
				touch()+"\n"+
				"������� �� ž�翩��:"+bluetoothPen();
	}
}
