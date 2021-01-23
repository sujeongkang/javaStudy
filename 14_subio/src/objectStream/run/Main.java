package objectStream.run;

import objectStream.controller.StudentController;
import objectStream.controller.StudentDB;

public class Main {
	public static void main(String[] args) {
//		new StudentController().saveData();
//		new StudentController().saveData();
//		
//		new StudentController().loadData();
//		
		new StudentDB().saveData();
		new StudentDB().loadData();
	}
}
