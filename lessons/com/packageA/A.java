package com.packageA;

public class A {
	private String s;
	protected int x = 2;
	boolean o;
	public char c = 'A';

}

class B {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.x);
		System.out.println(a.o);
		System.out.println(a.c);
	}
}
