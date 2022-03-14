class A {

	private String name = "A";
	protected int x = 20;

	public class B {


		public String getName() {

			return name;
		}

		public int getX() {

			return x;
		}

	}

	public static void main(String[] args) {

		A.B o = new A().new B();

		System.out.println(o.getName());
		System.out.println(o.getX());
	}
}

class C {


	private int z = 10;

	public class D {

		private String hobby = "hobby";
		protected int y = 20;

		public static void main(String[] args) {

		}
	}

	public static void main(String[] args) {

		C.D cd = new C().new D();
		
		System.out.println(cd.hobby);
	}
}
