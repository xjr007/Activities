public class A {
	String name = "John Doe";
	public String getName() {
		return this.name;
	}

	public int getHeight() {
		return 21;
	}
}

class B extends A {
	String name = "Mary Poppins";
	public int getHeight() {
		return 17;
	}
}

class C extends B {
	public static void main(String[] args) {
		C o = new C();
		A ao = o;
		// Object o is dereferenced to A
		System.out.println(ao.getName());
		System.out.println(ao.getHeight());

		B bo = o;
		// Object o is dereferenced to B
		System.out.println(bo.getName());
		System.out.println(bo.getHeight());

	}
}
