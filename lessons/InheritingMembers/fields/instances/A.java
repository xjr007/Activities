public class A {
	private void m1() {
		System.out.println("m1");
	}

	void m2() {
		System.out.println("m2");
	}

	protected void m3() {
		System.out.println("m3");
	}

	public void m4() {
		System.out.println("m4");
	}

	public static void main(String[] args) {

	}

}

class B extends A {
	private void m1() {
		System.out.println("B.m1");
	}

	void m2() {
		System.out.println("B.m2");
	}

	protected void m3() {
		System.out.println("B.m3");
	}

	public void m4() {
		System.out.println("B.m4");
	}
}

class C {
	public static main(String[] args) {
		
	}
}
