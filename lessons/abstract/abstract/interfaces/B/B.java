interface Nocturnal {

	public int hunt();
	String name = "This is a String.";

	private void m1() {

		System.out.println(name);
	}

	public default void m2() {

		m1(); 
	}
}

interface CanFly {

	public void flap();

	public int hunt(int y);
}

class Owl implements Nocturnal, CanFly {

	public Owl(int x) {

		System.out.println(name);
	}
	public int hunt() {

		return 5;
	}

	public int hunt(int y) {

		return 2;
	}

	{ System.out.println("instance"); }

	public void flap() {

		System.out.println("Flap!");
	}

	static {

		System.out.println("This is STATIC!");
	}

	public static void main(String[] args) {

		Owl o = new Owl(2);
		System.out.println(o.hunt());
		System.out.println(o.hunt(2));
		o.flap();

		o.m2();

		System.out.println(o.m3());
		
	}
}
