class Outer {
	Outer() {
		System.out.println("Outer Constructor");
	}
	class Inner {
		Inner() {
			System.out.println("Inner Constructor");
		}
	}
	public static void main(String[] args) {
		Outer outObj1 = new Outer();
		Outer outObj2 = new Outer();
		Inner obj = outObj1.new Inner();
	}
}

//Outer Constructor
//Outer Constructor
//Inner Constructor

