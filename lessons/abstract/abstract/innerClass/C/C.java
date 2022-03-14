class School {
	
	private interface Info {

		String M1();
	}

	public class Teacher implements Info {

		String name = "Mubashir Isaacs";

		public String M1() {
			
			return name;
		}
	}
	
	public static void main(String[] args) {

		School s = new School();
		School.Teacher t = s.new Teacher();

		School.Teacher o = new School().new Teacher();

		System.out.println(o.M1());
	}
}
