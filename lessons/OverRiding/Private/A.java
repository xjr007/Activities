class Camel {

	private String getNumberOfHumps() {

		return "Undefined";
	}
}


class DromedaryCamel extends Camel {
	@Override
	private String getNumberOfHumps() {

		return "Hello";
	}
}

// Since other classes has no access to private methods, the methods cannot 
// be overridden.
