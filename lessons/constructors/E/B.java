 class Primate {

	 public Primate() {
		// super();
		 System.out.print("Primate-");
	}
}

class Ape extends Primate {

	static String name = "Mubashir";

	public Ape(int fur) {
		// super();
		System.out.print("Ape1-");
	}
	
	public Ape() {

		System.out.println("Ape2-");

	}
}

class Chimpanzee extends Ape {

	static {
	
		System.out.println(name);

	}

	static {
		
		int x = 20;
		System.out.println(x);

	}


	public Chimpanzee() {

		super(2);
		System.out.println("Chimpanzee-");

	}

	public static void main(String[] args) {

		new Chimpanzee();

	}
}
