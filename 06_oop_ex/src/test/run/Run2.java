package test.run;

import oop.method.NonStaticSample;

public class Run2 {
	public static void main(String[] args) {
		NonStaticSample n=new NonStaticSample();
		int num=5;
		System.out.println(n.intArrayAllocation(num));
		int[]arr=n.intArrayAllocation(num);
		n.display(arr);
		int[]iarr= {5,6,8,4,3,2,7};
		n.swap(iarr,3,4);
		
		n.sortDescending(iarr);
		n.sorAscending(iarr);
		
		String str="간장공장공장장";
		char ch='장';
		System.out.println(n.countChar(str,ch));
		int a=5,b=8;
		System.out.println(n.totalValue(a,b));
		String strr="살았니?죽었니?";
		int z=3;
		System.out.println(n.pCharAt(strr, z));
		String str1="안녕!",str2="반가워";
				
		System.out.println(n.pconcat(str1, str2));
	}
}
