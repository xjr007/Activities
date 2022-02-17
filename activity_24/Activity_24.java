/*
 *	Question
 *
 *	1. Create your own functional interface.
 *	2. Add an additional 3 methods to the interface.
 *	3. Create a lambda and run it.
 *	4. Run the other 3 methods you created in the
 *	   interface.
 *	5. Print results to console.
 *
 *
 * */
class A implements B {

    public static void main(String[] args) {

        B lambda_1 = (String s) -> System.out.println("Hello");
        lambda_1.print("Mubashir");

        B a = new A();
        a.run();
        a.code();
        System.out.println(a.test());


    }

        public void print(String s) {
            System.out.println(s);
        }
}

interface B {

    void print(String s);

    default void run() {

        int i = 0;

        while(i < 1) {
            System.out.println("Hey! My name is Mubashir Isaacs");
            i++;
        }
    } 

    default void code() {

        String name = "Mubashir";
        if(name == "Isaacs") {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }   

    default int test() {

        int number = 2022;
        return number;

    }
}