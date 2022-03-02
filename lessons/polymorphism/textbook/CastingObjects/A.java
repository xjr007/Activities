class Bird {

	public void getName() {
		
		String name = "Eagle";
		System.out.println(name);
	}
}
class Duck extends Bird {


	public int getHeight() {

		int x = 20;
		return x;
	}
}

class Fish extends Duck {

	public static void main(String[] args) {

		Fish fish = new Fish();

		Duck duck =fish;			// Duck duck = new Fish();
		System.out.println(duck.getHeight());

		fish =(Fish) new Bird();			// Bird bird = new Fish();
		fish.getName();

		
	}
} 
