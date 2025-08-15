class Outer {
	void fun() {
		System.out.println("In fun");
		class Inner {
			Inner() {
				System.out.println("Constructor Inner");
			}
			void run() {
				class Inner2 {
				}
				Inner2 obj = new Inner2();
			}
		}
	Inner obj = new Inner();
	}
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.fun();
	}
}

//'Outer$1Inner$1Inner2.class'
//'Outer$1Inner.class'
//Outer.class
