package com.abstracttest.model.vo;
//abstract class�� �̿ϼ� Ŭ����, ��ü �����Ұ� -->�ݵ�� ����Ͽ� ��ü����
//abstract �޼ҵ� ��� abstractŬ���� ���� ����
//��, abstract�޼ҵ尡 ���� ���� �ݵ�� abstractŬ���� ����
//abstractŬ�������� �Ϲݺ���, �޼ҵ� ���԰���
//��ü ������ �ȵ�����, ������ ����Ÿ�����δ� ����.
//������ �Ƿ�����鼭 ��ü�������� �ʰ� ��ӹ޾� ����ϴ� ��  ���� �� ��
public abstract class Food{
//public class Food {
	
	private String kind;
	private String name;
	private String nation;
	private int portion;
	private int calory;
	
	public Food() {
		// TODO Auto-generated constructor stub
	}
	
	public Food(String kind, String name, String nation, int portion, int calory) {
		this.kind = kind;
		this.name = name;
		this.nation = nation;
		this.portion = portion;
		this.calory = calory;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public int getPortion() {
		return portion;
	}
	public void setPortion(int portion) {
		this.portion = portion;
	}
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}
	
	//alt+s+s+s
	@Override //Object.toString()�޼ҵ� ������
	public String toString() {
		return "Food [kind=" + kind + ", name=" + name + ", nation=" + nation + ", portion=" + portion + ", calory="
				+ calory + "]";
	}
	
	
	
	
}
