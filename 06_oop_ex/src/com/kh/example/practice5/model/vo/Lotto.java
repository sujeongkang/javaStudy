package com.kh.example.practice5.model.vo;

public class Lotto {
	
	private int[] lotto;
	{
		lotto=new int[6];
	
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)((Math.random()*45)+1);
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i=i-1;
					break;
				}
			}
		}
	}
	
	public Lotto() {}
	public void information() {
		
		
		for(int v:lotto) {
			System.out.print(v+" ");
		}
		
		
	
	}
}
