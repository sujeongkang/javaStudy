package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController{
	public NumberController() {
		
	}
	public boolean checkDouble(int num1, int num2) throws NumRangeException {
		if((0<num1&&num1<101)&&(0<num2&&num2<101)) {
			if(num1%num2==0) {
				return true;
			}else {
				return false;
			}
		}else {
			throw new NumRangeException("1���� 100������ ���� �ƴմϴ�.");
		}
		
	}
}
