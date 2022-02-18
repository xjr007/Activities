/*
 *			Question
 *
 *			Create a Comparator lambda that checks
 *			the length of a string.
 *
 *			sort in ascending order.
 *
 *
 * */

import java.util.*;

class A {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Isaacs");
		names.add("Behardien");
		names.add("Baker");
		names.add("Regal");

		System.out.println(names);

		Comparator<String> byLength;

		byLength = (s1, s2) -> s1.length() - s2.length();
		names.sort(byLength);
		System.out.println(names);
	}
}
