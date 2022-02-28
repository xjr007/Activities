class ZooTickets {

	private String name = "BestZooEver";

	{ System.out.println(name+"-"); }

	private static int COUNT = 0;

	static { 
		System.out.println( COUNT+"-");
	}

	static { 
		COUNT += 10; 
		System.out.println(COUNT+"-");
	}


	public ZooTickets() {
		System.out.println("z-");

	}

	public static void main(String[] args) {
		new ZooTickets();

	}

}



// FIRST   - Initialise static variables and static initialiser blocks and process them in the order they appear in!
// SECOND  - Initialise instance varivales and instance initialiser blocks and process them in the order they appear in!

