public class Puppy extends Dog {

	public static void main(String[] args) {

		Dog puppy = new Puppy();
		puppy.bark();

		char c = 'A';

		int x = 10;

		int y  = 5;

		int z = x + y + c;

		System.out.println(z);
		System.out.println((int) c);
	}
}

class Dog {

	public void bark() {

		System.out.println("Woof!");
	}
}