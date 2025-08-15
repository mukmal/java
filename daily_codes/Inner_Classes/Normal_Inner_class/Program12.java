class Outer {
	Outer() {
		System.out.println("In Outer Constructor");
	}
	class Inner {
		Inner() {
			System.out.println("In Inner Constructor");
		}
	}
	public static void main(String[] args) {
		Outer outObj1 = new Outer();
		Outer outObj2 = new Outer();
		Inner obj = outObj1.new Inner();
	}
}

//In Outer Constructor
//In Outer Constructor
//In Inner Constructor
