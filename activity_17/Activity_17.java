class A implements B, C, D {
	public static void main(String[] args) {
		A a = new A();

		a.run("This");								// This is the new word given.

		C lambda = (String s) -> System.out.println("This lambda ran!");
		lambda.run("uglier");								// Word is too long.

		D lambda2 = (String s) -> {
			System.out.println("Anything!");
			return true;
		};
		lambda2.test("Any word");

		a.test("Mubashir");

	}

	public void execute() {
		return;
	}

	public void run(String s) {
		if(s.length() > 5) {
			System.out.println("Word is too long");
			return;
		}

		System.out.println(s + " is the new word given.");

	}

	public boolean test(String s) {
		if(s.length() > 5) {
			System.out.println("Word is too long");
			return false;
		}

		System.out.println(s + " is the new word given.");
		return true;
	}
}

interface B {
	void execute();
}

interface C {
	void run(String s);
}

interface D {
	boolean test(String s);
}
