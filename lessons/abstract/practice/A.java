abstract class Family {

	public Family() {

		System.out.println("constructor");
	}
	
	public Family(int x) {

		System.out.println("parameter constructor");
	}

	public abstract void methA();

	public abstract String methB();

	public String methC() {

		return "This is a string.";
	}
}

abstract class Isaacs extends Family {

	public Isaacs() {

		super(0);
	}

	public void methA() {

		System.out.println("methA.");
	}

	abstract String methD();
}

class Jacobs extends Isaacs {

	public Jacobs() {

		super();
	}

	public String methB() {

		return "methB.";
	}

	 String methD() {

		return "methD";
	}
	
	@Override
	public void methA() {

		System.out.println("HI");
	}

	public static void main(String[] args) {

		Isaacs o = new Jacobs();
		
		o.methA();
		System.out.println(o.methB());
		System.out.println(o.methC());

		Jacobs m = new Jacobs();
		System.out.println(m.methD());
		m.methA();

	}
}


