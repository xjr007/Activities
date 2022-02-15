class A {
	public static void main(String[] args) {
		// Group 1
		String s = "Car";
		print(s);
		System.out.println();

		// Group 2
		String[] strArray = new String[5];
		strArray[0] = "Ferrari";
		strArray[1] = "Peugot";
		strArray[2] = "Toyota";
		strArray[3] = "BMW";
		strArray[4] = "Mustang";
		print(strArray);
		System.out.println();

		// Group 3
		print("Ferrari", "Peugot", "Toyota", "BMW", "Mustang");
		System.out.println();
	}

	private static void print(String... args) {
		for(String s: args) {
			System.out.println(s);
		}
	}
}
