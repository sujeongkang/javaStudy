package oop.staticmethod;

public class Run {

	public static void main(String[] args) {
		StaticMethod s=new StaticMethod();
		s.toUpper();
		int index=3;
		char ch='��';
		s.setChar(index,ch);
		System.out.println(s.valueLength());
		String str="ȯ���մϴ�.";
		System.out.println(s.valueConcat(str));
	}

}
