/*
 *	Question
 *
 *	Debug the code so that it may run successfully
 *		i.e. Remove 1 line of code ONLY.
 *
 * */

import java.util.function.*;

class A {
	
	// Constants
	private static final String surname = "Isaacs";
	
	// Static Fields
	private static String name = "Ghaleel";
	
	public static void main(String[] args) {
		String name = "Mubashir";
		Predicate<String> checkString = (String s) -> s.equals(name);
		name = "Aaqiel";
		boolean res = checkString.test(name);
		System.out.println(res);
	}
}
