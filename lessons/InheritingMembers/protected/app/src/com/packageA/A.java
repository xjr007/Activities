package com.packageA;

public class A {
	// create protected members

	protected int x = 20;
	protected String name = "Mubashir";
	protected String surname = "Isaacs";
	protected static String hobby = "Camping";
	 

	protected static void methA() {
		A o = new A();
		System.out.println(o.name + " " + hobby + o.x);

	}

	protected String methB(String s) {
		return surname;

	}

	protected int methC(int y) {
		int z = 24;
		return z;

	}
}
