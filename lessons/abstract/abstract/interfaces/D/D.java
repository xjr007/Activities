abstract class Animal {

	abstract int getType();
}

abstract class Bird extends Animal implements Fly {

	abstract boolean canSwoop();
}

class Swan extends Bird implements Swim {
	
	static String type = "Swan";
	int age = 23;

	public Swan() {

		String name = "This is a Swan";
		System.out.println(name);
	}

	public int getType() {

		return age;
	}

	public boolean canSwoop() {

		return true;
	}

	public void swim() {

		System.out.println("CAN SWIM");
	}

	public void fly() {

		System.out.println("CAN FLY");
	}

	static {

		System.out.println(type);
	}

	public static void main(String[] args) {

		Swan o = new Swan();

		System.out.println(o.getType());
		System.out.println(o.canSwoop());
		o.swim();
		o.fly();
	}
}

interface Fly {

	void fly();
}

interface Swim {

	void swim();
}
