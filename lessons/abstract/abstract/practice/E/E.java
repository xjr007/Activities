interface In1 {

	void In1();
	String NAME1 = "This is In1().";
}

interface In2 {

	void In2();
	String NAME2 = "This is In2().";
}

interface In3 {

	void In3();
	String NAME3 = "This is In3().";
}

class A implements In1, In2, In3 {

	public void In1() {

		System.out.println(NAME1);
	}

	public void In2() {

		System.out.println(NAME2);
	}

	public void In3() {

		System.out.println(NAME3);
	}

	public static void main(String[] args) {

		A a =  new A();
		a.In1();
		a.In2();
		a.In3();
	}

}

class B extends A {

	public static void main(String[] args) {

		B b = new B();
		A.main(args);
	}
}

class C extends B {}

class D extends C {}

