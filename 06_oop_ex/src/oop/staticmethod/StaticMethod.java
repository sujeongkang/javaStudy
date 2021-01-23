package oop.staticmethod;

public class StaticMethod {
	private static String value="æ»≥Á«œººø‰";

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticMethod.value = value;
	}
	
	public static void toUpper() {
		value.toUpperCase();
		//System.out.println(value.toUpperCase());
	}
	public static void setChar(int index, char ch) {
		value.replace((value.charAt(index)),ch);
		//System.out.println(value.replace((value.charAt(index)),ch));
	}
	public static int valueLength() {
		int count=value.length();
		return count;
	}
	public static String valueConcat(String str) {
		String result=str+value;
		return result;
	}
}
