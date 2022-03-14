class FieldMouse implements Climb, CanBurrow {

	public Float getSpeed(int age) {

		return 11f;
	}

	public static void main(String[] args) {

		FieldMouse o = new FieldMouse();
		System.out.println(o.getSpeed(0));
	}
}

interface CanBurrow {

	Float getSpeed(int age);
	int MINIMUM_DEPTH = 2;
}

interface Climb {

	Number getSpeed(int age);
}
