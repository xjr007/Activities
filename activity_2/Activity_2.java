/**
	1. Create 3 variables of type int, Integer, String and give them values.

	To create a String:
		String str = new String([word]);		// [word] can be anything between " ";

	To create an Integer:
		Integer x = Integer.valueOf([number]);	// [number] can be any number.

	2. Print all 3 variables to the PowerShell.

	3. Allow 2 of the objects to be eligible for garbage collection.

	
*/

public class Activity_2 {
	// Create variables here

	int y;												// local variables inside a instance method dont get default values 
	String str;
	Integer x;


	// public void getY() {
	// 	System.out.println(y);
	// }
	// public void getStr() {
	// 	System.out.println(str);
	
	// }
	




	public static void main(String[] args) {
		// Run code here
		
		Activity_2  y = new Activity_2();	
		// y.getY();
		String str = new String("Salaam");
		// System.out.println(st
		
	}

}

class Revision {

	int x = 1;
	Integer y = Integer.valueOf(2);
	String str = new String("Mubashir");


	public static void main(String[] args) {
		Revision revise = new Revision();
		System.out.println(revise.x + revise.y + revise.str);	// 12Mubashir
							( 1 + 2 ) 
							 "3" + "Mubashir"					// 3Mubashir

		System.out.println(revise.str + revise.x + revise.y);	// Mubashir3
							"Mubashir" + "1" + "2"				// Mubashir12
	}
}