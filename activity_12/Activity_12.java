/*	Question
 *
 *	1. Create 2 static variables
 *	2. Create 2 static methods
 *	3. Create 1 static initializer block
 *
 *
 *
 */

class A {
	static String olderBro = "Muj";
	String youngerBro = "Ghal";
	
	static {
		System.out.println("Aaq");
	}

	{
		System.out.println("Mubas");
	}

	{
		String olderSis = olderBro;
		String youngerSis = youngerBro;
		System.out.println(youngerSis);
	}

	public static String myFood() {
		return "Curry";
	}

	public static String myFood(String food) {
		
		return food + myFood();

	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.youngerBro);
		System.out.println(olderBro);

		// running statics
		myFood("Rice and ");
	}


	
}
