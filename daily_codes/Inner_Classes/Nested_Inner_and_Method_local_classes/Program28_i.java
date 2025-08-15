class Outer {
	void fun() {
		System.out.println("In fun");
		class Inner {
			Inner() {
				System.out.println("Constructor Inner");
			}
		}
	Inner obj = new Inner();
	}
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.fun();
		obj.fun().new Inner();
	}
}

//Program28_i.java:14: error: illegal start of type
//                obj.fun().new Inner();
//                                       ^
//                                       1 error
