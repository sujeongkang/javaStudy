package com.condition.run;
import com.condition.function.ConditionTest;
import com.condition.function.SwitchTest;
public class Main {
	public static void main(String[] args) {
		new ConditionTest().basicIfTest();
		new ConditionTest().testA();
		new ConditionTest().testB();
		new ConditionTest().testC();
		new ConditionTest().ifElseifTest();
		new ConditionTest().calc();
		new ConditionTest().acChoice();
		new SwitchTest().basicSwitch();
	}
	
}
