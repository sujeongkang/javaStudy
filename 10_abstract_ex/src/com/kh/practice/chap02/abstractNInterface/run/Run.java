package com.kh.practice.chap02.abstractNInterface.run;

import com.kh.practice.chap02.abstractNInterface.controller.PhoneController;

public class Run {
	public static void main(String[] args) {
		String[] str=new PhoneController().method();
		for(String v:str) {
			System.out.println(v+" ");
		}System.out.println("");
	}
}
