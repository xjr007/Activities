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
		System.out.println(c.x);
		System.out.println(c.o);
		System.out.println(c.c);
	}
}

class E extends A {

	public void m2() {
		A a = new A();
		int x = a.x;
		System.out.println(x);
	}





	public static void main(String[] args) {
		/*	A ae = new E();
		 *	ae.x IS NOT VISIBLE
		 *
		 * */
		// A ae = new E();
		// System.out.println(ae.c);
	System.out.println("hey");

	A object = new A();
	System.out.println();
	E e = new E();
	e.m2();
	}
}
