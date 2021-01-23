package oop.method;

import java.util.Arrays;

public class NonStaticSample {
	public NonStaticSample() {
		// TODO Auto-generated constructor stub
	}
	public int[] intArrayAllocation(int num) {
		int[]arr=new int[num];
		for(int i=0;i<arr.length;i++) {
			arr[i]=((int)(Math.random()*100)+1);
			
		}
		return arr;
	}
	public void display(int[]arr) {
		for(int v:arr) {
			System.out.print(v+" ");
		}System.out.println("");
	}
	public void swap(int[]iarr,int n1,int n2) {
		int a=iarr[n1];
		int b=iarr[n2];
		iarr[n1]=b;
		iarr[n2]=a;
		
//		for(int v:iarr) {
//			System.out.print(v+" ");
//		}System.out.println("");
	}
	
	public void sortDescending(int[]iarr) {//내림차순
		int temp=0;
		for(int i=0;i<iarr.length;i++) {
			for(int j=0;j<iarr.length;j++) {
				if (iarr[i] > iarr[j]) {
					temp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = temp;
				}
			}
		}
//		for(int v:iarr) {
//			System.out.print(v+" ");
//		}System.out.println("");
	}
	public void sorAscending(int[]iarr) {//오름차순
		Arrays.sort(iarr);
		for(int v:iarr) {
			System.out.print(v+" ");
		}System.out.println("");
	}
	
	public int countChar(String str,char ch) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==(ch)) {
				count++;
			}
		}return count;
	}
	public int totalValue(int a,int b) {
		int result=0;
		int sum=0;
		if(a<b) {
			for(int i=a;i<=b;i++) {
				sum+=i;
			}result=sum;
		}else if(a>b) {
			for(int i=b;i<=a;i++) {
				sum+=i;
			}result=sum;
		}return result;
	}
	public char pCharAt(String str,int z) {
		
		return str.charAt(z);
	}
	public String pconcat(String str1, String str2) {
		return str1+str2;
	}
}
