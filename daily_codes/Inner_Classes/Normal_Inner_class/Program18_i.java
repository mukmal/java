class Outer {
	int x = 10;
	static int y = 20;
	Outer() {
		System.out.println("Outer Constructor");
	}
	class Inner {
		static int z = 30;
		Inner() {
			System.out.println("Inner Constructor");
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
	}
	public static void main(String[] args) {
		Outer outObj = new Outer();
		Inner obj = outObj.new Inner();
	}
}


//Outer Constructor
//Inner Constructor
//10
//20
//30
