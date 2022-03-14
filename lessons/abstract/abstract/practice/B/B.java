interface Employee {

	String getName();
}

class Ashtech implements Employee {

	String name = "Mubashir Isaaacs";

	public String getName() {
	
		return name;
	}

	public static void main(String[] args) {

		Ashtech o = new Ashtech();
		System.out.println(o.getName());
	}
	
}
