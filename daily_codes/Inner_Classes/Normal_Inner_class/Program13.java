class Outer {
	int x = 10;
	Outer() {
		System.out.println("In Outer Constructor");
	}
	void fun() {
		System.out.println("In fun-outer");
	}
	class Inner {
		Inner() {
			System.out.println("In Inner Constructor");
		}
	}
	void run() {
		System.out.println("In run-outer");
	}
	public static void main(String[] args) {
		Outer outObj1 = new Outer();
		Inner obj = outObj1.new Inner();
		System.out.println(outObj1.x);
		outObj1.fun();
		outObj1.run();
	}
}

//In Outer Constructor
//In Inner Constructor
//10
//In fun-outer
//In run-outer
