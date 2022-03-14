abstract class Bird {

	public abstract String getName();

	public void printName() {

		System.out.println(getName());
	}

	public Bird() {
		
		System.out.println("Bird");
	}


}

 class Stork extends Bird {

	public String getName() {

		return "Stork!";
	}

	public static void main(String[] args) {

		new Stork().printName();
	}
}

class Crow extends Stork {

	@Override
	public String getName() {

		return "Crow!";
	}

	public static void main(String[] args) {

		System.out.println(new Stork().getName());
		
	}
}
