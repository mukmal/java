class Outer {
	class Inner1 {
		Inner1() {
			System.out.println("Constructor Inner1");
		}	
		class Inner2 {
			Inner2() {
				System.out.println("Constructor Inner2");
			}
		}
	}
	public static void main (String[] args) {
		Outer outObj = new Outer();
		Inner1 innerObj = outObj.new Inner1();
		Inner2 innerObj2 = innerObj.new Inner2();
	}
}

//Program21.java:15: error: cannot find symbol
//                Inner2 innerObj2 = innerObj.new Inner2();
//                ^
//symbol:   class Inner2
//location: class Outer
//1 error
