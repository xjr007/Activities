/*
 *		Question
 *
 *		Use the built in method removeIf()
 *		and remove all the animals that 
 *		have the letter 'e' in it.
 *
 *		Print out the remaining animals.
 *
 *
 * */

import java.util.List;
import java.util.ArrayList;

class A {
	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();
		animals.add("Lion");
		animals.add("Zebra");
		animals.add("Giraffe");
		animals.add("Hippo");
		animals.add("Penguin");
		animals.add("Lemur");
		
		// Lists all the animals
		animals.forEach(System.out::println);

		// Do code here

	}
}
