class A {

	public class C {

		private void m1() {

			System.out.println("M1");
		}
	}

	public static void main(String[] args) {

		A.C ac = new A().new C();
		ac.m1();
	}

	protected String getP() {

		return "String";
	}
}

class B extends A {

	public static void main(String[] args) {
		
		A a = new B();
		System.out.println(a.getP());

	}
}
