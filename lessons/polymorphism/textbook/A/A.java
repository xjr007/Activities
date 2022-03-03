class Primate {

	public boolean hasHair() {

		return true;
	}
}

interface HasTail {

	 boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {        // extend - HasTail is Lemur's.

	public boolean isTailStriped() {

		return false;
	}

	public int age = 10;

	public static void main(String[] args) {

		Lemur lemur = new Lemur();
		System.out.println(lemur.age);


		HasTail hasTail = lemur;			// HasTail hasTail = new Lemur();
		System.out.println(hasTail.isTailStriped());

		Primate primate = lemur;			// Primate primate = new Lemur();
		System.out.println(primate.hasHair());
	}
}
