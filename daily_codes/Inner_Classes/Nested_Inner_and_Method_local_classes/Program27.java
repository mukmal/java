class Outer {
	class Inner {
		void run() {
			System.out.println("In run");
		}
	}
	void fun() {
		System.out.println("In fun");
	}
	public static void main(String[] args) {
		Outer obj = new Outer();
		Inner obj1 = obj.new Inner();
		obj.fun();
		obj1.run();
	}
}

//In fun
//In run
