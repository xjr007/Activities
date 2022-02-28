public class A {
	public A() {
		super();
		System.out.println("This is A constructor.");
	}

	public A(String s) {
		this();
		System.out.println("This is overloaded with a string: " + s);
	}w

	public A(int x) {
		this("NotOkay");
		System.out.println("This is a constructor with an int: " + x);
	}

	public static void main(String[] args) {
		new A();
		new A(5);
		new A("OkayThen");
	}
}

class B extends A {
	public B() {
		System.out.println("Super implicit");
	}

	public B(String s) {
		super(s);
	}

	public static void main(String[] args) {
		new B("EvenBetter");
		new B();
	}
}



















class C {
	public C() {
		super();
	}
}

class D {
	
}
