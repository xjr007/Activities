 class Animal {
	
	 static { System.out.println("Hello"); }


 }

class Hippo extends Animal {

	 static { System.out.println("My name is Mubashir Isaacs"); }

	 public static void main(String[] args) {

		System.out.println("How are you doing?");

		new Hippo();
		new Hippo();
		new Hippo();

	}

}
