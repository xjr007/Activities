public class App {
	static boolean x;
	static boolean y;

	public static void main(String[] args) {
		x = x || y && !x;
		y = y && x || y;

	}
}