 class Bear  {

	 public static void eat() {

		 System.out.println("Bear is eating");
	 }
}

class Panda extends Bear {

	public static void eat() {

		System.out.println("Panda is chewing");
	}

	public static void eat(int x) {

		System.out.println("HEY");
	}

	public static void main(String[] args) {

		eat();
		eat(2);

	}
}

// Main method takes the STATIC that is in the class.
