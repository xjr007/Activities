interface Herbivore {

	public int eatPlants(int quantity);

}

interface Omnivore {

	public void eatPlants();
}

class Bear implements Herbivore, Omnivore {

	public int eatPlants(int quantity) {

		System.out.println("Eating plants: " + quantity);
		return quantity;
	}

	public void eatPlants() {

		System.out.println("Eating plants");
	}

	public static void main(String[] args) {

		Bear o = new Bear();
		o.eatPlants(20);
		o.eatPlants();
	}
}

interface Dances {

	CharSequence swingArms();
}

class Penguin implements Dances {

	public String swingArms() {

		return "swing!";
	}
}
