public class A {
	public static void main(String[] args) {
		MyStringBuilder strBuilder = new MyStringBuilder("ABC");
		String s = strBuilder.toString();
		System.out.println(s instanceof String);
		System.out.println(strBuilder);
	}
}

class MyStringBuilder {
	private String str;

	public MyStringBuilder(String s) {
		this.str = s;
	}

	public String toString() {
		return str;
	}
}