class Outer {
	class Inner {
		Inner() {
			System.out.println("In Inner Constructor");
		}
	}
	public static void main(String[] args) {
		new Outer().new Inner();
	}
}

//In Inner Constructor
