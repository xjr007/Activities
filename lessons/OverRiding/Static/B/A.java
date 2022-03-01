//class Bear {
//
//	public static void sneeze() {
//
//		System.out.println("Bear is sneezing");
//	}
///
//	public void hibernate() {
//
//		System.out.println("Bear is hibernating");
//	}
//
//	public static void laugh() {
//
//		System.out.println("Bear is laughing");
//	}
//}

//class Panda extends Bear {

//	public void sneeze() {
//
//		System.out.println("Panda sneezes quietly");     // Does not run because method in child class should also be STATIC.
//	}
//	public static void hibernate() {
//
//		System.out.println("Panda is going to sleep");   // Does not run because method in parent class should also be STATIC.
//	}
//	protected static void laugh() {
//
//		System.out.println("Panda is laughing");         // Does not because access modifier in method in child class is more restrictive than parent class.
//	}
//}


// BETTER VERSION THAT WILL WORK:


class Baboon {

	public static void sneeze() {

		System.out.println("Baboon is sneezing");
	}

	public static void hibernate() {

		System.out.println("Baboon is hibernating");
	}

	public static void laugh() {

		System.out.println("Baboon is laughing");
	}

}

class Monkey extends Baboon {

	public static void sneeze() {

		System.out.println("Monkey sneezes quietly");
	}

	public static void hibernate() {

		System.out.println("Monkey is going to sleep");
	}

	public static void laugh() {

		System.out.println("Monkey is laughing");
	}

	public static void main(String[] args) {

		sneeze();
		hibernate();
		laugh();
	}
}
