/*
 *		Question
 *
 *		Create a Comparator lambda that compares
 *		the fist letter of each name.
 *
 *		Sort in ascending order.
 *
 *		Print results.
 *
 *
 * */

import java.util.*;

class A {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Emily");
		names.add("Deedrick");
		names.add("Andy");
		names.add("Rebecca");

		System.out.println(names);

		Comparator<String> byFirstLetter;

		System.out.println(names);
	}
}
