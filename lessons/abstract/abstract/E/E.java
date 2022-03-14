// Outerclass thats going to create an object of a machine 
// The machine will have field name, type, is service required
// Create innerclass that has getter and setter methods
// Create one machine from another class called 


class Machine {


	private String name = "Grinder3000";
	String type = "Grinder"; 

	public class Handler {

		public String setName(String name) {

			this.name = name;
			return name;
		}

		public String getName() {

			return name;
		}

		public String getType(String type) {

			return type;
		}

		public boolean isServicesRequired() {
		
			return true;

		}
		
	}

}

class HireIt {

	public static void main(String[] args) {

	
		Machine.Handler o = new Machine().new Handler();
		
		System.out.println(o.setName("Grinder100"));
		System.out.println(o.getName());
		System.out.println(o.getType());
		System.out.println(o.isServicesRequired());

	}

}
