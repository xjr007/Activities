import java.util.Arrays;

class A {

	public static void main(String[] args) {
		String[] names = new String[] {"Mubashir", "Aaqiel", "Mujahid", "Ghaaleel", "Sedick"};

		B b = new B();
		System.out.println(b);

		System.out.println("Array content:");		
		System.out.println(Arrays.toString(names));			// 1

		System.out.println("No array content:");
		System.out.println(names);							// 2

		System.out.println("Array content:");
		for(String name: names) System.out.println(name);	// 3
	}
}

class B {}