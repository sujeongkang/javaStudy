package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	
	public CharacterController() {
		
	}
	
	
	public int countAlpha(String s) throws CharCheckException {
		String str=s;
		int count=0;
			for(int i=0;i<str.length();i++) {
				if(('Z'>=str.charAt(i)&&s.charAt(i)>='A')||('z'>=str.charAt(i)&&s.charAt(i)>='a')) {
					count++;
				}else if(str.charAt(i)==' ') {
					throw new CharCheckException("체크할 문자열 안에 공백이 포함되어있습니다.");
				}
			}return count;
			
		
		
	}
}
