import java.util.function.*;

class A {
	
	// Constants
	private static final String surname = "Isaacs";
	
	// Static Fields
	private static String name = "Ghaleel";
	
	public static void main(String[] args) {
		name = "Mubashir";
		Predicate<String> checkString = (String s) -> s.equals(name);
		boolean res = checkString.test(name);
		System.out.println(res);

		name = "Aaqiel";
	}
}
