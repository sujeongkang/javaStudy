package test.run;

import test.method.NonStaticSample;

public class Run {
	public static void main(String[] args) {
		NonStaticSample n=new NonStaticSample();
		n.printLottoNumbers();
		int num=5;
		char ch='a';
		n.outputChar(num, ch);
		System.out.println(n.alphabette());
		String str="�ȳ��ϼ���.�������Դϴ�.";
		int a=6, b=8;
		System.out.println(n.mySubstring(str,a, b));
		
		
		
	}
}
