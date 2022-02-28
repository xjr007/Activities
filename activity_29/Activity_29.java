class A {} // A contructor automatically created by Java

class B extends A {}	// B constructor automatically created by Java
			// implicit call to super() inside automatically created 
			// class B constructor




class C {}

class D extends C {
	public D() {	// explicitly created class D constructor
		// implicit call to super() inside class D constructor
	}
}




class E {
	public E() {
		// implicit call to super()
	}
}

class F extends E {} // automatic constructor and implicit call to class E super()







class G {
	public G() {
		// implicit call to super()

	}
}

class H extends G {
	public H() {
		// implicit call to super()
	}
}






class I {
	public I() {
		super();
	}
}

class J extends I {
	public J() {
		// implicit call to super()
	}
}







/* 	Java stopped creating automatic constructors 
	and implicit calls to super() for the following
*/

class K {
	public K() {
		super();
	}
}

class L extends K {
	public L() {
		super();
	}
}





class M {
	public M(int x) {
		super();
	}
}

class N extends M {
	public N() {
		super(5);
		// You cannot call super() without an argument.
		// Remember, super() calls the super class M constructor but
		// class M only has 1 construcor that takes an arguement.
		//
		// Also remember, java stopped creating automatic constructors
		// since you have created your own. 
		// Therefore, calling super() but M needs super(arguement) will
		// result in a compiler error.
	}
}
