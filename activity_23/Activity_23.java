/*		
 *
 *		NB!
 *		___________________________________________
 *
 *		Requirements to do the following activity
 *		
 *		1. Copy the Java code file from Activity 22
 *		   into the current directory
 *		
 *		___________________________________________
 *
 *		Question
 *
 *		1.	Override the functional interface method 
 *			you created in activity 22.
 *		2. 	Execute the newly created method.
 *		3.	You may run any code inside the method.
 *		4. 	Print your results to console.
 * */


class A implements B {
// Do code here

    public static void main(String[] args) {

        A object = new A();
        object.print("mubs");
    }

    public void print(String s) {
        System.out.println(s);
    }

}
