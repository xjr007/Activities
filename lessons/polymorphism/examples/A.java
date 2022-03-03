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

	public String getSurname() {
		return "Richard";
	}

}

class C extends B {

	public int getNumber() {
		return 8426;
	}
	public static void main(String[] args) {
		C o = new C();

		System.out.println(o.getSurname());

		A ao = o;
		// Object o is dereferenced to A
		System.out.println(ao.getName());
		System.out.println(ao.getHeight());
		
		//System.out.println(ao.getNumber());
		//System.out.println(ao.getSurname());

		B bo = o;
		// Object o is dereferenced to B
		System.out.println(bo.getName());
		System.out.println(bo.getHeight());

		B b = new B();

		A ba = b;

		A a = new B();
		B ab = (B) a;

	}
}
