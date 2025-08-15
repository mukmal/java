class Outer {
	int x = 10;
	static int y = 20;
	Outer() {
		System.out.println("Outer Constructor");
	}
	class Inner {
		int x = 30;
		Inner(int x) {
			System.out.println("Inner Constructor");
			System.out.println(Outer.this.x);			
			System.out.println(y);
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		Outer outObj = new Outer();
		Inner obj = outObj.new Inner(120);
	}
}



//Outer Constructor
//Inner Constructor
//10
//20
//120
