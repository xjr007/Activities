import java.util.function.*;

// Create five methods
// Different Names
// Different Arguments & return types


class A {

	public double m1(double b) {
		m2("Oops");
		return 2.02; 
	}
	public String m2(String x) {
	
		m3(2);
		String name = "Mubashir";
		return name;

	}

	public int m3(int y) {
		m4(true);
		int age = 20;
		return age;
	} 

	public boolean m4(boolean z) {
		
		m5('b');
		return false;
	}

	public char m5(char a) {

		a += 'b';
		return a;
	}

	public void m6(Predicate<String> d, String s) {
	
		if (d.test(s)) {
		System.out.println("This is actually true.");
		}
	}

	
	public static void main(String[] args) {
	
		A a = new A();

		double m1 = a.m1(2);
		String m2 = a.m2("hey");
		int m3 = a.m3(2);
		boolean m4 = a.m4(false);
		char m5 = a.m5('a');
		
		System.out.print(m2 + m1 + m3 + m4 + m5);

		//System.out.println(o.m2("oops") + o.m1(2.00) + o.m3(2) + 
		//		o.m4(false) + o.m5('a'));
		
			
		
	Predicate<String> predicate = (String ab) -> ab.toLowerCase().startsWith("a");
	System.out.println(predicate.test("Aaqiel"));

		a.m6(predicate, "Aaqiel");



	}

}
