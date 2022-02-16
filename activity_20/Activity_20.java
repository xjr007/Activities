import java.util.function.*;
class A {
	public static void main(String[] args) {
		// Use the 3 built in functional interfaces
		// and create 3 of your own lambdas in total of each interface: 
		// 									[ Consumer | accept() ] [ Supplier | get() ] [ Predicate | test() ]
		// Use whatever values you desire.
		//
		// Your 1 BiPredicate lambda must take 2 arguments
		//
		// Total lambdas: 3

		// First copy the following as is in your code.

		Consumer<String> message = (String s) -> System.out.println("Consumer prints: " + s);
		message.accept("Mubashir");

		Supplier<Integer> theNumber_5 = () -> 5;
		int num = theNumber_5.get();
		System.out.println("Supplier prints: " + num);

		// Predicate takes 1 arguments
		Predicate<Integer> checkMoreThan5 = (Integer x) -> x > 5;
		boolean isMoreThan5 = checkMoreThan5.test(4);
		System.out.println("Predicate prints: " + isMoreThan5);

		// BiPredicate takes 2 arguments
		BiPredicate<String, Integer> checkLength = (String s, Integer x) -> s.length() > x;
		boolean isLongerThan5 = checkLength.test("Mubashir", 5);
		System.out.println("BiPredicate prints: " + isLongerThan5);

	}
}
