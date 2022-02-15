/*
	Activity 3
	__________

	A store owner wants to list his/her employees.
	The store owner has 5 employees.

	Restrictions:
	-------------
	- Each employee has a name, age and an employeeNumber.
	
	- name is a String and is shorter than 15 letters and longer than 2 letters.
	- age is an int and must be 2 digits.
	- employeeNumber is a long and must be 5 digits or more.

	- create 5 objects.
	
	- assign respective values to their respective instances.

	e.g. public void employee_1() {
			String name;
			... and so on.
	}

	----------------------------------------
	| CREATE YOUR OWN VALUES FOR THE ABOVE.|
	| WRITE ALL YOUR CODE IN THE APP CLASS.|
	----------------------------------------

	Question:
	_________

	Write a program that displays all the employee details to the console.

	e.g.

	------

	Ashley
	45
	54782

	Jacob
	23
	87309

	...etc

	------

	Tip -> Use objects.


*/

public class App extends Activity_3 {
	String name;
	int age;
	long employeeNumber;

	public void employee() {
		String method = "Employee";
		// Write code here

		validate(name, age, employeeNumber, method);
	}

	public void run() {
		// run code here

	}
}