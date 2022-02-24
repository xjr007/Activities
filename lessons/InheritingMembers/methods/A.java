/*
 *		Lesson
 *
 *		On paper, write out all the results per class 
 *		( as if it were printing to Console ).
 *
 * */

public class A {
	static int x = 1;

	static void IamX() {
		System.out.println(x);
		x = 3;
	}

	public static void main(String[] args) {
		IamX();	
		System.out.println(x);
	}
}

class B {
	static int x = 1;

	static void IamX(int y) {
		x = y;
	}

	public static void main(String[] args) {
		IamX(5);
		System.out.println(x);
	}
}

class C {
	static int x = 1;

	static int IamX() {
		x = 9;
		return 7;
	}

	public static void main(String[] args) {
		System.out.println(IamX());
		System.out.println(x);
	}
}

class D {
	static int x = 1;

	static int IamX(int y) {
		x = y;
		return 11;
	}

	public static void main(String[] args) {
		System.out.println(IamX(13));
		System.out.println(x);
	}
}

class E {
	static int x = 1;
	static String IamX(String s) {
		x = s.length();
		return "The length of string [ " + s + " ] has been assigned to 'x'.";
	}

	public static void main(String[] args) {
		System.out.println(IamX("Some Random String"));
		System.out.println(x);
	}
}
