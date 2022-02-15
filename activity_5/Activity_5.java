// A school wants to display the names of children in a specific class.

// There a 10 names to display:
// 	list_names:
		// - Jamie
		// - Mathew
		// - Jatiem
		// - Ghalied
		// - Sharief
		// - Muzzamiel
		// - Kauthar
		// - Aayesha
		// - Mustapha
		// - Zainab

// Question

// 	Print out the names as below:
// 		1. Jamie
// 		2. Mathew
// 		...etc 

// NB!!
// YOU MAY NOT DO THE FOLLOWING:
// 	list_names[0] to print out the names

public class Activity_5 {
	public static void main(String[] args) {
		A a = new A();
		a.run();
	}
}

class A {
	public static void run() {
		// do code here
		String[] list_names = 	{"Jamie", "Mathew", "Jatiem", 
								"Ghalied", "Sharief", "Muzzamiel", 
								"Kauthar", "Aayesha", "Mustapha", "Zainab"};
		
		for(String x: list_names) {
			System.out.println(x);
		}

		System.out.println();


		for( int counter = 0; counter < list_names.length;) {
			System.out.println(list_names[counter++]);

		}
		 System.out.println();

		int counter = 0;
		while(counter < list_names.length) {
			System.out.println(list_names[counter++]);

		}

	}

	public static void main(String[] args) {
		run();
	}
}