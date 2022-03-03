class Penguin {

	public int getHeight() {
		return 3;
	}
	
	public void printInfo() {
		System.out.println(this.getHeight());
	}

	public String getString() {
		return "Mubashir";
	}
}

class EmperorPenguin extends Penguin {

	public int getHeight() {
		return 8;
	}

	public void printInfo() {
		System.out.println(super.getHeight());
	}

	public static void main(String[] args) {
		new EmperorPenguin().printInfo();
		
	}
} 
