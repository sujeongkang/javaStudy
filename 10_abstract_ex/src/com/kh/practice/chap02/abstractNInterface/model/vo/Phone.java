package com.kh.practice.chap02.abstractNInterface.model.vo;

public interface Phone {
	public final char[] NUMBERPAD= {'1','2','3','4','5','6','7','8','9','*','0','#'};
	
	public abstract String makeCall();
	public abstract String takeCall();
		
	
}
