package practice3.model.vo;

public class Dog extends Animal {
	public final String PLACE = "�ְ�ī��";
	private int weight;

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String kind, int weight) {
		super(name, kind);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPLACE() {
		return PLACE;
	}

	@Override
	public void speak() {
		System.out.println(super.toString()+" �����Դ� "+weight+"kg �Դϴ�.");
		
	}

}
