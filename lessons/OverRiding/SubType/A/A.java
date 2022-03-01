class Animal {

	int x = 5;
	String name = "A";

	//public Animal() {
	//	super();
	//}

	public Animal(int x, String name) {

		this.x = x;
		this.name = name;
	}

	public String toString() {

		return name + x;
	}
}

class Lion extends Animal {

	//public Lion() {
	//	super();
	//}
	public Lion(int x, String name) {
		
		super(x, name);
		this.x = x;
		this.name = name;
	}

	public String toString() {


		return name + x;
	}
}

class Bear extends Animal {

	public Bear(int x, String name) {

		super(x, name);
		this.x = x;
		this.name = name;
	} 

}


class A {

	public Animal m1() {

		return new Animal(12, "Bear");
	}	
}

class C extends A {

	@Override
	public Lion m1() {

		return new Lion(17, "Cat");
	}

	public static void main(String[] args) {

		C b = new C();
		System.out.println(b.m1());

		A o = new A();
		System.out.println(o.m1());
		

	}
}

class D extends C {

	public Bear m1(int z) {

		return new Bear(20, "bear");
	}

}


class Run {

	public static void main(String[] args) {

	D o = new D();
	System.out.println(o.m1(2));

	}

}
