package com.fbt.cleancode;


public class MultipleSubMethods {
	
	public static void multipleSubMethods() {
		subMethod1();
		subMethod11();
		subMethod111();
		subMethod1111();
		subMethod11111();
		subMethod111111();
	}

	public static void multipleSubMethod() {
		subMethod1();
	}

	private static String subMethod1() {
		return subMethod11();
	}
	
	private static String subMethod11() {
		return subMethod111();
	}
	
	private static String subMethod111() {
		return subMethod1111();
	}
	
	private static String subMethod1111() {
		return subMethod11111();
	}
	
	private static String subMethod11111() {
		return subMethod111111();
	}
	
	private static String subMethod111111() {
		return "111111";
	}
	
	public static void oneSubMethod() {
		subMethod111();
	}

	public static String recursiveMethod(int numberRepeats) {
		if(numberRepeats<1) {
			return subMethod111111();
		}
		return recursiveMethod(numberRepeats-1);
		
	}
}
