class Run {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		C c = new C();

		System.out.println(a.m1());
		System.out.println(b.m1());
		System.out.println(c.m1());
	}

}

class A {

	public Teacher m1() {

		return new Teacher(30, "Mubashir");
	}
}

class B extends A {
	
	public StudentTeacher m1() {

		return new StudentTeacher(34, "Aaqiel");
	}
}

class C extends B {
	
	public AssistantTeacher m1() {

		return new AssistantTeacher(44, "Muubzz");
	}
}


class Teacher {

	int age = 30;
	String name;

	public Teacher(int age, String name) {

		this.age = age;
		this.name = name;
	}

	public String toString() {

		return name + " " + age;
	}
}

class StudentTeacher extends Teacher {

	public StudentTeacher(int age, String name) {

		super(age, name);
		this.age = age;
		this.name = name;

	}

	public String toString() {

		return name + " " + age;
	}
}

class AssistantTeacher extends StudentTeacher {

	public AssistantTeacher(int age, String name) {

		super(age, name);
		this.age = age;
		this.name = name;
	}
}

