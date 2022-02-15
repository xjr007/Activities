public class Activity_3 {

	public static void validate(String name, int age, long employeeNumber, String method) {
		int counter = 0;

		if( name instanceof String && name.length() > 2 && name.length() < 15 ) counter++;
		if( age > 9 && age < 100 ) counter++;
		if( employeeNumber > 9999 && employeeNumber < 100_000 ) counter++;

		if(counter < 3) System.err.println(method + " did not meet requirements.");
		else System.out.println(name + age + employeeNumber);


	}

	public static void main(String[] args) {
		App app = new App();
		app.run();
	}
}