class CuttleFish {

	private String name = "swimmy";

	{ System.out.println(name);}

	private static int COUNT = 0;

	static {

		System.out.println(COUNT);
	}

	static {

		int x = 20;
		String hobby = "Camping";

		System.out.println(x + hobby);
	}

	{ COUNT++; System.out.println(COUNT);}

	public CuttleFish() {

		System.out.println("Constructor");
	}

	public static void main(String[] args) {

		System.out.println("Ready");
		new CuttleFish();
	}

}
