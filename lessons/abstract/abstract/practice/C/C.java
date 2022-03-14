interface Herbivore {

	String getType(String type);

	String eatPlants();
}

interface Omnivore {
	
	String getType(String type);
	String eatPlants(String plants);
	void eatMeat();
}

class Animal implements Herbivore, Omnivore {

	public String eatPlants() {

		return "Eating plants.";
	}

	public String eatPlants(String plants) {

		return plants;
	}

	public String getType(String type) {

		return type;

	}

	public void eatMeat() {

		System.out.println("Eating meat");
	
	}

	public static void main(String[] args) {

		Animal a = new Animal(); 
		System.out.println(a.getType("Cow"));
		System.out.println(a.eatPlants());
		System.out.println(a.getType("Lion"));
		System.out.println(a.eatPlants("Eating plants: HERBS"));
		a.eatMeat();

	}


}
