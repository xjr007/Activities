class B {

	public String getName() {

		return "Mubashir";
	}
}


class C extends B {
	
	@Override
	public String getName() {

		return "Aaqiel";
	}

	public int getAge() {

		return 18;
	}
}


class D extends C {

	public String getName() {

		return "Muubzz";
	}
	@Override
	public int getAge() {

		return 20;
	}

	public String getSurname() {

		return "Isaacs";
	}
}

class Run  {

	public static void main(String[] args) {
		
		B b = new B();
		System.out.println(b.getName());
				

		C c = new C();
		System.out.println(c.getName());
		System.out.println(c.getAge());

		D d = new D();
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d.getSurname());

		b = d;		// B b = new D();
		c = (C)b; 	// C c = new D();
	


		
	}
}
