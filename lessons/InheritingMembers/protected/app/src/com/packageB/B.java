package com.packageB;

import com.packageA.A;

public class B extends A {
	public static void main(String[] args) {
		// Print/use protected members from A

		B b = new B();
		b.methA();
		System.out.println(b.methB("hello"));
		System.out.println(b.methC(12));
		System.out.println(b.name);



	}
}	
