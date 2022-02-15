/*		Question
 *
 *		In the [Dog] class
 *		Create get methods to fetch dog related values.
 *
 *		In the [Generator] class
 *		Call get methods (what you have created) on given instances (max, zeena, felix) inside the run() method.
 *
 *		Requirements
 *		All created methods must return their respective values.
 *
 * */

class A {
	public static void main(String[] args) {
		Generator generate = new Generator();
		generate.run();
	}
}

class Generator {
	public void run() {
		Dog max = new Dog("Max", 7, "John Doe", "German Shepherd", true);
		Dog zeena = new Dog("Zeena", 4, "Megan Fox", "Alsation", true);
		Dog felix = new Dog("Felix", 9, "Mary Ann", "Doberman", false);

		// Do code here
	}
}

class Dog {
	private String name;
	private int age;
	private String owner;
	private String type;
	private boolean isHairy;

	public Dog(String name, int age, String owner, 
			String type, boolean isHairy) {
		this.name = name;
		this.age = age;
		this.owner = owner;
		this.type = type;
		this.isHairy = isHairy;
	}

	// Do code here
}
