import java.util.function.*;

class A {
	public static void main(String[] args) {
		// Example 
		Predicate<String> lambda = (String s) -> s.length() > 5;
		boolean results = lambda.test("This");				// false
		boolean results_2 = lambda.test("Okay then");			// true
		
		//System.out.println(results);
		//System.out.println(results_2);

		Predicate<String> lambda_2 = (String s) -> s.toLowerCase().startsWith("a");
		System.out.println(lambda_2.test("Aaqiel"));
	}
}

class B {
	public static void main(String[] args) {
		// Create your own Predicate here
		// Your predicate should check whether a String
		// starts with the letter A (NOT case sensitive).
		// Run the lambda twice with different arguments 
		// which provide different outputs.
		
	}
}
