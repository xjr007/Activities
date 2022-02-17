/*		Question
 *
 *		Create your own functional interface
 *		and functional interface method.
 *
 *		Create a lambda and run code that uses
 *		the functional interface method.
 *
 *		Print your results to console.
 *		
 *		Restrictions
 *		------------
 *
 *		1. ONLY CREATE 1 FUNCTIONAL INTERFACE
 *		2. YOUR LAMBDA MAY TAKE ANY TYPE OF ARGUMENT
 *		3. YOUR LAMBDA MAY ONLY TAKE A MAX OF 2 ARGUMENTS
 *
 *
 * */
class A implements B {
    public static void main(String[] args) {

    B lambda = (String s) -> System.out.println("LAMBDA RAN LESSGOOO");
    lambda.print("Muubzz");        

    A object = new A();
    object.print("Muubz");
    }

    public void print(String s) {
        if(s.length() == 5) {
            System.out.println("Word length is correct");
        } else {
        System.out.println("Word is too long");
            }
    }
}

interface B{

    void print(String s);
}