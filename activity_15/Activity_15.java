class A {
	private String name = "John Doe";

	public static void main(String[] args) {
		// Create a class A object
		

		// Create a class String object 
		// Create a normal String

		
		// Create a class StringBuilder object
		

		// Call methods on their respective types
		// and assign returned values where necessary
		

		// print results

	}

	// A methods

	private static void changeName_1(A a) {
		a.name += " Mary Anne";
	}

	private static A changeName_2(A a) {
		a.name += " Richard Parker";
		return a;
	}

	// String methods

	private static void changeString_1(String s) {
		s += " Doe";
	}

	private static String changeString_2(String s) {
		s += " Parker";
		return s;
	}

	// StringBuilder methods

	private static void changeBuilder_1(StringBuilder sb) {
		sb.append(" Semens");
	}

	private static StringBuilder changeBuilder_2(StringBuilder sb) {
		sb.append(" Phillips");
		return sb;
	}
}
