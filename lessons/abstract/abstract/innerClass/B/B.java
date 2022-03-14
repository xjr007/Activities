class Taraweegh {

	private interface Info {

		String getInfo();
	}

	class Haafith implements Info {

		String name1 = "Mubashir Isaacs";
		String name2 = "Aaqiel Behardien";
		
		public String getInfo() {
		
			return name1;
		
		}
	}
/*
	public Haafith _info(String name1) {

		Haafith h = new Haafith();
		h.name1 = name1;
		return h;
	}
*/


	public static void main(String[] args) {
/*
		Taraweegh o = new Taraweegh();
		Haafith h = o._info("Mubashir Isaacs");
		System.out.println(h.getInfo());
*/	
		Taraweegh t = new Taraweegh();
		Taraweegh.Haafith o = t.new Haafith();
		System.out.println(o.getInfo());
	}
}


