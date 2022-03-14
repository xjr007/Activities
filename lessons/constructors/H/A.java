class A {

	public A() {
		System.out.println("1");
	}

	public A(int x) {
		System.out.println("2");
	}

	static {
		System.out.println("3");
	}

	{ System.out.println("4"); }

	public static String getA() {
		return "A";
	}

	public static String getB() {
		return "B";
	}

	static {
		System.out.println("5");
	}

	public void getC() {
		System.out.println("C");
	}

	private static String getD() {
		return "D";
	}

	final static String getE() {
		return "E";
	}
}

class B extends A {

	public static String getA() {
		return "a";
	}

	final static String getF() {
		return "F";
	}

	public static void main(String[] args) {
		
		System.out.println(getA());
		System.out.println(A.getA());
		System.out.println(getF());
	}
}

class C extends A {

	public void getC() {
		System.out.println("HEY C!");
	}

	public static 


}
