class First implements Test {

	public void m1() {

		System.out.println("This is m1.First");
	}

	public class Second implements Test {

		public void m1() {

			System.out.println("This is m1.Second");
		}
	}


	public static void main(String[] args) {

	// FIRST EXAMPLE:	

		First.Second a = new First().new Second();
	        a.m1();

	// SECOND EXAMPLE:
	
		First b = new First();
		First.Second c = b.new Second();
		c.m1();

		First d = b;
		d.m1();
	
	}


}

interface Test {

	void m1();
}
