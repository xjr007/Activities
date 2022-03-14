abstract class Mammal {

	abstract void showHorn();
	abstract void eatLeaf();
}

abstract class Rhino extends Mammal {

	void showHorn() {

		System.out.println("Hey");
	}

}

class BlackRhino extends Rhino {

	void eatLeaf() {

		System.out.println("GOODBYE");
	}

	public static void main(String[] args) {

		BlackRhino o = new BlackRhino();
		o.showHorn();
		o.eatLeaf();
	}
}


