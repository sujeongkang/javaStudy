package com.subio.main;

import com.subio.controller.DataInputOutput;
import com.subio.controller.DataInputOutput2;
import com.subio.controller.ObjectInputOutput;
import com.subio.controller.TestController;

public class Run {
	public static void main(String[] args) {
		//new DataInputOutput().dataOutputTest();
//		new DataInputOutput().dataInputTest();
		//new DataInputOutput2().dataOutput();
//		new DataInputOutput2().dataInput();
//		new TestController().savePerson();
		new TestController().loadPerson();
//		new ObjectInputOutput().saveObject();
//		new ObjectInputOutput().loadObject();
	}
}
