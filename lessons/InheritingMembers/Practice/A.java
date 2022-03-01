 class Fish {

	 protected int size;
	 private int age;


	 public Fish(int age) {

		 this.age = age;
	 }

	 public int getAge() {

		 return age;
	 }
 }


class Shark extends Fish {

	private int numberOfFins = 6;

	public Shark(int a) {

		super(a);
		this.size = 4;
	}

	public void displaySharkDetails() {

		
		System.out.print("Shark with age: "+super.getAge());
		System.out.print(" and "+size+" meters long");
		System.out.print(" with "+this.numberOfFins+" fins");

	}

	public static void main(String[] args) {

		Shark o = new Shark(2);
		o.displaySharkDetails();

	}


}
