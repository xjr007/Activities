abstract class Bear {

	abstract CharSequence chew();
	public Bear() {

		System.out.println(chew());
	}
}

class Panda extends Bear {

	String chew() {

		return "yummy!";
	}

	public static void main(String[] args) {

		new Panda();
	}
}


