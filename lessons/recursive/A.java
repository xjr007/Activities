public class A {
	int x = 0;
	static int count = 0;
	void recur(int x) {
		System.out.println("Recurring " + count++ + " times");
		if(x >  4) {
			return;
		}
		
		x++;
		recur(x);
	}

	public static void main(String[] args) {
		A a = new A();
		a.recur(1);
		System.out.println("The end.");
	}
}
