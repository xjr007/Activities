import java.util.*;

public class A implements Comparator<Character> {
	
	public int compare(Character s1, Character s2) {

		return s1.compareTo(s2);





		

	}

	public static void main(String[] args) {

		Comparator<Character> byChar = (c1, c2) -> c1.compareTo(c2);
	
		// List of names

		List<String> names = new ArrayList<>();
		names.add("Raees");
		names.add("Mustapha");
		names.add("Ghaleed");
		names.add("Adams");
		

		// List of first character in each name

		List<Character> letters = new ArrayList<>();
		for(String s: names) letters.add(s.charAt(0));

		// Sort letters in ascending order
		// using overridden method

		Collections.sort(letters);
		System.out.println(letters);

		// Sort letters in descending order
		// using lambda
		// .reversed() changes it to descending

		letters.sort(byChar.reversed());
		System.out.println(letters);
	}
}
