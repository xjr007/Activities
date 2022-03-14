class Person_1 implements Male{

	static String hobby = "Running.";
	
	public Person_1(int a) {
	
		System.out.println("constructor");
	}

	public String m1() {
	
		return NAME;
	}

	static {
		System.out.println(hobby);
	}

	public static void main(String[] args) {

		Person_1 o = new Person_1(2);

		System.out.println(o.m1());

	}
}

interface Male {

	public final static int AGE = 18;
	String NAME = "Mubashir";
	
	 abstract String m1(); 
}


class Person_2 extends Person_1 {

	public Person_2() {

		super(2);
	}
	public static void main(String[] args) {

		Person_1 o = new Person_2();

		System.out.println(o.m1());
	}
}
