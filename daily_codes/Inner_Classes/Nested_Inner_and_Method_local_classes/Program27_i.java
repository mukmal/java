class Outer {
	class Inner {
		static void run() {
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
//Program27_i.java:3: error: Illegal static declaration in inner class Outer.Inner
//                static void run() {
//                                            ^
//                                              modifier 'static' is only allowed in constant variable declarations
//                                              1 error
//
//it give error in java11 but not in java 17
