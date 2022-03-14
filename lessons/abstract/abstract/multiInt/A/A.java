interface Herbivore {

	void eatPlants();
}

interface Omnivore {

	void eatPlants();
	void eatMeat();
}

class Bear implements Herbivore, Omnivore {

	String type = "Bear";
	
	public Bear(int x) {

		System.out.println("Animal Type: " + type);
	}
	public void eatMeat() {	

		System.out.println("Eating meat");
	}

	public void eatPlants() {

		System.out.println("Eating plants");
	}

	public static void main(String[] args) {

		Bear o = new Bear(2);
		o.eatMeat();
		o.eatPlants();
	}

}
