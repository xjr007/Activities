package com.packageB;
import com.packageA.*;

public class C {
	private String s;
	protected int x = 10;
	boolean o = true;
	public char c = 'C';
}

class D extends C {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.o);
		System.out.println(c.c);
	}
}

class E extends A {
	public static void main(String[] args) {
		/*	A ae = new E();
		 *	ae.x IS NOT VISIBLE
		 *
		 * */
		// A ae = new E();
		// System.out.println(ae.c);
	System.out.println("hey");
	
	E object = new E();
	object.methA();



	}
}
