class A {

protected int numberOfLegs = 4;
String label = "buggy";
short age = 6;

public void printData() {

	System.out.println(this.numberOfLegs);
	System.out.println(numberOfLegs);
}

}

class B extends	A {

	protected int numberOfLegs = 6;
	short age = 3;
	String label = "hey";

	public void printData() {

	System.out.println(this.numberOfLegs);
	System.out.println(super.numberOfLegs);
	System.out.println(age);	
	System.out.println(label);
	}


	public static void main(String[] args) {

		new A().printData();

	}
}
