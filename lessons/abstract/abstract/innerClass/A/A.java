class Zoo {

	private interface Paper {

		public String getId();
	}

	class Ticket implements Paper {

		private String serialNumber;
		
		public String getId() {

			return serialNumber;
		}
	}

	public Ticket sellTicket(String serialNumber) {

		var t = new Ticket();
		t.serialNumber = serialNumber;
		return t;
	}
	
	public static void main(String[] args) {

		Zoo z = new Zoo();
		Ticket t = z.sellTicket("100");
		System.out.println(t.getId()+ " Ticket sold!");
	}
}
