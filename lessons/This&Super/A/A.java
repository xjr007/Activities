class A {

	protected String name = "Mubashir";
	String surname = "Isaacs";
	public void mySurname() {
		System.out.println(name + surname + "weird");
	}
}

class B extends A {

String name = "Faatiemah";
String surname = "Phillips";

	public void mySurname() {
		System.out.println(this.name + super.surname);

	}
}

class C extends B {

	String name = "Aaqiel";
	int age = 19;

public void mySurname() {
		System.out.println(super.name + super.surname);	

			}
}

class D extends C {

	public void mySurname(int s) {
		System.out.println(s);
	}

	public String mySurname(String s) {
		return s;
	}


	public static void main(String[] args) {

     	A object = new D();
		object.mySurname();


	}
}