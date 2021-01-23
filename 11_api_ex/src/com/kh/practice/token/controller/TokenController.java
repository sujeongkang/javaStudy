package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {
		
	}
	public String afterTocken(String str) {
		StringTokenizer st=new StringTokenizer(str," ");
		String t="";
		while(st.hasMoreTokens()) {
			t+=st.nextToken();
		}return t;
	}
	public String firstCap(String input) {
		String a=String.valueOf(input.charAt(0));
		String b=String.valueOf((input.toUpperCase()).charAt(0));
		String first=input.replaceFirst(a,b);
		return first;
	}
	public int findChar(String input, char one) {
		int count=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==one) {
				
				count++;
			}
		}
		return count;
		
	}

}
