class A  {}

class B extends A {}



class C {}

class D extends C {

	public D() {

	}
}


class E {

	public E() {

	}
}

class F extends E {}


class G {

	public G() {

	}
}

class H extends G {

	public H() {

	}
}


class I {

	public I() {
	
		super();
	}
}

class J extends I {

	public J() {

	}
}



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

class N extends M{

	public N() {

		super(5);
	}
}

