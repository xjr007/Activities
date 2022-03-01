class Rhino {

	protected CharSequence getName() {

		return "rhino";
	}

	protected String getColor() {

		return "grey, black, or white";
	}

	static { System.out.println("HEY");}
}

class JavaRhino extends Rhino {

	@Override
	public String getName() {

		return "java rhino";
	}

	public String getColor() {

		return "grey";
	}

	{ System.out.println("HI");}
	

	public static void main(String[] args) {

		Rhino o = new JavaRhino();
		System.out.println(o.getName());
	}
}
